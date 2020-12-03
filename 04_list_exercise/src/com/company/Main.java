package com.company;

public class Main {

    public static void main(String[] args) {

        Dog d1 = new Dog("Bello", 2);
        Dog d2 = new Dog("Rex", 4);
        Dog d3 = new Dog("Klaus", 6);
        Dog d4 = new Dog("Doggo", 1);

        DogList myDogs = new DogList(d1);
        myDogs.addNewDogToList(d1, d2);
        myDogs.addNewDogToList(d2, d3);



    }
}
