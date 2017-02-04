/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooEjercicio1;

/**
 *
 * @author wasta
 */
public class Jugador {
    private int id,idEquipo,partidos,goles;
    private String nombre;
    public Jugador(int idE,int id,String nombre){
        this.id=id;
        this.nombre = nombre;
        idEquipo = idE;
        partidos= (int)Math.random()*5;
        goles=(int)Math.random()*3;
    }
    public Jugador (int id,int idE,String nombre,int partidos,int goles){
        this.id = id;
        idEquipo=idE;
        this.nombre = nombre;
        this.partidos = partidos;
        this.goles = goles;    
    }
    public int getId(){return id;}
    
    public int getIdEquipo(){return idEquipo;}
    
    public String getNombre(){return nombre;}
    
    public int getGoles(){return goles;}
    
    public void setId(int id){
        if(id>=0){
          this.id=id;
        }
    }
    
    public float promedioGoles(){
        return (float)goles/partidos;
    }
    @Override
    public String toString(){
        return id+" "+nombre+" "+" "+idEquipo+" "+partidos+" "+goles ;
    }
}
