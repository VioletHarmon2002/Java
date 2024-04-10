package moduuli7.task1;


public class SportsCar extends Car1 {
    private double accelerationRate;
    private double decelerationRate;
    private double gasolineConsumptionRate;

    public SportsCar(String typeName, double gasolineCapacity, double topSpeed,
                     double accelerationRate, double decelerationRate, double gasolineConsumptionRate) {
        super(typeName, gasolineCapacity, topSpeed);
        this.accelerationRate = accelerationRate;
        this.decelerationRate = decelerationRate;
        this.gasolineConsumptionRate = gasolineConsumptionRate;
    }

    public void accelerate() {
        if (getGasolineLevel() > 0 && getSpeed() < getTopSpeed()) {
            setSpeed(getSpeed() + accelerationRate);
            decreaseGasolineLevel(gasolineConsumptionRate);
        } else {
            setSpeed(Math.min(getSpeed(), getTopSpeed()));
        }
    }

    private void decreaseGasolineLevel(double gasolineConsumptionRate) {
    }

    private void setSpeed(double v) {
    }

    private double getTopSpeed() {
        return 0;
    }

    public void decelerate(int amount) {
        if (getGasolineLevel() > 0) {
            if (amount > 0) {
                setSpeed(Math.max(0, getSpeed() - decelerationRate * amount));
                decreaseGasolineLevel(gasolineConsumptionRate);
            }
        } else {
            setSpeed(0);
        }
    }
}
