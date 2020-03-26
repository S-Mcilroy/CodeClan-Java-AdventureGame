package Environment;

import java.util.ArrayList;
import java.util.Random;

public class Quest {

    private ArrayList<Room> rooms;
    private Random rand = new Random();
    private Room currentRoom;

    public Quest(){
        rooms = new ArrayList<Room>();
        this.addRooms();
    }

    public void addRooms(){
        int rand_int1 = rand.nextInt(3);
        for(int i = 0; i < rand_int1; i++){
            rooms.add(new Room());
        }
    }

    public int howManyRooms(){
        return rooms.size();
    }

    public void userPickRoom(String direction){
        if (rooms.get(0).exitPaths(direction)){
            if (rooms.get(1) == null){
                System.out.println("Quest Completed");
            } else {
                currentRoom = rooms.get(1);
                rooms.remove(0);
            }
        }
        System.out.println("Please pick correct exit");
    }



}
