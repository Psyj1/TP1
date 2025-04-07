package principal;

import javax.swing.JOptionPane;

public class Program {

    public static void main(String[] args) {
       int operacao = Integer.parseInt(JOptionPane.showInputDialog(null, "digite a operação desejada: \n 1- somar\n 2-subtrair \n 3 - multiplicar \n 4- dividir \n 0-sair"));
        while (operacao !=0){
            operacao = Integer.parseInt(JOptionPane.showInputDialog(null, "digite a operação desejada: \n 1- somar\n 2-subtrair \n 3 - multiplicar \n 4- dividir \n 0-sair"));
            switch (operacao){
            case 1:
                JOptionPane.showMessageDialog(null, "somar");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "subtrair");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "multiplicar");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "dividir");
                break;
            case 0:
                JOptionPane.showMessageDialog(null, "sair");
                break;
            default:
              JOptionPane.showMessageDialog(null, "opção invalida");
        }
        }
    }
    
}