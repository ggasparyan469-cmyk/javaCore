package chapter6.stack;

public class Stack {
    private int[] array = new int[10];
    private int index;

    Stack() {
        index = -1;
    }

    public void push(int item) {
        if (index == 9) {
            System.out.println("tex chka");
        } else {
            array[++index] = item;
        }
    }

    public int pop() {
        if (index < 0) {
            System.out.println("steky datark e");
            return 0;
        } else {
            return array[index--];
        }

    }
}
