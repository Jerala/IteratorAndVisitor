package grigorev.mikhail.services;

import grigorev.mikhail.data.Employee;
import grigorev.mikhail.data.Manager;

public interface Visitor {
    void doForEmployee(Employee employee);
    void doForManager(Manager manager);
}
