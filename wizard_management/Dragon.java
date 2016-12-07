package wizard_management;

public class Dragon extends MythicalBeast implements Flyable, Protectable {

  public Dragon(String name){
    super(name);
  }

  public String fly(){
    return "Standing up tall, beating wings, lift off!";
  }

  public String protect(){
    return "roar";
  }

}