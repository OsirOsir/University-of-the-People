// TruckVehicle Interface
interface TruckVehicle {
  void setCargoCapacity(double capacity);
  double getCargoCapacity();
  void setTransmissionType(String transmission);
  String getTransmissionType();
}

// Class Truck implementing Vehicle and TruckVehicle
class Truck implements Vehicle, TruckVehicle {
  private String make;
  private String model;
  private int year;
  private double cargoCapacity;
  private String transmission;

  public Truck(String make, String model, int year) {
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

  public void setCargoCapacity(double capacity) {
      this.cargoCapacity = capacity;
  }

  public double getCargoCapacity() {
      return cargoCapacity;
  }

  public void setTransmissionType(String transmission) {
      this.transmission = transmission;
  }

  public String getTransmissionType() {
      return transmission;
  }
}
