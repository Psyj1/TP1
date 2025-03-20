public class Multiplicacao {
    private int valor;
    private int resultado;

    public Multiplicacao() {
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    public void multiplcacao4(int valor, int resultado){
        setValor(valor);
        setResultado(resultado);
    }
    
    public void mostrarMultiplicacao(){
        System.out.print("Resultado da multiplicacao:"
                    + getResultado()
        );
    }
}