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
    public void addBook(Book newBook){

        Book [] newCollection = new Book[this.booksFromCollection.length + 1];

        for (int i = 0; i < this.booksFromCollection.length; i++) {
            newCollection[i] = this.booksFromCollection[i];
        }

        newCollection[this.booksFromCollection.length] = newBook;

        booksFromCollection = newCollection;

    }

    // lists all books in the collection
    public String listBooks(){

        String list = " ";

        for (int i = 0; i < this.booksFromCollection.length; i++) {
            list = list + "\n [" + i + "] " + this.booksFromCollection[i].getTitle();

        }

        return list;

    }

    // searches for a booktitle in the array and prints the location of searched book
    // might implement returning booksFromCollection[i] later if practical idk....
    public void searchBookInCollection(String searchedBookTitle){

        String output = " ";

        for (int i = 0; i < booksFromCollection.length; i++) {

            if (booksFromCollection[i].getTitle().equals(searchedBookTitle)){
                output ="The book you seek exists on Position " + i + " of the Collection Array.";
                break;
            } else {
                output ="The book you tried to find does not exist in this Collection...";
            }

        }

        System.out.println(output);

    }

    public Book getBookOnPosition(int i){
        return this.booksFromCollection[i];
    }



    public String getBookTitleOnPosition(int i){

        return booksFromCollection[i].getTitle();

    }


}
