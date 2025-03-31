package olimpiadamatematica;

import javax.swing.JOptionPane;

public class OlimpiadaMatematica {
    private String nome;
    private String endereco;
    private double media;
    private double notaMenor;
    private double notaMaior;

    public OlimpiadaMatematica() {
    }

    public OlimpiadaMatematica(String nome, String endereco, double media, double notaMenor, double notaMaior) {
        this.nome = nome;
        this.endereco = endereco;
        this.media = media;
        this.notaMenor = notaMenor;
        this.notaMaior = notaMaior;
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

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double getNotaMenor() {
        return notaMenor;
    }

    public void setNotaMenor(double notaMenor) {
        this.notaMenor = notaMenor;
    }

    public double getNotaMaior() {
        return notaMaior;
    }

    public void setNotaMaior(double notaMaior) {
        this.notaMaior = notaMaior;
    }
    
    public void calcularMedia(){
        setMedia((getNotaMenor() + getNotaMaior()) / 2); 
    }
    
    public void verificarMedia(){
        if(getMedia() > 9){
            JOptionPane.showMessageDialog(null, "Aluno inscrito!");
        } else {
            JOptionPane.showMessageDialog(null, "Media Insuficiente");
        }
        JOptionPane.showMessageDialog(null, "Media do Aluno: " + getMedia());
    }
    
}