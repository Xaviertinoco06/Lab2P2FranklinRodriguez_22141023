public class VehiculoFurgoineta extends vehiculo {
    private int carga;


    public VehiculoFurgoineta(int carga, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.carga = carga;


    }

    public int getCarga() {
        return carga;
    }

    public String Mostrardato() {
        return "Matricula: " + matricula + "\nMarca: " + marca + "\nModelo:" + modelo + "\nCarga: " + carga;
    }
}
