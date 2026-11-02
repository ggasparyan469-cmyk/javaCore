package newjavacourse;

import java.util.Locale;

public class StringExample {
    public static void main(String[] args) {
        String name = "Poxos";
        String name1 = "Poxos";
//        System.out.println(name == name1);
//        name = name.toUpperCase();
//        name = name + "IK";
//        System.out.println(name);
//        System.out.println(name1);
        String name2 = new String("Poxos");
        System.out.println(name.equals(name1));
        System.out.println(name.equals(name2));
    }
}
