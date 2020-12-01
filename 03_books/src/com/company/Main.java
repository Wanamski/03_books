package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // User erstellen
        // User soll Books haben
        // User soll eine Collection haben, die Books beinhaltet
        // User soll Books hinzufügen können, löschen etc.
        // User soll Inhalte von Books/Author bekommen

        // just some books for the start.. maybe implement external saving for the books later
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



        // Collection to list all existing books... ugly AF, but for now it does it's purpose..
        Collection allBooks = new Collection(tonyBio);
        allBooks.addBook(cocktails);
        allBooks.addBook(earnMoney);
        allBooks.addBook(potatoStocks);
        allBooks.addBook(ghostInCastle);
        allBooks.addBook(frankBio);
        allBooks.addBook(zombieInBedroom);
        allBooks.addBook(carlBio);
        allBooks.addBook(boo);


        // creating new profile
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Library. What is your name?");
        String userName = scanner.next();
        System.out.println("What is your age?");
        int userAge = scanner.nextInt();

        User user = new User(userName, userAge);

        System.out.println("Hello " + user.getName() + ".");
        System.out.println("To open your collection, we need you to pick one of the given books to add to your collection");
        System.out.println("Just type the number of the book you want to add to your collection.");
        System.out.println(allBooks.listBooks() + "\n");

        Collection userCollection = new Collection(allBooks.getBookOnPosition(scanner.nextInt()));
        user.setMyCollection(userCollection);

        System.out.println("Thank you. Now your profile is ready to be used. \n");


        while (true){

            System.out.println("\n What would you like to do?");
            System.out.println("(1) add a new book to my collection");
            System.out.println("(2) list all books in my collection");
            System.out.println("(3) list all books in the library");
            System.out.println("(4) exit");

            int userMenuDecision = scanner.nextInt();

            if (userMenuDecision == 1){

                System.out.println("What book would you like to add to your collection?");
                System.out.println(allBooks.listBooks() + "\n");

                int bookPositionToAdd = scanner.nextInt();
                user.getMyCollection().addBook(allBooks.getBookOnPosition(bookPositionToAdd));

                System.out.println("Okay, done. \"" + allBooks.getBookTitleOnPosition(bookPositionToAdd) + "\" is now added to your collection.");

            } else if (userMenuDecision == 2){

                System.out.println("Here are all books, that are currently in your collection: \n");
                System.out.println(user.getMyCollection().listBooks());

            } else if (userMenuDecision == 3){

                System.out.println("Here are all books available in our library: \n");
                System.out.println(allBooks.listBooks());

            } else if (userMenuDecision == 4){
                break;
            }

            //break; //for the moment to not get stuck in the loop..

        }

        System.out.println("Thank you for visiting our library. \n We hope, we will see you again.");



        /*

        User user = new User("XxPu55yD35tr0y3r69xX", 23);

        Collection test = new Collection(cocktails);
        user.setMyCollection(test);


        System.out.println(user.getMyCollection().listBooks());

        user.getMyCollection().addBook(potatoStocks);
        user.getMyCollection().addBook(ghostInCastle);
        user.getMyCollection().addBook(boo);

        System.out.println(user.getMyCollection().listBooks());

        boolean testEquals = potatoStocks.getTitle().equals(user.getMyCollection().getBookTitleOnPosition(1));
        if (testEquals){
            System.out.println("CHICKEN WINGS ARE THE BEST!!");
        } else {
            System.out.println("no i like salad...");
        }


        user.getMyCollection().searchBookInCollection(ghostInCastle.getTitle());
        user.getMyCollection().searchBookInCollection(tonyBio.getTitle());

         */




    }

}
