package com.company;

public class DogList {


    private Dog root;

    DogList(Dog rootDog) {
        this.root = rootDog;
    }

     public void addNewDogToList(Dog currentDog, Dog dogToAdd) {
        if (root == null) {
            this.root = currentDog;
        } else {
            currentDog.setNext(dogToAdd);
        }

        // D1 -> Root
         // D1 -> D2
         // D2 -> D3




    }





}
