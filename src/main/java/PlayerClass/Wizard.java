package PlayerClass;

import Behaviours.IDefend;
import Behaviours.ISpell;

public class Wizard extends Mage {

    public Wizard(String name, int healthPoints, ISpell spell, IDefend defensiveItem){
        super(name, healthPoints, spell, defensiveItem);
    }


}
