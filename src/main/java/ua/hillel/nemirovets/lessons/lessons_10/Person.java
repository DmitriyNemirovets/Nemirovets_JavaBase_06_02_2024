package ua.hillel.nemirovets.lessons.lessons_10;

public class Person {
    public static void main(String[] args) {
        Person person = new Person();

        System.out.println(person.personInfo("Will", "Smith", "New York", "2936729462846"));
        System.out.println(person.personInfo("Jackie", "Chan", "Shanghai", "12312412412"));
        System.out.println(person.personInfo("Sherlock", "Holmes", "London", "37742123513"));
    }

    public String personInfo(String name, String surname, String city, String phone) {
        return "Call a citizen " + name + " " + surname + " in  town " + city + " you can by number " + phone + ".";
    }
}