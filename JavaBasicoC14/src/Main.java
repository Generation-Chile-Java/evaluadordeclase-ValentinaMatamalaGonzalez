import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //Es el punto d entrada al programa, qiere decir que el JVM va a buscar esta class

        public static void main(String[] args) {
            // El punto de entrada del programa
            System.out.println("¡Hola, mundo!");
            System.out.println("¿Cómo te llamas?");
            // Instancia de la clase Scanner
            Scanner sc = new Scanner(System.in);
            // Almacena el input del usuario en una variable
            String nombre = sc.nextLine();
            System.out.println("Tu nombre es: " + nombre);
        }
    }
