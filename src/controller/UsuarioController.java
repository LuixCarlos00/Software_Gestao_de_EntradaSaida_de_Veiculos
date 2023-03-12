/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.UsuarioModel;
import util.Conexao;


/**
 *
 * @author luixc
 */
public class UsuarioController {
    
    
     public static boolean inserir (UsuarioModel usuario){
     String sql = "insert into usuarios (nome ,senha) values (?,?);";
    boolean retorno = false;
        Conexao.conectar();   
         try {
            PreparedStatement sentenca = Conexao.con.prepareStatement(sql);
            sentenca.setString(1, usuario.getLogin_usuario());
            sentenca.setString(2, usuario.getSenha_usuario());
           
            
            
            if (!sentenca.execute())
                retorno = true;
        }
        
        catch(SQLException e) {
            System.out.println("Erro ao  cadastra usuario no banco de dados no SQL \n" + e.getMessage());
        }
        
        Conexao.desconectar();
        return retorno;
        
    }
    
    public static boolean selecionar (UsuarioModel usuario){
    String sql = "select into cadastro_usuario(usuario,senha) values (?,?);";
         return false;
    
    }
     
    
    
    
    
    
    
    
    
    
}
