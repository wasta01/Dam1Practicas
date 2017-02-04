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
public class CuentaCorriente {
    private Titular t1;
    String NCuenta;
    double Saldo;
    public CuentaCorriente(Titular t1,String NCuenta,double saldo){
        this.t1=t1;
        this.NCuenta=NCuenta;
        Saldo = saldo;
    }
    public CuentaCorriente(Titular t1,String NCuenta){
            this.t1 = t1;
            this.NCuenta=NCuenta;
            Saldo=15.3;
    }
    //Getters && Setters
    public Titular getTitular(){return t1;}
    public String getNCuenta(){return NCuenta;}
    public double getSaldo(){return Saldo;}
    
    public void setSaldo(double saldo){
        if(saldo>=0){Saldo=saldo;}
    }
    //Methods
    public void ingresarSaldo(double monto){
        Saldo +=monto;
    }
    public void reintegroSaldo(double monto){
        Saldo-=monto;
    }
    public void imprimirCuenta(){
        System.out.println("Numero cuenta: "+NCuenta+"\n Saldo: "+Saldo);
    }
    public boolean equals(CuentaCorriente c){
        return NCuenta.compareTo(c.getNCuenta()) == 0;
    }
    
}
