package Spells;

import Behaviours.ISpell;
import Enemies.Enemy;

public class Fireball implements ISpell {

    private int attackDamage = 2;

    public void cast(Enemy enemy){
        enemy.takeDamage(this.attackDamage);
    }

}
