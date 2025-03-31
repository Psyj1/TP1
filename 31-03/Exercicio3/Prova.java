
package prova;
  
import javax.swing.JOptionPane;

public class Prova {
  private String nome;
    private double pontos;
    private String nivel;

    public Prova() {
    }

    public Prova(String nome, double pontos, String nivel) {
        this.nome = nome;
        this.pontos = pontos;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPontos() {
        return pontos;
    }

    public void setPontos(double pontos) {
        this.pontos = pontos;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }


    public void nivelProva(){
        if(getPontos() <= 100){
            JOptionPane.showMessageDialog(null, "Nivel 1");
        }else if(getPontos() > 100 && getPontos() < 200){
            JOptionPane.showMessageDialog(null, "Nível 2.");
        } else {
            JOptionPane.showMessageDialog(null, "Nível 3.");
        }
    }
    
    public void listarResultado(){
        String mensagem = 
                "Nome: " + getNome() +
                "\nPontos: " + getPontos() +
                "\nNível: " + getNivel();
        
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
