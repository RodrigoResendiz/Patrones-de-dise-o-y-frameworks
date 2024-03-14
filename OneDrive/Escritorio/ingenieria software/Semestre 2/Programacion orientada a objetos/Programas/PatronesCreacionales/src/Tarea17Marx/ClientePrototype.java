/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea17Marx;

/**
 *
 * @author ResendizRodrigo
 */
public class ClientePrototype {
    public static void main(String[] args) {
        
        Circulo circulo1 = new Circulo();
        circulo1.setNombre("Circulo de sol");
        circulo1.setColor("Red");
       
        
        System.out.println("Circulo1, name: "+circulo1.getNombre());
        System.out.println("Circulo 1, color: "+circulo1.getColor());
        System.out.println("");
        
        Circulo circulo2 = new Circulo();
        circulo2.setNombre("Circulo de fuego");
        circulo2.setColor("Black");
        
        Figura NuevoCirculo = circulo2.clonar();
        
        System.out.println(circulo2);
        
        System.out.println("Circulo 2, name: "+circulo2.getNombre());
        System.out.println("Circulo 2, color:: "+circulo2.getColor());
        System.out.println("");
           
        ////Figura triangulo
        Triangulo triangulo1 = new Triangulo ();
        triangulo1.setNombre("equilatero");
        triangulo1.setColor("White");
        
        System.out.println("Triangulo 1, name: "+triangulo1.getNombre());
        System.out.println("Triangulo1, color:: "+triangulo1.getColor());
        System.out.println("");
    }
}
