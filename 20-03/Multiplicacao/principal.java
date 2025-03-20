package multiplicacao;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Multiplicacao mult = new Multiplicacao();
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Informe um valor: ");
        int valor = teclado.nextInt();
        
        int resultado = valor * 4;
        
        mult.multiplcacao4(valor, resultado);
        
        mult.mostrarMultiplicacao();
        
       
        teclado.close();
    }
    
}
