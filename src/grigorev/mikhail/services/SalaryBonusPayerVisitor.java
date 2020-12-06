package grigorev.mikhail.services;

import grigorev.mikhail.data.Employee;
import grigorev.mikhail.data.Manager;

public class SalaryBonusPayerVisitor implements Visitor {

    private static final Double MANAGER_SALARY_BONUS_PERCENT = 30.0;
    private static final Double EMPLOYEE_SALARY_BONUS_PERCENT = 20.0;

    private final CardManager cardManager = new CardManager();

    public void doForEmployee(Employee employee) {
        cardManager.send(employee.getCardNumber(), employee.getSalary() * (EMPLOYEE_SALARY_BONUS_PERCENT / 100));
    }

    public void doForManager(Manager manager) {
        cardManager.send(manager.getCardNumber(), manager.getSalary() * (MANAGER_SALARY_BONUS_PERCENT / 100));
    }

}
