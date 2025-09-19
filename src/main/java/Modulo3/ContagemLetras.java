package Modulo3;

import java.util.Scanner;

public class ContagemLetras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma frase: ");


        String frase = input.nextLine();
        int quantidadesLetras = 0;

        for (int indice = 0; indice < frase.length();  indice++ ){
            char letra = frase.charAt(indice);
            boolean isLetra = Character.isLetter(letra);
            if (isLetra){
                quantidadesLetras++;
            }
        }

        System.out.println("A quantidade de letras é: ");

        input.close();
    }
}
