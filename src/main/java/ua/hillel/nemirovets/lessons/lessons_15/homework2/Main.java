package ua.hillel.nemirovets.lessons.lessons_15.homework2;

import java.util.Scanner;

import static ua.hillel.nemirovets.lessons.lessons_15.homework2.Drinks.getDrink;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalDrinks = 0;
        double totalCost = 0.0;

        while (true) {
            System.out.println("CHOOSE A DRINK :\n Coffee,\n Tea,\n Lemonade,\n Mojito,\n Mineral Water,\n Coca Cola,\n exit to complete ");
            String choice = scanner.nextLine();


            if (choice.equalsIgnoreCase("exit")) {
                break;
            }

            DrinksMachine drink = getDrink(choice);
            if (drink != null) {
                Drinks.makeDrink(drink);
                totalDrinks++;
                switch (drink) {
                    case COFFEE:
                        totalCost += Drinks.COFFEE_PRICE;
                        break;
                    case TEA:
                        totalCost += Drinks.TEA_PRICE;
                        break;
                    case LEMONADE:
                        totalCost += Drinks.LEMONADE_PRICE;
                        break;
                    case MOJITO:
                        totalCost += Drinks.MOJITO_PRICE;
                        break;
                    case MINERAL_WATER:
                        totalCost += Drinks.MINERAL_WATER_PRICE;
                        break;
                    case COCA_COLA:
                        totalCost += Drinks.COCA_COLA_PRICE;
                        break;
                }
            } else {
                System.out.println("Invalid selection");
            }


            System.out.println("Total number of drinks: " + totalDrinks);
            System.out.println("Total amount due: $ " + totalCost);

        }
        scanner.close();
    }
}

