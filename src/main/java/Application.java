import questions.question01.Stairs;
import questions.question02.Password;
import questions.question03.Anagram;

import java.io.IOException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            clearScreen();

            menu();
            int option = sc.nextInt();

            clearScreen();

            switch (option) {
                case 1:
                    System.out.println("Questão 01:");
                    Stairs.main();;
                    break;
                case 2:
                    System.out.println("Questão 02:");
                    Password.main();
                    break;
                case 3:
                    System.out.println("Questão 03:");
                    Anagram.main();
                    break;
            }

        sc.close();
    }

    private static void menu() {
        System.out.println("Capgemini Desafios");
        System.out.println("1 - Questão 01");
        System.out.println("2 - Questão 02");
        System.out.println("3 - Questão 03");
        System.out.print("Option: ");
    }

    private static void clearScreen() {
        String OS = System.getProperty("os.name").toLowerCase();
        Boolean isWindows = (OS.indexOf("win") >= 0);
        Boolean isUnix = (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") >= 0);

        if (isWindows) {
            try {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (isUnix) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }

}
