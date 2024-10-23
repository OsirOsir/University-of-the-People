// MotorVehicle Interface
interface MotorVehicle {
  void setNumberOfWheels(int wheels);
  int getNumberOfWheels();
  void setType(String type);
  String getType();
}

// Class Motorcycle implementing Vehicle and MotorVehicle
class Motorcycle implements Vehicle, MotorVehicle {
  private String make;
  private String model;
  private int year;
  private int numberOfWheels;
  private String type;

  public Motorcycle(String make, String model, int year) {
      this.make = make;
      this.model = model;
      this.year = year;
  }

  public String getMake() {
      return make;
  }

  public String getModel() {
      return model;
  }

  public int getYear() {
      return year;
  }

  public void setNumberOfWheels(int wheels) {
      this.numberOfWheels = wheels;
  }

  public int getNumberOfWheels() {
      return numberOfWheels;
  }

  public void setType(String type) {
      this.type = type;
  }

  public String getType() {
      return type;
  }
}
