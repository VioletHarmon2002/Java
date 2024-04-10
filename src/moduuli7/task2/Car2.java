package moduuli7.task2;

public class Car2 {
    private double speed;
    private double gasolineLevel;
    private String typeName;

    private double gasolineCapacity;
    private double topSpeed;

    public Car2(String typeName) {
        speed = 0;
        this.typeName = typeName;
        gasolineLevel = 0;
    }

    public Car2(String typeName, double gasolineCapacity, double topSpeed) {
        this(typeName);
        this.gasolineCapacity = gasolineCapacity;
        this.topSpeed = topSpeed;
    }

    public void accelerate() {
        if (gasolineLevel > 0 && speed < topSpeed)
            speed += 10;
        else
            speed = Math.min(speed, topSpeed);
    }

    void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
    }

    double getSpeed() {
        return speed;
    }

    String getTypeName() {
        return typeName;
    }

    void fillTank() {
        gasolineLevel = 100;
    }

    double getGasolineLevel() {
        return gasolineLevel;
    }
}

