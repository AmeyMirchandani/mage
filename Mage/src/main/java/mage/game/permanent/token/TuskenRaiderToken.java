package mage.game.permanent.token;

import mage.MageInt;
import mage.constants.CardType;
import mage.constants.SubType;

/**
 * @author spjspj
 */
public final class TuskenRaiderToken extends TokenImpl {

    public TuskenRaiderToken() {
        super("Tusken Raider Token", "white Tusken Raider creature token");
        this.power = new MageInt(1);
        this.toughness = new MageInt(1);
        cardType.add(CardType.CREATURE);
        color.setWhite(true);
        subtype.add(SubType.TUSKEN);
        subtype.add(SubType.RAIDER);
    }

    protected TuskenRaiderToken(final TuskenRaiderToken token) {
        super(token);
    }

    public TuskenRaiderToken copy() {
        return new TuskenRaiderToken(this);
    }
}
