package homework.BraceChecker;

public class BraceChecker {

    private String text;
    private int[] stck = new int[10];
    private int tos;

    public BraceChecker(String text) {
        this.text = text;
        tos = -1;
    }

    class Stack {

        void push(int item) {
            stck[++tos] = item;
        }

        int pop() {
            if (tos < 0) {
                return -1;
            } else {
                return stck[tos--];
            }
        }
    }

    public void check() {
        tos = -1;

        Stack stack = new Stack();
        int[] indexes = new int[10];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
                indexes[tos] = i;

            } else if (ch == '}' || ch == ']' || ch == ')') {
                int last = stack.pop();

                if (last == -1) {
                    System.out.println("Error: closed " + ch + " at " + i
                            + " without opening");
                    return;
                }

                if (ch == '}' && last != '{' ||
                        ch == ']' && last != '[' ||
                        ch == ')' && last != '(') {

                    System.out.println("Error: opened " + (char) last
                            + " but closed " + ch + " at " + i);
                    return;
                }
            }
        }

        if (tos != -1) {
            System.out.println("Error: opened " + (char) stack.pop()
                    + " but not closed");
        } else {
            System.out.println("True");
        }
    }
}