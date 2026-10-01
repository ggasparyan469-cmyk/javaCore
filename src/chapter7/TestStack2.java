package chapter7;

public class TestStack2 {
    public static void main(String[] args) {
        Stack ms1 = new Stack(5);
        Stack ms2 = new Stack(8);
        for (int i = 0; i < 5; i++) {
            ms1.push(i);
        }
        for (int i = 0; i < 8; i++) {
            ms2.push(i);
        }
        System.out.println("Cтeк в ms1:");
        for (int i = 0; i < 5 ; i++) {
            System.out.println(ms1.pop());
        }
        System.out.println("Cтeк в ms2");
        for (int i = 0; i < 8; i++) {
            System.out.println(ms2.pop());
        }

    }
}
