package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.UsuarioModel;
import util.Conexao;

public class UsuarioController {
    
    public boolean inserir(UsuarioModel usuario) {
        String sql = "INSERT INTO USUARIOS (nome,senha,admin,cpf) values (?,?,?,?);";
        boolean retorno = false;
        Conexao.conectar();   
        try {
            PreparedStatement sentenca = Conexao.con.prepareStatement(sql);
            sentenca.setString(1, usuario.getNome());
            sentenca.setString(2, usuario.getSenha());
            sentenca.setString(3, usuario.getAdmin());
            sentenca.setString(4, usuario.getCpf());
            if (!sentenca.execute())
                retorno = true;
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar usuário no banco de dados no SQL \n" + e.getMessage());
        }
        Conexao.desconectar();
        return retorno;   
    }
    
    public boolean verificarCPF(String cpf) {
        String sql = "SELECT cpf FROM usuarios WHERE cpf = ?";
        boolean cpfExiste = false;
        Conexao.conectar();
        try {
            PreparedStatement sentenca = Conexao.con.prepareStatement(sql);
            sentenca.setString(1, cpf);
            ResultSet resultado = sentenca.executeQuery();
            cpfExiste = resultado.next();
        } catch (SQLException e) {
            System.out.println("Erro ao verificar CPF no banco de dados: " + e.getMessage());
        }
        Conexao.desconectar();
        return cpfExiste;
    }
    
    
      

    
    
    public UsuarioModel selecionar(UsuarioModel usuario){
        String sql = "SELECT * FROM usuarios WHERE cpf = ? AND senha = ?;";
        UsuarioModel modeloEncontrado = null;
        Conexao.conectar();
        
        try{
            PreparedStatement sentenca = Conexao.con.prepareStatement(sql);
            sentenca.setString(1, usuario.getCpf());
            sentenca.setString(2, usuario.getSenha());
            ResultSet resultado = sentenca.executeQuery();
            
            if(resultado.next()) {
                modeloEncontrado = new UsuarioModel();
                modeloEncontrado.setId(resultado.getInt("id"));
                modeloEncontrado.setCpf(resultado.getString("cpf"));
                modeloEncontrado.setSenha(resultado.getString("senha"));
                modeloEncontrado.setAdmin(resultado.getString("admin"));
                modeloEncontrado.setCpf(resultado.getString("cpf"));
            }
            
        }
        
        catch(SQLException e){
            System.out.println("Erro na sentença SQL de seleção: "+ e.getMessage());
        }
        
        Conexao.desconectar();
        return modeloEncontrado;
    }

    public UsuarioModel selecionarADM(UsuarioModel usuario) {
         String sql = "SELECT id,nome FROM usuarios WHERE id = ? AND nome = ?;";
        UsuarioModel modeloEncontrado = null;
        Conexao.conectar();
        
    
            try{
        PreparedStatement sentenca = Conexao.con.prepareStatement(sql);
        sentenca.setInt(1, usuario.getId());
        sentenca.setString(2, usuario.getNome());
        ResultSet resultado = sentenca.executeQuery();
        
        if(resultado.next()) {
            modeloEncontrado = new UsuarioModel();
            modeloEncontrado.setId(resultado.getInt("id"));
            modeloEncontrado.setNome(resultado.getString("nome"));
        }
            
            
            
            
            
        }
        
        catch(SQLException e){
            System.out.println("Erro na sentença SQL de seleção--: "+ e.getMessage());
        }
        
         
        Conexao.desconectar();
        return modeloEncontrado;

    }


  
     
    

    
    
    
    
    
    
    
}
