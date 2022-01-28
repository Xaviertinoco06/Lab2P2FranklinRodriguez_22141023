package LabProgramacion;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2P2_FranklinRodriguez_22141023 {

    public static ArrayList<Animales> lista = new ArrayList();
    public static Animales Predeterminado  = new Animales();

    public static Scanner scan = new Scanner(System.in);






    public static void editarAnimales(){
        System.out.print("Ingrese la posicion: ");
        int pos=scan.nextInt();
        System.out.println("Animal seleccionado: "+animales.get(pos).getNombreCientifico());
        System.out.println("1.Un atributo");
        System.out.println("2.Todos los atributos");
        System.out.print("Ingrese la opcion: ");
        int opcion = scan.nextInt();
        if(opcion == 1)
            editarUnAtributo(pos);
        else if(opcion == 2)
            editarAtributos(pos);


    }
    public static void editarUnAtributo(int pos){
        System.out.println("1. Nombre Comun");
        System.out.println("2. Alimentacion");
        System.out.println("3. Descripcion de Rasgos");
        System.out.println("4. Habitat");
        System.out.println("5. Ubicacion Geografica");
        System.out.println("7. vida");
        System.out.print("Ingrese la opcion: ");
        int opcion = scan.nextInt();
        if(opcion == 1){
            System.out.print("Nombre Comun: ");
            lista.get(pos).setNombrecomun(scan.next());
        }else if(opcion == 2){
            System.out.print("Alimentacion: ");
            lista.get(pos).setAlimentacion(scan.next());
        }else if(opcion == 3){
            System.out.print("Descripcion de Rasgos: ");
            lista.get(pos).setDescricionRasgos(scan.next());
        }else if(opcion == 4){
            System.out.println("Habitat: ");
            lista.get(pos).setHabitat(scan.next());
        }else if(opcion == 5){
            System.out.print("Ubicacion Geograficas: ");
            lista.get(pos).setGeografica(scan.next());
        }else if(opcion == 6){
            System.out.print("Vida: ");
            lista.get(pos).setVida(scan.nextInt());

        }
    }

    public static void editarAtributos(int pos){
        System.out.print("Nombre Comun: ");
        lista.get(pos).setNombrecomun(scan.next());
        System.out.print("Alimentacion: ");
        lista.get(pos).setAlimentacion(scan.next());
        System.out.print("Descripcion de Rasgos: ");
        lista.get(pos).setDescricionRasgos(scan.next());
        System.out.println("Habitat: ");
        lista.get(pos).setHabitat(scan.next());
        System.out.print("Ubicacion Geografica: ");
        lista.get(pos).setGeografica(scan.next());
        System.out.print("Vida: ");
        lista.get(pos).setVida(scan.nextInt());


        public static void eliminarAnimales(){
            System.out.print("Posicion: ");
            lista.remove(scan.nextInt());

    }



}


