package ua.hillel.nemirovets.lessons.lessons_11;

public class Burger1Main {
    public static void main(String[] args) {
//        Burger1 burgerRegular = new Burger1();
//        burgerRegular.burgerRegular();

        Burger1 burgerRegular = new Burger1("Roll","Meat","Cheese","Green","Mayonnaise");
        burgerRegular.burgerRegular();
        System.out.println();

        Burger1 burgerDiet = new Burger1("Roll","Meat","Cheese","Green");
        burgerDiet.burgerDiet();
        System.out.println();

        Burger1 burgerDoubleMeat = new Burger1("Roll","Meat","Cheese","Green","Mayonnaise",true);
        burgerDoubleMeat.burgerDoubleMeat();














    }

}
