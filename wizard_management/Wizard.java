package wizard_management;

public class Wizard implements Flyable, Protectable, Magicable {
  String name;
  Flyable ride;
  Protectable protector;
  Magicable magic;


  public Wizard(String name, Flyable ride, Protectable protector, Magicable magic){
    this.name = name;
    this.ride = ride;
    this.protector = protector;
    this.magic = magic;
  }

  public String getName(){
    return this.name;
  }

  public Flyable getRide(){
    return this.ride;
  }

  public Magicable getMagic(){
    return this.magic;
  }

  public String fly(){
    return this.ride.fly();
  }

  public void setRide(Flyable ride){
    this.ride = ride;
  }

  public Protectable getProtector(){
    return this.protector;
  }

  public String protect(){
    return this.protector.protect();
  }

  public void setProtector(Protectable protector){
    this.protector = protector;
  }

  public String doMagic(){
    return this.magic.doMagic();
  }

  public void setMagicItem(Magicable magic){
    this.magic = magic;
  }
}