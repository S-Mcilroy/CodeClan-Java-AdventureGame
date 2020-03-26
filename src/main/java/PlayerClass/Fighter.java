package PlayerClass;

import Behaviours.IDefend;
import Behaviours.IWeapon;
import Enemies.Enemy;

public abstract class Fighter extends Player implements IWeapon {

    private IWeapon weapon;

    public Fighter(String name, int healthPoints, IWeapon weapon, IDefend defensiveItem){
        super(name, healthPoints, defensiveItem);
        this.weapon = weapon;
    }

    public void attack(Enemy enemy){
        this.weapon.attack(enemy);
    }

    public void changeWeapon(IWeapon newWeapon){
        this.weapon = newWeapon;
    }

    public IWeapon getWeapon() {
        return weapon;
    }
}
