package fornecedores;

import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {
       Fornecedores forne = new Fornecedores();
       
       Scanner teclado = new Scanner(System.in);
       
       System.out.println("Nome: ");
       String nomeFornecedor = teclado.next();
       System.out.println("Produto: ");
       String nomeProduto = teclado.next();
       System.out.println("Descricao: ");
       String descricaoProduto = teclado.next();
       
       forne.cadastrarFornecedor(nomeFornecedor, nomeProduto, descricaoProduto);
       
       forne.listarFornecedor();
       
       teclado.close();
    }
    
}