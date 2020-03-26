package PlayerClass;

import Behaviours.IDefend;
import Behaviours.IHeal;

public class Cleric extends Player implements IHeal {

    public Cleric(String name, int healthPoints, IDefend defensiveItem){
        super(name, healthPoints, defensiveItem);
    }

    public int heal(){
        return 5; //Fix this later
    };
}
