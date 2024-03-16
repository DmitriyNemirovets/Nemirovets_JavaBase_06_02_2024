package ua.hillel.nemirovets.lessons.lessons_11;

public class BurgerMain {
    public static void main(String[] args) {

        Burger burgerRegular = new Burger("Roll", "Meat", "Cheese", "Green", "Mayonnaise");
        System.out.println("BURGER REGALAR : " + burgerRegular);
        System.out.println();


        Burger burgerDiet = new Burger("Roll", "Meat", "Cheese", "Green");
        System.out.println("BURGER DIET : " + burgerDiet);
        System.out.println();


        Burger burgerDoubleMeat = new Burger("Roll", "Meat", "Cheese", "Green", "Mayonnaise", true);
        System.out.println("BOURGER DOUBLE MEAT : " + burgerDoubleMeat);

    }
}
