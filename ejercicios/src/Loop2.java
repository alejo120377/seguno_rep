import java.util.Scanner;
public class Loop2 {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        float contador = 0;
        float edades = 0;
        int edad;
        //int seguir = 0;
        float prome = 0;
        while (true){

            System.out.println("ingrese la edad");
            edad = in.nextInt();
            if (edad > 1 && edad < 115) {
                contador = contador + 1;
                edades = edades + edad;

                // System.out.println("desea Continua? Si =0 , No=1 ");
                //  seguir = in.nextInt();
                prome = edades / contador;

            } else {
                break;
            }


        }
        System.out.println("la cantidadde de edades" + contador);
        System.out.println("sumatoria de edades" + edades);
        System.out.println("promedio" + prome);


    }

}
