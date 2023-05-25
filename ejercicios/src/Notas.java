import java.util.Scanner;
public class Notas{

    public static void main(String [] args) {
        Scanner in = new Scanner( System.in);
        float nota;
        System.out.println(" ingrese nota");
        nota = in.nextFloat();

        if(nota>0 && nota<3){
            System.out.println("aplazado");
        } else if(nota>4 && nota<6){
            System.out.println("desaprobado");
        } else if(nota>7 && nota<10){
            System.out.println("aprobado");
        }  else {
            System.out.println("error:nota no validad");
        }


    }

}
         