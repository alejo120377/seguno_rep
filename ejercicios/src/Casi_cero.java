import java.util.Scanner;
public class Casi_cero {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
       while(true){

   int a=0;
    a=a++;

    System.out.println("INGRESE NUM");
    float num = in.nextFloat();

    if (num > 0 && num < 1 || num > -1 && num <0){
        System.out.println("  es casi cero");

         } else {
        System.out.println(" no es casi cero");
       }


      }


    }
}

