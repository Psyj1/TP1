
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

    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public void setNomePassageiro(String nomePassageiro) {
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

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getLocalViagem() {
        return localViagem;
    }

    public void setLocalViagem(String localViagem) {
        this.localViagem = localViagem;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getNumpoltrona() {
        return numpoltrona;
    }

    public void setNumpoltrona(String numpoltrona) {
        this.numpoltrona = numpoltrona;
    }

    
      
    public void cadastrarDadosPassageiros(String nomePassageiro, String RG, String telefone){
        setNomePassageiro (nomePassageiro);
        setRG (RG);
        setTelefone(telefone);
    }
    
    
    
    public void mostrarDadosPassageiros(){
        System.out.println("Dados do Contato"
                + "\nNome: " + getNomePassageiro()
                + "\nTelefone: " + getTelefone()
                + "\nRG: " + getRG());
    }
    
    public void cadastrarDadosPassagem(String localViagem, String data, String horario, String numpoltrona){
       setData(data);
       setHorario(horario);
       setLocalViagem(localViagem);
       setNumpoltrona(numpoltrona);
    }
    
    public void mostrarDadosPassagem(){
        System.out.println("Dados da Viagem"
                + "\nCidade: " + getLocalViagem()
                + "\nData: " + getData()
                + "\nHorario: " + getHorario()
                + "\nPoltrona: " + getNumpoltrona());
    }
    
}
