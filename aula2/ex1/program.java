import java.util.Scanner;

//Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.

public class program {

   
    public static void main(String[] args) {
    
        try (Scanner entrada = new Scanner (System.in)) {
            System.out.println("Digite o seu salário atual: ");
            float salario = entrada.nextFloat();
            
            System.out.println("Digite o percentual de reajuste: ");
            float reajuste = entrada.nextFloat();
            
            float novoSalario = salario + (salario * reajuste /100 );
            
            System.out.println(novoSalario);
        }
        
    }
}