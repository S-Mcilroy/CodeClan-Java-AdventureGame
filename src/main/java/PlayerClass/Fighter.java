package PlayerClass;

import Behaviours.IWeapon;
import Enemies.Enemy;

public abstract class Fighter extends Player implements IWeapon {

    private IWeapon weapon;

    public Fighter(String name, int healthPoints, IWeapon weapon){
        super(name, healthPoints);
        this.weapon = weapon;
    }

    public void attack(Enemy enemy){
        this.weapon.attack(enemy);
    }

    public void changeWeapon(IWeapon newWeapon){
        this.weapon = newWeapon;
    }

}
