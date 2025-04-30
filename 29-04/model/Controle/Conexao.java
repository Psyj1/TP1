package Controle;
 
import java.sql.*;
import javax.swing.JOptionPane;
 
public class Conexao {
    private final String driver = "com.mysql.cj.jdbc.Driver";
    private final String url = "jdbc:mysql://127.0.0.1/base";
    
    private final String usuario = "root";
    private final String senha = "";
    private Connection conexao;
    public Statement statement; 
    public ResultSet resultset;
 
    public boolean conecta() {
        boolean result = true;
        
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, usuario, senha);
            //JOptionPane.showMessageDialog (null, "Conectou com o Banco de Dados");
        } catch (ClassNotFoundException Driver) {
            JOptionPane.showMessageDialog(null, "Driver não localizado: "+Driver);
            result = false;
        } catch (SQLException Fonte) {
            JOptionPane.showMessageDialog(null, "Erro na conexão com a fonte de dados: "+Fonte);
            result = false;
        }
    return result;
    }
 
    public void desconecta() {
        boolean result = true;
        try {
                conexao.close();
                //JOption.Pane.showMessageDialog(null, "Banco fechado");
            
        } catch (SQLException fecha) {
            JOptionPane.showMessageDialog(null, "Não foi possível fechar o banco de dados: " + fecha);
            result = false;
        }
    }
 
    public void executeSQL(String sql) {
        //chamada do metodo conecta para abrir a conexão com o db
        conecta();
       
try{
        statement = conexao.createStatement();

        statement.execute(sql);
        //desconecta();
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Driver não encontrado1 " + sqle.getMessage());
        }
    }
        
 
    public ResultSet RetornarResultSet(String sql) {
        ResultSet resultSet = null;
        conecta();

        try{
        statement = conexao.createStatement();
        resultSet = statement.executeQuery(sql);
        resultSet.next();
        } catch (Exception e){
        JOptionPane.showMessageDialog(null, "Erro ao retornar resultset"+e.getMessage());
    }
        return resultSet;
    }    
}