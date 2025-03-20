package quadrado;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Quadrado quad = new Quadrado();
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Informe um numero: ");
        double numero = teclado.nextDouble();
        
        double resultado =  numero * numero;
        
        quad.calcularQuadrado(numero, resultado);
        
        quad.mostrarQuadrado();
        
       
        teclado.close();
    }
    
}
