import java.util.Scanner;

public class Mes {
 public static void main(String [] args){

    int numero;
    Scanner in=new Scanner(System.in);

    System.out.println("INGRESE NUM");
    numero=in.nextInt();
    switch (numero) {
        case 1: System.out.println("mes de enero");
            break;


        case 2:  System.out.println("mes de febrero");
            break;


        case 3: System.out.println("mes de marzo");
            break;

        case 4: System.out.println("mes de abril");
            break;


        case 5: System.out.println("mes de mayo");
            break;

        case 6:  System.out.println("mes de junio");
            break;

        case 7:   System.out.println("mes de julio");
            break;
        case 8:   System.out.println("mes de agosto");
            break;
        case 9:   System.out.println("mes de septiembre");
            break;
        case 10:   System.out.println("mes de octubre ");
            break;

        case 11:   System.out.println("mes de noviembre");
            break;
        case 12:   System.out.println("mes de diciembre");
            break;

        default:System.out.println("no es un dia de la semana");


      }


    }

}
