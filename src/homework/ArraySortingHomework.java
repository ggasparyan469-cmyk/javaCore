package homework;

public class ArraySortingHomework {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("No;1");
        int[] numbers = {12,45, 5, 8, -3, 21, 7, 0, 15, 2, 9};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < i; j++) {
                if (numbers[i] < numbers[j]) {
                    int x = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = x;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println();
        System.out.println("No;2");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < i; j++) {
                if (numbers[i] > numbers[j]) {
                    int x = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = x;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}

