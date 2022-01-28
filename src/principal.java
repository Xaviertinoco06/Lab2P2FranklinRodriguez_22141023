public class principal {
    public static void main(String[] args) {
        vehiculo misVehiculos[]=new vehiculo[4];

        misVehiculos[0]=new vehiculo("gh67","ferrari","A87");
        misVehiculos[1]=new vehiculoturismo(4,"78hj","Audi","984");
        misVehiculos[2]=new Vehiculodeportivo(500,"84588","TEsla","k48");
        misVehiculos[3]=new VehiculoFurgoineta(80,"3456","HYUNDAI","TUCSON");

        for(vehiculo vehiculos:misVehiculos){
            System.out.println(vehiculos.Mostrardato());
            System.out.println();
        }

    }

}
