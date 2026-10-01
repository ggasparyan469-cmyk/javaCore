package chapter2;

public class Example2 {
    public static void main(String[] args) {
//        System.out.println("start");
//        for (int i = 0; i < 7; i++) {
//            System.out.print("* ");
//           C
//        }

//        for (int i = 0; i < 5; i++) {
//            System.out.println("i" + i);
//            for (int j = 0; j < 3; j++) {
//                System.out.println("j" + j++);
//
//            }
//        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

    }
}
