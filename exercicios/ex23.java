import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {
        // Faça um programa para ler: a descrição do produto (nome), a quantidade comprada e o preço unitário. Calcular e escrever o total a pagar.

        Scanner keyboard = new Scanner(System.in);

        char name;
        double qtd, value, total;

        System.out.print("Enter the name of the product: ");
        name = keyboard.nextLine().charAt(100);

        System.out.print("How much do you pick?: ");
        qtd = keyboard.nextDouble();

        System.out.print("How much this cost?: ");
        value = keyboard.nextDouble();

        total = qtd * value;

        System.out.println("The name of the product is: " + name);
        System.out.println("The total cost is: " + total);


    }
}
