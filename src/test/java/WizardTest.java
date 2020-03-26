import DefensiveItems.DefensiveSpell;
import Enemies.HellKnight;
import PlayerClass.Wizard;
import Spells.Fireball;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    private Wizard wizard;
    private Fireball fireball;
    private DefensiveSpell defensiveSpell;

    private HellKnight hellKnight;


    @Before
    public void before(){
        defensiveSpell = new DefensiveSpell();
        fireball = new Fireball();
        hellKnight = new HellKnight();
        wizard = new Wizard("Gordon the Old", 5, fireball, defensiveSpell);
    }

    @Test
    public void hasName(){
        assertEquals("Gordon the Old", wizard.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(5, wizard.getHealthPoints());
    }

    @Test
    public void hasWeapon(){
        assertEquals(fireball, wizard.getSpell());
    }

    @Test
    public void hasDefensiveItem(){
        assertEquals(defensiveSpell, wizard.getDefensiveItem());
    }

    @Test
    public void canTakeDamage(){
        wizard.takeDamage(1);
        assertEquals(4, wizard.getHealthPoints());
    }

    @Test
    public void testDefence(){
        assertEquals(2, wizard.defend());
    }

    @Test
    public void testHeal(){
        wizard.heal();
        assertEquals(7, wizard.getHealthPoints());
    }

    @Test
    public void canAttack(){
        wizard.cast(hellKnight);
        assertEquals(1, hellKnight.getHealthPoints());
    }

}
