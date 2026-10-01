package homework;

public class HomeworkExample {
    public static void main(String[] args) {
        System.out.println("ex1");
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        System.out.println("ex2");

        int[] number = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        System.out.println(number[0]);

        System.out.println("ex3");
        int[] number1 = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        System.out.println(number1[8]);

        System.out.println("ex4");
        int[] number2 = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        System.out.println(number2.length);

        System.out.println("ex5");
        int[] array = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min=" + min);

        System.out.println("ex6");
        int[] numbers1 = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        System.out.println(numbers1[4]);
        if (numbers1.length <= 2) {
            System.out.println("can't print middle vallues");
            if (numbers1[4] % 2 == 0) {
                System.out.println(numbers1[4]);
                System.out.println(numbers1[5]);
            } else {
                System.out.println(numbers1[4]);
            }
        }

        System.out.println("ex7");

        int[] numbers2 = {1, 6, 3, 9, 15, 52, -3, 5, 8};

        for (int i = 0; i < numbers2.length; i++) {
            if (numbers2[i] % 2 == 0) {
                System.out.println(numbers2[i]);
            }
        }

        System.out.println("ex8");
        int[] numbers3 = {1, 6, 3, 9, 15, 52, -3, 5, 8};

        for (int i = 0; i < numbers3.length; i++) {
            if (numbers3[i] % 2 != 0) {
                System.out.println(numbers3[i]);
            }
        }

        System.out.println("ex9");
        int[] numbers4 = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        int sum = 0;
        for (int i = 0; i < numbers4.length; i++) {
            sum += numbers4[i];
        }
        System.out.println(sum);
        System.out.println("ex10");
        int[] numbers5 = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        int sum1 = 0;
        int average1=0;
        for (int i = 0; i < numbers5.length; i++) {
            sum1 += numbers5[i];
        }
        average1 =  sum1 / numbers5.length;
        System.out.println(average1);


    }
}
