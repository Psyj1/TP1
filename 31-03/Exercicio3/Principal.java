
package prova;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
      String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
      double pontos = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de pontos: "));
      String ni = null;
      Prova nivel = new Prova();
      
      nivel.nivelProva();
      
      nivel.listarResultado();
    }
    
}
