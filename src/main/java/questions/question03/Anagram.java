package questions.question03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.Scanner;

public class Anagram {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        /*
         * string = Palavra digitada pelo usuário
         * stringSize = Quantidade de caracteres da string
         * subStrings = Lista com todas as possibilidades de substrings da string em questão
         * */
        String string = sc.next();
        int stringSize = string.length();
        List<Integer> subStrings = new ArrayList<>();

        /*
         * total = Total de anagramas pares formadas a partir das substrings da string
         * */
        int total = 0;

        /*
         * Duas substrings são anagramas correspondentes entre si quando
         * a soma do hashcode de cada caractere das substrings são iguais
         * */
        for (int i = 0; i < stringSize; i++) {
            for (int ii = i + 1; ii <= stringSize; ii++) {
                int hashCodeSum = getHashCodeSum(string.substring(i, ii));
                boolean isEvenAnagram = subStrings.contains(hashCodeSum);
                if (isEvenAnagram) total++;
                else subStrings.add(hashCodeSum);
            }
        }

        System.out.println(total);
    }

    public static int getHashCodeSum(String subString) {
        boolean isOneCharacterOnly = subString.length() == 1;
        if (isOneCharacterOnly) return subString.hashCode();

        String[] array = subString.split("");
        return Stream.of(array).map(String::hashCode).reduce(0, Integer::sum);
    }
}

