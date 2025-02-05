class Vehicle {
    protected String brand;
    protected String model;
    protected double price;
    
    public Vehicle(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}
class Car extends Vehicle {
    protected int seatingCapacity;
    protected String fuelType;

    public Car(String brand, String model, double price, int seatingCapacity, String fuelType) {
        super(brand, model, price); 
        this.seatingCapacity = seatingCapacity;
        this.fuelType = fuelType;
    }

    // -> Overriding displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class ElectricCar extends Car {
    private double batteryCapacity; // in kWh
    private double chargingTime; // in hours

    public ElectricCar(String brand, String model, double price, int seatingCapacity, double batteryCapacity, double chargingTime) {
        super(brand, model, price, seatingCapacity, "Electric"); // Calls Car constructor
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charging Time: " + chargingTime + " hours");
    }
}

class Motorcycle extends Vehicle {
    private int engineCapacity; // in cc
    private String type; // e.g., "Sport", "Cruiser"

    public Motorcycle(String brand, String model, double price, int engineCapacity, String type) {
        super(brand, model, price); // Calls Vehicle constructor
        this.engineCapacity = engineCapacity;
        this.type = type;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Engine Capacity: " + engineCapacity + " cc");
        System.out.println("Type: " + type);
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Fortuner", 30000, 5, "Petrol");
        ElectricCar eCar = new ElectricCar("Tesla", "Model 3", 50000, 5, 75, 6);
        Motorcycle bike = new Motorcycle("Yamaha", "R1", 25000, 998, "Sport");
        
        System.out.println("Car Details are :");
        car.displayDetails();
        System.out.println("\nElectric Car Details are as follows:");
        eCar.displayDetails();
        System.out.println("\nMotorcycle Details is as follows:");
        bike.displayDetails();
    }
}
