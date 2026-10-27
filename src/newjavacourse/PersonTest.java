package newjavacourse;

public class PersonTest {
    public static void main(String[] args) {
        {
            Person p1 = new Person();
            Person p2 = new Person();

            p1.name = "Gohar";
            p1.age = 14;
            System.out.println(p1.name);
        }
    }
}
