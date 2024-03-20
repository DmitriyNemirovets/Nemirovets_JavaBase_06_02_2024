package ua.hillel.nemirovets.lessons.lessons_12.fitness;

public class Main {
    public static void main(String[] args) {
        FitnessTrackerUser user1 = new FitnessTrackerUser("Kiril", 17, 5, 2012, "kiril@gmail.com", "1111111111","Nemirovets",27.2,"120/80",9000);
        FitnessTrackerUser user2 = new FitnessTrackerUser("Tanya", 25, 9, 1987, "tanya@gmail.com", "2222222222","Nemirovets",54.2,"110/75",10000);
        FitnessTrackerUser user3 = new FitnessTrackerUser("Matvey", 28, 9, 2018, "matvey@gmail.com", "3333333333","Nemirovets",23.2,"120/80",6000);

        user1.setSurname("Nemirovets");
        user1.setWeight(80);
        user1.setBloodPressure("120/80");
        user1.setStepsPerDay(10000);

        user2.setSurname("Nemirovets");
        user2.setWeight(56.2);
        user2.setBloodPressure("110/70");
        user2.setStepsPerDay(12000);

        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();
    }
}
