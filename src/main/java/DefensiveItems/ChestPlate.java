package DefensiveItems;

import Behaviours.IDefend;
import Enemies.Enemy;

public class ChestPlate implements IDefend {

    private int defenseNumber = 2;

    public int defend(){
        return this.defenseNumber;
    }

}
