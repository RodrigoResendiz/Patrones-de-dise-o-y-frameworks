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
public class MySql extends DB {

    public MySql() {
    }

    @Override
    String getconect() {
        return "Conexión a MySQL";
    }

    @Override
    String getdisconect() {
        return "Cerrando MySQL";
    }
    
    
}
