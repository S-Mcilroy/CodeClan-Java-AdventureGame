package Environment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Room {

    private ArrayList<Exit> exits;
    private Random rand = new Random();

    public Room(){
        exits = new ArrayList<Exit>();
        this.addExits();
    }

    public void addExits(){
    for (Exit exit: Exit.values()){
        exits.add(exit);
     }
        Collections.shuffle(exits);
        int rand_int1 = rand.nextInt(3);
        for(int i = 0; i < rand_int1; i++){
            exits.remove(i);
        }
    }

    public ArrayList<Exit> getExits() {
        return exits;
    }

    public void getExitsRoutes() {
        System.out.println("The exits to this room are:");
        for (Exit exit: exits){
            System.out.println(exit);
        }
    }

    public int howManyExits(){
        return exits.size();
    }

    public boolean exitPaths(String direction){
        for (Exit exit: exits) {
            if (exit.toString().equals(direction)) {
                return true;
            }
        }
        return false;
    }

}



