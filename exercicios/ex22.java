import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {
        // Faça um algoritmo ,que leia o número de litros, calcule e mostre o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 4,39.

        Scanner keyboard = new Scanner(System.in);

        double value, litro;

        System.out.println("How much do you put in the car?: ");
        litro = keyboard.nextDouble();

        value = litro * 4.39;

        System.out.println("The value did you gonna pay is: " + value);



    }
}
