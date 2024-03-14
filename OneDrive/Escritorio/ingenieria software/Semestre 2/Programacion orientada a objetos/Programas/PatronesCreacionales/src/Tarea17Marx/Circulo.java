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
public class Circulo implements Figura {

    private String nombre;
    private String color;
    private Integer radio;

    public Circulo() {
    }

    @Override
    public void setNombre(String n) {
        this.nombre = n;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void setColor(String c) {
        this.color = c;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public Figura clonar() {
        Figura figura = new Circulo();
        figura.setNombre(this.nombre);
        figura.setColor(this.color);
        return figura;
    }

    @Override
    public String toString() {
        return "Circulo{" + "nombre=" + nombre + ", color=" + color + ", radio=" + radio + '}';
    }
  
}
