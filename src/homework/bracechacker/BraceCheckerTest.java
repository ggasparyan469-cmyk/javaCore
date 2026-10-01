package homework.bracechacker;

public class BraceCheckerTest {
    public static void main(String[] args) {
        String s = "this {is) [a} ]text}";
        BraceChecker braceChecker = new BraceChecker(s);
        braceChecker.check();
    }
}

