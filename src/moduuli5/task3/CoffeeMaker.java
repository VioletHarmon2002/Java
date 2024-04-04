package moduuli5.task3;

public class CoffeeMaker {
    private boolean isOn;
    private CoffeeType coffeeType;
    private int coffeeAmount;

    public CoffeeMaker() {
        isOn = false;
        coffeeType = CoffeeType.NORMAL;
        coffeeAmount = 50;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setCoffeeType(CoffeeType type) {
        if (isOn) {
            coffeeType = type;
        }
    }

    public CoffeeType getCoffeeType() {
        return coffeeType;
    }

    public void setCoffeeAmount(int amount) {
        if (isOn && amount >= 10 && amount <= 80) {
            coffeeAmount = amount;
        }
    }

    public int getCoffeeAmount() {
        return coffeeAmount;
    }

    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker();

        // Turn on the coffee maker
        coffeeMaker.turnOn();

        // Set the coffee type
        coffeeMaker.setCoffeeType(CoffeeType.ESPRESSO);

        // Set the coffee amount
        coffeeMaker.setCoffeeAmount(60);

        // Turn off the coffee maker
        coffeeMaker.turnOff();

        // Print the coffee type and amount (will retain the last set values)
        System.out.println("Coffee Type: " + coffeeMaker.getCoffeeType());
        System.out.println("Coffee Amount: " + coffeeMaker.getCoffeeAmount() + " ml");
    }
}
