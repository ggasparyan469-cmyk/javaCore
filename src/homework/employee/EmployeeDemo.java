package homework.employee;

import java.util.Scanner;

public class EmployeeDemo {

    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = new EmployeeStorage();

    public static void main(String[] args) {

        while (true) {
            printCommands();

            System.out.println("Please input command:");
            String command = scanner.nextLine();

            switch (command) {
                case "0":
                    System.out.println("Goodbye!");
                    return;

                case "1":
                    addEmployee();
                    break;

                case "2":
                    employeeStorage.print();
                    break;

                case "3":
                    searchEmployeeByID();
                    break;

                case "4":
                    searchEmployeeByCompany();
                    break;

                default:
                    System.out.println("Invalid command. Please try again.");
            }
        }
    }

    private static void printCommands() {
        System.out.println("Please input 0 for EXIT");
        System.out.println("Please input 1 for ADD EMPLOYEE");
        System.out.println("Please input 2 for PRINT ALL EMPLOYEES");
        System.out.println("Please input 3 for SEARCH EMPLOYEE BY ID");
        System.out.println("Please input 4 for SEARCH EMPLOYEES BY COMPANY");
    }

    private static void addEmployee() {

        System.out.println("Please input employee name:");
        String name = scanner.nextLine();

        System.out.println("Please input employee surname:");
        String surname = scanner.nextLine();

        System.out.println("Please input employee ID:");
        String employeeID = scanner.nextLine();

        System.out.println("Please input employee company:");
        String company = scanner.nextLine();

        System.out.println("Please input employee position:");
        String position = scanner.nextLine();

        System.out.println("Please input employee salary:");
        int salary = Integer.parseInt(scanner.nextLine());

        Employee employee = new Employee(
                name,
                surname,
                employeeID,
                company,
                position,
                salary
        );

        employeeStorage.add(employee);

        System.out.println("Employee successfully added!");
    }

    private static void searchEmployeeByID() {

        System.out.println("Please input employee ID:");
        String employeeID = scanner.nextLine();

        employeeStorage.searchByEmployeeID(employeeID);
    }

    private static void searchEmployeeByCompany() {

        System.out.println("Please input company name:");
        String company = scanner.nextLine();

        employeeStorage.searchByCompany(company);
    }
}