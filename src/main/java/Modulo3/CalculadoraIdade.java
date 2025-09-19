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

        input.close();
    }
}
