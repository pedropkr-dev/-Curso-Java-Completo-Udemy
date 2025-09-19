package Modulo3;

import java.util.Scanner;

public class CalculaMedia {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a nota do primeiro trimestre");
        int nota1 = input.nextInt();

        System.out.println("Digite a nota do segundo trimestre");
        int nota2 = input.nextInt();

        System.out.println("Digite a nota do terceiro trimestre");
        int nota3 = input.nextInt();


        double media =  (nota1 + nota2 + nota3) / 3;

        // Operadores de comparação: ->
        // Igualdade: ==
        // maior e menor que: > <
        // e diferente de: !=

        if (media >= 6) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }

        System.out.println("A média para o aluno é: " + media);
        input.close();
    }
}
