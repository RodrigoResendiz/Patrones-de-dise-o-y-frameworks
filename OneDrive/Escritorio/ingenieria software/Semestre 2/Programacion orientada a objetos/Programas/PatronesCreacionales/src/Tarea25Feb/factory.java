/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea25Feb;

import java.util.Objects;

/**
 *
 * @author ResendizRodrigo
 */
public class factory {
     public static DB getDBoperation(String name){
      if(Objects.equals(name,"mysql"))
        return new MySql();       
      else if (Objects.equals(name,"oracle"))
        return new Oracle();
      else
        return new DbFalla();
    }
    
}
