/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooEjercicio3;

/**
 *
 * @author wasta
 */
public class Titular {
    private String Nombre,Apellidos;
    private int edad;
    
    public Titular(){
        edad=(int)(Math.random()*20);
        Nombre="Usuario"+edad;
        Apellidos="peñas Granada"+Nombre;
    }
    
    //Methods
    @Override
    public String toString(){
        return "Nombre: "+Nombre+"\nApellidos: "+Apellidos+"\nEdad: "+edad;
    }
}
