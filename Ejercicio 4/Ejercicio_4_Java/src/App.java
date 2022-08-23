
/*
 * Reto #4
 * ÁREA DE UN POLÍGONO
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea UNA ÚNICA FUNCIÓN (importante que sólo sea una) que sea capaz de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */

public class App {
    final static int TRIANGULO = 0;
    final static int CUADRADO = 1;
    final static int RECTANGULO = 2;

    public static void main(String[] args) {
        System.out.println(area(TRIANGULO, 5, 3));
        System.out.println(area(CUADRADO, 4, 0));
        System.out.println(area(RECTANGULO, 4, 2));
    }

    public static double area(int polygon, double base, double height) {
        switch (polygon) {
            case TRIANGULO:
                return base * height / 2;

            case CUADRADO:
                return base * base;

            case RECTANGULO:
                return base * height;

            default:
                return 0;
        }
    }
}
