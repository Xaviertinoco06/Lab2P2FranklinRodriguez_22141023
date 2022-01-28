public class dia3 {

    //up
    public int suma(int n,int sum) {
        if (n >= 1)
            return suma(n - 1,sum + n);
            return sum;

        }
        public static void main(String[] args){
        dia3 t=new dia3();
            System.out.println(t.suma(10,0));
        }
    }







