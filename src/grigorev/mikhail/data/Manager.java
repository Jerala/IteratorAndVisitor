package grigorev.mikhail.data;

import grigorev.mikhail.services.Visitor;

public class Manager extends Employee {

    public Manager(String name, Integer age, Double salary, String cardNumber) {
        super(name, age, salary, cardNumber);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.doForManager(this);
    }

}
