package ua.hillel.nemirovets.lessons.lessons_12.animal;

public class ChildCat extends Cat {



    void meow() {
        System.out.println(name + " color " + color + " meow!!!");
    }

    @Override
    void run() {
        System.out.println("NEW VERSION");
    }
}