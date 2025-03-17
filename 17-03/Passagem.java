
package passagem;

public class Passagem {
      private String nomePassageiro;
      private String telefone;
      private String RG;
      private String localViagem;
      private String data;
      private String horario;
      private String numpoltrona;

    public Passagem() {
    }

    public Passagem(String nomePassageiro, String telefone, String RG, String localViagem, String data, String horario, String numpoltrona ) {
        this.nomePassageiro = nomePassageiro;
        this.telefone = telefone;
        this.RG = RG;
        this.localViagem = localViagem;
        this.data = data;
        this.horario = horario;
        this.numpoltrona = numpoltrona;
    }

    public String getNome() {
        return nomePassageiro;
    }

    public void setNome(String nome) {
        this.nomePassageiro = nomePassageiro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRG() {
        return RG;
    }
    
    public void setRG(){
        this.RG = RG;
    }

    public void setlocalViagem(String localViagem) {
        this.localViagem = localViagem;
    }

    public String data() {
        return data;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
      
    public void cadastrarDados(String nome, String telefone, String endereco, String cidade){
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cidade = cidade;
    }
    
    public void mostrarDados(){
        System.out.println("Dados do Contato"
                + "\nNome: " + this.nome
                + "\nTelefone: " + this.telefone
                + "\nEndereco: " + this.endereco
                + "\nCidade: " + this.cidade);
    }
    
}
