import java.util.Scanner;
public class Contador{
    public static void main(String [] args){

        Scanner in = new Scanner( System.in);

        int c;

        System.out.println(" ingrese c");
        c = in.nextInt();
        while(c != 0) {
            for (int contador = 1; contador <= c; contador++) {
                
                System.out.println("el contador vale:" + contador);

            }
              c=0;
        }
    }
}
