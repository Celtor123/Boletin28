/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin28;

import boletin28.Alumno.Enderezo;

/**
 *
 * @author AMD
 */
public class Principal {
    
     public static void main(String[] args) {
         
       Alumno alumno1 = new Alumno("Samuel", 0);

        alumno1.setEnderezo(alumno1.new Enderezo("Calle de los pelicanos", 69));
       
       alumno1.cambiarNota(0);
       alumno1.amosar();
    }
}
