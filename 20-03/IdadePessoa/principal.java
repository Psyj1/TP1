package idadepessoa;

import java.util.Scanner;


public class Principal {


    public static void main(String[] args) {
    IdadePessoa id = new IdadePessoa();
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Informe o ano em que nasceu: ");
        int ano = teclado.nextInt();
        
        int idade = 2025 - ano;
        
        id.calcularIdade(ano, idade);
        
        id.mostrarIdade();
        
        teclado.close();
    }
    
}