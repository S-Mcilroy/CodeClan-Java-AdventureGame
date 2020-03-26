package PlayerClass;

import Behaviours.IDefend;
import Behaviours.IHeal;
import Behaviours.IWeapon;
import Enemies.Enemy;
import HealingItems.HealthPotion;

import java.util.ArrayList;

public abstract class Player implements IDefend, IHeal {
    private String name;
    private int healthPoints;
    private ArrayList<IHeal> healingItems;
    private IDefend defensiveItem;

    public Player(String name, int healthPoints, IDefend defensiveItem){
        this.name = name;
        this.healthPoints = healthPoints;
        this.healingItems = new ArrayList<IHeal>();
        this.healingItems.add(new HealthPotion());
        this.healingItems.add(new HealthPotion());
        this.defensiveItem = defensiveItem;
    }

    public void takeDamage(int damage){
        this.healthPoints -= damage;
    }

    public int defend(){
        return this.defensiveItem.defend();
    }

    public int heal(){
        if(this.healingItems.size() > 0){
            this.healthPoints += this.healingItems.get(0).heal();
            this.healingItems.remove(0);
        } else {
            System.out.println("You have no healing items left.");
        }
        return 0;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public ArrayList<IHeal> getHealingItems() {
        return healingItems;
    }

    public IDefend getDefensiveItem() {
        return defensiveItem;
    }
}
