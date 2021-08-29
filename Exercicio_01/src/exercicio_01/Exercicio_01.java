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
public class Exercicio_01 {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        
    Chapter capitolo = new Chapter();
    author Autor = new author();
    Library biblioteca = new Library(); 
    Book Livro = new Book("ISBN",biblioteca,Autor,capitolo);
    biblioteca.setNameLibrary("Livraria cacador");
    System.out.println(Livro.nameLibrary.getNameLibrary());
        
        
    }
}
 