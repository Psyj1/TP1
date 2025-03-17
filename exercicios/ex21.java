import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {
        // Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.

        Scanner keyboard = new Scanner(System.in);

        double percentage, salary, newSalary;

        System.out.print("Type your salary salary: ");
        salary = keyboard.nextDouble();

        System.out.print("Type the percentage: ");
        percentage = keyboard.nextDouble();

        newSalary = salary + (salary * percentage)/100;

        System.out.println("New salary is: " + newSalary);

    }
}
