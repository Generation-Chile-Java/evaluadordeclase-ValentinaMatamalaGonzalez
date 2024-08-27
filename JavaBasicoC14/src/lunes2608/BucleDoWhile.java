package lunes2608;

import java.util.Scanner;

public class BucleDoWhile  {
    //
    Scanner miScanner = new Scanner(System.in);
    Integer opcion = 0;

    do {
        System.out.println("Ingresa una opcion");
        opcion = miScanner.nextInt();
        System.out.println("0 -Salir \n 1 -Suma \n - Restar \n - Multiplicar \n 4 - Dividir" );
        opcion = miScanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Saliste de la calculadora");
                break;
                case 2:
                    System.out.println("Suma de la calculadora");
                    break;
                    case 3:
                        System.out.println("Resta de la calculadora");
                        break;
                        case 4:
                            System.out.println("Multiplicar la calculadora");
                            break;
                            default:
                                System.out.println("Opcion no valida");
        }
    } while (opcion <0 || opcion >4);
}
