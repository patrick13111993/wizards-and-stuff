package wizard_management;

public class Cauldron extends Equipment implements Magicable {

  public Cauldron(String material){
    super(material);
  }

  public String doMagic(){
    return "Double, double toil and trouble. Fire burn and caldron bubble.";
  }
}