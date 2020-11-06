package com.company;

public class Main {

    public static void main(String[] args) {
        // User erstellen
        // User soll Books haben
        // User soll eine Collection haben, die Books beinhaltet
        // User soll Books hinzufügen können, löschen etc.
        // User soll Inhalte von Books/Author bekommen


        Author tony = new Author("Tony", 35);
        Book tonyBio = new Book("My life as an alcoholic", "Autobiography", tony);

        System.out.println(tonyBio.getTitle()+ " , " + tonyBio.getGenre()+ " , " + tonyBio.getAuthor().getName());


    }
}
