package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // User erstellen
        // User soll Books haben
        // User soll eine Collection haben, die Books beinhaltet
        // User soll Books hinzufügen können, löschen etc.
        // User soll Inhalte von Books/Author bekommen

        Gson gson = new Gson();
        Scanner scanner = new Scanner(System.in);



        // just some books for the start.. maybe implement external saving for the books later

        /*

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
        
         */

        /*

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

         */

        // loading allBooks Collection
        String allBooksJson = loadJsonFromFileToString("allBooks.json");
        Collection allBooks = gson.fromJson(allBooksJson, Collection.class);

        User user = new User();

        System.out.println("Welcome to the Library. Do you already have an account or do you want to register?");
        System.out.println("[1] Register");
        System.out.println("[2] Login");
        int userInput = scanner.nextInt();

        if (userInput == 1){
            // creating new profile
            System.out.println("What is your name?");
            String userName = scanner.next();
            System.out.println("What is your age?");
            int userAge = scanner.nextInt();

            user.setName(userName);
            user.setAge(userAge);

            System.out.println("Hello " + user.getName() + ".");
            System.out.println("To open your collection, we need you to pick one of the given books to add to your collection");
            System.out.println("Just type the number of the book you want to add to your collection.");
            System.out.println(allBooks.listBooks() + "\n");

            Collection userCollection = new Collection(allBooks.getBookOnPosition(scanner.nextInt()));
            user.setMyCollection(userCollection);

            System.out.println("Thank you. Now your profile is ready to be used. \n");
            System.out.println("You can log in next time using your name.");

        }else if(userInput == 2){

            // logging into an existing account
            System.out.println("Please enter your Name to log in: ");
            String userProfileLocation = "user_" + scanner.next() + ".json";

            String userJson = loadJsonFromFileToString(userProfileLocation);
            user = gson.fromJson(userJson, User.class);

            System.out.println("Welcome back, " + user.getName() + "!");

        } else {

            // terminating the program if input is unexpected.. maybe change later idk
            // TODO: 03.03.2021  
            System.out.println("invalid input..");
            System.out.println("Terminating program...");
            System.exit(0);
        }





        while (true){

            System.out.println("\n What would you like to do?");
            System.out.println("(1) add a new book to my collection");
            System.out.println("(2) delete a book from my collection");
            System.out.println("(3) list all books in my collection");
            System.out.println("(4) list all books in the library");
            System.out.println("(5) exit");

            int userMenuDecision = scanner.nextInt();

            if (userMenuDecision == 1){  // adding new book to collection

                // TODO: 03.03.2021 fix out of bounds exception with unexpected input 

                System.out.println("What book would you like to add to your collection?");
                System.out.println(allBooks.listBooks() + "\n");

                int bookPositionToAdd = scanner.nextInt();
                user.getMyCollection().addBook(allBooks.getBookOnPosition(bookPositionToAdd));

                System.out.println("Okay, done. \"" + allBooks.getBookTitleOnPosition(bookPositionToAdd) + "\" is now added to your collection.");

            } else if (userMenuDecision == 2){  // deleting book from collection

                // TODO: 03.03.2021 fix out of bounds exception with unexpected input 

                System.out.println("What book do you want to delete from your collection?");
                System.out.println(user.getMyCollection().listBooks());

                int bookPositionToDelete = scanner.nextInt();
                Book bookToDelete = user.getMyCollection().getBookOnPosition(bookPositionToDelete);

                user.getMyCollection().deleteBook(user.getMyCollection().getBookOnPosition(bookPositionToDelete));

                System.out.println("Okay, \"" + bookToDelete.getTitle() + "\" has been deleted from your collection." );

            } else if (userMenuDecision == 3){  // list all books in collection

                System.out.println("Here are all books, that are currently in your collection: \n");
                System.out.println(user.getMyCollection().listBooks());

            } else if (userMenuDecision == 4){  // list all books in library

                System.out.println("Here are all books available in our library: \n");
                System.out.println(allBooks.listBooks());

            } else if (userMenuDecision == 5){  // exit

                break;

            } else {

                System.out.println("invalid input.. Please use one of the given options.");

            }

        }

        // saving the allBooks Collection to json file
        saveObjectToJsonFile(allBooks, "allBooks.json");

        // saving used user profile
        String userProfileJsonFileName = "user_" + user.getName() + ".json";
        saveObjectToJsonFile(user, userProfileJsonFileName);

        System.out.println("Thank you for visiting our library. \n Have a great day!");

    }

    // save existing Object to external json file
    static void saveObjectToJsonFile(Object object, String fileName){
        System.out.println("Saving data...");

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonToSave = gson.toJson(object);

        try{
            PrintWriter writer = new PrintWriter(fileName, "UTF-8");
            writer.println(jsonToSave);
            writer.close();
        }catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("Data saved.");

    }

    // load existing external json file to String
    static String loadJsonFromFileToString(String pathname){
        String jsonToReturn = "";

        try{
            File fileToRead = new File(pathname);
            Scanner reader = new Scanner(fileToRead);

            while (reader.hasNextLine()){
                jsonToReturn = jsonToReturn + reader.nextLine();
            }
        }catch(FileNotFoundException e){
            System.out.println(pathname + " was not found.");
            e.printStackTrace();
        }

        return jsonToReturn;
    }

}
