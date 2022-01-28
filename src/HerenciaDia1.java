public class HerenciaDia1 {
/*
Herencia
Permite reutiliar una clase,creando una nuevo que extiende o expecializa la funcionabilidad de una clase existente.

2.al momento de la herencia,la clase hija o subclase herada todos los:
-atributos
-funciones
(siempre y cuando no sean privadas)

Ejemplo:

Clase b extneder clase a
(Clase a le da a la b sin necesidad de instanciar)

3.En java la herencia es simple, es decir que solamente se puede heredar de un padre.
4.Aunque hay que hacer enfasis que en java las

-Formato
-Para crear una clase hija
Public class ClaseHija extends ClasePadre{
(Tiene que existir y no ser final)

 */
    public class Padre{
         String Nombre;
         int edad;
         String Trabajo;
         int numerodetelefono;

        public Padre(){
            Nombre= "Franklin";
            edad = 17;
            Trabajo="Diseño";
            numerodetelefono=9604653;
        }
        public static class hija extends Padre{
            hija() {
                Nombre = "Katherine";
                edad = 2;
                Trabajo = "estudiar";
                numerodetelefono = 8888888;
            }
            }
            public class Usarmain{
                public static void main(String[] args) {
                    Padre cp=new hija();
                    hija id=(hija)cp;







                }






        }






    }

/*
Objetivo-Clase
Con esta clase usted debera:
Entender el concepto de polimorfismo de la jerarquia de la herencia.
-Aprender a redefinir funciones que una clase hija a herederdo.
-Comprender los escenarios adecuados que tienen que ocurrir para el polimorfismo sea optimo dentro de la programacion.
-convertir objetivos utilizado el metodo downcasting.

Jerarquia de la herencia
-Importante
un objeto de la hija es tipo de la hija y es de tipo de todos sus ancestros.
1.Un objeto coche es de tipo Coche,vehiculo y object.
-Lo podemos comprobar con las intruciiones  INTANCEOF
if(obj intanceof Padre)


UpCasting
Declarar un objeto de la clase padre pero instanciarlo con el constructor de una clase hija.
padre id=new hija();
((hija)cp) version resumida.

Estandar
hija id=(hija)idCp;
Directa
((hija)idCp).
 */
}


