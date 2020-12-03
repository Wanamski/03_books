package com.company;

public class Dog {

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;
    private Dog next;

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog getNext() {
        return this.next;
    }

    public void setNext(Dog referenceToNextDog) {
        this.next = referenceToNextDog;
    }



    @Override
    public String toString() {
        return "com.company.Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
