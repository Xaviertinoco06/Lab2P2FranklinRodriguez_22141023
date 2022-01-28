public class vehiculoturismo extends vehiculo {
    private int nPuertas;

    public vehiculoturismo(int nPuertas,String matricula,String marca,String modelo){
        super(matricula,marca,modelo);
        this.nPuertas=nPuertas;
    }
    public int getnPuertas(){
        return nPuertas;

    }
    public String Mostrardato(){
        return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo+"\nNumero de Puertas:"+nPuertas;
    }
}

