import java.util.Scanner;
public class Cantcifras {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);

        System.out.println("INGRESE NUM");
        num = in.nextInt();

        if (num < 0 || num > 99999) {
            System.out.println("no esta dentro del rango");
        } else {
            if (num > 0 && num < 10) {
                System.out.println("el numero tiene una cifra");
            }
            if (num > 10 && num < 100) {
                System.out.println("el numero tiene dos cifra");
            } else if (num > 100 && num < 1000) {
                System.out.println("el numero tiene tres cifra");
            } else if (num > 1000 && num < 10000) {
                System.out.println("el numero tiene cuatro cifra");
            } else if (num < 100000) {
                System.out.println("el numero tiene cinco cifra");

            }
        }
    }
}
    