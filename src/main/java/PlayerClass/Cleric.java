package PlayerClass;

import Behaviours.IDefend;
import Behaviours.IHeal;

public class Cleric extends Player implements IHeal {

    private int healingSpell = 5;

    public Cleric(String name, int healthPoints, IDefend defensiveItem){
        super(name, healthPoints, defensiveItem);
    }

    public int heal(){
        return healingSpell;
    };

    public void healPlayer(Player player){
        player.receiveHealth(this.heal());
    }
}
