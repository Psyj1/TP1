package fornecedores;

public class Fornecedores {
    private String nomeFornecedor;
    private String nomeProduto;
    private String descricaoProduto;

    public Fornecedores() {
    }

    public Fornecedores(String nomeFornecedor, String nomeProduto, String descricaoProduto) {
        this.nomeFornecedor = nomeFornecedor;
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }
    
    public void cadastrarFornecedor(String nomeFornecedor, String nomeProduto, String descricaoProduto){
        setNomeFornecedor(nomeFornecedor);
        setNomeProduto(nomeProduto);
        setDescricaoProduto(descricaoProduto);
    }
    
    public void listarFornecedor(){
        System.out.println("Dados do Fornecedor");
        System.out.println("Nome: " + getNomeFornecedor());
        System.out.println("Produto: " + getNomeProduto());
        System.out.println("Nome: " + getDescricaoProduto());
    }
}