package com.company;

public class User {



   // myColleciton.push(Book myNewBook)  ??? zum hinzufügen zur collection

   private Collection myCollection;
   private String name;
   private int age;
   private String mostLovedGenre;


   User(String name, int age){

      this.name = name;
      this.age = age;

   }


   public Collection getMyCollection() {
      return myCollection;
   }

   public int getAge() {
      return age;
   }

   public String getName() {
      return name;
   }

   public String getMostLovedGenre() {
      return mostLovedGenre;
   }

   public void setMyCollection(Collection myCollection) {
      this.myCollection = myCollection;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setMostLovedGenre(String mostLovedGenre) {
      this.mostLovedGenre = mostLovedGenre;
   }


}
