import java.util.Scanner;

public class printfuncionesrecursivas {
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        int opcion=0;
        while(opcion!=7) {
            System.out.print("""
                   Menu
                   1.imprimir
                   2.PrintMismo
                   3.Suma Up
                   4.Suma down
                   5.potUp
                   6.putDown
                   7.Palindroma
                   8.Function Fibonacci
                   9.Piramide
                   Ingresa el numero: """);
            opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    FuncionesRecursivas.print(25);
                    break;
                case 2:
                    FuncionesRecursivas.printMismo(5,7);
                    break;
                case 3:
                    FuncionesRecursivas.sumeaUp(8);
                    break;
                case 4:
                    FuncionesRecursivas.sumaDown(1);
                    break;
                case 5:
                    FuncionesRecursivas.potUp(8,4);
                    break;
                case 6:
                    FuncionesRecursivas.potDown(2,7);
                    break;
                case 7:
                    FuncionesRecursivas.Palindromo("Monserrat");
                case 8:
                    System.out.println("\nFibonacci");
                    System.out.println("Ingrese la cantidad");
                    int limite = leer.nextInt();
                    for (int i = 0; i < limite; i++) {
                        System.out.println(FuncionesRecursivas.fibonacci(i) + ",");
                    }
                    FuncionesRecursivas.fibonacci(1);
                    break;
                case 9:
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Ingrese la cantidad de las filas");
                    int i=scanner.nextInt();

                    int j=i;
                    FuncionesRecursivas.torre(i,j);

                    break;
                default:
                    System.err.println("Opcion no valida");

            }
        }
    }
}


