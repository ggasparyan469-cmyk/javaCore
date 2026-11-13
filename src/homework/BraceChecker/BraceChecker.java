package homework.BraceChecker;

public class BraceChecker {

    private String text;
    private Stack stack = new Stack();

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch, i);

            } else if (ch == '}' || ch == ']' || ch == ')') {

                int last = stack.pop();
                int openedIndex = stack.getLastIndex();

                if (last == -1) {
                    System.out.println("Error: closed " + ch
                            + " at " + i + " without opening");
                    return;
                }

                if (ch == '}' && last != '{' ||
                        ch == ']' && last != '[' ||
                        ch == ')' && last != '(') {

                    System.out.println("Error: opened " + (char) last
                            + " at " + openedIndex
                            + " but closed " + ch + " at " + i);
                    return;
                }
            }
        }

        if (!stack.isEmpty()) {
            int last = stack.pop();
            int openedIndex = stack.getLastIndex();

            System.out.println("Error: opened " + (char) last
                    + " at " + openedIndex + " but not closed");
        } else {
            System.out.println("True");
        }
    }
}