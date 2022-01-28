package LabProgramacion;

public class Animales {
    private String nombrecomun;
    private String habitat;
    private String alimentacion;
    private String descricionRasgos;
    private String geografica;
    private int vida;

}
public Animales() {
}
    public Animales(String nombrecomun, String habitat, String alimentacion, String descricionRasgos, String geografica, int vida) {
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


        public String toString() {
            return "Animales{" + "Nombre Comun=" + nombrecomun + ", Habitat=" + habitat + ", Alimentacion=" + alimentacion + ", Descripcion de Rasgos=" + descricionRasgos + ", Ubicacion Geografica=" + geografica + ", Vida=" +vida+'}';


        }




    }


}

