package ua.hillel.nemirovets.lessons.lessons7;


import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {

        int[] team1 = new int[25];
        int[] team2 = new int[25];

        double sumTeam1 = 0.0;
        double sumTeam2 = 0D;

        for (int i = 0; i < team1.length; i++) {
            int minOld = 18;
            int maxOld = 40;
            maxOld -= minOld;
            int rezultTeam1Old = (int) (Math.random() * ++maxOld) + minOld;
            team1[i] = (rezultTeam1Old + 1);
            sumTeam1 += team1[i];
        }
        for (int i = 0; i < team2.length; i++) {
            int minOld = 18;
            int maxOld = 40;
            maxOld -= minOld;
            int rezultTeam2Old = (int) (Math.random() * ++maxOld) + minOld;
            team2[i] = (rezultTeam2Old + 1);
            sumTeam2 += team2[i];
        }
        System.out.println(Arrays.toString(team1));
        System.out.println(Arrays.toString(team2));
        System.out.println("Average age of players One Team = " + sumTeam1 / team1.length);
        System.out.println("Average age of players Two Team = " + sumTeam2 / team2.length);
    }
}
