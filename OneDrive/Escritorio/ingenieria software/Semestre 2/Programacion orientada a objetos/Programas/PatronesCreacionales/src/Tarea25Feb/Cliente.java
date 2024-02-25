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
public class Cliente {
    
    public static void main(String []args){
        DB mysql=factory.getDBoperation("mysql");
        System.out.println(mysql.getconect());
        System.out.println(mysql.getdisconect());
        System.out.println();
        
                
        DB oracle=factory.getDBoperation("oracle");
        System.out.println(oracle.getconect());
        System.out.println(oracle.getdisconect());
               System.out.println();


    }
}
