import java.util.Scanner;
public class Tabla {
    public static void main(String []arg) {

        Scanner in = new Scanner(System.in);
        int a = 0;
        int c;
        int f;
        int b = 0;
        while (b == 0) {
        System.out.println(" ingrese c");
        c = in.nextInt();

            for (int contador = 1; contador < 11; contador++) {
                f = contador * c;
                a = a+1;
                System.out.println("resultado es:" + f);

            }
            System.out.println("ingrese 0 si quiere seguir ");
            b = in.nextInt();
        }


    }
}
