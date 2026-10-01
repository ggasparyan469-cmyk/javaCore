package chapter5;

public class Examples {
    public static void main(String[] args) {
        int month = 4;
        String season;
        if (month == 12 || month == 1 || month == 2) {
            season = "winter";
        } else if (month == 3 || month == 4 || month == 5) {
            season = "spring";
        } else if (month == 6 || month == 7 || month == 8) {
            season = "summer";
        } else if (month == 9 || month == 10 || month == 11) {
            season = "autumn";
        } else
            season = "fictitious months";
        System.out.println("April refers to " + season + ".");

        System.out.println("ex 2");
        for (int i = 0; i < 6; i++) {
            switch (i) {
                case 0:
                    System.out.println("i = 0");
                    break;
                case 1:
                    System.out.println("i = unit");
                    break;
                case 2:
                    System.out.println("i = 2");
                    break;
                case 3:
                    System.out.println("i = 3");
                    break;
                default:
                    System.out.println("i>3");

            }

        }

        System.out.println();
        System.out.println("ex3");
        for (int i = 0; i < 12; i++) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("i < 5");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("i < 10");
                    break;
                default:
                    System.out.println("i>=10");
            }
        }

        System.out.println();
        System.out.println("ex4");
        int month1 = 4;
        String season1;
        switch (month1) {
            case 12:
            case 1:
            case 2:
                season1 = "winter";
                break;
            case 3:
            case 4:
            case 5:
                season1 = "spring";
                break;
            case 6:
            case 7:
            case 8:
                season1 = "summer";
            case 9:
            case 10:
            case 11:
                season1 = "autumn";
                break;
            default:
                season1 = "fictitious months";
        }
        System.out.println("APrel in " + season1 + ";");

        System.out.println();
        System.out.println("ex4");
        String str = "2";
        switch (str) {
            case "one":
                System.out.println("one");
                break;
            case "two":
                System.out.println("two");
                break;
            case "three":
                System.out.println("three");
                break;
            default:
                System.out.println("didn't match");
                break;

        }

        System.out.println();
        System.out.println("ex5");
        int n = 10;
        while (n > 0) {
            System.out.println("takt" + n);
            n--;
        }
        System.out.println();
        System.out.println("ex6");
        int l, m;
        l = 100;
        m = 200;
        while (++l < --m) ;
        System.out.println("The average value is equal to " + l);

        System.out.println();
        System.out.println("ex7");
        int n1;

        for (n1 = 10; n1 > 0; n1--) {
            System.out.println("takt" + n1);
        }

        System.out.println();
        System.out.println("ex8");

        int num;
        boolean isPrime;
        num = 14;
        if (num < 2) {
            isPrime = false;
        } else {
            isPrime = true;
        }
        for (int i = 2; i <= num / i; i++) {
            if ((num % i) == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Prime number");
        } else {
            System.out.println("No Prime number");
        }

        System.out.println();
        System.out.println("ex9");
        int k, b;
        b = 4;
        for (k = 1; k < b; k++) {
            System.out.println("k = " + k);
            System.out.println("b = " + b);
            b--;
        }
        System.out.println();
        System.out.println("ex10");
        outer:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j > i) {
                    System.out.println();
                    continue outer;
                }
                System.out.print(" " + (i * j));
            }
        }
    }
}

