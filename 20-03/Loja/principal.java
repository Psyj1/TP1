package loja;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Loja loja = new Loja();
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Qual o valor da compra?");
        double valorCompra = teclado.nextDouble();
        System.out.println("Quantidade: ");
        double qtdItensComp = teclado.nextDouble();
        System.out.println("Nome da Loja: ");
        String razaoSocial = teclado.next();
        System.out.println("Seu CPF: ");
        String cpfCliente = teclado.next();
        
        double valorTotalCompra = valorCompra * qtdItensComp;
        
        loja.inserirDadosLoja(razaoSocial, cpfCliente);
        
        loja.mostrarDadosLoja();
        
        loja.calcularCompraLoja(valorCompra, qtdItensComp);
        
        System.out.println(valorTotalCompra);
        
        
        
        teclado.close();
        
        
    }
    
}