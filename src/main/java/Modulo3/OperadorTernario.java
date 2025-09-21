package Modulo3;

public class OperadorTernario {
    public static void main(String[] args) {

        int idade = 10;
        int idadeMinima = 18;
        int anoNascimento = 2000;

        boolean boleana = idade > idadeMinima && anoNascimento >= 2000;

        if (boleana) {
            System.out.println("Executa o IF: ");
        }

        String deMaior = idade >= 18 ? "Sim, é de maior" : "Não, é de menor";
        System.out.println(deMaior);


    }
}
