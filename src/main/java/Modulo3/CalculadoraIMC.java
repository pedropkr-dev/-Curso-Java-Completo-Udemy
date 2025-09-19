package Modulo3;

public class CalculadoraIMC {
    public static void main(String[] args) {
        // peso div (altura * altura)

        float peso = 75.5f;
        float altura = 1.65f;

        double peso_imc = peso/(altura*altura);

        System.out.println("Seu IMC é " + peso_imc);
    }
}
