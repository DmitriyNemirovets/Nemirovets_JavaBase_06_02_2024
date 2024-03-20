package ua.hillel.nemirovets.lessons.lessons_12.car;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Black", 4);

        car.start();

        System.out.println(car.countWheels);

        System.out.println(car.getDemoVariable1());

//        System.out.println(car.demoVariable3);
//        car.getDemoVariable1();
        car.setDemoVariable1(123);

    }
}
