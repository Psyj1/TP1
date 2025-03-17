import java.util.Scanner;

public class ex11 {

    public static void main(String[] args) {
        //Declare as variáveis n1, n2 como tipo real, Leia os valores de n1 e n2 e faça as 4 operações matemáticas(adição, subtração, divisão e multiplicação) com estes valores de n1 e n2.

        Scanner entrada = new Scanner(System.in);

        int number1, number2, soma, subtracao, divisao, multiplicacao;

        System.out.print("Digite um numero: ");
        number1 = entrada.nextInt();

        System.out.print("Digite outro numero: ");
        number2 = entrada.nextInt();

        soma = number1 + number2;
        subtracao = number1 - number2;
        multiplicacao = number1 * number2;
        divisao = number1 / number2;

        System.out.println("O resultado da soma eh: " + soma);
        System.out.println("O resultado da subtracao eh: " + subtracao);
        System.out.println("O resultado da multiplicacao eh: " + multiplicacao);
        System.out.println("O resultado da divisao eh: " + divisao);
    }
}