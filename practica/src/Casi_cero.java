import java.util.Scanner;
public class Casi_cero {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.println("INGRESE NUM");
        float num = in.nextFloat();

        if ( num >-1 && num < 0 && num >0 && num <1){
            System.out.println("es casi cero");

        }else {
            System.out.println(" no es casi cero");
        }





    }
}

