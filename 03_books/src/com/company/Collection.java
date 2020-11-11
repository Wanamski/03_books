package com.company;

import java.util.Arrays;

public class Collection {

    private Book[] books = new Book[1];

    // Methoden zum Hinzufügen/Löschen von Büchern

    // Methode zum Suchen eines bestimmten Buches

    // Inhalte anzeigen

    // equals? for schleifen etc.


    Collection(Book openingBook){

        Book[] books = {openingBook};
        this.books[0] = books[0];

    }

    // adds a given book to the collection
    // TODO: 11.11.2020 DEBUG!!!! 
    public void addBook(Book book){

        Book [] books = new Book[this.books.length + 1];

        for (int i = 0; i < this.books.length; i++) {
            books[i] = this.books[i];
        }

        books[this.books.length] = book;

    }

    // lists all books in the collection
    public String listBooks(){

        String list = " ";

        for (int i = 0; i < this.books.length; i++) {
            list = list + "|" + this.books[i].getTitle() + "|";

        }

        return list;

    }



}
