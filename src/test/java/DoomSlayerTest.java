import DefensiveItems.ChestPlate;
import Enemies.HellKnight;
import PlayerClass.DoomSlayer;
import Weapons.BFG9000;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DoomSlayerTest {

    private DoomSlayer doomSlayer;
    private BFG9000 bfg9000;
    private ChestPlate chestPlate;

    private HellKnight hellKnight;


    @Before
    public void before(){
        chestPlate = new ChestPlate();
        bfg9000 = new BFG9000();
        doomSlayer = new DoomSlayer("Steve the Mental", 5, bfg9000, chestPlate);
        hellKnight = new HellKnight();
    }

    @Test
    public void hasName(){
        assertEquals("Steve the Mental", doomSlayer.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(5, doomSlayer.getHealthPoints());
    }

    @Test
    public void hasWeapon(){
        assertEquals(bfg9000, doomSlayer.getWeapon());
    }

    @Test
    public void hasDefensiveItem(){
        assertEquals(chestPlate, doomSlayer.getDefensiveItem());
    }

    @Test
    public void canTakeDamage(){
        doomSlayer.takeDamage(1);
        assertEquals(4, doomSlayer.getHealthPoints());
    }

    @Test
    public void testDefence(){
        assertEquals(2, doomSlayer.defend());
    }

    @Test
    public void testHeal(){
        doomSlayer.heal();
        assertEquals(7, doomSlayer.getHealthPoints());
    }

    @Test
    public void canAttack(){
        doomSlayer.attack(hellKnight);
        assertEquals(1, hellKnight.getHealthPoints());
    }

}
