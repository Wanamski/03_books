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

    // deletes a specific book from the collection
    public void deleteBook(Book bookToDelete){

        int locationOfBookToDelete = this.searchBookInCollection(bookToDelete) - 1;

        if (locationOfBookToDelete == 0){
            System.out.println("Sorry, but this book does not exist in your collection.");
        } else {

            Book [] newCollection =new Book[this.booksFromCollection.length - 1];

            for (int i = 0; i < this.booksFromCollection.length; i++) {

                if (i < locationOfBookToDelete){
                    newCollection[i] = booksFromCollection[i];
                } else if ( i > locationOfBookToDelete){
                    newCollection[i - 1] = booksFromCollection[i];
                }

            }

            booksFromCollection = newCollection;

        }

    }





    // lists all books in the collection
    public String listBooks(){

        String list = " ";

        for (int i = 0; i < this.booksFromCollection.length; i++) {
            list = list + "\n [" + i + "] " + this.booksFromCollection[i].getTitle();

        }

        return list;

    }

    // searches for a book in the array and returns the location of searched book
    // CAUTION!!: return value is the array location + 1!!!
    // => if return value is 0, the searched book doesn't exist in the collection!!!
    public int searchBookInCollection(Book searchedBook){

        for (int i = 0; i < booksFromCollection.length; i++) {

            if (booksFromCollection[i].equals(searchedBook)){
                return i + 1;
            }

        }

        return 0;

    }

    public Book getBookOnPosition(int i){
        return this.booksFromCollection[i];
    }



    public String getBookTitleOnPosition(int i){

        return booksFromCollection[i].getTitle();

    }


}
