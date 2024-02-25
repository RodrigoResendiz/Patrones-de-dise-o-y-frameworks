/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creacionales;

/**
 *
 * @author ResendizRodrigo
 * 
 * El patrón Singleton en Java asegura que una clase tenga solo una instancia 
 * y proporciona un punto de acceso global a esa instancia. 
 */
public class Singleton {
    
     // La instancia única de la clase
    private static Singleton instancia;

    // Constructor privado para evitar la creación de instancias fuera de la clase
    private Singleton() {
        // Inicialización del singleton
    }

    // Método para obtener la instancia única de la clase
    public static Singleton obtenerInstancia() {
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }

    // Métodos adicionales de la clase
    public void realizarAccion() {
        System.out.println("Realizando una acción en el singleton");
    }
    
   /*MiSingleton tiene un campo privado instancia que almacena la única instancia de la clase.
El constructor de la clase es privado, lo que significa que no se puede crear una instancia fuera de la clase.
obtenerInstancia() es un método estático que proporciona la única instancia de la clase. 
Si la instancia aún no existe, se crea; de lo contrario, se devuelve la instancia existente.
*/
}
