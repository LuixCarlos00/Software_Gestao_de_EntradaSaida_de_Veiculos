/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.RequisicaoModel;
import util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author luixc
 */
public class RequisicaoControlle {
    
    
     public boolean salvarItens(RequisicaoModel requisicaoMode){
        boolean retorno = false;
        //CRIAR STRING SQL
        //INSERT INTO tabela (campos) VALUES (valores);
        String sql= "insert into requisicao (itens, quantidade, valor_unitario,empresa,veiculo,placa_veiculo,funcionario,data) values (?,?,?,?,?,?,?,?)";
        
        //CONECTAR COM BD
        Conexao conexao = new Conexao();
        conexao.conectar();
        
        
        try{
            //PASSAR PARAMENTRO PARA SENTENCA
            PreparedStatement sentenca = conexao.con.prepareStatement(sql);
            sentenca.setString(1, requisicaoMode.getItens());
            sentenca.setFloat(2, requisicaoMode.getQuantidade());
            sentenca.setFloat(3, requisicaoMode.getValorUnitario());
            sentenca.setString(4, requisicaoMode.getEmpresa());
            sentenca.setString(5, requisicaoMode.getVeiculo());
            sentenca.setString(6, requisicaoMode.getPlacaveiculo());
            sentenca.setString(7, requisicaoMode.getFuncionario());
            sentenca.setString(8, requisicaoMode.getdata());
            
            //EXECUTAR SENTENCA
            if(!sentenca.execute())
                retorno = true;
        }catch(SQLException e){
            System.out.println("Erro no inserir: "+ e.getMessage());
        }
               
        //ENCERRAR CONEXAO
        conexao.desconectar();
        return retorno;
    }
    
}
