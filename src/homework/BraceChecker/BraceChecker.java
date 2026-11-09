package homework.BraceChecker;

public class BraceChecker {

    private String text;
    private int[] stck = new int[10];
    private int tos;

    public BraceChecker(String text) {

    }

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

    public void check() {
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(') {
                push(ch);
            } else if (ch == '}' || ch == ']' || ch == ')') {
                int last = pop();
                if (ch == '}' && last != '{' ||
                        ch == ']' && last != '[' ||
                        ch == ')' && last != '(') {
                    System.out.println("Error: opened " + (char) last
                            + " but closed " + ch + " at " + i);
                    return;
                }
            }

        }

        if (tos == -1) {
            System.out.println("No errors");
        } else {
            System.out.println("Error: opened " + (char) stck[tos]
                    + " but not closed at " + text.length());
        }
    }
}