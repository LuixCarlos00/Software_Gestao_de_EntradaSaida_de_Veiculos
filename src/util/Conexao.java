package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conexao {
    
    public static Connection con;
    
    public static void conectar() {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user = "root", pass = "root", url = "jdbc:mysql://localhost:/gestao_de_carros";
            
            
            con = DriverManager.getConnection(url, user, pass);
        } 
        
        catch (ClassNotFoundException ex) {
            System.out.println("Conector Java - MySQL não encontrado.\n" + ex.getMessage());
        }
        
        catch (SQLException ex) {
            System.out.println("Erro na conexão com o banco de dados.\n" + ex.getMessage());
        }
        
    }
    
    public static void desconectar() {
        
        try {
            con.close();
        } 
        
        catch (SQLException ex) {
            System.out.println("Erro ao encerrar a conexão com o banco de dados.\n" + ex.getMessage());
        }
        
    }

    public static PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}