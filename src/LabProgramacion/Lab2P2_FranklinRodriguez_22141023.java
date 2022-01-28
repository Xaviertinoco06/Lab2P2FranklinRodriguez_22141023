package LabProgramacion;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2P2_FranklinRodriguez_22141023 {
    public class ArrayAnimals {
        static Scanner scan = new Scanner(System.in);
        static ArrayList<Animales> Animales = new ArrayList<>();
        static Animales defaults = new Animales();
        static Animales defaults2 = new Animales();
        static Animales defaults3 = new Animales();

        public static void main(String[] args) {
            defaultss();
            do {
                Opciones(menu());
            } while (menu() != 0);
        }

        public static int menu() {
            System.out.println("\n0. Salir\n1. Crear Animales\n2. Eliminar Animales\n3. Editar Atributos\n4. Imprimir\n5. Cadena Alimentacia\nIngrese una opcion: ");
            return scan.nextInt();
        }
        public static void Opciones(int opcion) {
            switch (opcion) {
                case 1:
                    crearAnimal();
                    break;
                case 2:
                    eliminarAnimales();
                    break;
                case 3:
                    editarAtributos();
                    break;
                case 4:
                    Imprimir();
                    break;
                case 5:
                    Alimenticia();
                    break;
            }
        }
        public static void defaultss() {
            defaults = new Animales("Penguinos", "Spheniscidae", "Polo sur", "Pescados", "Finos", "polos", 8);
            Animales.add(defaults);
            defaults2 = new Animales("Pulpo", "Octopoda", "Oceano", "Algas y pescadas", "Elegantes", "Oceanos pacificos", 10);
            Animales.add(defaults2);
            defaults3 = new Animales("Perro", "Canis lupus familiaris", "Mi casa", "Carne", "peludos", "Todo el mundo", 15);
            Animales.add(defaults3);
        }
        public static void crearAnimal() {
            System.out.print("Nombre Cientifico: ");
            String nombrecientifico = scan.next();
            System.out.print("Nombre Comun: ");
            String nombrecomun = scan.next();
            System.out.print("Habitat: ");
            String habitat = scan.next();
            System.out.print("Alimento: ");
            String Alimento = scan.next();
            System.out.print("Descripcion de Rasgos: ");
            String descripcion = scan.next();
            System.out.print("Distribucion Geografica: ");
            String geografia = scan.next();
            System.out.print("Vida: ");
            int vida =scan.nextInt();
            Animales.add(new Animales(nombrecientifico, nombrecomun, habitat, Alimento, descripcion, geografia, vida));
        }
        public static void editarAtributos() {
            System.out.print("Ingrese la posicion: ");
            int pos = scan.nextInt();
            System.out.println("Animal seleccionado: " + Animales.get(pos).getNombreCient());
            System.out.println("1.Un atributo\n2.Todos los atributos\nIngrese la opcion: ");
            int opcion = scan.nextInt();
            if (opcion == 1) {
                editarUnAtributo(pos);
            } else if (opcion == 2) {
                editarTodos(pos);
            }
        }
        public static void editarUnAtributo(int pos) {
            System.out.println("1. Nombre Cientifico\t2. Nombre Comun\n3. Habitat\t4. Alimentacion" + "\n5. Descripcion de Rasgos\t6. Ubicacion Geografica\n7. Vida\tIngrese la opcion: ");
            int opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Nombre Cientifico: ");
                    Animales.get(pos).setNombreCient(scan.next());
                    break;
                case 2:
                    System.out.print("Nombre Comun: ");
                    Animales.get(pos).setNombrecomun(scan.next());
                    break;
                case 3:
                    System.out.print("Alimentacion: ");
                    Animales.get(pos).setAlimentacion(scan.next());
                    break;
                case 4:
                    System.out.print("Descripcion de Rasgos: ");
                    Animales.get(pos).setDescricionRasgos(scan.next());
                    break;
                case 5:
                    System.out.println("Habitat: ");
                    Animales.get(pos).setHabitat(scan.next());
                    break;
                case 6:
                    System.out.print("Ubicacion Geograficas: ");
                    Animales.get(pos).setGeografica(scan.next());
                    break;
                case 7:
                    System.out.print("Vida: ");
                    Animales.get(pos).setVida(scan.nextInt());
                    break;
            }
        }
        public static void editarTodos(int pos) {
            System.out.println("Nombre Cientifico: ");
            Animales.get(pos).setNombreCient(scan.next());
            System.out.print("Nombre Comun: ");
            Animales.get(pos).setNombrecomun(scan.next());
            System.out.println("Habitat: ");
            Animales.get(pos).setHabitat(scan.next());
            System.out.print("Alimentacion: ");
            Animales.get(pos).setAlimentacion(scan.next());
            System.out.print("Descripcion de Rasgos: ");
            Animales.get(pos).setDescricionRasgos(scan.next());
            System.out.print("Ubicacion Geografica: ");
            Animales.get(pos).setGeografica(scan.next());
            System.out.print("Vida: ");
            Animales.get(pos).setVida(scan.nextInt());
        }

        public static void eliminarAnimales() {
            System.out.print("Posicion del animal a eliminar: ");
            Animales.remove(scan.nextInt());
        }
        public static void Imprimir() {
            System.out.println("1. Imprimir por posición de la lista\n2. Imprimir lista completa\n3. Imprimir por nombre científico");
            if (scan.nextInt() == 1) {
                Lista();
            } else if (scan.nextInt() == 2) {
                Completa();
            } else if (scan.nextInt() == 3);

        }

        public static void Lista() {
            System.out.println("Ingrese la posicion: ");
            Animales.get(scan.nextInt()).toString();
        }

        public static void Completa() {
            for (int i = 0; i < Animales.size(); i++) {
                Animales.get(i).toString();
            }
        }
        public static void Alimenticia(){
            System.out.println("Posicion del Animal el que va a comer: ");
            int posicion=scan.nextInt();
            System.out.println("Posicion del Animal el comido: ");
            int posicionc=scan.nextInt();
            Animales.get(posicion).vida+=Animales.get(posicionc).vida;
            Animales.remove(posicionc);
        }
    }
}


