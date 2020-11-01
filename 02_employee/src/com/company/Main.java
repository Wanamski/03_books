package com.company;

public class Main {

    public static void main(String[] args) {

        Employee carl = new Employee("carl");

        Employee sasha = new Employee("sasha", 2000);

        carl.setSalary(4000);

        sasha.setSalary(51000);

        System.out.println(carl.getEmployeeInfo());
        System.out.println(sasha.getEmployeeInfo());

    }
}
