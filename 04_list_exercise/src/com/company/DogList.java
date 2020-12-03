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

    public Dog findLastDogInList(){
        if(root == null){
            return null;
        } else if (root.getNext() == null){
            return root;
        } else {
            Dog nextDog = root.getNext();

            while (hasNext(nextDog)){

                nextDog = nextDog.getNext();

            }

            return nextDog;

        }


    }

    public boolean hasNext(Dog dog){
        return dog.getNext() != null;
    }





}
