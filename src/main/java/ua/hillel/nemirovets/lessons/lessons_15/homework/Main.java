package ua.hillel.nemirovets.lessons.lessons_15.homework;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalDrinks = 0;
        double totalCost = 0.0;

        while (true) {
            System.out.println("Choose a drink  (1 - Coffee, 2 - Tea, 3 - Lemonade, 4 - Mojito, 5 - Mineral Water, 6 - Coca Cola, 0 - to complete): ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            }

            switch (choice) {
                case 1:
                    Drinks.makeDrink(DrinksMachine.COFFEE);
                    totalDrinks++;
                    totalCost += Drinks.COFFEE_PRICE;
                    break;
                case 2:
                    Drinks.makeDrink(DrinksMachine.TEA);
                    totalDrinks++;
                    totalCost += Drinks.TEA_PRICE;
                    break;
                case 3:
                    Drinks.makeDrink(DrinksMachine.LEMONADE);
                    totalDrinks++;
                    totalCost += Drinks.LEMONADE_PRICE;
                    break;
                case 4:
                    Drinks.makeDrink(DrinksMachine.MOJITO);
                    totalDrinks++;
                    totalCost += Drinks.MOJITO_PRICE;
                    break;
                case 5:
                    Drinks.makeDrink(DrinksMachine.MINERAL_WATER);
                    totalDrinks++;
                    totalCost += Drinks.MINERAL_WATER_PRICE;
                    break;
                case 6:
                    Drinks.makeDrink(DrinksMachine.COCA_COLA);
                    totalDrinks++;
                    totalCost += Drinks.COCA_COLA_PRICE;
                    break;
                default:
                    System.out.println("Invalid selection");
                    break;
            }

            System.out.println("Total number of drinks: " + totalDrinks);
            System.out.println("Total amount due: $" + totalCost);
        }
        scanner.close();
    }
}