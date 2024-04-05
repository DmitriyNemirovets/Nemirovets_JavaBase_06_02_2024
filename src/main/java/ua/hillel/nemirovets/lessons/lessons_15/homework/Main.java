package ua.hillel.nemirovets.lessons.lessons_15.homework;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalDrinks = 0;
        double totalCost = 0.0;

        while (true) {
            System.out.println("Оберіть напій (1 - Coffee, 2 - Tea, 3 - Lemonade, 4 - Mojito, 5 - Mineral Water, 6 - Coca Cola, 0 - Завершити): ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            }

            switch (choice) {
                case 1:
                    makeCoffee();
                    totalDrinks++;
                    totalCost += Drinks.COFFEE_PRICE;
                    break;
                case 2:
                    makeTea();
                    totalDrinks++;
                    totalCost += Drinks.TEA_PRICE;
                    break;
                case 3:
                    makeLemonade();
                    totalDrinks++;
                    totalCost += Drinks.LEMONADE_PRICE;
                    break;
                case 4:
                    makeMojito();
                    totalDrinks++;
                    totalCost += Drinks.MOJITO_PRICE;
                    break;
                case 5:
                    makeMineralWater();
                    totalDrinks++;
                    totalCost += Drinks.MINERAL_WATER_PRICE;
                    break;
                case 6:
                    makeCocaCola();
                    totalDrinks++;
                    totalCost += Drinks.COCA_COLA_PRICE;
                    break;
                default:
                    System.out.println("Недійсний вибір");
                    break;
            }
            System.out.println("Загальна кількість напоїв: " + totalDrinks);
            System.out.println("Загальна сума до сплати: $" + totalCost);
        }
        scanner.close();
    }

    public static void makeCoffee() {
        System.out.println("Готуємо каву...");
    }

    public static void makeTea() {
        System.out.println("Готуємо чай...");
    }

    public static void makeLemonade() {
        System.out.println("Готуємо лимонад...");
    }

    public static void makeMojito() {
        System.out.println("Готуємо мохіто...");
    }

    public static void makeMineralWater() {
        System.out.println("Готуємо мінеральну воду...");
    }

    public static void makeCocaCola() {
        System.out.println("Готуємо кока-колу...");
    }
}