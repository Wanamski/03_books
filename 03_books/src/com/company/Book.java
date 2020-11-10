package com.company;

import java.util.Arrays;
import java.util.Objects;

public class Book {
    // Sinnvolle Attribute erstellen

    private String title;
    private String genre;
    private Author author;

    Book(String title, String genre, Author author){

        this.title = title;
        this.genre = genre;
        this.author = author;

    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    // tests, if the title of the book equals given title
    public boolean equalsTitle(String givenTitle){
        if(this.getTitle() == givenTitle){
            return true;
        }else{
            return false;
        }
    }

}
