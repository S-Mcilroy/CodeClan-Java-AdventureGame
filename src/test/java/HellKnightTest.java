import DefensiveItems.ChestPlate;
import Enemies.HellKnight;
import PlayerClass.DoomSlayer;
import Weapons.BFG9000;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HellKnightTest {

    private HellKnight hellKnight;

    private DoomSlayer doomSlayer;
    private BFG9000 bfg9000;
    private ChestPlate chestPlate;

    @Before
    public void before(){
        chestPlate = new ChestPlate();
        bfg9000 = new BFG9000();
        doomSlayer = new DoomSlayer("Steve the Mental", 5, bfg9000, chestPlate);
        hellKnight = new HellKnight();
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(3, hellKnight.getHealthPoints());
    }

    @Test
    public void hasAttackDamage(){
        assertEquals(3, hellKnight.getAttackDamage());
    }

    @Test
    public void canTakeDamage(){
        hellKnight.takeDamage(2);
        assertEquals(1, hellKnight.getHealthPoints());
    }

    @Test
    public void canAttack(){
        hellKnight.attack(doomSlayer);
        assertEquals(4, doomSlayer.getHealthPoints());
    }
}
