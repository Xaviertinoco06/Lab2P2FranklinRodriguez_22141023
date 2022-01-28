package Herencia;

import java.util.Calendar;
import java.util.Date;

public class CuentaAhorro extends CuentaBancaria {
    //Variables
    private Calendar ultimaModif;
    //Final-Vamos a agregar un valor Y OBLIGAR A A LA ID GUARDAR UN VALOR
    public static final double TASA_AHORRO=0.03;
    public  CuentaAhorro(int numero,String cliente){
        super(numero,cliente,TASA_AHORRO);
        ultimaModif=Calendar.getInstance();

    }

    public Calendar getUltimaModif() {
        return ultimaModif;
    }
    public boolean estado(){
        Calendar hoy=Calendar.getInstance();
        hoy.add(Calendar.MONTH, -6);
        //hace la funcion de un if
        return hoy.before(ultimaModif);

    }

    @Override
    public String toString() {
        return super.toString()+"- Estado: "+estado();
    }
    public boolean retirar(double monto){
        if (estado()){
            return super.retirar(monto);
        }
        return false;

    }
    public void depositar(double monto){
        if(!estado()){
            monto-=monto*0.1;

            super.depositar(monto);

        }

    }
}
