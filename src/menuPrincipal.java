import Conicas1.*;

import java.util.Scanner;

public class menuPrincipal {
    public static void main(String[] args) {
        int op;
        Scanner sc = new Scanner(System.in);

        Circunferencia figura1 = new Circunferencia(2,3,6,4,14,7);
        ELIPSEE figura2 = new ELIPSEE(12,5,9,6,4,2);
        Hiperbole figura3 = new Hiperbole(9,1,6,7,5,6,2);
        Parabola figura4 = new Parabola(4,9,5,2);


        do {
            System.out.println("\n\t\t *** MENU PRINCIPAL ***\n");
            System.out.println("1. Circunferencia");
            System.out.println("2. Elipse");
            System.out.println("3. Hiperbole");
            System.out.println("4. Parabola");
            System.out.println("0. SALIR");
            System.out.print("Opcion: ");
            op = sc.nextInt();

            switch (op){
                case 1:{
                    System.out.println("\n\t\t CIRCUNFERENCIA\n");
                    System.out.println("Datos registrados: ");
                    figura1.imprimir();
                    break;
                }
                case 2:{
                    System.out.println("\n\t\t ELIPSE\n");
                    System.out.println("Area: " + figura2.area(12,7));
                    break;
                }
                case 3:{
                    System.out.println("\n\t\t HIPERBOLE\n");
                    System.out.println("Vertices: ");
                    figura3.hallar_vertices();
                    break;
                }
                case 4:{
                    System.out.println("\n\t\t PARABOLA\n");
                    System.out.println("Eje horizontal: " + figura4.calculo_eje_horizontal());
                    break;
                }
                case 0:{
                    System.out.println("\n\t\t  *** GRACIAS POR USAR ***");
                    break;
                }
                default:{
                    System.out.println("\n\t\t OPCION INCORRECTA!\n");
                }
            }
        }while(op != 0);
    }
}
