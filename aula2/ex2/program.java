import java.util.Scanner;

//Faça um algoritmo ,que leia o número de litros, calcule e mostre o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 4,39.

public class program {
    public static void main(String[] args) {
    
        try (Scanner entrada = new Scanner (System.in)) {
            System.out.println("Digite quantos litros voce abasteceu: ");
            double litros = entrada.nextFloat();
            
            double valorPago = litros * 4.39;
            
            System.out.println(valorPago);
        }
             
    }
}