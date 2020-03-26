package Enemies;

import PlayerClass.Player;

public abstract class Enemy {

    private int healthPoints;
    private int attackDamage;

    public Enemy(int healthPoints, int attackDamage){
        this.healthPoints = healthPoints;
        this.attackDamage = attackDamage;
    }

    public void takeDamage(int damage){
        this.healthPoints -= damage;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void attack(Player player){
        int playerDefense = player.defend();
        player.takeDamage(attackDamage - playerDefense);
    }

    public int getAttackDamage() {
        return attackDamage;
    }
}
