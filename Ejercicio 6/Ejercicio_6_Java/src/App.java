import java.util.Arrays;

/*
 * Reto #6
 * INVIRTIENDO CADENAS
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea un programa que invierta el orden de una cadena de texto sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 */

public class App {
    public static void main(String[] args) {
        System.out.println("Hola");
        System.out.println(reverse("Hola mundo"));
        System.out.println(recursiveReverse("Hola mundo", 0, ""));
    }

    private static String reverse(String text) {
        final int textCount = text.length() - 1;
        char[] reversedText = new char[text.length()];
        for (int i = 0; i <= textCount; i++) {
            reversedText[i] = text.charAt(textCount - i);
        }
        return String.valueOf(reversedText);
    }

    // Sin un bucle, mediante una función recursiva
    private static String recursiveReverse(String text, int i, String reversedText) {
        int textCount = text.length() - 1;
        String newReversedText = reversedText;
        newReversedText += String.valueOf(text.charAt(textCount - i));
        if (i < textCount) {
            int newIndex = i + 1;
            newReversedText = recursiveReverse(text, newIndex, newReversedText);
        }
        return newReversedText;
    }
}
