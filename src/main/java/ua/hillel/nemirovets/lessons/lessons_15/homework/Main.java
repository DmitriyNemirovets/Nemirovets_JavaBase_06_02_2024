package ua.hillel.nemirovets.lessons.lessons_15.homework;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalDrinks = 0;
        double totalCost = 0.0;

        while (true) {
            System.out.println("������ ���� (1 - Coffee, 2 - Tea, 3 - Lemonade, 4 - Mojito, 5 - Mineral Water, 6 - Coca Cola, 0 - ���������): ");
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
                    System.out.println("�������� ����");
                    break;
            }
            System.out.println("�������� ������� �����: " + totalDrinks);
            System.out.println("�������� ���� �� ������: $" + totalCost);
        }
        scanner.close();
    }

    public static void makeCoffee() {
        System.out.println("������ ����...");
    }

    public static void makeTea() {
        System.out.println("������ ���...");
    }

    public static void makeLemonade() {
        System.out.println("������ �������...");
    }

    public static void makeMojito() {
        System.out.println("������ ������...");
    }

    public static void makeMineralWater() {
        System.out.println("������ ��������� ����...");
    }

    public static void makeCocaCola() {
        System.out.println("������ ����-����...");
    }
}