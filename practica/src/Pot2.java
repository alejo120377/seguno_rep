
import java.util.Scanner;


public class Pot2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num;
        float pot;
        float r=1;
        System.out.println("ingrese num");

        num = sc.nextFloat();

        System.out.println("ingrese pot");

        pot = sc.nextFloat();


        for (int a=0; a < pot;a++){
            r = r * num;
           a = a++;
           }
        System.out.println("resultado"+r);


    }

}