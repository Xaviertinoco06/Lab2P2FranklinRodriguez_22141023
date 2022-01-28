public class Vehiculodeportivo extends vehiculo{
    private int cilindrada;
    public Vehiculodeportivo(int cilindrada,String matricula,String marca, String modelo){
        super(matricula,marca,modelo);
        this.cilindrada=cilindrada;

    }

    public int getCilindrada() {
        return cilindrada;
    }
    public String Mostrardato() {
        return "Matricula: " + matricula + "\nMarca: " + marca + "\nModelo:" + modelo + "\nCilindrada: " +cilindrada;
    }

}
