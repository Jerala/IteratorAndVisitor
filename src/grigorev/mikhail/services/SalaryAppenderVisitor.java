package grigorev.mikhail.services;

import grigorev.mikhail.data.Employee;
import grigorev.mikhail.data.Manager;

public class SalaryAppenderVisitor implements Visitor {

    private static final Double MANAGER_SALARY_INCREASE_PERCENT = 15.0;
    private static final Double EMPLOYEE_SALARY_INCREASE_PERCENT = 10.0;

    public void doForEmployee(Employee employee) {
        Double oldSalary = employee.getSalary();
        employee.setSalary(employee.getSalary() * (1 + (EMPLOYEE_SALARY_INCREASE_PERCENT / 100)));
        System.out.println(employee.getName() + "'s salary was increased from " + Math.round(oldSalary) + " to " + Math.round(employee.getSalary()));
    }

    public void doForManager(Manager manager) {
        Double oldSalary = manager.getSalary();
        manager.setSalary(manager.getSalary() * (1 + (MANAGER_SALARY_INCREASE_PERCENT / 100)));
        System.out.println(manager.getName() + "'s salary was increased from " + oldSalary + " to " + manager.getSalary());
    }

}
