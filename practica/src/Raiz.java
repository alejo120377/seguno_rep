import java.util.Locale;
import java.util.Scanner;
public class Raiz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        double a, b, c;
        double x1, x2, d;
        System.out.print("ingrese primer coef(a)");
        a = sc.nextDouble();
        System.out.print("ingrese primer coef(b)");
        b = sc.nextDouble();
        System.out.print("ingrese primer coef(c)");
        c = sc.nextDouble();
        d = (b * b - (4 * a * c));
        if (d < 0) {
            System.out.println("no existen soluciones reales");
             } else {
            if (a == 0) {
                System.out.println("no es una ecuacion de 2 grado");
               } else {
                x1 = (-b + Math.sqrt(d)) / (2 * a);
                x2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println("Solucion 1;" + x1);
                System.out.println("Solucion 2;" + x2);
            }
        }
    }
}








