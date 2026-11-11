package BraceChecker;

public class Stack {

    int[] stck = new int[10];
    int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9) {
            System.out.println("Stack is full");
        } else {
            stck[++tos] = item;
        }
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Ստեկը դատարկ է։");
            return -1;
        } else {
            return stck[tos--];
        }
    }

    boolean isEmpty() {
        return tos == -1;
    }

    void clear() {
        tos = -1;
    }
}

