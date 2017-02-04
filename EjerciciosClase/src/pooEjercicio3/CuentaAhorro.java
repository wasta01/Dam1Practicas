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
public class CuentaAhorro extends CuentaCorriente{
    private double interes;
    public CuentaAhorro(Titular t1, String NCuenta, double saldo,double interes) {
        super(t1, NCuenta, saldo);
        this.interes=interes;
    }
    public CuentaAhorro(Titular t1,String NCuenta,double interes){
        super(t1,NCuenta);
        this.interes=interes;
    }
     public CuentaAhorro(Titular t1,String NCuenta){
        super(t1,NCuenta);
        this.interes= 2.5;
    }
     
    //Getters && Setters
     public double getInteres(){return interes;}
    //Methods
    public void CalculoInteres(){
        Saldo += (Saldo*interes)/100;
    }
}
