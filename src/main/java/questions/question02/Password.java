package questions.question02;

import java.util.Scanner;

public class Password {

    public static void main() {
        Scanner sc = new Scanner(System.in);

        /*
         * password = Senha digitada pelo usuário
         * */
        String password = sc.next();

        /*
         * conditions = Array com os resultados de testes de condições para que a senha seja válida
         * */
        boolean[] conditions = testConditions(password);

        /*
         * 1 - Caso os valores do array sejam true e password maior que 6 caracteres: requiredCharacters = 0
         * 2 - Para cada valor do array sendo falso: requiredCharacters += 1
         * 3 - Caso password for menor que 6 caracteres:
         *     resultado será o maior valor entre requiredCharacters e o que falta para os seis caracteres
         * */
        int requiredCharacters = calculateRequiredCharacters(conditions, password);

        System.out.println(requiredCharacters);
    }

    public static boolean[] testConditions(String password) {
        boolean containsNumber = password.matches("^(?=.*[0-9]).*$");
        boolean containsLowercase = password.matches("^(?=.*[a-z]).*$");
        boolean containsUppercase = password.matches("^(?=.*[A-Z]).*$");
        boolean containsSpecialCharacter = password.matches("^(?=.*\\W).*$");

        return new boolean[]{containsNumber, containsLowercase, containsUppercase, containsSpecialCharacter};
    }

    public static int calculateRequiredCharacters(boolean[] conditions, String password) {
        int requiredCharacters = 0;
        for (boolean condition : conditions) if (!condition) requiredCharacters++;

        int passwordLength = password.length();
        boolean isSixCharactersOrMore = passwordLength >= 6;
        if (!isSixCharactersOrMore) requiredCharacters = Math.max(requiredCharacters, (6 - passwordLength));

        return requiredCharacters;
    }
}