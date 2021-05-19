package practica_entorno;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Programa que almacena 10 números por teclado sin decimales 
 * para después devolverlos en orden ascendente. También, se 
 * deben obtener los números pares que son divisibles por 2 y
 * los impares y mostrarlos en orden descendente.
 * Versión 1.0
 * @author Euris Alc.
 */
public class Practica_Entorno {

    /**
     * Primer método: Controla los valores intrucidos por teclado 
     * por medio de un bucle do-while y las posibles excepciones 
     * en el bloque try-catch.
     * @param array Array para acceder a los elementos.
     */
    // Declaración de variables.
    int[] numeros = new int[10];
    boolean repetir = false;
    Scanner teclado_int = new Scanner(System.in);

    public void IngresarNumero() {
        do {
            /**
             * Control de excepciones: Si el número es entero o no,
             * lee los valores por teclado y los guarda en el array.
             */
            try {
                System.out.println("------------------------------");
                System.out.println("Introduzca 10 números enteros.");
                System.out.println("------------------------------");
                // Recorre los elemtos introducidos por medio del bucle for.
                for (int i = 0; i < numeros.length; ++i) {
                    System.out.printf("Valor: ", i + 1);
                    numeros[i] = teclado_int.nextInt();
                    repetir = false;
                }
                // Controla si se introduce un número con decimales.
            } catch (InputMismatchException ex) {
                teclado_int.nextLine();
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println("Debe introducir solo números enteros.");
                System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
                repetir = true;
            }
        } while (repetir);
    }
    /**
     * Segundo método: Devolverá los números intrucidos
     * en orden asendente.
     */
    public void OrdenarNumeros() {
        Arrays.sort(numeros);
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Orden ascendente de los números introducidos: "
                + Arrays.toString(numeros));
        System.out.println("-----------------------------------------------------------------------------");
    }
     /**
     * Tercer método: Divide los valores del array en 2,
     * clasifica los que son parese e impares y los ordena
     * en orden descendente.
     */
    public void Division(){      
        Arrays.sort(numeros);
        System.out.println("------------------------------------------------------");
        System.out.println("Obtener los números PAR e IMPAR en orden descendente");
        System.out.println("------------------------------------------------------");
        
        for (int i = numeros.length - 1; i > -1; i--){
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i] + ":" + " es PAR y divisible por 2");
            } else {
                System.out.println(numeros[i] + ":" + " es IMPAR");
            }
        } 
    }
    // Mostrar resultado
    public static void main(String[] args) {
        Practica_Entorno rest = new Practica_Entorno();
        rest.IngresarNumero();
        rest.OrdenarNumeros();
        rest.Division();
    }
}



