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
public class Start {
   
    public static void main(String[] arg){
        boolean flag=true;
        Scanner lector = new Scanner(System.in);
        while(flag){
            System.out.println("Rellenemos los dos equipos:");
            Equipo[] z= new Equipo[2];
            for(byte i=0;i<=1;i++){
                System.out.println("Introduzca el nombre del equipo numero "+(i+1));
                String nombre= lector.nextLine();
                z[i]=new Equipo(i,nombre);
            }
           
            System.out.println(z.getClass().getName().substring(0,1));
        System.out.println("Introduzca una opcion para continuar:\n "
                + "1.Mostrar datos de los equipos\n 2.Mostrar Datos de un jugador por nombre\n"
                + "3.Mostrar los mejores delanteros\n 4.Ordenar a los jugadores por goles\n "
                + "5.Dar de Baja a un jugador en un equipo\n 6.Dar de Alta a un jugador nuevo en un equipo\n 7.Exit");
        switch(lector.nextInt()){
            case 1:
                z[0].mostrarDatosEquipo();
                z[1].mostrarDatosEquipo();
            case 2:
                System.out.println("Seleccione al equipo:\n 1 o 2");
                int aux =lector.nextInt()-1;
                System.out.println("Escriba el nombre del jugador");
                z[aux].mostrarDatosJugador(lector.nextLine());
                break;
            case 3:
                System.out.println("Mejores delanteros:");
                System.out.println(z[0].nombre);
                z[0].mostrarMejorDelantero();
                System.out.println(z[1].nombre);
                z[1].mostrarMejorDelantero();
                break;
            case 4:
                System.out.println("Ordenacion de los equipos por goles");
                z[0].ordenarGoles();
                z[1].ordenarGoles();
                z[0].mostrarDatosEquipo();
                z[1].mostrarDatosEquipo();
                break;
            case 5:
                System.out.println("Seleccione al equipo:\n 1 o 2");
                aux =lector.nextInt()-1;
                System.out.println("Id del jugador a dar de baja");
                z[aux].darBaja(lector.nextInt());
                break;
            case 6:
                System.out.println("Seleccione al equipo:\n 1 o 2");
                aux =lector.nextInt()-1;
                z[aux].darAlta(aux);
                break;
            case 7:
                flag=false;
                break;
            default:
                System.out.println("Opcion no valida intentelo denuevo");
        }
           
        }
        
    }
}
