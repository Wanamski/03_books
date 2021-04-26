package com.company;

public class User {



   // myColleciton.push(Book myNewBook)  ??? zum hinzufügen zur collection

   private Collection myCollection;
   private String name;
   private int age;
   private String mostLovedGenre;
   private String password;

   private boolean isAdmin = false;
   private boolean isAuthor = false;


   User(String name, int age){

      this.name = name;
      this.age = age;

   }

   User(){

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

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public boolean getAdminStatus() {
      return isAdmin;
   }

}
