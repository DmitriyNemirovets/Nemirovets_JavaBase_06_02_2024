package ua.hillel.nemirovets.lessons.lessons_12.fitness;
import java.util.Calendar;

class FitnessTrackerUser {
     private final String name;
     private final int birthDay;
     private final int birthMonth;
     private final int birthYear;
     private final String email;
     private final String phone;
     private String surname;
     private double weight;
     private String bloodPressure;
     private int stepsPerDay;
     private final int age;

    public FitnessTrackerUser(String name, int birthDay, int birthMonth, int birthYear, String email, String phone) {
        this.name = name;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.email = email;
        this.phone = phone;


        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        this.age = currentYear - birthYear;
    }

    public String getName() {
        return name;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setStepsPerDay(int stepsPerDay) {
        this.stepsPerDay = stepsPerDay;
    }

    public int getStepsPerDay() {
        return stepsPerDay;
    }

    public void printAccountInfo() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Date of Birth: " + birthDay + "/" + birthMonth + "/" + birthYear);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Weight: " + weight);
        System.out.println("Blood Pressure: " + bloodPressure);
        System.out.println("Steps per Day: " + stepsPerDay);
        System.out.println();
    }


}
