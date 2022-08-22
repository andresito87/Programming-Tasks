
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
    public static void main(String[] args) {

        area(Triangle(10.0, 5.0));
        area(Rectangle(5.0, 7.0));
        area(Square(4.0));
    }

    public interface Polygon {

        public double area();

        public void printArea();
    }

    class Triangle implements Polygon {

        public double area(double base, double height) {
            return (base * height) / 2;
        }

        public void printArea() {
            System.out.println("El área del triángulo es ${area()}");

        }

        @Override
        public double area() {
            // TODO Auto-generated method stub
            return 0;
        }
    }

    class Rectangle implements Polygon {

        public double area(double lenght, double width) {
            return lenght * width;
        }

        public void printArea() {
            System.out.println("El área del rectangulo es ${area()}");

        }

        @Override
        public double area() {
            // TODO Auto-generated method stub
            return 0;
        }
    }

    public double area(Polygon polygon) {
        polygon.printArea();
        return polygon.area();
    }
}
