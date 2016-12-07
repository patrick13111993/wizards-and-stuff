package wizard_management;

public class Ogre extends MythicalBeast implements Protectable {
  
  public Ogre(String name){
    super(name);
  }

  public String protect(){
    return "It's not ogre yet";
  }

}