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


    public void addBook(Book book, Collection collection){

        // TODO: 10.11.2020 implement

    }

    public String listBooks(){

        String list = " ";

        for (int i = 0; i < this.books.length; i++) {
            list = list + "|" + this.books[i].getTitle() + "|";

        }

        return list;

    }



}
