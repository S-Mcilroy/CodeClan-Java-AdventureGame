import DefensiveItems.ChestPlate;
import Enemies.HellKnight;
import PlayerClass.Cleric;
import PlayerClass.DoomSlayer;
import Weapons.BFG9000;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    private Cleric cleric;
    private DoomSlayer doomSlayer;
    private BFG9000 bfg9000;
    private ChestPlate chestPlate;

    private HellKnight hellKnight;


    @Before
    public void before(){
        chestPlate = new ChestPlate();
        bfg9000 = new BFG9000();
        doomSlayer = new DoomSlayer("Steve the Mental", 5, bfg9000, chestPlate);
        cleric = new Cleric("Niall the Bard", 5, chestPlate);
        hellKnight = new HellKnight();
    }

    @Test
    public void hasName(){
        assertEquals("Niall the Bard", cleric.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(5, cleric.getHealthPoints());
    }

    @Test
    public void hasHealingPower(){
        assertEquals(5, cleric.heal());
    }

    @Test
    public void hasDefensiveItem(){
        assertEquals(chestPlate, cleric.getDefensiveItem());
    }

    @Test
    public void canTakeDamage(){
        cleric.takeDamage(1);
        assertEquals(4, cleric.getHealthPoints());
    }

    @Test
    public void testDefence(){
        assertEquals(2, cleric.defend());
    }

    @Test
    public void testHeal(){
        cleric.healPlayer(cleric);
        assertEquals(10, cleric.getHealthPoints());
    }

    @Test
    public void fight(){
        hellKnight.attack(doomSlayer);
        assertEquals(4, doomSlayer.getHealthPoints());
        doomSlayer.attack(hellKnight);
        assertEquals(1, hellKnight.getHealthPoints());
        hellKnight.attack(doomSlayer);
        assertEquals(3, doomSlayer.getHealthPoints());
        cleric.healPlayer(doomSlayer);
        assertEquals(8, doomSlayer.getHealthPoints());
    }

}
