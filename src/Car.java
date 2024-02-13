public class Car {
    public void Car(String name) {

    }
    public static String color;

    public Car() {
        type = "Lada";
        System.out.println("const");
    }
    boolean isPower;
    String type;

    boolean light;

    String model;

    public void Car(String type, String name) {
        this.type = type;
        this.model = model;
    }
    public void lightOn() {
        light = true;
    }
    public void print() {
        System.out.println();
    }

}
