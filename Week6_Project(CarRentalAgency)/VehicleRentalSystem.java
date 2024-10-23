import java.util.Scanner;

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Creating a Car
        System.out.print("Enter Car Make: ");
        String carMake = scanner.nextLine();
        System.out.print("Enter Car Model: ");
        String carModel = scanner.nextLine();
        System.out.print("Enter Car Year: ");
        int carYear = scanner.nextInt();
        Car car = new Car(carMake, carModel, carYear);
        System.out.print("Enter Number of Doors: ");
        car.setNumberOfDoors(scanner.nextInt());
        System.out.print("Enter Fuel Type (Petrol/Diesel/Electric): ");
        car.setFuelType(scanner.next());

        // Creating a Motorcycle
        scanner.nextLine();  // Consume newline
        System.out.print("Enter Motorcycle Make: ");
        String motorcycleMake = scanner.nextLine();
        System.out.print("Enter Motorcycle Model: ");
        String motorcycleModel = scanner.nextLine();
        System.out.print("Enter Motorcycle Year: ");
        int motorcycleYear = scanner.nextInt();
        Motorcycle motorcycle = new Motorcycle(motorcycleMake, motorcycleModel, motorcycleYear);
        System.out.print("Enter Number of Wheels: ");
        motorcycle.setNumberOfWheels(scanner.nextInt());
        System.out.print("Enter Type of Motorcycle (Sport/Cruiser/Off-road): ");
        motorcycle.setType(scanner.next());

        // Creating a Truck
        scanner.nextLine();  // Consume newline
        System.out.print("Enter Truck Make: ");
        String truckMake = scanner.nextLine();
        System.out.print("Enter Truck Model: ");
        String truckModel = scanner.nextLine();
        System.out.print("Enter Truck Year: ");
        int truckYear = scanner.nextInt();
        Truck truck = new Truck(truckMake, truckModel, truckYear);
        System.out.print("Enter Cargo Capacity (in tons): ");
        truck.setCargoCapacity(scanner.nextDouble());
        System.out.print("Enter Transmission Type (Manual/Automatic): ");
        truck.setTransmissionType(scanner.next());

        // Display Vehicle Details
        System.out.println("\nVehicle Details:");
        System.out.println("Car: " + car.getMake() + " " + car.getModel() + " (" + car.getYear() + ") - " + 
                           car.getNumberOfDoors() + " doors, Fuel: " + car.getFuelType());
        System.out.println("Motorcycle: " + motorcycle.getMake() + " " + motorcycle.getModel() + " (" + motorcycle.getYear() + ") - " + 
                           motorcycle.getNumberOfWheels() + " wheels, Type: " + motorcycle.getType());
        System.out.println("Truck: " + truck.getMake() + " " + truck.getModel() + " (" + truck.getYear() + ") - " + 
                           truck.getCargoCapacity() + " tons, Transmission: " + truck.getTransmissionType());

        scanner.close();
    }
}
