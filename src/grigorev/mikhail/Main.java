package grigorev.mikhail;

public class Main {

    public static void main(String[] args) {
        CompanyOrganizer companyOrganizer = new CompanyOrganizer();
        companyOrganizer.fillEmployees();
        companyOrganizer.increaseSalaryOfOrdinaryEmployees();
        companyOrganizer.sendSalaryBonus();
    }
}
