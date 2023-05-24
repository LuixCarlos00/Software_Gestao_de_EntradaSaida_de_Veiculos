package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.MovimentacaoModel;
import util.Conexao;

/**
 *
 * @author Talles
 */
public class MovimentacaoController {
    
    public boolean inserir(MovimentacaoModel movimentacao) {
        String sql = "INSERT INTO movimentacoes (tipo,id_veiculo,id_funcionario,data,hora,destino,quilometragem) VALUES (?,?,?,?,?,?,?);";
        boolean retorno = false;
        Conexao.conectar();
        
        try {
            PreparedStatement sentenca = Conexao.con.prepareStatement(sql);
            sentenca.setString(1, movimentacao.getTipo());
            sentenca.setInt(2, movimentacao.getIdVeiculo());
            sentenca.setInt(3, movimentacao.getIdFuncionario());
            sentenca.setString(4, movimentacao.getData());
            sentenca.setString(5, movimentacao.getHora());
            sentenca.setString(6, movimentacao.getDestino());
            sentenca.setFloat(7, movimentacao.getQuilometragem());
            if (!sentenca.execute())
                retorno = true;
        }
        
        catch(SQLException e) {
            System.out.println("Erro na sentença SQL de inserção.\n" + e.getMessage());
        }
        
        Conexao.desconectar();
        return retorno;
    }
    
    public MovimentacaoModel selecionar(MovimentacaoModel movimentacao){
        String sql = "SELECT * FROM movimentacoes WHERE id = ?;";
        MovimentacaoModel modeloEncontrado = null;
        Conexao.conectar();
        
        try{
            PreparedStatement sentenca = Conexao.con.prepareStatement(sql);
            sentenca.setInt(1, movimentacao.getId());
            ResultSet resultado = sentenca.executeQuery();
            
            if(resultado.next()) {
                modeloEncontrado = new MovimentacaoModel();
                modeloEncontrado.setId(resultado.getInt("id"));
                modeloEncontrado.setTipo(resultado.getString("tipo"));
                modeloEncontrado.setIdVeiculo(resultado.getInt("id_veiculo"));
                modeloEncontrado.setIdFuncionario(resultado.getInt("id_funcionario"));
                modeloEncontrado.setData(resultado.getString("data"));
                modeloEncontrado.setHora(resultado.getString("hora"));
                modeloEncontrado.setDestino(resultado.getString("destino"));
                modeloEncontrado.setQuilometragem(resultado.getInt("quilometragem"));
            }
            
        }
        
        catch(SQLException e){
            System.out.println("Erro na sentença SQL de seleção: "+ e.getMessage());
        }
        
        Conexao.desconectar();
        return modeloEncontrado;
    }
 
    public boolean editar(MovimentacaoModel movimentacao) {
        String sql = "UPDATE movimentacoes SET data = ?, hora = ?, destino = ?, quilometragem = ? WHERE id = ?;";
        boolean retorno = false;
        Conexao.conectar();
        
         try{
            PreparedStatement sentenca = Conexao.con.prepareStatement(sql);
            sentenca.setString(1, movimentacao.getData());
            sentenca.setString(2, movimentacao.getHora());
            sentenca.setString(3, movimentacao.getDestino());
            sentenca.setInt(4, movimentacao.getQuilometragem());
            sentenca.setInt(5, movimentacao.getId());
            
            if (!sentenca.execute())
                retorno = true;
        }
        
        catch(SQLException e) {
            System.out.println("Erro na sentença SQL de edição.\n" + e.getMessage());
        }
        
        Conexao.desconectar();
        return retorno;
    }
    
    public boolean excluir(MovimentacaoModel movimentacao) {
        String sql = "DELETE FROM movimentacoes WHERE id = ?;";
        boolean retorno = false;
        Conexao.conectar();
        
        try{
            PreparedStatement sentenca = Conexao.con.prepareStatement(sql);
            sentenca.setInt(1, movimentacao.getId());
            if (!sentenca.execute())
                retorno = true;
        }
        
        catch(SQLException e) {
            System.out.println("Erro na sentença SQL de exclusão.\n" + e.getMessage());
        }
        
        Conexao.desconectar();
        return retorno;
    }
    
    public ArrayList <MovimentacaoModel> selecionarTodos() {
        ArrayList<MovimentacaoModel> movimentacoes = new ArrayList<>();
        String sql = "SELECT * FROM movimentacoes";
        Conexao.conectar();
        
        try {
            PreparedStatement sentenca = Conexao.con.prepareStatement(sql);
            ResultSet resultado = sentenca.executeQuery();
            
            while(resultado.next()) {
                MovimentacaoModel modelo = new MovimentacaoModel();
                modelo.setId(resultado.getInt("id"));
                modelo.setTipo(resultado.getString("tipo"));
                modelo.setIdVeiculo(resultado.getInt("id_veiculo"));
                modelo.setIdFuncionario(resultado.getInt("id_funcionario"));
                modelo.setData(resultado.getString("data"));
                modelo.setHora(resultado.getString("hora"));
                modelo.setDestino(resultado.getString("destino"));
                modelo.setQuilometragem(resultado.getInt("quilometragem"));
                movimentacoes.add(modelo);
            }
        }
        
        catch(SQLException e) {
            System.out.println("Erro na sentença SQL de seleção.\n" + e.getMessage());
        }
        
        Conexao.desconectar();
        return movimentacoes;
    }
    
}