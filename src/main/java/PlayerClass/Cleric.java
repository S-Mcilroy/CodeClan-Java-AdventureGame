package PlayerClass;

import Behaviours.IHeal;

public class Cleric extends Player implements IHeal {

    public Cleric(String name, int healthPoints){
        super(name, healthPoints);
    }

    public int heal(){
        return 5; //Fix this later
    };
}
