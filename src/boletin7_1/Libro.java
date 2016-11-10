/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7_1;

/**
 *
 * @author Ara
 */
public class Libro {
       private String libro, autor;
    private int numExemplares, numPrestados;
   
    public Libro (){
        
    }
    public Libro (String li, String au, int numE, int numP){
        libro=li;
        autor=au;
        numExemplares=numE;
        numPrestados=numP;
    }
    public void setLibros (String li){
        libro=li;
    }
    public String getLibros(){
        return libro;
    }
    public void setAutor (String au){
        autor=au;
    }
    public String getAutor(){
        return autor;
    }
    public void setExemplares (int numE){
        numExemplares=numE;
    }
    public int getExemplares(){
        return numExemplares;
    }
    public void setPrestados (int numP){
        numPrestados=numP;
    }
    public int getPrestados(){
        return numPrestados;
    }
    
    public boolean prestamo (){
        
        if(numExemplares<=numPrestados){
            System.out.println("No está disponible para préstamo.");
            return false;
            }   
        else{
            numPrestados=numPrestados+1; 
            System.out.println("Hay libros disponibles. Hay prestados " + numPrestados);  
             return true;
            }
    }
    public boolean devolucion(){
        if(numPrestados<1){
            System.out.println("No se puede devolver" );
            return false;
            }
        else{
           numPrestados=numPrestados-1;
            System.out.println("Libro devuelto, ejemplares disponibles " + (numExemplares-numPrestados));
            return true;
            }
    }

    //
    @Override
    public String toString (){
        String message = "Tenemos el libro " + libro + " de el/la autor/a " + autor + ", hay " + numExemplares + " ejemplares en la biblioteca y están prestados " + numPrestados;
        return message;
    }
}
