package com.company;

public class Main {

    public static void main(String[] args) {
        // User erstellen
        // User soll Books haben
        // User soll eine Collection haben, die Books beinhaltet
        // User soll Books hinzufügen können, löschen etc.
        // User soll Inhalte von Books/Author bekommen


        Author tony = new Author("Tony Sanchez", 35);
        Author alex = new Author("Alex Fisher", 27);
        Author frank = new Author("Frank N. Stein", 69);
        Author carl = new Author("Carl Marks", 33);


        Book tonyBio = new Book("My life as an alcoholic", "Autobiography", tony);
        Book cocktails = new Book("My top 100 cocktails", "Recipe", tony);

        Book earnMoney = new Book("10 Ways to quickly earn money with potatoes!", "Finance", alex);
        Book potatoStocks = new Book("How potato stocks will change your life!", "Finance", alex);

        Book ghostInCastle = new Book("The ghost in castle Castlestein", "Horror", frank);
        Book frankBio = new Book("I can see dead people", "Autobiography", frank);
        Book zombieInBedroom = new Book("The zombie in my bedroom", "Horror", frank);

        Book carlBio = new Book("The life of a regular person", "Autobiography", carl);
        Book boo = new Book("BOO", "Horror", carl);


        User user = new User("XxPu55yD3stroy3r69xX", 23);

        Collection test = new Collection(cocktails);
        user.setMyCollection(test);

        System.out.println(user.getMyCollection().listBooks());

        user.getMyCollection().addBook(potatoStocks);

        System.out.println(user.getMyCollection().listBooks());


    }
}
