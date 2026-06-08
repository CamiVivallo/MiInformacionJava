package clases;

public class Algoritmos {

    // revisa si el número recibido es par
    public static boolean esPar(int numero) {

        // si el resto de dividir por 2 es 0, significa que es par
        return numero % 2 == 0;
    }

    // revisa si el número recibido es primo
    public static boolean esPrimo(int numero) {

        // los números menores o iguales a 1 no son primos
        if (numero <= 1) {
            return false;
        }

        // reviso si el número se puede dividir exacto por otro número
        for (int i = 2; i < numero; i++) {

            // si el resto es 0, entonces tiene otro divisor y no es primo
            if (numero % i == 0) {
                return false;
            }
        }

        // si no encontró divisores, entonces sí es primo
        return true;
    }

    // devuelve el texto recibido escrito al revés
    public static String stringEnReversa(String texto) {

        // acá voy guardando el texto invertido
        String textoReversa = "";

        // parto desde el último carácter y avanzo hacia el primero
        for (int i = texto.length() - 1; i >= 0; i--) {

            // agrego cada carácter al nuevo texto
            textoReversa += texto.charAt(i);
        }

        // devuelvo el texto ya invertido
        return textoReversa;
    }

    // revisa si el texto recibido es un palíndromo
    public static boolean esPalindromo(String texto) {

        // paso el texto a minúsculas y le quito los espacios
        String textoLimpio = texto.toLowerCase().replace(" ", "");

        // uso el método anterior para invertir el texto limpio
        String textoReversa = stringEnReversa(textoLimpio);

        // comparo el texto original limpio con el texto invertido
        return textoLimpio.equals(textoReversa);
    }

    // imprime la secuencia FizzBuzz hasta el número recibido
    public static void secuenciaFizzBuzz(int numero) {

        // recorro desde el 1 hasta el número indicado
        for (int i = 1; i <= numero; i++) {

            // primero reviso si es divisible por 3 y por 5 al mismo tiempo
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz ");
            }

            // si solo es divisible por 3, imprime Fizz
            else if (i % 3 == 0) {
                System.out.print("Fizz ");
            }

            // si solo es divisible por 5, imprime Buzz
            else if (i % 5 == 0) {
                System.out.print("Buzz ");
            }

            // si no cumple ninguna condición, imprime el número normal
            else {
                System.out.print(i + " ");
            }
        }

        // salto de línea final para que la terminal quede más ordenada
        System.out.println();
    }
}