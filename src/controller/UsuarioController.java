package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.UsuarioModel;
import util.Conexao;

public class UsuarioController {
    
    public boolean inserir (UsuarioModel usuario){
    String sql = "INSERT INTO USUARIOS (nome,senha,admin) values (?,?,?);";
    boolean retorno = false;
        Conexao.conectar();   
         try {
            PreparedStatement sentenca = Conexao.con.prepareStatement(sql);
            sentenca.setString(1, usuario.getNome());
            sentenca.setString(2, usuario.getSenha());
            sentenca.setString(3, usuario.getAdmin());
           
            if (!sentenca.execute())
                retorno = true;
        }
        
        catch(SQLException e) {
            System.out.println("Erro ao  cadastra usuario no banco de dados no SQL \n" + e.getMessage());
        }
        
        Conexao.desconectar();
        return retorno;
        
    }
    
    public UsuarioModel selecionar(UsuarioModel usuario){
        String sql = "SELECT * FROM usuarios WHERE nome = ? AND senha = ?;";
        UsuarioModel modeloEncontrado = null;
        Conexao.conectar();
        
        try{
            PreparedStatement sentenca = Conexao.con.prepareStatement(sql);
            sentenca.setString(1, usuario.getNome());
            sentenca.setString(2, usuario.getSenha());
            ResultSet resultado = sentenca.executeQuery();
            
            if(resultado.next()) {
                modeloEncontrado = new UsuarioModel();
                modeloEncontrado.setId(resultado.getInt("id"));
                modeloEncontrado.setNome(resultado.getString("nome"));
                modeloEncontrado.setSenha(resultado.getString("senha"));
                modeloEncontrado.setAdmin(resultado.getString("admin"));
            }
            
        }
        
        catch(SQLException e){
            System.out.println("Erro na sentença SQL de seleção: "+ e.getMessage());
        }
        
        Conexao.desconectar();
        return modeloEncontrado;
    }
     
    
    
    
    
    
    
    
    
    
}
