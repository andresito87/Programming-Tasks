/*
 * Reto #1
 * ¿ES UN ANAGRAMA?
 * Fecha publicación enunciado: 03/01/22
 * Fecha publicación resolución: 10/01/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
 * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
 * NO hace falta comprobar que ambas palabras existan.
 * Dos palabras exactamente iguales no son anagrama.
*/

import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        String word1 = "bad credit";
        String word2 = "debit card";

        if (isAnAnagram(word1, word2)) {
            System.out.println(word1 + " and " + word2 + " are anagrams");
        } else {
            System.out.println(word1 + " and " + word2 + " aren't anagrams");
        }
    }

    static Boolean isAnAnagram(String word1, String word2) {

        if (word1.length() != word2.length() || word1 == word2)
            return false;
        String word1String = word1.toLowerCase();
        char[] word1Sorted = word1String.toCharArray();
        Arrays.sort(word1Sorted);
        String word1SortedString = Arrays.toString(word1Sorted);

        String word2String = word2.toLowerCase();
        char[] word2Sorted = word2String.toCharArray();
        Arrays.sort(word2Sorted);
        String word2SortedString = Arrays.toString(word1Sorted);

        if (word1SortedString.equals(word2SortedString)) {
            return true;
        } else {
            return false;
        }
    }
}
