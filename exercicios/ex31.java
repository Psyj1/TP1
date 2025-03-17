import java.util.Scanner;

public class ex31 {
    public static void main(String[] args) {
        //Faça um algoritmo em Java que receba dois números inteiros, calcule e mostre o dobro do primeiro e o triplo do segundo

        Scanner sc = new Scanner(System.in);

        int a, b, triple, Double;

        System.out.print("Enter a number for A: ");
        a = sc.nextInt();

        System.out.print("Enter a number for B: ");
        b = sc.nextInt();

        Double = a * 2;
        triple = 3 * b;

        System.out.println("The triple of the number is: " + triple);
        System.out.println("The double of the number is: " + Double);
    }
}
