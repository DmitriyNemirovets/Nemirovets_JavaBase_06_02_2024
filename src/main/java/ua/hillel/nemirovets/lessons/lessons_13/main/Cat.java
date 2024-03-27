package ua.hillel.nemirovets.lessons.lessons_13.main;

public final class Cat extends Animal {

    public static int counter = 0;
    public int nonStaticCounter = 0;

    public Cat(String name, int age) {
        super(name, age);
        counter++;
    }

    @Override
    void run() {
        System.out.println("Cat " + name + " run");
    }

    @Override
    void swim() {
        System.out.println("ITS NEW METHOD VERSION");
        System.out.println(counter);
        System.out.println(nonStaticCounter);
        demoStaticMethod();
    }


    public static void demoStaticMethod() {
        System.out.println("ITS STATIC METHOD");
        System.out.println(counter);
        demoStaticMethod2();
    }

    public static void demoStaticMethod2() {
        System.out.println("ITS STATIC METHOD");
        System.out.println(counter);
    }

}