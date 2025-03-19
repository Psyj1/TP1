package javaapplication4;

import java.util.Scanner;


public class JavaApplication4 {

    
    public static void main(String[] args) {
       Cliente cliente = new Cliente();
       
       Scanner teclado = new Scanner(System.in);
       
       System.out.println("Nome: ");
       String nome = teclado.next();
       System.out.println("Endereco: ");
       String endereco = teclado.next();
       System.out.println("RG: ");
       String rg = teclado.next();
       
       cliente.cadastrarCliente(nome, endereco, rg);
       
       cliente.listarCliente();
       
       
       teclado.close();
    }
    
}