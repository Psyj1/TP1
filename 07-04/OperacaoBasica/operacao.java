
package matematica;

public class OperacoesBasicas {
    private double n1;
    private double n2;
    private double resultado;

    public OperacoesBasicas() {
    }

    public OperacoesBasicas(double n1, double n2, double resultado) {
        this.n1 = n1;
        this.n2 = n2;
        this.resultado = resultado;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    public double somar(double n1, double n2){
        double result = n1 + n2;
        return result;
    }
    
    public double subtrair(double n1, double n2){
        double result = n1 - n2;
        return result;
    }
    
    public double multiplicar(double n1, double n2){
        double result = n1 * n2;
        return result;
    }
    
    public double dividir(double n1, double n2){
        double result = n1 / n2;
        return result;
    }
}
