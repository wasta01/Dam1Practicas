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
public class Prctica5b {
    public static void main(String[] args){
        Asignatura as1 = new Asignatura(1);
        Asignatura as2 = new Asignatura(2);
        Asignatura as3 = new Asignatura(3);
        Alumno a1 = new Alumno(as1,as2,as3);
        Profesor p1 = new Profesor();
        System.out.println("El Profesor calificara al alumno");
        p1.ponerNotas(a1);
        System.out.println(a1.toString());
        System.out.println("La media del alumno es de: "+p1.calcularMedia(a1));
    }
}
