/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooEjercicio1;
import java.util.Scanner;
/**
 *
 * @author wasta
 */
public class Equipo {
    int id;
    Jugador[] x=new Jugador[11];
    String nombre;
    public Equipo(int id,String nombre){
        
        this.id=id;
        this.nombre = nombre;
        System.out.println("Indique en el siguiente formato sus 11 jugadores: \n"
                + "[NombreJugador];[PartidosJugados];[goles]");
        for(byte i=0;i<x.length;i++){
            
            if(i!=0){
                System.out.println("Introduzca siguiente jugador");
            }else{
                System.out.println("Introduzca su primer jugador");
            }
            nuevoJugador(i);
        }
    }
    public Jugador getJugador(int i){
        return x[i];
    }
    protected void setJugador(int i,Jugador j){
        x[i]= j;
    }
    public void mostrarDatosEquipo(){
        System.out.println("\t\t Equipo numero"+id);
        for(byte i=0;i<x.length;i++){
            mostrarDatosJugador(x[i].getNombre());
        }
    }
    public String mostrarDatosJugador(String Nombre){
        for(byte i=0;i<x.length;i++){
            if(x[i].getNombre().equals(Nombre))
            return x[i].toString();
        }
            return null;
    }
    
    public String mostrarMejorDelantero(){
        float aux=0;
        String auxnombre=null;
        for(byte i =0;i<x.length;i++){
            if(x[i].promedioGoles()>aux){
                aux=x[i].promedioGoles();
                auxnombre=x[i].getNombre();
            }
        }
        return mostrarDatosJugador(nombre);
    }
    
    public void ordenarGoles(){
        Jugador aux;
        for(byte i=0;i<x.length;i++){
            for(byte j=(byte)(i+1);j<x.length;j++){
                if(x[i].getGoles()>x[j].getGoles()){
                    aux=x[j];
                    x[j]=x[i];
                    x[i]=aux;
                    x[i].setId(i);
                    x[j].setId(j);
                }
            }
        }
    }
    private Jugador nuevoJugador(int i){
        Scanner lector = new Scanner(System.in);
        String aux;
        aux=lector.nextLine();
        int partidoaux=Integer.parseInt(aux.split(";")[1]);
        int golesaux=Integer.parseInt(aux.split(";")[2]);
        return new Jugador(i,id,aux.split(";")[0],partidoaux,golesaux);
    }
    public void darBaja(int id){
        x[id]=null;
    }
    public void darAlta(int id){
        System.out.println("Introduzca su nuevo Jugador:\n "
                + "En el siguiente formato [NombreJugador];[PartidosJugados];[goles]");
        if(x[id]==null){
           nuevoJugador(id);
        }
    }
    public void traspaso(Equipo e,int id){
        Jugador aux;
        aux = x[id];
        x[id] = e.getJugador(id);
        e.setJugador(id, aux);
    }
}
