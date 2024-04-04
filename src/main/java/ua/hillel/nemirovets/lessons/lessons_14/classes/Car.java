//package ua.hillel.nemirovets.lessons.lessons_14.classes;
//
//import ua.hillel.nemirovets.lessons.lessons_14.demointerfaces.Interface1;
//import ua.hillel.nemirovets.lessons.lessons_14.demointerfaces.Interface2;
//
//import javax.management.ObjectName;
//
//public class Car {
//
//    private String modelName;
//    private double fuelStatus;
//    private static boolean isStart;
//    public String color;
//    private Engine engine;
//    private Door door;
//
//
//    public Car(String modelName, double fuelStatus, String color, double horsePower, String title) {
//        this.modelName = modelName;
//        this.fuelStatus = fuelStatus;
//        this.color = color;
//        engine = new Engine(horsePower);
//        door = new Door(title);
//    }
//
//    private void privateMethodClassCar() {
//        System.out.println("FROM CAR");
//        engine.start();
//        System.out.println(engine.horsePower);
//
//
//    }
//
//    public void demoLocalClass() {
//        class LocalClass extends Object implements Interface1 {
//            private String variable;
//
//            public LocalClass(String variable) {
//                this.variable = variable;
//            }
//
//            public String getVariable() {
//                return variable;
//            }
//        }
//        LocalClass localClass = new LocalClass("sdfsdfdsfds");
//        System.out.println(localClass.getVariable());
//    }
//
//
//    static void staticMethodClassCar() {
//        System.out.println("STATIC FROM CAR");
//    }
//
//    static class Door extends Object implements Interface1 {
//        String title;
//
//        public Door(String title) {
//            this.title = title;
//        }
//
//        void demo() {
//            System.out.println(isStart);
////            System.out.println(modelName);
//            staticMethodClassCar();
//        }
//    }
//
//    class SuperEngine {
//
//    }
//
//    class Engine extends SuperEngine implements Interface1, Interface2 {
//
//        double horsePower;
//
//        public Engine(double horsePower) {
//            this.horsePower = horsePower;
//        }
//
//        public void start() {
//            isStart = true;
//        }
//
//        public void stop() {
//            isStart = false;
//        }
//
//        private void privateMethodClassEngine() {
//            System.out.println("qweqweqwe");
//        }
//
//        @Override
//        public void demoMethod() {
//            Interface1.super.demoMethod();
//        }
//    }
//
//}