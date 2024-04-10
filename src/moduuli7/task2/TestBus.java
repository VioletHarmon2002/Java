package moduuli7.task2;



public class TestBus {
    public static void main(String[] args) {

        Bus myBus = new Bus("My Bus", 100, 120);

        myBus.accelerate();

        myBus.passengerEnter(10);

        // Print the current speed and number of passengers
        System.out.println("Current speed: " + myBus.getSpeed());
        System.out.println("Number of passengers: " + myBus.getNumberOfPassengers());
    }
}
