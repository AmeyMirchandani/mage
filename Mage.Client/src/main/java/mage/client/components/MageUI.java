package mage.client.components;

import mage.utils.ThreadUtils;
import org.apache.log4j.Logger;

import java.awt.Component;
import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.swing.JButton;

public class MageUI {

    private static final Logger logger = Logger.getLogger(MageUI.class);

    private final Map<MageComponents, Component> ui = new EnumMap<>(MageComponents.class);
    private final Map<MageComponents, Object> sync = new EnumMap<>(MageComponents.class);

    public static final ThreadPoolExecutor threadPoolPopups;
    private static int threadCount;

    static {
        threadPoolPopups = new ThreadPoolExecutor(4, 4, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactory() {
            @Override
            public Thread newThread(Runnable runnable) {
                threadCount++;
                Thread thread = new Thread(runnable, "POPUP-" + threadCount);
                thread.setDaemon(true);
                return thread;
            }
        }) {
            @Override
            protected void afterExecute(Runnable r, Throwable t) {
                super.afterExecute(r, t);

                // catch errors in popup threads (example: card popup over cards or chat/log messages)
                t = ThreadUtils.findRealException(r, t);
                if (t != null) {
                    logger.error("Catch unhandled error in POPUP thread: " + t.getMessage(), t);
                }
            }
        };
        threadPoolPopups.prestartAllCoreThreads();
    }

    public JButton getButton(MageComponents name) throws InterruptedException {
        //System.out.println("request for " + name);
        Object buttonSync;
        synchronized (ui) {
            if (ui.containsKey(name)) {
                //System.out.println("clicking " + name);
                return (JButton) ui.get(name);
            } else {
                buttonSync = new Object();
                sync.put(name, buttonSync);
            }
        }

        synchronized (buttonSync) {
            //System.out.println("waiting " + name + " to be created");
            buttonSync.wait();
            //System.out.println(name + "was created");
            if (!ui.containsKey(name)) {
                throw new IllegalStateException("Component wasn't initialized. This should not happen.");
            }
            return (JButton) ui.get(name);
        }

    }

    public Component getComponent(MageComponents name) throws InterruptedException {
        Object componentSync;
        synchronized (ui) {
            if (ui.containsKey(name)) {
                return ui.get(name);
            } else {
                componentSync = new Object();
                sync.put(name, componentSync);
            }
        }

        synchronized (componentSync) {
            componentSync.wait();
            if (!ui.containsKey(name)) {
                throw new IllegalStateException("Component wasn't initialized. This should not happen.");
            }
            return ui.get(name);
        }

    }

    public void addButton(MageComponents name, JButton button) {
        synchronized (ui) {
            //System.out.println("added " + name);
            ui.put(name, button);
            if (sync.containsKey(name)) {
                synchronized (sync.get(name)) {
                    //System.out.println("notifyAll - " + name);
                    sync.get(name).notifyAll();
                }
            }
        }
    }

    public void removeButton(MageComponents name) {
        synchronized (ui) {
            ui.remove(name);
        }
    }

    public void addComponent(MageComponents name, Component component) {
        synchronized (ui) {
            ui.put(name, component);
            if (sync.containsKey(name)) {
                synchronized (sync.get(name)) {
                    sync.get(name).notifyAll();
                }
            }
        }
    }

    public void doClick(MageComponents name) throws InterruptedException {
        doClick(name, 0);
    }

    public void doClick(MageComponents name, int waitBeforeClick) throws InterruptedException {
        final JButton j = getButton(name);
        TimeUnit.MILLISECONDS.sleep(waitBeforeClick);
        while (!j.isEnabled()) {
            TimeUnit.MILLISECONDS.sleep(10);
        }
        Thread t = new Thread(() -> j.doClick());
        t.start();
    }
}
