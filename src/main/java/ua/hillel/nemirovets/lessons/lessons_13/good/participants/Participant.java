package ua.hillel.nemirovets.lessons.lessons_13.good.participants;

public abstract class Participant {

    private String name;

    public Participant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}