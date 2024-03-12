package ua.hillel.nemirovets.lessons.lessons9;

import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");

        String input;
        while (true) {
            input = scanner.nextLine();
            if (input.equals("Cencel")) {
                break;
            }
            System.out.println("You Entered : " + input);
        }

        System.out.println("Program closed");
        scanner.close();

    }
}
