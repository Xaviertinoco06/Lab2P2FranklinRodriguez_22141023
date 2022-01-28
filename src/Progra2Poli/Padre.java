package Progra2Poli;

public class Padre {
   protected String nombre;
    protected  String queHaces;
    public Padre(String nombre,String queHaces){
        this.nombre=nombre;
        this.queHaces=queHaces;

    }

    public String getNombre() {
        return nombre;
    }

    public String getQueHaces() {
        return queHaces;
    }

    public String mostrarDatos(){
        return "Nombre: "+nombre+"Que haces: "+queHaces;
    }
}
