package homework;

public class Homework1 {
    public static void main(String[] args) {
        int x, y;
        x = 12;
        y = 23;
        if (x > y) {
            System.out.println("x>y");
        }
        if (x < y) {
            System.out.println("x<y");
        }

        System.out.println("----------");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println("----------");
        int a = 5;
        int b = 7;
        System.out.println("a+b = " + (a + b));
        System.out.println("----------");
        int n = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
}



