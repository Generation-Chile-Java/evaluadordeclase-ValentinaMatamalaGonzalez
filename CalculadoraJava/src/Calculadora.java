
    import java.util.Scanner;

    public class Calculadora {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Solicitar al usuario que ingrese los dos operandos
            System.out.print("Ingresa el primer número: ");
            int operador1 = scanner.nextInt();
            System.out.print("Ingresa el segundo número: ");
            int operador2 = scanner.nextInt();

            // Operadores aritméticos
            int suma = operador1 + operador2;
            int resta = operador1 - operador2;
            int multiplicacion = operador1 * operador2;
            int division = operador1 / operador2;  // Asegúrate de que operando2 no sea cero
            int modulo = operador1 % operador2;

            System.out.println("Resultados de operaciones aritméticas:");
            System.out.println("Suma: " + suma);
            System.out.println("Resta: " + resta);
            System.out.println("Multiplicación: " + multiplicacion);
            System.out.println("División: " + division);
            System.out.println("Módulo (resto de la división): " + modulo);

            // Operadores relacionales
            System.out.println("\nComparaciones usando operadores relacionales:");
            System.out.println("¿Operando1 es igual a Operando2? " + (operador1 == operador2));
            System.out.println("¿Operando1 no es igual a Operando2? " + (operador1 != operador2));
            System.out.println("¿Operando1 es mayor que Operando2? " + (operador1 > operador2));
            System.out.println("¿Operando1 es menor que Operando2? " + (operador1 < operador2));
            System.out.println("¿Operando1 es mayor o igual a Operando2? " + (operador1 >= operador2));
            System.out.println("¿Operando1 es menor o igual a Operando2? " + (operador1 <= operador2));

            // Operadores de asignación
            int resultado = operador1;  // Asignación básica
            resultado += operador1;  // Suma y asigna
            System.out.println("\nResultado después de 'resultado += operando2': " + resultado);

            // Operadores de incremento y decremento
            resultado++;  // Incrementa en 1
            System.out.println("Resultado después de 'resultado++': " + resultado);
            resultado--;  // Decrementa en 1
            System.out.println("Resultado después de 'resultado--': " + resultado);

            // Operadores lógicos
            boolean condicion1 = (operador1 > operador2);
            boolean condicion2 = (operador1 > 0);

            System.out.println("\nUso de operadores lógicos:");
            System.out.println("¿Condicion1 y Condicion2 son ambas verdaderas? " + (condicion1 && condicion2));
            System.out.println("¿Al menos una de las condiciones es verdadera? " + (condicion1 || condicion2));
            System.out.println("¿Condicion1 no es verdadera? " + (!condicion1));

            scanner.close();
        }
}
