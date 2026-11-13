package homework.employee;

public class Employee {
    private String name;
    private String surname;
    private String employeeID;
    private String company;
    private String position;
    private int salary;


    public Employee(String name, String surname, String employeeID,
                   String company,String position,int salary) {
        this.name = name;
        this.surname = surname;
        this.employeeID = employeeID;
        this.company = company;
        this.position=position;
        this.salary=salary;
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", employeeID='" + employeeID + '\'' +
                ", company='" + company + '\'' +
                ", salary='" + salary + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Employee employee = (Employee) obj;

        return employeeID.equals(employee.employeeID);
    }

    @Override
    public int hashCode() {
        return employeeID.hashCode();
    }

}
