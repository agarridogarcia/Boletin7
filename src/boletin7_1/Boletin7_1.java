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
public class Boletin7_1 {

    
    public static void main(String[] args) {
        
        Libro m=new Libro();
        m.setAutor("Dan Brown");
        m.setLibros("Ángeles y demonios");
        m.setExemplares(10);
        m.setPrestados(3);
        m.prestamo();
        m.devolucion();
        System.out.println(m.toString());
        
        Libro lib=new Libro();
        lib.setAutor("Camilla Lackberg");
        lib.setLibros("El domador de leones");
        lib.setExemplares(5);
        lib.setPrestados(1);
        lib.prestamo();
        lib.devolucion();
        System.out.println(lib.toString());
    }
    
}
