package Herencia;

import java.util.Calendar;

public class CuentaBancaria {
    //Variables
    protected int numero;
    protected String cliente;
    protected double saldo;
    protected double tasa;
    protected Calendar creacion;

    //contructor Padre
    public CuentaBancaria(int numero,String cliente,double tasa){
        this.numero=numero;
        this.cliente=cliente;
        this.saldo=500;
        this.tasa=tasa;
        this.creacion=Calendar.getInstance();


    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Calendar getCreacion() {
        return creacion;
    }

    public double getTasa() {
        return tasa;
    }
    public boolean retirar(double monto){
        if(saldo>monto){
            saldo-=monto;
            return true;


        }
            return false;

    }
    public void depositar(double monto){
        if(monto>0)
            saldo+=monto;
            System.err.println("Su deposito debe ser mayor que 0- "+monto+"Lps");
    }
    @Override
    public String toString(){
        return "{Numero: "+numero+",Cliente: "+cliente+",Saldo: "+saldo+",Tasa: "+tasa+"}";
    }

}
