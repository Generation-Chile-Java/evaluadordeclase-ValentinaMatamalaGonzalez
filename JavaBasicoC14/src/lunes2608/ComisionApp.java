import java.util.Scanner;

public class ComisionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Crear un objeto Scanner para leer la entrada del usuario

        System.out.print("Ingrese el total de ventas: ");
        double ventas = scanner.nextDouble();  // Leer las ventas ingresadas por el usuario

        if (ventas < 0) {
            System.out.println("Entrada inválida. Las ventas no pueden ser negativas.");  // Validación de entrada negativa
        } else {
            double comision = 0.0;

            // Calcular la comisión basada en las ventas
            if (ventas > 100000) {
                comision = ventas * 0.30;  // 30% de comisión
            } else if (ventas >= 50001 && ventas <= 90999) {
                comision = ventas * 0.20;  // 20% de comisión
            } else if (ventas >= 10001 && ventas <= 40999) {
                comision = ventas * 0.10;  // 10% de comisión
            } else {
                System.out.println("No aplica comisión para ventas inferiores a $10,000.");  // No hay comisión
                System.out.println("Ventas ingresadas: $" + ventas);
                return;  // Salir del programa porque no hay comisión
            }

            // Imprimir el resultado de la comisión calculada
            System.out.println("Ventas ingresadas: $" + ventas);
            System.out.println("La comisión calculada es: $" + comision);
        }

        scanner.close();  // Cerrar el objeto Scanner
    }
}