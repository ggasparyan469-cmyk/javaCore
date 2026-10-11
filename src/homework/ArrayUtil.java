package homework;

public class ArrayUtil {
    public static void main(String[] args) {
        //Տպել զանգվածի բոլոր էլէմենտները
        System.out.println("---1---");
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        //Տպել առաջին էլեմենտը
        System.out.println("---2---");
        int[] numbers1 = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        System.out.println("First Element:" + numbers1[0]);

        //Տպել վերջին էլեմենտը
        System.out.println("---3---");
        int[] numbers2 = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        System.out.println("Last Element:" + numbers2[numbers2.length - 1]);

        //Տպել զանգվածի երկարությունը
        System.out.println("---4---");
        int[] numbers3 = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        System.out.println("Array length:" + numbers3.length);

        //Գտնել ամենափոքր թիվը
        System.out.println("---5---");
        int[] numbers4 = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        int min = numbers[0];
        for (int i = 0; i < numbers4.length; i++) {
            if (numbers4[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Minimum number:" + min);

        //Տպել զանգվածի մեջտեղի էլեմենտը
        System.out.println("---6---");
        int[] numbers5 = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        if (numbers5.length <= 2) {
            System.out.println("Can't print middle values");
        } else {
            System.out.println("Middle Element:" + numbers5[numbers5.length / 2]);
        }

        //Հաշվել զույգ թվերի քանակը
        System.out.println("---7---");
        int[] numbers6 = {1, 6, 3, 9, 15, 52, -3, 5, 8};

        int count = 0;

        for (int i = 0; i < numbers6.length; i++) {
            if (numbers6[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Even numbers count: " + count);

        //Հաշվել կենտ թվերի քանակը
        System.out.println("---8---");
        int[] numbers7 = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        int count1 = 0;
        for (int i = 0; i < numbers7.length; i++) {
            if (numbers7[i] % 2 != 0) {
                count1++;
            }
        }
        System.out.println("Odd numbers count: " + count1);

        //Հաշվել զանգվածի էլեմենտների գումարը
        System.out.println("---9---");
        int[] numbers8 = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        int sum = 0;
        for (int i = 0; i < numbers8.length; i++) {
            sum += numbers8[i];
        }
        System.out.println(sum);

        //Հաշվել միջին թվաբանականը
        System.out.println("---10---");
        int[] numbers9 = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        double sum1 = 0;
        for (int i = 0; i < numbers9.length; i++) {
            sum1 += numbers9[i];
        }
        System.out.println(sum1 / numbers9.length);

        //Գտնել ամենամեծ թիվը
        System.out.println("---Bonus1---");
        int[] numbers10 = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        int max = numbers10[0];
        for (int i = 0; i < numbers10.length; i++) {
            if (numbers4[i] > max) {
                max = numbers10[i];
            }
        }
        System.out.println("Maximum number:" + max);

        //Հաշվել դրական և բացասական թվերը
        System.out.println("---Bonus2---");
        int[] numbers11 = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        int evenCount = 0,oddCount = 0,zeroCount = 0;
        for (int i = 0; i < numbers11.length; i++) {
            if (numbers11[i] == 0) {
                zeroCount++;
            } else if (numbers11[i] % 2 == 0) {
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
        int[] num = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        for (int i = num.length-1; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }

}

