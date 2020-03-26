package PlayerClass;

import Behaviours.IDefend;
import Behaviours.ISpell;
import Enemies.Enemy;

public abstract class Mage extends Player implements ISpell {

    private ISpell spell;

    public Mage(String name, int healthPoints, ISpell spell, IDefend defensiveItem){
        super(name, healthPoints, defensiveItem);
        this.spell = spell;
    }

    public void cast(Enemy enemy){

    }

    public ISpell getSpell() {
        return spell;
    }
}
