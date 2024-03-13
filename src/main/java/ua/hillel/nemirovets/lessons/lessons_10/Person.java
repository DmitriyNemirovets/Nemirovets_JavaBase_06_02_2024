package ua.hillel.nemirovets.lessons.lessons_10;

public class Person {
    public static void main(String[] args) {
        personInfo("Will", "Smith", "New York ", "2936729462846");
        System.out.println();
        personInfo("Jackie ", "Chan", "Shanghai", "12312412412");
        System.out.println();
        personInfo("Sherlock ", "Holmes", "London ", "37742123513");

    }

    static void personInfo(String name, String surname, String town, String tel) {
        System.out.println("Call a citizen " + name + " " + surname + " in  town " + town + "you can by number " + tel);

    }
}
