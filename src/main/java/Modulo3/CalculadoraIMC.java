package Modulo3;

import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {

        Scanner leitorTeclado = new Scanner(System.in);

        // peso div (altura * altura)
        System.out.println("Digite seu peso (em kg): ");
        float peso = leitorTeclado.nextFloat();
        System.out.println("Digite sua altura (em cm): ");
        float altura = leitorTeclado.nextFloat();

        double peso_imc = peso/(altura*altura);

        System.out.println("Seu IMC é " + peso_imc);

        leitorTeclado.close();
    }
}
