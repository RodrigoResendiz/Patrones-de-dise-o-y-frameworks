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
public interface Figura {
    public void setNombre(String n); //dar nombre
    public String getNombre();  //obtener nombre
    public void setColor(String c); //dar nombre
    public String getColor();
    public Figura clonar();
}
