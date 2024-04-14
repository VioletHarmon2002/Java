package moduuli8.task1;

interface Vehicle {
    void start();
    void stop();
    String getInfo();
}

class Car implements Vehicle {

    public void start() {
        System.out.println("Car is starting...");
    }

    public void stop() {
        System.out.println("Car is stopping...");
    }

    public String getInfo() {
        return "Car Information:\nType: Car\nFuel: Petrol\nColor: Red";
    }
}

class Motorcycle implements Vehicle {

    public void start() {
        System.out.println("Motorcycle is starting...");
    }

    public void stop() {
        System.out.println("Motorcycle is stopping...");
    }


    public String getInfo() {
        return "Motorcycle Information:\nType: Motorcycle\nFuel: Gasoline\nColor: Black";
    }
}

class Bus implements Vehicle {

    public void start() {
        System.out.println("Bus is starting...");
    }

    public void stop() {
        System.out.println("Bus is stopping...");
    }

    public String getInfo() {
        return "Bus Information:\nType: Bus\nFuel: Diesel\nCapacity: 40 passengers";
    }
}

class VehicleDemo {
    public static void main(String[] args) {
        System.out.println("Vehicle Demonstration\n");

        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();
        Vehicle bus = new Bus();

        System.out.println("Car is starting...");
        car.start();
        System.out.println("Car is stopping...");
        car.stop();
        System.out.println(car.getInfo() + "\n");

        System.out.println("Motorcycle is starting...");
        motorcycle.start();
        System.out.println("Motorcycle is stopping...");
        motorcycle.stop();
        System.out.println(motorcycle.getInfo() + "\n");

        System.out.println("Bus is starting...");
        bus.start();
        System.out.println("Bus is stopping...");
        bus.stop();
        System.out.println(bus.getInfo() + "\n");
    }
}
