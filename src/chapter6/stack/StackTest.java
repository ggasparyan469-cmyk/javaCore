package chapter6.stack;

public class StackTest {
    public static void main(String[] args) {
        Stack ms = new Stack();
        ms.push(10);
        ms.push(110);
        ms.push(50);
        ms.push(90);
        ms.push(1);
        ms.push(20);
        ms.push(8);
        ms.push(108);
        ms.push(108);
        ms.push(2012);

        System.out.println(ms.pop());
        System.out.println(ms.pop());
        ms.push(3);
        ms.push(5);
        System.out.println(ms.pop());
        System.out.println(ms.pop());
        System.out.println(ms.pop());
        System.out.println(ms.pop());
    }
}
