package examples;

public class StudenttTest {
    public static void main(String[] args) {
        Studentt s1 = new Studentt();
        Studentt s2 = new Studentt("gohar", 14);
        System.out.println(s1);
        System.out.println(s2.name);
        System.out.println(s2.age);

    }
}
