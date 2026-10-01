package examples;
public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();

        p.name = "gohar";
        p.age = 13;
        p.adult = true;

        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.isAdult());
    }
}
