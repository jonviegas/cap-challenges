package questions.question01;

import java.util.Scanner;

public class Stairs {

    public static void main() {
        Scanner sc = new Scanner(System.in);

        /*
         * n = Tamanho da escada
         * */
        System.out.print("n = ");
        int size = sc.nextInt();

        /*
         * stair = Array de espaços vazios (" ") de tamanho n representando o degrau da escada
         * */
        String[] stair = new String(new char[size]).replace("\0", " ").split("");

        /*
         * A cada loop, o último espaço vazio é substituído com "*" até não sobrar mais espaços vazios
         * */
        buildStairs(size, stair);
    }

    public static void buildStairs(int size, String[] stair) {
        for (int index = size - 1; index >= 0; index--) {
            stair[index] = "*";
            System.out.println(String.join("", stair));
        }
    }

}

