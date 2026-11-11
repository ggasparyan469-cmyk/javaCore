package homework.BraceChecker;

public class BraceCheckerTest {
    public static void main(String[] args) {
        BraceChecker bc = new BraceChecker("Hello from [Java]");
        bc.check();
        BraceChecker bc1 = new BraceChecker("{Hello (Java)}");
        bc1.check();
        BraceChecker bc2 = new BraceChecker("Hello from [Java)");
        bc2.check();
        BraceChecker bc3 = new BraceChecker("{[()]}");
        bc3.check();
        BraceChecker bc4 = new BraceChecker("Hello Java");
        bc4.check();
        BraceChecker bc5 = new BraceChecker("{[(])}");
        bc5.check();
        BraceChecker bc6 = new BraceChecker("Hello from Java]");
        bc6.check();
        BraceChecker bc7 = new BraceChecker("{Hello Java");
        bc7.check();
        BraceChecker bc8 = new BraceChecker("((()))");
        bc8.check();
        BraceChecker bc9 = new BraceChecker("(()");
        bc9.check();
    }
}

