public class vehiculo {
       protected String matricula;
       protected String marca;
       protected String modelo;

       public vehiculo(String matricula,String marca,String modelo){
           this.marca=marca;
           this.matricula=matricula;
           this.modelo=modelo;

       }




    public String getMatricula() {
           return matricula;
       }

       public String getMarca() {
           return marca;
       }

       public String getModelo() {
           return modelo;
       }
       public String Mostrardato(){
           return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo;


       }
   }


