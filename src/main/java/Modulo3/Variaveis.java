package Modulo3;

public class Variaveis {

    //Para fazer uma constante,eu preciso utilizar o "static final". Observação: Diferentemente da variável, não é um valor mutável,
    //O "float" serve para trabalhar com valores quebrados, ou seja, decimais.
    static final float VALOR_PI = 3.14f;

    public static void main(String[] args) {

        //Variável é um valor volátil

        int idade;
        idade = 19;

        idade = 20;

        System.out.println("idade: " + idade);
        System.out.println("valor de PI: "+ VALOR_PI);
    }
}
