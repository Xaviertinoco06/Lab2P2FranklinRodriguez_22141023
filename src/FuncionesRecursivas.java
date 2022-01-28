public class FuncionesRecursivas {
    public static void print(int numero){
        if(numero>1)
            print(numero-1);
        System.out.println(numero);
    }
    public static void printMismo(int numero,int repetir){
        if(repetir>0)
            System.out.println(numero);
        printMismo(numero,repetir-1);

    }



public static int sumeaUp(int numero) {
    if (numero >= 1)
        return sumeaUp(numero - 1) + numero;//Valor en colado
    return 0;


}
//La funcion se llama polimorfismo ya que utilizamos la misma id
public static int sumaDown(int numero) {
    return sumaDown(numero,0);
}
private  static int sumaDown(int numero,int suma){
    if (numero>=1)
        return sumaDown(numero-1,suma+numero);
    return suma;


}
public static int potUp(int base,int exponente) {
    //la base es el exponente porque se va estar cambiando de valor
    if (exponente > 0)
        return potUp(base, exponente - 1)*base;
    //returna 1 porque estamos multiplicando
    return 1;

}
//se llama solo lo que quieres utilizar
public static int potDown(int base, int exponente) {
    return potDown(base,exponente,1);

}

private  static int potDown(int base,int exponente,int resultado) {
    if(exponente<0)
        return potDown(base,exponente-1,resultado*base);
    return resultado;
}
public static boolean Palindromo(String palabra) {
        return Palindromo(palabra,0,palabra.length()-1);

}

private  static boolean Palindromo(String palabra,int inicio,int fin) {
    if (inicio<fin){
        if (palabra.charAt(inicio)== palabra.charAt(fin))
            return Palindromo(palabra,inicio+1,fin-1);
        return false;


    }
    return true;


    }

    public static boolean fila_asteriscos(int filas ) {
        if (filas == 0)
            return false;
        else
            return true;
    }

    public  static int fibonacci(int numero ) {
        if (numero == 0 || numero == 1)
            return numero;
        else
            return fibonacci(numero- 1) + fibonacci(numero- 2);
    }
    public static void torre(int i, int j) {
        if(i>0)
        {
            System.out.print("*");
            torre(--i,j);
        }else {
            if(j>0) {
                i=j;
                System.out.println("");
                torre(i,--j);
            }
        }
    }








}











