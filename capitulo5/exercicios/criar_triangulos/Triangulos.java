package criar_triangulos;

public class Triangulos {
    
    public static void mostrar() {

        int valor = 10;


        for (int i = 0; i < valor; i++) {
            
            System.out.println(montar(i));
        }

        System.out.println();
        

        for (int i = 0; i < valor; i++) {
            
            System.out.println(montar(valor - i));
        }

        System.out.println();

        for (int i = 0; i < valor; i++) {
            
            System.out.println(" ".repeat(valor - i) + montar(i));
        }

            System.out.println();
       


        for (int i = 0; i < valor; i++) {
            
            System.out.println(" ".repeat(i) + montar( valor - i));
        }

        System.out.println();


    }


    private static String montar(int valor){


        String a = "";
        
        for (int i = 0; i < valor; i++) {
            
            a += "*";
        }

        return a;
    }


    public static void main(String[] args) {
        
        Triangulos.mostrar();
    }
}
