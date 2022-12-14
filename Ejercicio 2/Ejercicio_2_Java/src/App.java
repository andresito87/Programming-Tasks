/*
 * Reto #2
 * LA SUCESIÓN DE FIBONACCI
 * Dificultad: DIFÍCIL
 *
 * Enunciado: Escribe un programa que imprima los 50 primeros números de la sucesión de Fibonacci empezando en 0.
 * La serie Fibonacci se compone por una sucesión de números en la que el siguiente siempre es la suma de los dos anteriores.
 * 0, 1, 1, 2, 3, 5, 8, 13...
 */

public class App {
    public static void main(String[] args) {

        long n0 = 0;
        long n1 = 1;
        int[] numbers;
        numbers = new int[50];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(n0);
            Long fib = n0 + n1;
            n0 = n1;
            n1 = fib;
        }
    }
}
