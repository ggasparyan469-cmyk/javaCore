
package homework.employee;

public class EmployeeStorage {

    private Employee[] array = new Employee[10];
    private int size = 0;

    public void add(Employee e) {
        if (size == array.length) {
            extend();
        }

        array[size++] = e;
    }

    private void extend() {
        Employee[] tmp = new Employee[array.length + 10];

        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }

        array = tmp;
    }

    public Employee getByIndex(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        }

        return null;
    }

    public void print() {
        if (size == 0) {
            System.out.println("No employees found.");
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.println(array[i]);
            System.out.println();
        }
    }

    public void search(String keyword) {
        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (array[i].getName().contains(keyword)
                    || array[i].getSurname().contains(keyword)) {

                System.out.println(array[i]);
                System.out.println();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Employee not found.");
        }
    }

    public void searchByCompany(String company) {
        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (array[i].getCompany().equalsIgnoreCase(company)) {

                System.out.println(array[i].getName() + " "
                        + array[i].getSurname() + " - "
                        + array[i].getPosition());

                found = true;
            }
        }

        if (!found) {
            System.out.println("No employees found for company " + company + ".");
        }
    }

    public void searchByEmployeeID(String employeeID) {
        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (array[i].getEmployeeID().equalsIgnoreCase(employeeID)) {

                System.out.println("Employee found:");
                System.out.println(array[i]);

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee with ID "
                    + employeeID + " not found.");
        }
    }
}
