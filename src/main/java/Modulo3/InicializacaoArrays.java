package Modulo3;

import java.util.Scanner;

public class InicializacaoArrays {
    public static void main(String[] args) {

        int idade = 30;
        int[] numerosImpares = {1, 3, 5, 7, 9};

        String nome = "Pedro";
        String telefone1 = "123489875";
        String telefone2 = "423489875";
        String[] filhos = {"Zé", "Maria", "Pedro", "Rita"};

        System.out.println(filhos[3]);
        System.out.println(filhos[2]);
        System.out.println(filhos[1]);
        System.out.println(filhos[0]);

        String nomePrimeiroFilho = filhos[0];
        String nomeSegundoFilho = filhos[1];

        String[] telefones = new String[2];

        System.out.println("Telefone 1 quando array vazio: " + telefones[0]);

        telefones[0] = "123489875";
        telefones[1] = "423489875";

        System.out.println("Primeiro telefone: " + telefones[0]);
        System.out.println("Segundo telefone: " + telefones[1]);


        int[] outrosNumeros = new int[5];
        System.out.println("Valor: " + outrosNumeros[1]);
    }
}
