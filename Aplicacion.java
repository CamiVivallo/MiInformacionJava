import clases.Algoritmos;

public class Aplicacion {
    public static void main(String[] args) {

        // pruebo el método esPar con un número par y uno impar
        System.out.println("Probando método esPar:");
        System.out.println("10 es par: " + Algoritmos.esPar(10));
        System.out.println("7 es par: " + Algoritmos.esPar(7));

        // salto de línea para separar los resultados
        System.out.println();

        // pruebo el método esPrimo con distintos casos
        System.out.println("Probando método esPrimo:");
        System.out.println("7 es primo: " + Algoritmos.esPrimo(7));
        System.out.println("10 es primo: " + Algoritmos.esPrimo(10));
        System.out.println("1 es primo: " + Algoritmos.esPrimo(1));

        // salto de línea para separar los resultados
        System.out.println();

        // pruebo el método que invierte textos
        System.out.println("Probando método stringEnReversa:");
        System.out.println("Java al revés: " + Algoritmos.stringEnReversa("Java"));
        System.out.println("Camila al revés: " + Algoritmos.stringEnReversa("Camila"));

        // salto de línea para separar los resultados
        System.out.println();

        // pruebo el método esPalindromo con textos que sí y no son palíndromos
        System.out.println("Probando método esPalindromo:");
        System.out.println("reconocer es palíndromo: " + Algoritmos.esPalindromo("reconocer"));
        System.out.println("Java es palíndromo: " + Algoritmos.esPalindromo("Java"));
        System.out.println("Anita lava la tina es palíndromo: " + Algoritmos.esPalindromo("Anita lava la tina"));

        // salto de línea para separar los resultados
        System.out.println();

        // pruebo la secuencia FizzBuzz hasta el número 15
        System.out.println("Probando método secuenciaFizzBuzz:");
        Algoritmos.secuenciaFizzBuzz(15);
    }
}