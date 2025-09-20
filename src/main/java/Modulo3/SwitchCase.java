package Modulo3;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao = 0;
        double valorTotal;

        do{
            System.out.println("Digite uma opcao do menu: ");
            System.out.println("1.Sanduiche");
            System.out.println("2.Pizza");
            System.out.println("3.Sorvete");
            System.out.println("0.Sair");

            opcao = input.nextInt();

           switch(opcao){
               case 1:
                   System.out.println("1.Sanduiche");
                   break;
               case 2:
                   System.out.println("2.Pizza");
                   break;
               case 3:
                   System.out.println("3.Sorvete");
                   break;
               case 0:
                   System.out.println("0.Sair");
                   break;
               default:
                   System.out.println("Escolha uma opção válida");
           }

        } while (opcao != 0);

        input.close();
    }
}
