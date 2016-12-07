package wizard_management;

public class Wand extends Equipment implements Magicable  {

  public Wand(String material){
    super(material);
  }

  public String doMagic(){
    return "Wingardium leviooooosa!";
  }
}