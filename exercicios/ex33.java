import java.util.Scanner;

public class ex33 {
    public static void main(String[] args) {
        //Uma loja de móveis paga a seu vendedor um fixo de R$1000 por mês, mais um bônus de R$50 por móvel vendido. Faça um algoritmo que leia a quantidade de móveis vendidos e calcule o salário total do funcionário.

        Scanner sc = new Scanner(System.in);

        double salary, bonus, qtd;

        salary = 1000;

        System.out.println("How much do you sell today?: ");
        qtd = sc.nextDouble();

        bonus = qtd * 50;

        System.out.println("The bonus of the number is: " + bonus);
    }
}
