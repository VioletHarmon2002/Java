package moduuli7.task1;

public class TestSportsCar {
    public static void main(String[] args) {

        SportsCar mySportsCar = new SportsCar("Toyota", 1000, 2020, 280, 180, 57);

        System.out.println("Accelerating...");
        mySportsCar.accelerate();
        System.out.println("Current speed: " + mySportsCar.getSpeed());

        System.out.println("Decelerating...");
        mySportsCar.decelerate(2);
        System.out.println("Current speed: " + mySportsCar.getSpeed());
    }
}
