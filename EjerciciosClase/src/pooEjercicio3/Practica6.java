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
public class Practica6 {
    public static void main (String[] arg){
        CuentaAhorro ca1,ca2;
        CuentaCorriente cc1,cc2;
        Titular t1=new Titular(),t2=new Titular();
        
        ca1=new CuentaAhorro(t1,"122113");
        ca2 = new CuentaAhorro(t2,"422211",15.5);
        cc1 = new CuentaCorriente(t1,"122113");
        cc2 =new CuentaCorriente(t2,"422211",5000.00);
        System.out.println("Se crearon 2 cuentas para el titular"+t1.toString());
        System.out.println("Las Cuentas son las siguientes: \n cuenta 1: ");
        ca1.imprimirCuenta();
        System.out.println("cuenta 2: ");
        cc1.imprimirCuenta();
        System.out.println("Se crearon 2 cuentas para el titular"+t2.toString());
        System.out.println("Las Cuentas son las siguientes: \n cuenta 1: ");
        ca2.imprimirCuenta();
        System.out.println("cuenta 2: ");
        cc2.imprimirCuenta();
    }
}
