package com.company;

public class User {

   private Collection myCollection;

   // myColleciton.push(Book myNewBook)  ??? zum hinzufügen zur collection


   User(String name, int age){

      this.name = name;
      this.age = age;

   }


   String name;
   int age;
   String mostLovedGenre;

   public Collection getMyCollection() {
      return myCollection;
   }

   public void setMyCollection(Collection myCollection) {
      this.myCollection = myCollection;
   }


}
