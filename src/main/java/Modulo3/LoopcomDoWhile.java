package Modulo3;

import java.util.Scanner;

public class LoopcomDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;

        do {
            System.out.print("Digite um numero entre 1 e 10: ");
            numero = input.nextInt();
        } while (numero < 1 || numero > 10);

        System.out.println("Digitado é valido: ");

    input.close();
    }

}
