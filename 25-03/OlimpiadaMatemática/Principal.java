package olimpiadamatematica;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        
        OlimpiadaMatematica oli = new OlimpiadaMatematica();
        
        oli.setNome(JOptionPane.showInputDialog("Nome: "));
        oli.setEndereco(JOptionPane.showInputDialog("Endereco: "));
        oli.setNotaMenor(Double.parseDouble(JOptionPane.showInputDialog("menor nota: ")));
        oli.setNotaMaior(Double.parseDouble(JOptionPane.showInputDialog("maior nota: ")));
        
        oli.calcularMedia();
        
        oli.verificarMedia();
        
        
    }
    
}