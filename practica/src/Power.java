import java.lang.Math;
import java.util.Scanner;


public class Power {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);

        int number ;
        int power ;
        System.out.println("ingrese number");
        number = in.nextInt();
        System.out.println("ingrese power");
        power = in.nextInt();

        double result = CalculatePower(number,power);
        System.out.println(number+"^"+power+"="+result);
    }
    static double CalculatePower (int num, int pow){
        return Math.pow(num,pow);
    }
}