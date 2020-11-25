package com.company;

public class User {



   // myColleciton.push(Book myNewBook)  ??? zum hinzufügen zur collection

   private Collection myCollection;
   String name; // modifiers? (private, public, package, etc.)
   int age;
   String mostLovedGenre;


   User(String name, int age){

      this.name = name;
      this.age = age;

   }


   public Collection getMyCollection() {
      return myCollection;
   }

   public void setMyCollection(Collection myCollection) {
      this.myCollection = myCollection;
   }


}
