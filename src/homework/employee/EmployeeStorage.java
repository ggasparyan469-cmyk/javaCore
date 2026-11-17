
package homework.employee;

public class EmployeeStorage {

    private Employee[] employees = new Employee[10];
    private int size = 0;

    public void add(Employee employee) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeID().equalsIgnoreCase(employee.getEmployeeID())) {
                System.out.println("Employee already exists.");
                return;
            }
        }

        if (size == employees.length) {
            extend();
        }

        employees[size++] = employee;
    }

    private void extend() {
        Employee[] tmp = new Employee[employees.length + 10];

        for (int i = 0; i < employees.length; i++) {
            tmp[i] = employees[i];
        }

        employees = tmp;
    }

    public Employee getById(String id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeID().equalsIgnoreCase(id)) {
                return employees[i];
            }
        }

        return null;
    }

    public void printAll() {
        if (size == 0) {
            System.out.println("No employees found.");
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.println(employees[i]);
            System.out.println();
        }
    }

    public void search(String keyword) {
        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (employees[i].getName().equalsIgnoreCase(keyword)
                    || employees[i].getSurname().equalsIgnoreCase(keyword)
                    || employees[i].getEmployeeID().equalsIgnoreCase(keyword)) {

                System.out.println(employees[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No employees found.");
        }
    }

    public void printByCompanyName(String name) {
        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany().getName().equalsIgnoreCase(name)) {
                if (!found) {
                    System.out.println("Employees:");
                }

                System.out.println(employees[i].getName() + " "
                        + employees[i].getSurname() + " - "
                        + employees[i].getPosition());

                found = true;
            }
        }

        if (!found) {
            System.out.println("No employees found for company " + name + ".");
        }
    }

    public void printByCompanyId(String id) {
        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany().getCompanyId().equalsIgnoreCase(id)) {
                if (!found) {
                    System.out.println("Employees:");
                }

                System.out.println(employees[i].getName() + " "
                        + employees[i].getSurname() + " - "
                        + employees[i].getPosition());

                found = true;
            }
        }

        if (!found) {
            System.out.println("No employees found for company ID " + id + ".");
        }
    }

    public Employee searchByEmployeeID(String employeeID) {
        return getById(employeeID);
    }

    public int countByCompanyId(String id) {
        int count = 0;

        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany().getCompanyId().equalsIgnoreCase(id)) {
                count++;
            }
        }

        return count;
    }

    // Bonus 2
    public long calculateTotalSalaryByCompanyId(String id) {
        long total = 0;

        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany().getCompanyId().equalsIgnoreCase(id)) {
                total += employees[i].getSalary();
            }
        }

        return total;
    }

    // Bonus 3
    public Employee getEmployeeWithHighestSalary() {
        if (size == 0) {
            return null;
        }

        Employee highest = employees[0];

        for (int i = 1; i < size; i++) {
            if (employees[i].getSalary() > highest.getSalary()) {
                highest = employees[i];
            }
        }

        return highest;
    }

    // Bonus 4
    public boolean deleteById(String id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeID().equalsIgnoreCase(id)) {

                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1];
                }

                employees[size - 1] = null;
                size--;

                return true;
            }
        }

        return false;
    }
}

