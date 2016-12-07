package wizard_management;

public class FordAnglia implements Flyable {

  String colour;

  public FordAnglia(String colour){
    this.colour = colour;
  }

  public String fly(){
    return "Activate the invisibility cloak!";
  }

}