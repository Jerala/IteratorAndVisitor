package grigorev.mikhail;

import grigorev.mikhail.data.Employee;
import grigorev.mikhail.data.Manager;
import grigorev.mikhail.data.TreeNode;
import grigorev.mikhail.services.SalaryAppenderVisitor;
import grigorev.mikhail.services.SalaryBonusPayerVisitor;

import java.util.Arrays;
import java.util.Iterator;

public class CompanyOrganizer {

    private TreeNode<Employee> employees;

    public void fillEmployees() {
        Manager ceo = new Manager("Georgiy", 45, 60000.0, "3434343434343434");
        TreeNode<Employee> emp1 = new TreeNode<>(new Employee("Dmitry" , 25, 25000.0, "1234567812345678"));
        TreeNode<Employee> emp2 = new TreeNode<>(new Employee("Sergey", 27, 30000.0, "1111111111111111"));
        TreeNode<Employee> emp3 = new TreeNode<>(new Employee("Anna", 23, 27000.0, "0468476928502857"));
        TreeNode<Employee> emp4 = new TreeNode<>(new Employee("Mikhail", 30, 26000.0, "0386734968396043"));
        TreeNode<Employee> emp5 = new TreeNode<>(new Employee("Nikita", 40, 35000.0, "8573769403857694"));
        TreeNode<Employee> emp6 = new TreeNode<>(new Employee("Olga", 28, 26000.0, "48673068376693864"));

        TreeNode<Employee> man1 = new TreeNode<>(new Manager("Alexey", 32, 42000.0, "48674658697648604"), Arrays.asList(emp1, emp2));
        TreeNode<Employee> man2 = new TreeNode<>(new Manager("Bogdan", 35, 40000.0, "48673669473664956"), Arrays.asList(emp3, emp4));
        TreeNode<Employee> man3 = new TreeNode<>(new Manager("Oleg", 37, 45000.0, "686736695736568594"), Arrays.asList(emp5, emp6));

        TreeNode<Employee> employees = new TreeNode<>(new Manager("Georgiy", 45, 60000.0, "3434343434343434"), Arrays.asList(man1, man2, man3));

        this.employees = employees;
    }

    public void increaseSalaryOfOrdinaryEmployees() {
        SalaryAppenderVisitor salaryAppenderVisitor = new SalaryAppenderVisitor();
        for (Iterator<TreeNode> iterator = employees.leafOnlyIterator(); iterator.hasNext(); ) {
            TreeNode elem = iterator.next();
            Employee employee = (Employee) elem.getElem();
            employee.accept(salaryAppenderVisitor);
        }
        System.out.println();
    }

    public void sendSalaryBonus() {
        SalaryBonusPayerVisitor salaryBonusPayerVisitor = new SalaryBonusPayerVisitor();
        for (Iterator<TreeNode> iterator = employees.iterator(); iterator.hasNext(); ) {
            TreeNode elem = iterator.next();
            Employee employee = (Employee) elem.getElem();
            employee.accept(salaryBonusPayerVisitor);
        }
        System.out.println();
    }

}
