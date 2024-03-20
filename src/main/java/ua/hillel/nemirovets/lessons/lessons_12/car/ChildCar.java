package ua.hillel.nemirovets.lessons.lessons_12.car;

public class ChildCar extends Car{
    public ChildCar(String color, int countWheels) {
        super(color, countWheels);
    }

    void demo() {
        System.out.println(fuelStatus);
        System.out.println(countWheels);
    }

}
