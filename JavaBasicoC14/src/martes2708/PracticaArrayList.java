package martes2708;

import java.util.ArrayList;
import java.util.List;

public class PracticaArrayList {
    //los array list son un arrelgo dinamico, tienen metodos para agregar y eliminar elementos y no tienen una longitud fija

    public static void main(String[] args) {
        //la sintaxis para crear un ArrayList es la siguiente:
        //Interfaz "List" + <tipoDeDato> + nombreVariable = Inicializacion como nueva instancia vacia de la clase ArrayliST
        List<Integer> numeros = new ArrayList<Integer>();

        // Agregar elementos al ArrayList
        numeros.add(5);
        numeros.add(10);
        numeros.add(15);

        // Imprimir el ArrayList
        System.out.println("ArrayList de números: " + numeros);

        // Acceder a un elemento por índice
        int primerNumero = numeros.get(0);
        System.out.println("Primer número: " + primerNumero);

        // Modificar un elemento
        numeros.set(1, 20);
        System.out.println("ArrayList después de la modificación: " + numeros);

        // Verificar si un elemento está presente
        boolean contiene15 = numeros.contains(15);
        System.out.println("¿Contiene 15? " + contiene15);

        // Eliminar un elemento por valor
        numeros.remove(Integer.valueOf(10));
        System.out.println("ArrayList después de eliminar 10: " + numeros);

        // Tamaño del ArrayList
        int tamanoArrayList = numeros.size();
        System.out.println("Tamaño del ArrayList: " + tamanoArrayList);

    }
}
