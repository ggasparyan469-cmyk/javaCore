package newjavacourse;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls input student name");
        String name = scanner.nextLine();

        System.out.println("Pls input student surname");
        String surname = scanner.nextLine();

        System.out.println("Pls input student's phone number");
        String phone = scanner.nextLine();

        System.out.println("Pls input student's course name");
        String course = scanner.nextLine();

        Student student = new Student(name,surname,phone,course);
        System.out.println("Student Registered!");
        System.out.println(student);

    }
}
