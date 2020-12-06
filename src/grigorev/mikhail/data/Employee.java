package grigorev.mikhail.data;

import grigorev.mikhail.services.Visitor;

public class Employee {

    private String name;
    private Integer age;
    private Double salary;
    private String cardNumber;

    public Employee(String name, Integer age, Double salary, String cardNumber) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.cardNumber = cardNumber;
    }

    public void accept(Visitor visitor) {
        visitor.doForEmployee(this);
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

}
