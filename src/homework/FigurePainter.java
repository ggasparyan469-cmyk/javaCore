package homework;

public class FigurePainter {

        void figureOne () {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }


        void figureTwo () {
            for (int i = 5; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        void figureThree () {
            for (int i = 0; i <= 5; i++) {
                for (int j = 5; j > i; j--) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print(" *");
                }
                System.out.println();
            }
        }


        void figureFour () {
            for (int i = 5; i >= 0; i--) {
                for (int j = 5; j > i; j--) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }


        void figureFive () {
            for (int i = 0; i <= 5; i++) {
                for (int j = 5; j > i; j--) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("? ");
                }
                System.out.println();
            }

            System.out.println();

            for (int i = 0; i < 5; i++) {
                System.out.print("/ ");
            }

            System.out.println();

            System.out.println();

            for (int i = 5; i >= 0; i--) {
                for (int j = 5; j > i; j--) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("? ");
                }
                System.out.println();
            }
        }

    void figureSix(){
        for (int i = 0; i < 3; i++) {
            System.out.print(" *");
        }

        System.out.println();

        for (int i = 0; i < 2; i++) {
            System.out.println("*");
        }

        System.out.print("*");
        for (int i = 0; i < 4; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < 2; i++) {
            System.out.print("* ");
        }
        System.out.println();

        System.out.print("*");
        for (int i = 0; i < 5; i++) {
            System.out.print(" ");
        }
        System.out.println("*");


        for (int i = 0; i < 3; i++) {
            System.out.print(" *");
        }

    }
    void figureSeven(){
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }
    }
}






