package homework;

public class ArrayUtil {
    public static void main(String[] args) {
        //Տպել զանգվածի բոլոր էլէմենտները
        System.out.println("---1---");
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8, 9};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        //Տպել առաջին էլեմենտը
        System.out.println("---2---");
        System.out.println("First Element:" + numbers[0]);

        //Տպել վերջին էլեմենտը
        System.out.println("---3---");
        System.out.println("Last Element:" + numbers[numbers.length - 1]);

        //Տպել զանգվածի երկարությունը
        System.out.println("---4---");
        System.out.println("Array length:" + numbers.length);

        //Գտնել ամենափոքր թիվը
        System.out.println("---5---");
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Minimum number:" + min);

        //Տպել զանգվածի մեջտեղի էլեմենտը
        System.out.println("---6---");
        if (numbers.length <= 2) {
            System.out.println("Can't print middle values");
        } else if (numbers.length % 2 != 0) {
            System.out.println("Middle Element:" + numbers[numbers.length / 2]);
        } else {
            System.out.println("Middle Element:" + numbers[numbers.length / 2 - 1] + " "
                    + numbers[numbers.length / 2]);
        }

        //Հաշվել զույգ թվերի քանակը
        System.out.println("---7---");
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Even numbers count: " + count);

        //Հաշվել կենտ թվերի քանակը
        System.out.println("---8---");
        int count1 = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                count1++;
            }
        }
        System.out.println("Odd numbers count: " + count1);

        //Հաշվել զանգվածի էլեմենտների գումարը
        System.out.println("---9---");
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);

        //Հաշվել միջին թվաբանականը
        System.out.println("---10---");
        double sum1 = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum1 += numbers[i];
        }
        System.out.println(sum1 / numbers.length);

        //Գտնել ամենամեծ թիվը
        System.out.println("---Bonus1---");
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Maximum number:" + max);

        //Հաշվել դրական և բացասական թվերը
        System.out.println("---Bonus2---");
        int evenCount = 0, oddCount = 0, zeroCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                zeroCount++;
            } else if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
        System.out.println("Zero count: " + zeroCount);

        //Տպել զանգվածը հակառակ հերթականությամբ
        System.out.println("---Bonus3---");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

}

