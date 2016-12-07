import static org.junit.Assert.*;
import org.junit.*;
import wizard_management.*;

public class WizardTest {

  Wizard wizard;
  Broomstick broomstick;
  Ogre ogre;
  Wand wand;

  @Before
  public void before(){
    broomstick = new Broomstick("Nimbus", 10);
    ogre = new Ogre("Fiona");
    wand = new Wand("Phoenix Feather");
    wizard = new Wizard("Toby", broomstick, ogre, wand);

  }

  @Test
  public void hasName(){
    assertEquals("Toby", wizard.getName());
  }

  @Test
  public void hasBroomstick(){
    Broomstick broomstick = (Broomstick) wizard.getRide();
    assertEquals("Nimbus", broomstick.getBrand());
  }

  @Test
  public void hasWand(){
    Wand wand = (Wand) wizard.getMagic();
    assertEquals("Phoenix Feather", wand.getMaterial());
  }

  @Test
  public void canFly(){
    assertEquals(wizard.fly(),"mounting broom, running, skipping, flying!");
  }

  @Test
  public void canFlyDragon(){
    Dragon dragon = new Dragon("Tilly");
    wizard = new Wizard("Dumbledore", dragon, ogre, wand);
    assertEquals("Standing up tall, beating wings, lift off!", wizard.fly());
  }

  @Test
  public void canSetRide(){
    Dragon dragon = new Dragon("Eric");
    wizard.setRide(dragon);
    assertEquals("Standing up tall, beating wings, lift off!", wizard.fly());
  }

  @Test
  public void hasProtector(){
    Ogre ogre = (Ogre) wizard.getProtector();
    assertEquals("Fiona", ogre.getName());
  }

  @Test 
  public void canBeProtected() {
    assertEquals("It's not ogre yet", wizard.protect());
  }

  @Test
  public void canSetProtector(){
    Ogre ogre = new Ogre("Shrek");
    wizard.setProtector(ogre);
    assertEquals("It's not ogre yet", wizard.protect());
  }

  @Test
  public void canFlyFordAnglia(){
    FordAnglia fordanglia = new FordAnglia("blue");
    wizard = new Wizard("Ron", fordanglia, ogre, wand);
    assertEquals("Activate the invisibility cloak!", wizard.fly());
  }

  @Test
  public void canPerformMagic(){
    assertEquals("Wingardium leviooooosa!", wizard.doMagic());
  }

  @Test
  public void canSetMagicable(){
    Cauldron cauldron = new Cauldron("Cast iron");
    wizard.setMagicItem(cauldron);
    assertEquals("Double, double toil and trouble. Fire burn and caldron bubble.", wizard.doMagic());
  }
}