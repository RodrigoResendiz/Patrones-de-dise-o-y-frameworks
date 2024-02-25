/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea25Feb;

/**
 *
 * @author ResendizRodrigo
 */
public class DbFalla extends DB{

    @Override
    String getconect() {
        return "Sin Conexión";
    }

    @Override
    String getdisconect() {
        return "no existe";
    }
    
}
