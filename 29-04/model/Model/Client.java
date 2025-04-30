package model;
 
import Controle.Conexao;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
 
public class Client {
    private int code;
    private String name;
    private String phone;
    private String email;

    Conexao conClient = new Conexao();
    public Client(){
    this(0,"","","");
}

    public Client (int code, String name, String phone, String email){
    this.code = code;
    this.name = name;
    this.phone = phone;
    this.email = email;
}
    public int getCode(){
        return code;
    }
    public void setCode (int code){
        this.code = code;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getPhone() {
        return phone;
    }
 
    public void setPhone(String phone) {
        this.phone = phone;
    }
 
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
    public void record() {
        String sql = "INSERT INTO Cliente(code, name_cliente, phone, email) VALUES (" +
                 this.getCode() + ", '" + 
                 this.getName() + "', '" + 
                 this.getPhone() + "', '" + 
                 this.getEmail() + "')";
        conClient.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Register recorded with sucess...");
}
    public ResultSet consult(){
        ResultSet table = null;
        String sql = "Select * from cliente";
        table = conClient.RetornarResultSet(sql);
        return table;
    } 
}