package Progra2Poli;

public class Hijas extends Padre{
    private int años;
    public Hijas(String nombre,String queHaces,int años){
        super(nombre,queHaces);
        this.años=años;
    }

    public int getAños() {
        return años;
    }

    public String Mostrardato(){

        return "Nombre: "+nombre+"Que haces:"+queHaces+"Edad:"+años;

    }
}
