// no calcula fracciones para tomar la letra como opcion del case se tuvo q crear un srtr

   import java.util.Scanner;

// no calcula fracciones para tomar la letra como opcion del case se tuvo q crear un srtring y dos scanner.


        public class Unidades {
            public static void main (String [] args) {
                Scanner in = new Scanner(System.in);
                Scanner sc = new Scanner(System.in);
                double resu ;

                float num;


                System.out.println("ingrese num ");
                num = in.nextFloat();
                System.out.println("A que unidad lo convertimos:");
                System.out.println("dame letra \n \t a - mm: \n\t b- pulg: \n\t ");
                String s = sc.nextLine();
                String details = " ";
                char x = s.charAt(0);


                switch (x) {
                    case 'a':
                        resu = num * 25.4;
                        System.out.println("el resultado es:" + resu);
                        break;
                    case 'b':
                        pulg:
                        resu = num / 25.4;
                        System.out.println("el resultado es:" + resu);
                        break;


                    default:
                        System.out.println("error en la opcion");
                }


            }
        }




