package moduuli8.task3;

interface Vehicle {
    void start();
    void stop();
    String getInfo();
}

interface ElectricVehicle {
    void charge();
}


abstract class AbstractVehicle implements Vehicle, ElectricVehicle {
    private String type;
    private String fuel;

    public AbstractVehicle(String type, String fuel) {
        this.type = type;
        this.fuel = fuel;
    }

    public String getType() {
        return type;
    }

    public String getFuel() {
        return fuel;
    }

    public void displayFuel() {
        System.out.println("Fuel: " + fuel);
    }


    public void charge() {
        System.out.println("Charging the " + getType() + "...");
    }
}

class Car extends AbstractVehicle {
    private String color;

    public Car(String color) {
        super("Car", "Petrol");
        this.color = color;
    }

    public void start() {
        System.out.println("Car is starting...");
    }

    public void stop() {
        System.out.println("Car is stopping...");
    }

    public String getInfo() {
        return "Car Information:\nType: " + getType() + "\n";
    }

    public void displayColor() {
        System.out.println("Color: " + color);
    }
}

class Motorcycle extends AbstractVehicle {
    private String brand;

    public Motorcycle(String brand) {
        super("Motorcycle", "Gasoline");
        this.brand = brand;
    }

    public void start() {
        System.out.println("Motorcycle is starting...");
    }

    public void stop() {
        System.out.println("Motorcycle is stopping...");
    }

    public String getInfo() {
        return "Motorcycle Information:\nType: " + getType() + "\n";
    }

    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}


class ElectricCar extends AbstractVehicle {
    private String color;

    public ElectricCar(String color) {
        super("Electric Car", "Electricity");
        this.color = color;
    }

    public void start() {
        System.out.println("Electric Car is starting...");
    }

    public void stop() {
        System.out.println("Electric Car is stopping...");
    }

    public String getInfo() {
        return "Electric Car Information:\nType: " + getType() + "\n";
    }

    public void displayColor() {
        System.out.println("Color: " + color);
    }
}

class ElectricMotorcycle extends AbstractVehicle {
    private String brand;

    public ElectricMotorcycle(String brand) {
        super("Electric Motorcycle", "Electricity");
        this.brand = brand;
    }

    public void start() {
        System.out.println("Electric Motorcycle is starting...");
    }

    public void stop() {
        System.out.println("Electric Motorcycle is stopping...");
    }

    public String getInfo() {
        return "Electric Motorcycle Information:\nType: " + getType() + "\n";
    }

    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

class Bus extends AbstractVehicle {
    private int capacity;

    public Bus(int capacity) {
        super("Bus", "Diesel");
        this.capacity = capacity;
    }

    public void start() {
        System.out.println("Bus is starting...");
    }

    public void stop() {
        System.out.println("Bus is stopping...");
    }

    public String getInfo() {
        return "Bus Information:\nType: " + getType() + "\n";
    }

    public void displayCapacity() {
        System.out.println("Capacity: " + capacity + " passengers");
    }
}

class VehicleDemo {
    public static void main(String[] args) {
        System.out.println("Vehicle Demonstration\n");

        Car car = new Car("Red");
        Motorcycle motorcycle = new Motorcycle("Honda");
        ElectricCar electricCar = new ElectricCar("Blue");
        ElectricMotorcycle electricMotorcycle = new ElectricMotorcycle("Yamaha");

        System.out.println("Starting and stopping vehicles:\n");

        car.start();
        car.stop();
        System.out.println();

        motorcycle.start();
        motorcycle.stop();
        System.out.println();

        electricCar.start();
        electricCar.stop();
        System.out.println();

        electricMotorcycle.start();
        electricMotorcycle.stop();
        System.out.println();

        // Display information about each vehicle
        System.out.println("Vehicle Information:\n");

        System.out.println(car.getInfo());
        car.displayFuel();
        car.displayColor();
        System.out.println();

        System.out.println(motorcycle.getInfo());
        motorcycle.displayFuel();
        motorcycle.displayBrand();
        System.out.println();

        System.out.println(electricCar.getInfo());
        electricCar.displayFuel();
        electricCar.displayColor();
        electricCar.charge();
        System.out.println();

        System.out.println(electricMotorcycle.getInfo());
        electricMotorcycle.displayFuel();
        electricMotorcycle.displayBrand();
        electricMotorcycle.charge();
    }
}