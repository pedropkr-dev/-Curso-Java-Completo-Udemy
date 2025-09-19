package Modulo3;

import java.util.Scanner;

public class CalculadoraIdade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o ano atual: ");
        int anoAtual = input.nextInt();
        System.out.println("Digite o ano do seu nascimento: ");
        int anoNascimento = input.nextInt();

        int resultado =anoAtual - anoNascimento;

        System.out.println("A idade é " + resultado + " anos");

        if (resultado < 18) {
            System.out.println("Você é menor de idade.");
        } else if (resultado < 60) {
            System.out.println("Você é de Maior");
        } else {
            System.out.println("Você é um idoso ");
        }



        input.close();
    }
}
