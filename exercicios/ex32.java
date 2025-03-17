import java.util.Scanner;

public class ex32 {
    public static void main(String[] args) {
        // Faça um algoritmo em Java, que receba um número inteiro e calcule e mostre este número elevado ao quadrado.

        Scanner sc = new Scanner(System.in);

        int a, pot;

        System.out.println("Enter a number for A: ");
        a = sc.nextInt();

        pot = a * a;

        System.out.println("The square of the number is: " + pot);
    }
}
