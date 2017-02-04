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
public class Alumno {
    private Asignatura as1,as2,as3;
    public Alumno(Asignatura as1,Asignatura as2,Asignatura as3){
        this.as1 = as1;
        this.as2=as2;
        this.as3=as3;  
    }
    public Alumno(int as1,int as2,int as3){
        this.as1=new Asignatura(as1);
        this.as2=new Asignatura(as2);
        this.as3=new Asignatura(as3);
    }
    //Getters && Setters
    
    public Asignatura getAsignatura1(){return as1;}
    public Asignatura getAsignatura2(){return as2;}
    public Asignatura getAsignatura3(){return as3;}
    //Mothods
    @Override
    public String toString(){
        return "Asignatura con id : "+as1.getIdentificador()+"\n una nota de: "+as1.getCalificacion()+
                "\nAsignatura con id : "+as2.getIdentificador()+"\n una nota de: "+as2.getCalificacion()+
                "\nAsignatura con id : "+as3.getIdentificador()+"\n una nota de: "+as3.getCalificacion();
    }
}
