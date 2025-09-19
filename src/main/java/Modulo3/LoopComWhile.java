package Modulo3;

import java.util.Scanner;

public class LoopComWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um Valor: ");
        int contador = input.nextInt();
        int valor = 1;

        while (valor <= contador) {
            System.out.println(valor);
            valor = valor + 1;
        }

        input.close();
    }
}
