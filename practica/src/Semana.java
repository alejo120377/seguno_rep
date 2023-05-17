import java.util.Scanner;

public class Semana {
    public static void main(String[] args) {

        int numero;
        Scanner in=new Scanner(System.in);

        System.out.println("INGRESE NUM");
        numero=in.nextInt();
        switch (numero) {
            case 1: System.out.println("dia lunes");
                break;


            case 2:  System.out.println("dia martes");
                break;


            case 3: System.out.println("dia miercoles");
                break;

            case 4: System.out.println("dia jueves");
                break;


            case 5: System.out.println("dia viernes");
                break;

            case 6:  System.out.println("dia sabado");
                break;

            case 7:   System.out.println("dia domingo");
                break;

            default:System.out.println("no es un dia de la semana");


        }


    }

}