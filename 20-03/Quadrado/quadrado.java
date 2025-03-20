package quadrado;

public class Quadrado {
        private double numero;
        private double resultado;

    public Quadrado() {
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
        
    public void calcularQuadrado (double numero, double resultado){
        setNumero(numero);
        setResultado(resultado);
    }
    
    public void mostrarQuadrado(){
        System.out.println("Resultado do quadrado:"
                + getResultado()
        );
    }
}