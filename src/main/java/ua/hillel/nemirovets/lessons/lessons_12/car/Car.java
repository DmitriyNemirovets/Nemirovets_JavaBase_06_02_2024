package ua.hillel.nemirovets.lessons.lessons_12.car;


public class Car {

    public String color;
    protected double fuelStatus;
    int countWheels;
    private boolean isStart;
    private int demoVariable1;
    private int demoVariable2;
    private int demoVariable3;
    private int demoVariable4;

    public Car(String color, int countWheels) {
        this.color = color;
        this.countWheels = countWheels;
    }

    public Car(String color, int countWheels, double fuelStatus) {
        this.color = color;
        this.countWheels = countWheels;
    }

    public void start() {
        startElectronicSystem();
        startFuelSystem();
        startGPSSystem();
        isStart = true;
    }

    public void stop() {
        stopGPSSystem();
        stopFuelSystem();
        stopElectronicSystem();
        isStart = false;
    }

    private void startElectronicSystem() {
        System.out.println("Start electronic system");
    }

    private void startFuelSystem() {
        System.out.println("Start fuel system");
    }

    private void startGPSSystem() {
        System.out.println("Start GPS system");
    }

    private void stopElectronicSystem() {
        System.out.println("Stop electronic system");
    }

    private void stopFuelSystem() {
        System.out.println("Stop fuel system");
    }

    private void stopGPSSystem() {
        System.out.println("Stop GPS system");
    }


    public String getColor() {
        return color;
    }

    public double getFuelStatus() {
        return fuelStatus;
    }

    public int getCountWheels() {
        return countWheels;
    }

    public boolean isStart() {
        return isStart;
    }

    public int getDemoVariable1() {
        return demoVariable1;
    }

    public int getDemoVariable2() {
        return demoVariable2;
    }

    public int getDemoVariable3() {
        return demoVariable3;
    }

    public int getDemoVariable4() {
        return demoVariable4;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCountWheels(int countWheels) {
        this.countWheels = countWheels;
    }

    public void setDemoVariable1(int demoVariable1) {
        this.demoVariable1 = demoVariable1;
    }


}