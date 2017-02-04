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
public class Profesor {
    public void ponerNotas(Alumno a1){
        a1.getAsignatura1().setCalificacion((int) (Math.random() * 10));
        a1.getAsignatura2().setCalificacion((int) (Math.random() * 10));
        a1.getAsignatura3().setCalificacion((int) (Math.random() * 10));
    }
    public double calcularMedia(Alumno a1){
        double aux=0;
        aux += a1.getAsignatura1().getCalificacion();
        aux += a1.getAsignatura2().getCalificacion();
        aux += a1.getAsignatura3().getCalificacion();
        return aux/3;
    }
}
