import Environment.Room;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class RoomTest {

    private Room room;

    @Before
    public void before(){
        room = new Room();
    }

    @Test
    public void roomHasExits(){
        assertNotNull(room.getExits());
        room.getExitsRoutes();
    }
}
