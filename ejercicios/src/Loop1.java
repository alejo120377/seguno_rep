import java.util.Scanner;
//nota todas las variables dentro del while ecepto la q esclaviza el while//

public class Loop1 {


    public static void main(String[] args) {

        //  float c=0;
        Scanner sc = new Scanner(System.in);
        // int i = 0;
        float num;
        float pot;
        float r=1;
        float coc;



        while(true){



            System.out.println("ingrese num");
            num= sc.nextFloat();
            if(num==0){
                break;
            }

            coc=num%2;
            if(coc==0){

                System.out.println("es par :") ;


            } else {

                System.out.println("es impar :");

            }

            System.out.println("ingrese pot");
            pot = sc.nextFloat();

            for (int a = 0; a < pot; a++) {

                r = r * num;



            }
            System.out.println("su potencia es:" + r);

            // System.out.println("continuar teclee 0 /n salir teclee 1");
            // c= sc.nextFloat();

            r=1;

        }






        System.out.println("fin");
    }





}







