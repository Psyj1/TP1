
package passagem;

import java.util.Scanner;


public class Passagem2 {
    
    public static void main (String[] args){
              //Instanciando a classe Passagem
        Passagem passagem = new Passagem();
        
        //Instanciando a classe Scanner
        Scanner keyboard = new Scanner(System.in);
        
        //Pegando as informações do usuário
        System.out.println("Nome do passageiro: ");
        String nome = keyboard.next();
        System.out.println("RG do passageiro: ");
        String RG = keyboard.next();
        System.out.println("Telefone do passageiro: ");
        String telefone = keyboard.next();
        
        //Chamando o método cadastrarDadosPassageiro
        passagem.cadastrarDadosPassageiros(nome, RG, telefone);
       
        //Mostrando dados do Passageiro
        passagem.mostrarDadosPassageiros();
        
        keyboard.close();
    }
}
