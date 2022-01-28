package LabProgramacion;

import java.util.GregorianCalendar;

public class Animales {
    private String nombreCient;
    private String nombrecomun;
    private String habitat;
    private String alimentacion;
    private String descricionRasgos;
    private String geografica;
     int vida;


public Animales() {
}
    public Animales(String nombrecomun,String nombreCient ,String habitat, String alimentacion, String descricionRasgos, String geografica, int vida) {
    this.nombreCient=nombreCient;
    this.nombrecomun=nombrecomun;
    this.habitat=habitat;
    this.alimentacion=alimentacion;
    this.descricionRasgos=descricionRasgos;
    this.geografica=geografica;
    this.vida=vida;


    }

    public String getNombrecomun() {
        return nombrecomun;
    }

    public void setNombrecomun(String nombrecomun) {
        this.nombrecomun = nombrecomun;
    }

    public String getNombreCient() {
        return nombreCient;
    }

    public void setNombreCient(String nombreCient) {
        this.nombreCient = nombreCient;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getDescricionRasgos() {
        return descricionRasgos;
    }

    public void setDescricionRasgos(String descricionRasgos) {
        this.descricionRasgos = descricionRasgos;
    }

    public String getGeografica() {
        return geografica;
    }

    public void setGeografica(String geografica) {
        this.geografica = geografica;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }


            public String toString() {
                return "Nombre Cientifico: "+nombreCient+"\tNombre Comun: "+nombrecomun+
                        "\nHabitat: "+habitat+"\tAlimento"+alimentacion+"\nDescripciones de Rasgos: "+descricionRasgos+
                        "\tDistribucion Geografica: "+ geografica +"\nVida: "+vida;
            }


        }









