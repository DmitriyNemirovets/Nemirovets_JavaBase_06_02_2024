package ua.hillel.nemirovets.lessons.lessons_13.demo;

public class Main {

    public static void main(String[] args) {

        Class1 class1 = new Class1();
        Class2 class2 = new Class2();
        Class3 class3 = new Class3();
        Class4 class4 = new Class4();
        Class5 class5 = new Class5();


//        class1.methodClass1();
//
//        class2.methodClass1();
//        class2.methodClass2();
//
//        class3.methodClass1();
//        class3.methodClass2();
//        class3.methodClass3();
//
//        class4.methodClass1();
//        class4.methodClass2();
//        class4.methodClass3();
//        class4.methodClass4();
//
//        class5.methodClass1();
//        class5.methodClass2();
//        class5.methodClass3();
//        class5.methodClass4();
//        class5.methodClass5();
//
//
//        Class1 demo = new Class5();
//
//        demo.methodClass1();


        demoMethod2(class3);

    }

    static void demoMethod2(AbsClass obj) {

        if (obj.getClass() == Class1.class) {
            ((Class1) obj).methodClass1();
        }

        if (obj.getClass() == Class2.class) {
            ((Class2) obj).methodClass2();
        }

        if (obj.getClass() == Class3.class) {
            ((Class3) obj).methodClass3();
        }

        if (obj.getClass() == Class4.class) {
            ((Class4) obj).methodClass4();
        }

        if (obj.getClass() == Class5.class) {
            ((Class5) obj).methodClass5();
        }

    }

    static void demoMethod(AbsClass obj) {

        if (obj instanceof Class1) {
            ((Class1) obj).methodClass1();
        }

        if (obj instanceof Class2) {
            ((Class2) obj).methodClass2();
        }

        if (obj instanceof Class3) {
            ((Class3) obj).methodClass3();
        }

        if (obj instanceof Class4) {
            ((Class4) obj).methodClass4();
        }

        if (obj instanceof Class5) {
            ((Class5) obj).methodClass5();
        }

    }


//    static void demoMethod(Class1 class1) {
//        class1.methodClass1();
//    }
//
//    static void demoMethod(Class2 class2) {
//        class2.methodClass1();
//        class2.methodClass2();
//    }
//
//    static void demoMethod(Class3 class3) {
//        class3.methodClass1();
//        class3.methodClass2();
//        class3.methodClass3();
//    }
}