package PlayerClass;

import Behaviours.IDefend;
import Behaviours.IWeapon;

public class DoomSlayer extends Fighter {

    public DoomSlayer(String name, int healthPoints, IWeapon weapon, IDefend defensiveItem){
        super(name, healthPoints, weapon, defensiveItem);
    }

}
