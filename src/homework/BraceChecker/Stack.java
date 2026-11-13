package homework.BraceChecker;

public class Stack {

    private int[] stck = new int[10];
    private int[] indexes = new int[10];
    private int tos;
    private int lastIndex;

    public Stack() {
        tos = -1;
    }

    public void push(int item, int index) {
        if (tos == 9) {
            System.out.println("Stack is full");
        } else {
            stck[++tos] = item;
            indexes[tos] = index;
        }
    }

    public int pop() {
        if (tos < 0) {
            lastIndex = -1;
            return -1;
        } else {
            lastIndex = indexes[tos];
            return stck[tos--];
        }
    }

    public int getLastIndex() {
        return lastIndex;
    }

    public boolean isEmpty() {
        return tos == -1;
    }
}
