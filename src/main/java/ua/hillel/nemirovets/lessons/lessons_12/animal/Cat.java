package ua.hillel.nemirovets.lessons.lessons_12.animal;

public class Cat extends Animal {

    String color;

    @Override
    void run() {
//        super.run();
        System.out.println(name + " color " + color + " run!!!!!!!!!");
    }

}
