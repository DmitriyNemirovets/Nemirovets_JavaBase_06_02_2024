package ua.hillel.nemirovets.lessons.lessons_13.main;

public abstract class Animal {

    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void run();


    void swim() {
        System.out.println(name + " swim");
    }

    final void demoFinalMethod() {
        System.out.println("ITS FINAL METHOD");
    }


    void demoFinalArgument(final int qwerty) {
        System.out.println(qwerty);
    }

}