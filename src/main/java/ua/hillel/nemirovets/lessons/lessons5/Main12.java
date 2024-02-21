package ua.hillel.nemirovets.lessons.lessons5;

import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the first team");
        String team1Name = scanner.nextLine();
        System.out.println("Name first team " + team1Name);
        System.out.println();
        System.out.println("Enter frags of players first team");

        int team1User1Int = 0;
        if (scanner.hasNextInt()) {
            team1User1Int = scanner.nextInt();
            System.out.println("The number of frags of player 1 first team " + team1User1Int);
        } else {
            System.out.println("Wrong data. Restart application");
            System.exit(0);
        }
        int team1User2Int = 0;
        if (scanner.hasNextInt()) {
            team1User2Int = scanner.nextInt();
            System.out.println("The number of frags of player 2 first team " + team1User2Int);
        } else {
            System.out.println("Wrong data. Restart application");
            System.exit(0);
        }
        int team1User3Int = 0;
        if (scanner.hasNextInt()) {
            team1User3Int = scanner.nextInt();
            System.out.println("The number of frags of player 3 first team " + team1User3Int);
        } else {
            System.out.println("Wrong data. Restart application");
            System.exit(0);
        }
        int team1User4Int = 0;
        if (scanner.hasNextInt()) {
            team1User4Int = scanner.nextInt();
            System.out.println("The number of frags of player 4 first team " + team1User4Int);
        } else {
            System.out.println("Wrong data. Restart application");
            System.exit(0);
        }
        int team1User5Int = 0;
        if (scanner.hasNextInt()) {
            team1User5Int = scanner.nextInt();
            System.out.println("The number of frags of player 5 first team " + team1User5Int);
        } else {
            System.out.println("Wrong data. Restart application");
            System.exit(0);
        }
        scanner.nextLine();

        System.out.println();
        System.out.println("Enter the name of the second team");
        String team2Name = scanner.nextLine();
        System.out.println("Name second team " + team2Name);
        System.out.println();
        System.out.println("Enter frags of players second team");

        int team2User1Int = 0;
        if (scanner.hasNextInt()) {
            team2User1Int = scanner.nextInt();
            System.out.println("The number of frags of player 1 second team" + team2User1Int);
        } else {
            System.out.println("Wrong data. Restart application");
            System.exit(0);
        }
        int team2User2Int = 0;
        if (scanner.hasNextInt()) {
            team2User2Int = scanner.nextInt();
            System.out.println("The number of frags of player 2 second team" + team2User2Int);
        } else {
            System.out.println("Wrong data. Restart application");
            System.exit(0);
        }
        int team2User3Int = 0;
        if (scanner.hasNextInt()) {
            team2User3Int = scanner.nextInt();
            System.out.println("The number of frags of player 3 second team" + team2User3Int);
        } else {
            System.out.println("Wrong data. Restart application");
            System.exit(0);
        }
        int team2User4Int = 0;
        if (scanner.hasNextInt()) {
            team2User4Int = scanner.nextInt();
            System.out.println("The number of frags of player 4 second team" + team2User4Int);
        } else {
            System.out.println("Wrong data. Restart application");
            System.exit(0);
        }
        int team2User5Int = 0;
        if (scanner.hasNextInt()) {
            team2User5Int = scanner.nextInt();
            System.out.println("The number of frags of player 5 second team " + team2User5Int);
        } else {
            System.out.println("Wrong data. Restart application");
            System.exit(0);
        }
        scanner.nextLine();

        double arithmeticAverageTeam1 = (team1User1Int + team1User2Int + team1User3Int + team1User4Int + team1User5Int) / 5;
        double arithmeticAverageTeam2 = (team2User1Int + team2User2Int + team2User3Int + team2User4Int + team2User5Int) / 5;

//        System.out.println("Arithmetic average  " + team1Name + " = " + arithmeticAverageTeam1);
//        System.out.println("Arithmetic average  " + team2Name + " = " + arithmeticAverageTeam2);

        if (arithmeticAverageTeam1 > arithmeticAverageTeam2) {
            System.out.println("Winner Team 1 " + team1Name + " = " + arithmeticAverageTeam1 + " points ");
        } else if (arithmeticAverageTeam1 < arithmeticAverageTeam2) {
            System.out.println("Winner Team 2 " + team2Name + " = " + arithmeticAverageTeam2 + " points ");
        } else {
            System.out.println("Team1 == Team2");
        }
    }
}
