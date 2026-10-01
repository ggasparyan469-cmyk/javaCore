package chapter2;

public class Example {
    public static void main(String[] args) {

        int num;
        num = 120;
        System.out.println("num = " + num);
        num = num * 2;
        System.out.println("num * 2 = " + num);

        if (num > 100) {
            System.out.println("num > 100");
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
