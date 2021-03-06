package org.ananta.itCompany.employee;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private int salary;
    private float vacation;

    protected Employee() {
    }

    protected Employee(String firstName, String lastName, int age, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public abstract void work();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public float getVacation() {
        return vacation;
    }

    public void setVacation(float vacation) {
        this.vacation = vacation;
    }
}
