package ua.hillel.nemirovets.lessons.lessons_15;

public class CarTypeClass {
    private String type;

    public static final CarTypeClass CAR = new CarTypeClass("�������i��");
    public static final CarTypeClass BUS = new CarTypeClass("�������");
    public static final CarTypeClass TRUCK = new CarTypeClass("������i���");
    public static final CarTypeClass MOTORCYCLE = new CarTypeClass("��������");

    private CarTypeClass(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
