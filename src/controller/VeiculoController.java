package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.VeiculoModel;
import util.Conexao;

/*
 * @author Talles
 */

public class VeiculoController {
    
    public static boolean inserir(VeiculoModel veiculo) {
        String sql = "INSERT INTO veiculos (placa,marca,modelo,ano,status) VALUES (?,?,?,?,?);";
        boolean retorno = false;
        Conexao.conectar();
        
        try {
            PreparedStatement sentenca = Conexao.con.prepareStatement(sql);
            sentenca.setString(1, veiculo.getPlaca());
            sentenca.setString(2, veiculo.getMarca());
            sentenca.setString(3, veiculo.getModelo());
            sentenca.setInt(4, veiculo.getAno());
            sentenca.setString(5, "DISPONIVEL");
            if (!sentenca.execute())
                retorno = true;
        }
        
        catch(SQLException e) {
            System.out.println("Erro na sentença SQL de inserção.\n" + e.getMessage());
        }
        
        Conexao.desconectar();
        return retorno;
    }
    
    public static VeiculoModel selecionar(VeiculoModel veiculo){
        String sql = "SELECT * FROM veiculos WHERE id = ?;";
        VeiculoModel modeloEncontrado = null;
        Conexao.conectar();
        
        try{
            PreparedStatement sentenca = Conexao.con.prepareStatement(sql);
            sentenca.setInt(1, veiculo.getId());
            ResultSet resultado = sentenca.executeQuery();
            
            if(resultado.next()) {
                modeloEncontrado = new VeiculoModel();
                modeloEncontrado.setId(resultado.getInt("id"));
                modeloEncontrado.setPlaca(resultado.getString("placa"));
                modeloEncontrado.setMarca(resultado.getString("marca"));
                modeloEncontrado.setModelo(resultado.getString("modelo"));
                modeloEncontrado.setAno(resultado.getInt("ano"));
                modeloEncontrado.setStatus(resultado.getString("status"));
            }
            
        }
        
        catch(SQLException e){
            System.out.println("Erro na sentença SQL de seleção: "+ e.getMessage());
        }
        
        Conexao.desconectar();
        return modeloEncontrado;
    }
    
    public static boolean editar(VeiculoModel veiculo) {
        String sql = "UPDATE veiculos SET placa = ?, marca = ?, modelo = ?, ano = ? WHERE id = ?;";
        boolean retorno = false;
        Conexao.conectar();
        
         try{
            PreparedStatement sentenca = Conexao.con.prepareStatement(sql);
            sentenca.setString(1, veiculo.getPlaca());
            sentenca.setString(2, veiculo.getMarca());
            sentenca.setString(3, veiculo.getModelo());
            sentenca.setInt(4, veiculo.getAno());
            sentenca.setInt(5, veiculo.getId());
            if (!sentenca.execute())
                retorno = true;
        }
        
        catch(SQLException e) {
            System.out.println("Erro na sentença SQL de edição.\n" + e.getMessage());
        }
        
        Conexao.desconectar();
        return retorno;
    }
    
    public static boolean excluir(VeiculoModel veiculo) {
        String sql = "DELETE FROM veiculos WHERE id = ?;";
        boolean retorno = false;
        Conexao.conectar();
        
        try{
            PreparedStatement sentenca = Conexao.con.prepareStatement(sql);
            sentenca.setInt(1, veiculo.getId());
            if (!sentenca.execute())
                retorno = true;
        }
        
        catch(SQLException e) {
            System.out.println("Erro na sentença SQL de exclusão.\n" + e.getMessage());
        }
        
        Conexao.desconectar();
        return retorno;
    }
    
    public static ArrayList <VeiculoModel> selecionarTodos() {
        ArrayList<VeiculoModel> veiculos = new ArrayList<>();
        String sql = "SELECT * FROM veiculos";
        Conexao.conectar();
        
        try {
            PreparedStatement sentenca = Conexao.con.prepareStatement(sql);
            ResultSet resultado = sentenca.executeQuery();
            
            while(resultado.next()) {
                VeiculoModel modelo = new VeiculoModel();
                modelo.setId(resultado.getInt("id"));
                modelo.setPlaca(resultado.getString("placa"));
                modelo.setMarca(resultado.getString("marca"));
                modelo.setModelo(resultado.getString("modelo"));
                modelo.setAno(resultado.getInt("ano"));
                modelo.setStatus(resultado.getString("status"));
                veiculos.add(modelo);
            }
        }
        
        catch(SQLException e) {
            System.out.println("Erro na sentença SQL de seleção.\n" + e.getMessage());
        }
        
        Conexao.desconectar();
        return veiculos;
    }
    
}