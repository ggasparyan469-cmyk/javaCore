package newjavacourse;

public class StackTest {
    public static void main(String[] args) {
        Stack1 stack = new Stack1(15);
        stack.push(5);
        stack.push(7);
        stack.push(8);
        stack.push(3);
        System.out.println(stack.pop());
    }
}
