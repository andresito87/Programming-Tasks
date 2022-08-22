/*
 * Reto #3
 * ¿ES UN NÚMERO PRIMO?
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */

public class App {
    public static void main(String[] args) {
        int myArray[] = new int[101];
        for (int i = 1; i < myArray.length; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static Boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
