package mage.game.permanent.token;

import mage.MageInt;
import mage.abilities.keyword.LifelinkAbility;
import mage.constants.CardType;
import mage.constants.SubType;

/**
 * @author spjspj
 */
public final class WurmWithLifelinkToken extends TokenImpl {

    public WurmWithLifelinkToken() {
        super("Phyrexian Wurm Token", "3/3 colorless Phyrexian Wurm artifact creature token with lifelink");
        cardType.add(CardType.ARTIFACT);
        cardType.add(CardType.CREATURE);
        subtype.add(SubType.PHYREXIAN);
        subtype.add(SubType.WURM);
        power = new MageInt(3);
        toughness = new MageInt(3);
        this.addAbility(LifelinkAbility.getInstance());
    }

    protected WurmWithLifelinkToken(final WurmWithLifelinkToken token) {
        super(token);
    }

    public WurmWithLifelinkToken copy() {
        return new WurmWithLifelinkToken(this);
    }
}
