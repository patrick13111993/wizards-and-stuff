package wizard_management;

public abstract class Equipment {

  String material;

  public Equipment(String material){
    this.material = material;
  }

  public String getMaterial(){
    return this.material;
  }
}