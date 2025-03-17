import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        // Crie um algoritmo que leia o valor do salário mínimo e coloque um valor do salário de um funcionário=(digite salario), calcule a quantidade de salários mínimos esse funcionário ganha.

        Scanner keyboard = new Scanner(System.in);

        double minsal, salary, qtdsal;

        minsal = 1200;

        System.out.print("Type your salary: ");
        salary = keyboard.nextDouble();

        qtdsal = salary/minsal;

        System.out.println("You recieve " + qtdsal + " minimum salary");


    }
}
