
package homework.employee;

public class CompanyStorage {

    private Company[] companies = new Company[10];
    private int size = 0;

    public void add(Company company) {
        for (int i = 0; i < size; i++) {
            if (companies[i].getCompanyId().equalsIgnoreCase(company.getCompanyId())) {
                System.out.println("Company already exists.");
                return;
            }
        }

        if (size == companies.length) {
            extend();
        }

        companies[size++] = company;
    }

    private void extend() {
        Company[] tmp = new Company[companies.length + 10];

        for (int i = 0; i < companies.length; i++) {
            tmp[i] = companies[i];
        }

        companies = tmp;
    }

    public Company getById(String id) {
        for (int i = 0; i < size; i++) {
            if (companies[i].getCompanyId().equalsIgnoreCase(id)) {
                return companies[i];
            }
        }

        return null;
    }

    public void printAll() {
        if (size == 0) {
            System.out.println("No companies found.");
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.println("Company " + (i + 1) + ":");
            System.out.println(companies[i]);
            System.out.println();
        }
    }

    // Bonus 5
    public boolean deleteById(String id) {
        for (int i = 0; i < size; i++) {
            if (companies[i].getCompanyId().equalsIgnoreCase(id)) {

                for (int j = i; j < size - 1; j++) {
                    companies[j] = companies[j + 1];
                }

                companies[size - 1] = null;
                size--;

                return true;
            }
        }

        return false;
    }
}
















