package homework;

public class CharArrayUtil {
    public static void main(String[] args) {
        System.out.println("No1");
        //Տպել բոլոր սիմվոլները
        char[] chars = {
                'J', 'a', 'v', 'a', ' ',
                'i', 's', ' ', 'f', 'u', 'n', '!'
        };
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);

        }

        System.out.println();
        System.out.println("No2");
        // Հաշվել սիմվոլների քանակը
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            count++;
        }
        System.out.println("Characters count: " + count);
        System.out.println("First is; " + chars[0]);
        System.out.println("Last is; " + chars[11]);

        System.out.println("No3");
        //Հաշվել տրված սիմվոլի հանդիպումների քանակը
        char space = 'a';
        int count1 = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == space) {
                count1++;
            }
        }
        System.out.println("Count of 'a': " + count1);
        System.out.println("No4");
        // Հաշվել ձայնավորների քանակը
        char[] vowels = {
                'a', 'e', 'i', 'o', 'u',
                'A', 'E', 'I', 'O', 'U'
        };

        int count2 = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (chars[i] == vowels[j]) {
                    count2++;
                    break;
                }
            }
        }
        System.out.println("Count of vowels: " + count2);
        System.out.println("No5");
        //Հաշվել բաղաձայնների քանակը
        char[] consonants = {
                'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm',
                'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z',
                'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M',
                'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'
        };
        int count3 = 0;

        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < consonants.length; j++) {
                if (chars[i] == consonants[j]) {
                    count3++;
                    break;
                }
            }
        }
        System.out.println("Count of consonants: " + count3);
        System.out.println("No6");
        // Հաշվել բացատների քանակը
        char a = ' ';
        int count4 = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == a) {
                count4++;
            }
        }
        System.out.println("Count of ' ': " + count4);
        System.out.println("No7");
        //Շրջել սիմվոլների հերթականությունը
        for (int i = 0; i < chars.length / 2; i++) {
            char x = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = x;
        }

        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }

        System.out.println();
        System.out.println("No8");
        //Փոխել մեծատառերը և փոքրատառերը
        char[] chars4 = {
                'J', 'a', 'v', 'a', ' ',
                'i', 's', ' ', 'f', 'u', 'n', '!'
        };
        for (int i = 0; i < chars4.length; i++) {
            if (chars4[i] >= 'a' && chars4[i] <= 'z') {
                chars4[i] = (char) (chars4[i] - 32);
            }
        }
        System.out.print("Uppercase is: ");
        System.out.println(chars4);
        for (int i = 0; i < chars4.length; i++) {
            if (chars4[i] >= 'A' && chars4[i] <= 'Z') {
                chars4[i] = (char) (chars4[i] + 32);
            }
        }
        System.out.print("Lowercase is: ");
        System.out.println(chars4);
        System.out.println("No9");
        //Փոխարինել տրված սիմվոլը
        char[] chars6 = {
                'J', 'a', 'v', 'a', ' ',
                'i', 's', ' ', 'f', 'u', 'n', '!'
        };
        char oldChar = 'a';
        char newChar = '*';
        for (int i = 0; i < chars6.length; i++) {
            if (chars6[i] == oldChar) {
                chars6[i] = newChar;
            }
        }
        System.out.println(chars6);
        System.out.println("No10");
        //Ստուգել Palindrome-ը
        char[] chars7 = {'h', 'e', 'l', 'l', 'o'};
        boolean isPalindrome = true;
        for (int i = 0; i < chars7.length / 2; i++) {
            if (chars7[i] != chars7[chars7.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);
        System.out.println("Bonus1");
        // Գտնել սիմվոլի առաջին հանդիպման ինդեքսը
        char[] chars8 = {'a', 'b', 'c', 'a', 'd'};
        char target = 'a';
        for (int i = 0; i < chars8.length; i++) {
            if (chars8[i]==target){
                System.out.println("First index: " + i);
                break;
            }
        }
        System.out.println("Bonus2");
        //Համեմատել երկու char զանգված
        char[] chars1 = {'J', 'a', 'v', 'a'};
        char[] chars2 = {'J', 'a', 'v', 'a'};
        boolean areEqual = true;
        if (chars1.length == chars2.length) {
            for (int i = 0; i < chars1.length; i++) {
                if (chars1[i] != chars2[i]) {
                    areEqual = false;
                    break;
                }
            }
        } else {
            areEqual = false;
        }

        if (areEqual) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays aren't equal");
        }
        System.out.println("Bonus3");
        //Հեռացնել կրկնվող սիմվոլները
        char[] chars5 = {
                'J', 'a', 'v', 'a'
        };
        for (int i = 0; i < chars5.length; i++) {
            boolean found = true;
            for (int j = 0; j < i; j++) {
                if (chars5[i] == chars5[j]) {
                    found = false;
                    break;
                }
            }
            if (found) {
                System.out.print(chars5[i] + " ");
            }
        }


    }
}
