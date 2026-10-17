package homework;

public class ArrayHomework {
    public static void main(String[] args) {
        //Հաշվել տվյալ թվի հանդիպումների քանակը
        System.out.println("No1;");
        int[] numbers = {6, 3, 8, 6, 1, 9, 6, 4, 3, 2, 6};
        int n = 6;
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == n) {
                count++;
            }
        }
        System.out.println("Count of 6: " + count);

        //Շրջել զանգվածի էլեմենտների հերթականությունը
        System.out.println("No2;");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("No3;");
        int count3 = 0;
        for (int i = 0; i < numbers.length; i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    found = true;
                    break;
                }
            }
            if (found != false) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j]) {
                        count3++;
                        break;
                    }
                }
            }
        }

        System.out.println("Repeated numbers count: " + count3);
        System.out.println("No4;");
        // Հաշվել ձայնավորների քանակը
        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};
        char[] vowels = {'ա', 'ե', 'է', 'ը', 'ի', 'ո', 'օ'};

        int count1 = 0;

        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (chars[i] == vowels[j]) {
                    count1++;
                    break;
                }
            }
        }

        System.out.println("Count of vowels: " + count1);
        System.out.println("Bonus1");
        int max = numbers[0];
        int secondmax = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                secondmax = max;
                max = numbers[i];
            } else if (numbers[i] > secondmax && numbers[i] < max) {
                secondmax = numbers[i];
            }
        }

        System.out.println("Maximum number: " + max);
        System.out.println("Second maximum number: " + secondmax);
        System.out.println("Bonus2");
        int count4 = 0;
        for (int i = 0; i < numbers.length; i++) {
            boolean found = true;
            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    found = false;
                    break;
                }
            }
            if (found) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Bonus3");
        int maxCount = 0;
        int mostRepeated = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            int counts = 0;

            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    counts++;
                }
            }

            if (counts > maxCount) {
                maxCount = counts;
                mostRepeated = numbers[i];
            }
        }

        System.out.println("Most repeated number: " + mostRepeated);
        System.out.println("Count: " + maxCount);
    }
}