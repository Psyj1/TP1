package loja;

public class Loja {
    private String razaoSocial;
    private String cpfCliente;
    private double valorCompra;
    private double qtdItensComp;
    private double valorTotalCompra;

    public Loja() {
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getQtdItensComp() {
        return qtdItensComp;
    }

    public void setQtdItensComp(double qtdItensComp) {
        this.qtdItensComp = qtdItensComp;
    }

    public double getValorTotalCompra() {
        return valorTotalCompra;
    }

    public void setValorTotalCompra(double valorTotalCompra) {
        this.valorTotalCompra = valorTotalCompra;
    }
    
    public void inserirDadosLoja(String razaoSocial, String cpfCliente){
        setRazaoSocial(razaoSocial);
        setCpfCliente(cpfCliente);
    }
    
    public void mostrarDadosLoja(){
        System.out.println("O nome da loja é"
                + getRazaoSocial() + "onde o CPF do cliente e"
                + getCpfCliente()
        );
    }
    
    public void calcularCompraLoja(){
        System.out.println("O valor da compra foi"
                + getValorCompra() + "onde comprou"
                + getQtdItensComp() + "unidades, logo, o total foi:"
                + getValorTotalCompra());
    
    }
    }