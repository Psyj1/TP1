package javaapplication4;

public class Cliente {
    private String nome;
    private String endereco;
    private String RG;
    
    public Cliente(){
    }

    public Cliente(String nome, String endereco, String RG) {
        this.nome = nome;
        this.endereco = endereco;
        this.RG = RG;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }
    
    public void cadastrarCliente(String nome, String endereco, String RG){
        setNome(nome);
        setEndereco(endereco);
        setRG(RG);
    }
    
    public void listarCliente(){
        System.out.println("Dados do Cliente"
                + "\nNome: " + getNome()
                + "\nEndereco: " + getEndereco()
                + "\nRG: " + getRG());
    }
}
