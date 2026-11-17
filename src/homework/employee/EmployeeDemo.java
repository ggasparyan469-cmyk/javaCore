
package homework.employee;

import java.util.Scanner;

public class EmployeeDemo {

    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = new EmployeeStorage();
    private static CompanyStorage companyStorage = new CompanyStorage();

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
                    employeeStorage.printAll();
                    break;

                case "3":
                    searchEmployeeByID();
                    break;

                case "4":
                    searchEmployeeByCompany();
                    break;

                case "5":
                    addCompany();
                    break;

                case "6":
                    companyStorage.printAll();
                    break;

                case "7":
                    searchCompanyByID();
                    break;

                case "8":
                    printEmployeesByCompanyID();
                    break;

                case "9":
                    changeEmployeeCompany();
                    break;

                case "10":
                    printEmployeeCompany();
                    break;

                case "11":
                    countEmployeesByCompany();
                    break;

                case "12":
                    calculateTotalSalaryByCompany();
                    break;

                case "13":
                    findEmployeeWithHighestSalary();
                    break;

                case "14":
                    deleteEmployee();
                    break;

                case "15":
                    deleteCompany();
                    break;

                default:
                    System.out.println("Invalid command. Please try again.");
            }
        }
    }

    private static void printCommands() {
        System.out.println("0 - EXIT");
        System.out.println("1 - ADD EMPLOYEE");
        System.out.println("2 - PRINT ALL EMPLOYEES");
        System.out.println("3 - SEARCH EMPLOYEE BY ID");
        System.out.println("4 - SEARCH EMPLOYEES BY COMPANY NAME");
        System.out.println("5 - ADD COMPANY");
        System.out.println("6 - PRINT ALL COMPANIES");
        System.out.println("7 - SEARCH COMPANY BY ID");
        System.out.println("8 - PRINT EMPLOYEES BY COMPANY ID");
        System.out.println("9 - CHANGE EMPLOYEE COMPANY");
        System.out.println("10 - PRINT EMPLOYEE COMPANY");
        System.out.println("11 - COUNT EMPLOYEES BY COMPANY");
        System.out.println("12 - CALCULATE TOTAL SALARY BY COMPANY");
        System.out.println("13 - FIND EMPLOYEE WITH HIGHEST SALARY");
        System.out.println("14 - DELETE EMPLOYEE");
        System.out.println("15 - DELETE COMPANY");
    }

    private static void addEmployee() {

        System.out.println("Enter employee name:");
        String name = scanner.nextLine();

        System.out.println("Enter employee surname:");
        String surname = scanner.nextLine();

        System.out.println("Enter employee ID:");
        String employeeID = scanner.nextLine();

        if (employeeStorage.getById(employeeID) != null) {
            System.out.println("Employee already exists.");
            return;
        }

        System.out.println("Enter employee salary:");
        int salary = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter employee position:");
        String position = scanner.nextLine();

        System.out.println("Enter company ID:");
        String companyId = scanner.nextLine();

        Company company = companyStorage.getById(companyId);

        if (company == null) {
            System.out.println("Company with ID " + companyId + " not found.");
            System.out.println("Please add the company first.");
            return;
        }

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

        System.out.println("Enter employee ID:");
        String employeeID = scanner.nextLine();

        Employee employee = employeeStorage.getById(employeeID);

        if (employee != null) {
            System.out.println("Employee found:");
            System.out.println(employee);
        } else {
            System.out.println("Employee not found.");
        }
    }

    private static void searchEmployeeByCompany() {

        System.out.println("Enter company name:");
        String company = scanner.nextLine();

        employeeStorage.printByCompanyName(company);
    }

    private static void addCompany() {

        System.out.println("Enter company ID:");
        String companyId = scanner.nextLine();

        if (companyStorage.getById(companyId) != null) {
            System.out.println("Company already exists.");
            return;
        }

        System.out.println("Enter company name:");
        String name = scanner.nextLine();

        System.out.println("Enter industry:");
        String industry = scanner.nextLine();

        System.out.println("Enter country:");
        String country = scanner.nextLine();

        Company company = new Company(
                name,
                companyId,
                industry,
                country
        );

        companyStorage.add(company);

        System.out.println("Company successfully added!");
    }

    private static void searchCompanyByID() {

        System.out.println("Enter company ID:");
        String companyId = scanner.nextLine();

        Company company = companyStorage.getById(companyId);

        if (company != null) {
            System.out.println("Company found:");
            System.out.println(company);
        } else {
            System.out.println("Company not found.");
        }
    }

    private static void printEmployeesByCompanyID() {

        System.out.println("Enter company ID:");
        String companyId = scanner.nextLine();

        Company company = companyStorage.getById(companyId);

        if (company == null) {
            System.out.println("Company not found.");
            return;
        }

        System.out.println("Company: " + company.getName());
        System.out.println();
        employeeStorage.printByCompanyId(companyId);
    }

    private static void changeEmployeeCompany() {

        System.out.println("Enter employee ID:");
        String employeeID = scanner.nextLine();

        Employee employee = employeeStorage.getById(employeeID);

        if (employee == null) {
            System.out.println("Employee not found.");
            return;
        }

        System.out.println("Current company: " +
                employee.getCompany().getName());

        System.out.println("Enter new company ID:");
        String companyId = scanner.nextLine();

        Company company = companyStorage.getById(companyId);

        if (company == null) {
            System.out.println("Company with ID " + companyId + " not found.");
            return;
        }

        employee.setCompany(company);

        System.out.println("Employee company successfully changed!");
        System.out.println("New company: " +
                employee.getCompany().getName());
    }

    private static void printEmployeeCompany() {

        System.out.println("Enter employee ID:");
        String employeeID = scanner.nextLine();

        Employee employee = employeeStorage.getById(employeeID);

        if (employee != null) {
            System.out.println("Employee: " +
                    employee.getName() + " " + employee.getSurname());

            System.out.println();
            System.out.println("Company information:");
            System.out.println(employee.getCompany());
        } else {
            System.out.println("Employee not found.");
        }
    }

    // Bonus 1
    private static void countEmployeesByCompany() {

        System.out.println("Enter company ID:");
        String companyId = scanner.nextLine();

        Company company = companyStorage.getById(companyId);

        if (company == null) {
            System.out.println("Company not found.");
            return;
        }

        int count = employeeStorage.countByCompanyId(companyId);

        System.out.println("Company: " + company.getName());
        System.out.println("Employees count: " + count);
    }

    // Bonus 2
    private static void calculateTotalSalaryByCompany() {

        System.out.println("Enter company ID:");
        String companyId = scanner.nextLine();

        Company company = companyStorage.getById(companyId);

        if (company == null) {
            System.out.println("Company not found.");
            return;
        }

        long total = employeeStorage.calculateTotalSalaryByCompanyId(companyId);

        System.out.println("Company: " + company.getName());
        System.out.println("Total salary: " + total);
    }

    // Bonus 3
    private static void findEmployeeWithHighestSalary() {

        Employee employee = employeeStorage.getEmployeeWithHighestSalary();

        if (employee == null) {
            System.out.println("No employees found.");
        } else {
            System.out.println("Employee with highest salary:");
            System.out.println(employee);
        }
    }

    // Bonus 4
    private static void deleteEmployee() {

        System.out.println("Enter employee ID:");
        String employeeID = scanner.nextLine();

        boolean deleted = employeeStorage.deleteById(employeeID);

        if (deleted) {
            System.out.println("Employee successfully deleted!");
        } else {
            System.out.println("Employee not found.");
        }
    }

    // Bonus 5
    private static void deleteCompany() {

        System.out.println("Enter company ID:");
        String companyId = scanner.nextLine();

        Company company = companyStorage.getById(companyId);

        if (company == null) {
            System.out.println("Company not found.");
            return;
        }

        int count = employeeStorage.countByCompanyId(companyId);

        if (count > 0) {
            System.out.println("Cannot delete company.");
            System.out.println("Company has " + count + " employees.");
            return;
        }

        companyStorage.deleteById(companyId);

        System.out.println("Company successfully deleted!");
    }
}
