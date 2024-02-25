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
public class Oracle extends DB{

    public Oracle() {
    }

    @Override
    String getconect() {
        return "Conectando Oracle";
    }

    @Override
    String getdisconect() {
        return "Desconectando Oracle";
    }
    
    
}
