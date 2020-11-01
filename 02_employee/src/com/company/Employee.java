package com.company;

public class Employee {

    private String name;
    private int salary;

    Employee(String name){
        this.name = name;
    }

    Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {

        if(salary > 50000){
            return;
        }

        this.salary = salary;
    }

    public String getEmployeeInfo(){

        String employeeInfo = name + " " + salary;

        return employeeInfo;

    }

}
