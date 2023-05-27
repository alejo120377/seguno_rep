import java.util.Scanner;
public class Fctorial{
    public static void main(String[]args){

        Scanner in = new Scanner( System.in);
        int c;
int f=1;
        System.out.println(" ingrese c");
        c = in.nextInt();
        while(c != 0) {
            for (int contador = 1; contador <= c; contador++) {
                            f = contador * f;

               // System.out.println("el contador vale:" +contador);
                System.out.println("el contador vale:" +f);
               // f = contador * a;
            }
                c=0;
        }
    }
}
