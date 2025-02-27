
import java.util.Scanner;

//Uma loja de móveis paga a seu vendedor um fixo de R$1000 por mês, mais um bônus de R$50 por móvel vendido. Faça um algoritmo que leia a quantidade de móveis vendidos e calcule o salário total do funcionário.

public class program {
      public static void main(String[] args) {
         
        
         //salario fixo do funcionario
         
         double fixed = 1000.00;
         double bonus = 50.00;
         
        
         Scanner teclado = new Scanner(System.in);
         //quantidade imóveis vendidos
         
         System.out.println("Digite a quantidade de imóveis recebidos: ");
         int qtd = teclado.nextInt();
         
         //salario do funcionario
         
        double salario = fixed + (qtd * bonus);
         
         //quantidade vendida e o salario do funcionario
         
         System.out.println("A qtd vendida foi: " + qtd);
         System.out.println("O salario do funcionario do mes foi: " + salario);
         
         teclado.close();
      }
    }
