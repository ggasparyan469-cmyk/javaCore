package homework.employee;

import java.util.Scanner;

public class EmployeeDemo {

    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = new EmployeeStorage();

    public static void main(String[] args) {

        boolean isRun = true;

        while (isRun) {
            printCommands();

            String command = scanner.nextLine();

            switch (command) {
                case "0":
                    isRun = false;
                    break;

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
                    System.out.println("command not found!");
            }
        }
    }

    private static void printCommands() {
        System.out.println("Please input 0 for EXIT");
        System.out.println("Please input 1 for ADD EMPLOYEE");
        System.out.println("Please input 2 for PRINT ALL EMPLOYEES");
        System.out.println("Please input 3 for SEARCH EMPLOYEE BY ID");
        System.out.println("Please input 4 for SEARCH EMPLOYEES BY COMPANY NAME");
    }


    private static void addEmployee() {
        System.out.println("Please input name,surname,employeeID,company,position,salary");

        String employeeDataStr = scanner.nextLine();
        String[] employeeData = employeeDataStr.split(",");

        Employee employee = new Employee(
                employeeData[0],
                employeeData[1],
                employeeData[2],
                employeeData[3],
                employeeData[4],
                Integer.parseInt(employeeData[5])
        );

        employeeStorage.add(employee);

        System.out.println("Employee added!!!");
    }

    private static void searchEmployeeByID() {
        System.out.println("Please input employeeID");

        String employeeID = scanner.nextLine();

        employeeStorage.searchByEmployeeID(employeeID);
    }

    private static void searchEmployeeByCompany() {
        System.out.println("Please input company");

        String company = scanner.nextLine();

        employeeStorage.searchByCompany(company);
    }
}
