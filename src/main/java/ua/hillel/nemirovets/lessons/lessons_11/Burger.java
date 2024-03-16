package ua.hillel.nemirovets.lessons.lessons_11;

import java.awt.font.TextHitInfo;

public class Burger {

    String roll;
    String meat;
    String cheese;
    String green;
    String mayonnaise;

    Burger(String roll, String meat, String cheese, String green, String mayonnaise) {
        this.roll = roll;
        this.meat = meat;
        this.cheese = cheese;
        this.green = green;
        this.mayonnaise = mayonnaise;
    }

    Burger(String roll, String meat, String cheese, String green) {
        this.roll = roll;
        this.meat = meat;
        this.cheese = cheese;
        this.green = green;
    }

    Burger(String roll, String meat, String cheese, String green, String mayonnaise, boolean doubleMeat) {
        this.roll = roll;
        this.meat = meat;
        this.cheese = cheese;
        this.green = green;
        this.mayonnaise = mayonnaise;
        if (doubleMeat) {
            this.meat += "(double)";
        }
    }

    @Override
    public String toString() {
        return "Burger{" +
                "roll='" + roll + '\'' +
                ", meat='" + meat + '\'' +
                ", cheese='" + cheese + '\'' +
                ", green='" + green + '\'' +
                ", mayonnaise='" + mayonnaise + '\'' +
                '}';
    }
}


