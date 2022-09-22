package interface_project.models;

public class Vehicle {

  private String model;

  //----------------------
  //!       CONSTRUCTOR
  //----------------------
  public Vehicle(String model) {
    this.model = model;
  }

  public Vehicle() {}

  //----------------------
  //! GETTERS AND SETTERS
  //----------------------
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }
}
