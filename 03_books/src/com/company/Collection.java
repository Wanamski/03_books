package com.company;

public class Collection {

    private Book[] booksFromCollection = new Book[1];

    // Methoden zum Hinzufügen/Löschen von Büchern

    // Methode zum Suchen eines bestimmten Buches

    // Inhalte anzeigen

    // equals? for schleifen etc.


    Collection(Book openingBook){

//        Book[] books = {openingBook};
//        this.books[0] = books[0];

        this.booksFromCollection[0] = openingBook;

    }

    // adds a given book to the collection
    public void addBook(Book book){

        Book [] newCollection = new Book[this.booksFromCollection.length + 1];

        for (int i = 0; i < this.booksFromCollection.length; i++) {
            newCollection[i] = this.booksFromCollection[i];
        }

        newCollection[this.booksFromCollection.length] = book;

        booksFromCollection = newCollection;

    }

    // lists all books in the collection
    public String listBooks(){

        String list = " ";

        for (int i = 0; i < this.booksFromCollection.length; i++) {
            list = list + "\n" + this.booksFromCollection[i].getTitle() + "\n";

        }

        return list;

    }



}
