/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooEjercicio2;

/**
 *
 * @author wasta
 */
public class Asignatura {
    private int identificador , calificacion;
    
    public Asignatura(int identificador){
        this.identificador = identificador;
    }
    
    //Getters && Setters
    public int getIdentificador(){return identificador;}
    public int getCalificacion(){return calificacion;}
    public void setCalificacion(int nota){
        if(nota>=0){
            calificacion=nota;
        }
    }
}
