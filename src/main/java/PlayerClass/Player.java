package PlayerClass;

import Behaviours.IDefend;
import Behaviours.IHeal;
import Enemies.Enemy;

import java.util.ArrayList;

public abstract class Player implements IDefend, IHeal {
    private String name;
    private int healthPoints;
    private ArrayList<IHeal> healingItems;

    public Player(String name, int healthPoints){
        this.name = name;
        this.healthPoints = healthPoints;
        this.healingItems = new ArrayList<IHeal>();
    }

    public void takeDamage(int damage){
        this.healthPoints -= damage;
    }

    public void defend(Enemy enemy){

    }

    public void heal(IHeal healingItem){
        healingItem.heal();
    }
}
