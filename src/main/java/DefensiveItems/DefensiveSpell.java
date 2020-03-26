package DefensiveItems;

import Behaviours.IDefend;

public class DefensiveSpell implements IDefend {

    private int defenseNumber = 2;

    public int defend(){
        return this.defenseNumber;
    }
}
