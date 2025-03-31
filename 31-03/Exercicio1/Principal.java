package cliente2;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        String nome = JOptionPane.showInputDialog("Nome: ");
        double numeroConta = Double.parseDouble(JOptionPane.showInputDialog("Numero conta: "));
        double saldoMedio = Double.parseDouble(JOptionPane.showInputDialog("Saldo medio: "));
        
        Cliente2 cli = new Cliente2(nome, numeroConta, saldoMedio);
        
        cli.verificarSaldo();
        
    }
}