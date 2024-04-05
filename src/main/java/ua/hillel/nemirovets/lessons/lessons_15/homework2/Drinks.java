package ua.hillel.nemirovets.lessons.lessons_15.homework2;

public class Drinks {
    public static final double COFFEE_PRICE = 2.50;
    public static final double TEA_PRICE = 1.80;
    public static final double LEMONADE_PRICE = 2.00;
    public static final double MOJITO_PRICE = 3.50;
    public static final double MINERAL_WATER_PRICE = 1.00;
    public static final double COCA_COLA_PRICE = 1.50;

    public static void makeDrink(DrinksMachine drinkMachine) {
        System.out.println("We are cooking " + drinkMachine.toString().toLowerCase() + "...");
    }

    public static DrinksMachine getDrink(String choice) {
        switch (choice.toLowerCase()) {
            case "coffee":
                return DrinksMachine.COFFEE;
            case "tea":
                return DrinksMachine.TEA;
            case "lemonade":
                return DrinksMachine.LEMONADE;
            case "mojito":
                return DrinksMachine.MOJITO;
            case "mineral water":
                return DrinksMachine.MINERAL_WATER;
            case "coca cola":
                return DrinksMachine.COCA_COLA;
            default:
                return null;
        }
    }
}
