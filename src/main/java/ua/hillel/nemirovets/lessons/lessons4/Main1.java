package ua.hillel.nemirovets.lessons.lessons4;

public class Main1 {
    public static void main(String[] args) {
        int liwarion = 13;
        int liarcher = 24;
        int lihorsman  = 46;
        int cauntwarionli = 860;
        int generalattackli = (liwarion + liarcher + lihorsman) * cauntwarionli;

        int minwarion = 9;
        int minarcher = 35;
        int minhorsman = 12;
        double cauntwarionmin = 860 * 1.5;
        int generalattackmin =  (minwarion + minarcher + minhorsman) * (int) cauntwarionmin;

        System.out.println(" = " + generalattackli);
        System.out.println(cauntwarionmin);
        System.out.println(" = "+ generalattackmin);

    }
}
