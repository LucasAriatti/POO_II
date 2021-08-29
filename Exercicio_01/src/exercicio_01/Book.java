/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_01;

/**
 *
 * @author Lucas
 */
public class Book {
    String ISBN; 
    Library nameLibrary;
    author name;
    Chapter number;

    public Book(String ISBN, Library nameLibrary, author name, Chapter number) {
        this.ISBN = ISBN;
        this.nameLibrary = nameLibrary;
        this.name = name;
        this.number = number;
    }

    

   
    

    public Library getNameLibrary() {
        return nameLibrary;
    }

    public void setNameLibrary(Library nameLibrary) {
        this.nameLibrary = nameLibrary;
    }

    public author getName() {
        return name;
    }

    public void setName(author name) {
        this.name = name;
    }

    public Chapter getNumber() {
        return number;
    }

    public void setNumber(Chapter number) {
        this.number = number;
    }
    public String getISBN() {   
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    
    
    
}
