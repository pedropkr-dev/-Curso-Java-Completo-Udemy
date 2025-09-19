package Modulo3;

import java.util.Scanner;

public class LoopComFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");

        int valor = input.nextInt();

        for (int contador = 1; contador <= valor; contador++){
            System.out.println(contador);
        }


        input.close();
    }
}
