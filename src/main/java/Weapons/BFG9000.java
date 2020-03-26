package Weapons;

import Behaviours.IWeapon;
import Enemies.Enemy;

public class BFG9000 implements IWeapon {

    private int attackDamage = 2;

    public void attack(Enemy enemy){
        enemy.takeDamage(attackDamage);
    }
}
