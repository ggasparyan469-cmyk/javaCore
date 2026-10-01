package examples;

public class CarTest {
    public static void main(String[] args) {
        Car n1 = new Car();
        Car n2 = new Car("BMW","black",2026);
        Car n3 = new Car("Mercedes", "white", 2024);
        System.out.println(n2.model);
        System.out.println(n2.color);
        System.out.println(n2.year);
        System.out.println(n3.model);
        System.out.println(n3.color);
        System.out.println(n3.year);
    }
}
