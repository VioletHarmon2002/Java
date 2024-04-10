package moduuli7.task2;

public class Bus extends Car2 {
    private int numberOfPassengers;

    public Bus(String typeName, double gasolineCapacity, double topSpeed) {
        super(typeName, gasolineCapacity, topSpeed);
        numberOfPassengers = 0;
    }

    public void passengerEnter(int numberOfPassengers) {
        this.numberOfPassengers += numberOfPassengers;
    }

    public void passengerExit(int numberOfPassengers) {
        this.numberOfPassengers -= numberOfPassengers;
        if (this.numberOfPassengers < 0) {
            this.numberOfPassengers = 0;
        }
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }
}