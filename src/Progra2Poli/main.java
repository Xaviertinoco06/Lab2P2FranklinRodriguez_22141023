package Progra2Poli;

public class main {
    public static void main(String[] args) {
        String nombre = "pablo\n", queHaces = "estudiar";
        int edad = 0;

        Padre familia=new Hijas(nombre,queHaces,edad);
        Hijas herederos=(Hijas)familia;
        System.out.println(herederos.mostrarDatos());
    }
}
