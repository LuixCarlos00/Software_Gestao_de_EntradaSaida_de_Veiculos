/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import model.RequisicaoModel;
import util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author luixc
 */
public class RequisicaoControlle {

    public boolean salvarItens(RequisicaoModel requisicaoMode) {
        boolean retorno = false;
        //CRIAR STRING SQL
        //INSERT INTO tabela (campos) VALUES (valores);
        String sql = "insert into requisicao (itens, quantidade, valor_unitario,empresa,veiculo,placa_veiculo,funcionario,data) values (?,?,?,?,?,?,?,?)";

        //CONECTAR COM BD
        Conexao conexao = new Conexao();
        conexao.conectar();

        try {
            //PASSAR PARAMENTRO PARA SENTENCA
            PreparedStatement sentenca = conexao.con.prepareStatement(sql);
            sentenca.setString(1, requisicaoMode.getItens());
            sentenca.setFloat(2, requisicaoMode.getQuantidade());
            sentenca.setFloat(3, requisicaoMode.getValorUnitario());
            sentenca.setString(4, requisicaoMode.getEmpresa());
            sentenca.setString(5, requisicaoMode.getVeiculo());
            sentenca.setString(6, requisicaoMode.getPlacaveiculo());
            sentenca.setString(7, requisicaoMode.getFuncionario());
            sentenca.setString(8, requisicaoMode.getData());

            //EXECUTAR SENTENCA
            if (!sentenca.execute()) {
                retorno = true;
            }
        } catch (SQLException e) {
            System.out.println("Erro no inserir: " + e.getMessage());
        }

        //ENCERRAR CONEXAO
        conexao.desconectar();
        return retorno;
    }

    
    
    
    public boolean inserir(RequisicaoModel requisicaoMode) {

        String sql = "insert into requisicao (itens, quantidade, valor_unitario,empresa,veiculo,placa_veiculo,funcionario,data) values (?,?,?,?,?,?,?,?)";
        boolean retorno = false;
        Conexao.conectar();

        try {
              PreparedStatement sentenca = Conexao.con.prepareStatement(sql);
            sentenca.setString(1, requisicaoMode.getItens());
            sentenca.setFloat(2, requisicaoMode.getQuantidade());
            sentenca.setFloat(3, requisicaoMode.getValorUnitario());
            sentenca.setString(4, requisicaoMode.getEmpresa());
            sentenca.setString(5, requisicaoMode.getVeiculo());
            sentenca.setString(6, requisicaoMode.getPlacaveiculo());
            sentenca.setString(7, requisicaoMode.getFuncionario());
            sentenca.setString(8, requisicaoMode.getData());

            if (!sentenca.execute()) {
                retorno = true;
            }
        } catch (SQLException e) {
            System.out.println("Erro ao inserir dados no SQL.\n" + e.getMessage());
        }

        Conexao.desconectar();
        return retorno;

    }
    
    
     public List<RequisicaoModel> selecionarNome(RequisicaoModel requisicaoModel) {
        String sql = "select * from requisicao where empresa like ?;";
        List<RequisicaoModel> nomesEncontrado = new ArrayList<>();
        Conexao.conectar();

        try {
            PreparedStatement sentenca = Conexao.con.prepareStatement(sql);
            sentenca.setString(1, "%" + requisicaoModel.getEmpresa()+ "%"); // adicionando % no início e fim do nome para pesquisar substrings
            ResultSet resultado = sentenca.executeQuery();

            while (resultado.next()) {
                RequisicaoModel nomeEncontrado = new RequisicaoModel();
                nomeEncontrado.setId(resultado.getInt("id"));
                nomeEncontrado.setItens(resultado.getString("itens"));
                nomeEncontrado.setQuantidade(Float.parseFloat(resultado.getString("quantidade")));
                nomeEncontrado.setValorUnitario(Float.parseFloat(resultado.getString("valor_unitario")));
                nomeEncontrado.setEmpresa(resultado.getString("empresa"));
                nomeEncontrado.setVeiculo(resultado.getString("veiculo"));
                nomeEncontrado.setPlacaveiculo(resultado.getString("placa_veiculo"));
                nomeEncontrado.setFuncionario(resultado.getString("funcionario"));
                nomeEncontrado.setData(resultado.getString("data"));
                
                nomesEncontrado.add(nomeEncontrado);
            }

        } catch (SQLException e) {
            System.out.println("Erro na sentença SQL de seleção: " + e.getMessage());
        }

        Conexao.desconectar();
        return nomesEncontrado;
    }
    
    public RequisicaoModel selecionarID(RequisicaoModel requisicaoModel) {
        String sql = "SELECT * FROM requisicao where ID = ?;";
        RequisicaoModel idencontrado = null;
        Conexao.conectar();

        try {
            PreparedStatement sentenca = Conexao.con.prepareStatement(sql);
            sentenca.setInt(1, requisicaoModel.getId());
            ResultSet resultado = sentenca.executeQuery();

            if (resultado.next()) {
                idencontrado = new RequisicaoModel();
                idencontrado.setId(resultado.getInt("id"));
                idencontrado.setItens(resultado.getString("itens"));
                idencontrado.setQuantidade(Float.parseFloat(resultado.getString("quantidade")));
                idencontrado.setValorUnitario(Float.parseFloat(resultado.getString("valor_unitario")));
                idencontrado.setEmpresa(resultado.getString("empresa"));
                idencontrado.setVeiculo(resultado.getString("veiculo"));
                idencontrado.setPlacaveiculo(resultado.getString("placa_veiculo"));
                idencontrado.setFuncionario(resultado.getString("funcionario"));
                idencontrado.setData(resultado.getString("data"));
            }

        } catch (SQLException e) {
            System.out.println("Erro na sentença SQL de seleção: " + e.getMessage());
        }

        Conexao.desconectar();
        return idencontrado;
    }
    
    

    public RequisicaoModel selecionarPlacaVeiculo(RequisicaoModel requisicaoModel) {
        String sql = "SELECT * FROM requisicao where placa_veiculo = ?;";
        RequisicaoModel idencontrado = null;
        Conexao.conectar();

        try {
            PreparedStatement sentenca = Conexao.con.prepareStatement(sql);
            sentenca.setString(1, requisicaoModel.getPlacaveiculo());
            ResultSet resultado = sentenca.executeQuery();

            if (resultado.next()) {
                idencontrado = new RequisicaoModel();
                idencontrado.setId(resultado.getInt("id"));
                idencontrado.setItens(resultado.getString("itens"));
                idencontrado.setQuantidade(Float.parseFloat(resultado.getString("quantidade")));
                idencontrado.setValorUnitario(Float.parseFloat(resultado.getString("valor_unitario")));
                idencontrado.setEmpresa(resultado.getString("empresa"));
                idencontrado.setVeiculo(resultado.getString("veiculo"));
                idencontrado.setPlacaveiculo(resultado.getString("placa_veiculo"));
                idencontrado.setFuncionario(resultado.getString("funcionario"));
                idencontrado.setData(resultado.getString("data"));
            }

        } catch (SQLException e) {
            System.out.println("Erro na sentença SQL de seleção: " + e.getMessage());
        }

        Conexao.desconectar();
        return idencontrado;
    }

    public ArrayList<RequisicaoModel> selecionarTodos() {
        ArrayList<RequisicaoModel> requisicaoModels = new ArrayList<>();
        String sql = "SELECT * FROM requisicao";
   
        Conexao.conectar();

        try {
            PreparedStatement sentenca = Conexao.con.prepareStatement(sql);
            ResultSet resultado = sentenca.executeQuery();

            while (resultado.next()) {
                RequisicaoModel modelo = new RequisicaoModel();
                modelo.setId(resultado.getInt("id"));
                modelo.setItens(resultado.getString("itens"));
                modelo.setQuantidade(Float.parseFloat(resultado.getString("quantidade")));
                modelo.setValorUnitario(Float.parseFloat(resultado.getString("valor_unitario")));
                modelo.setEmpresa(resultado.getString("empresa"));
                modelo.setVeiculo(resultado.getString("veiculo"));
                modelo.setPlacaveiculo(resultado.getString("placa_veiculo"));
                modelo.setFuncionario(resultado.getString("funcionario"));
                modelo.setData(resultado.getString("data"));
                requisicaoModels.add(modelo);
            }
        } catch (SQLException e) {
            System.out.println("Erro na sentença SQL de seleção.\n" + e.getMessage());
        }

        Conexao.desconectar();
        return requisicaoModels;
    }

    
    
      public boolean excluir(RequisicaoModel requisicaoModel) {
        String sql = "DELETE FROM requisicao WHERE id = ?;";
        boolean retorno = false;
        Conexao.conectar();

        try {
            PreparedStatement sentenca = Conexao.con.prepareStatement(sql);
            sentenca.setInt(1, requisicaoModel.getId());
            if (!sentenca.execute()) {
                retorno = true;
            }
        } catch (SQLException e) {
            System.out.println("Erro na sentença SQL de exclusão.\n" + e.getMessage());
        }

        Conexao.desconectar();
        return retorno;
    }
    
  
    
    public boolean editar(RequisicaoModel requisicaoModel) {
        String sql = "UPDATE requisicao SET itens = ?, quantidade = ?, valor_unitario = ? , empresa = ? , veiculo =? , placa_veiculo = ? , funcionario = ? , data =? WHERE id = ?;";
        boolean retorno = false;
        Conexao.conectar();

        try {
            PreparedStatement sentenca = Conexao.con.prepareStatement(sql);
            sentenca.setString(1, requisicaoModel.getItens());
            sentenca.setFloat(2, requisicaoModel.getQuantidade());
            sentenca.setFloat(3, requisicaoModel.getValorUnitario());
            sentenca.setString(4, requisicaoModel.getEmpresa());
            sentenca.setString(5, requisicaoModel.getVeiculo());
            sentenca.setString(6, requisicaoModel.getPlacaveiculo());
            sentenca.setString(7, requisicaoModel.getFuncionario());
            sentenca.setString(8, requisicaoModel.getData());
            
            
            
            
            sentenca.setInt(9, requisicaoModel.getId());

            if (!sentenca.execute()) {
                retorno = true;
            }
        } catch (SQLException e) {
            System.out.println("Erro na sentença SQL de edição.\n" + e.getMessage());
        }

        Conexao.desconectar();
        return retorno;
    }
    
    public List<RequisicaoModel> selecionarData (RequisicaoModel requisicaoModel) {
        String sql = "SELECT * FROM requisicao where data = ?;";
        List<RequisicaoModel> dataEncontrada = new ArrayList<>();        
        Conexao.conectar();

        try {
            PreparedStatement sentenca = Conexao.con.prepareStatement(sql);
            sentenca.setString(1, requisicaoModel.getData());
            ResultSet resultado = sentenca.executeQuery();

            if (resultado.next()) {
                RequisicaoModel idEncontrado = new RequisicaoModel();
                idEncontrado.setId(resultado.getInt("id"));
                idEncontrado.setItens(resultado.getString("itens"));
                idEncontrado.setQuantidade(Float.parseFloat(resultado.getString("quantidade")));
                idEncontrado.setValorUnitario(Float.parseFloat(resultado.getString("valor_unitario")));
                idEncontrado.setEmpresa(resultado.getString("empresa"));
                idEncontrado.setVeiculo(resultado.getString("veiculo"));
               idEncontrado.setPlacaveiculo(resultado.getString("placa_veiculo"));
                idEncontrado.setFuncionario(resultado.getString("funcionario"));
               idEncontrado.setData(resultado.getString("data"));
               dataEncontrada.add(idEncontrado);
               
            
            }

        } catch (SQLException e) {
            System.out.println("Erro na sentença SQL de seleção: " + e.getMessage());
        }

        Conexao.desconectar();
        return dataEncontrada;
    }

    
    
    public void gerarRelatorio(String placa) throws IOException {
        // Conectar ao banco de dados (exemplo usando JDBC)
        String sql = "SELECT * FROM requisicao WHERE placa_veiculo = ?";
        Conexao.conectar();

        try {
            // Consulta SQL para buscar os dados do veículo
            PreparedStatement statement = Conexao.con.prepareStatement(sql);
            statement.setString(1, placa);
            ResultSet resultSet = statement.executeQuery();

            // Criar documento PDF
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream("relatorio.pdf"));
            document.open();

            // Adicionar título do relatório
            document.add(new Paragraph("Relatório de Veículo"));

            // Verificar se existe um veículo com a placa fornecida
            while (resultSet.next())  {
                // Obter os valores dos campos do resultado da consulta
              
                int id = resultSet.getInt("id");
                String itens = resultSet.getString("itens");
                float quantidade = resultSet.getFloat("quantidade");
                float valorUnitario = resultSet.getFloat("valor_unitario");
                String empresa = resultSet.getString("empresa");
                String veiculo = resultSet.getString("veiculo");
                String placaVeiculo = resultSet.getString("placa_veiculo");
                String funcionario = resultSet.getString("funcionario");
                String data = resultSet.getString("data");

                // Adicionar informações do veículo ao relatório
                
                
                document.add(new Paragraph("\n\nID: " + id));
                document.add(new Paragraph("Itens: " + itens));
                document.add(new Paragraph("Quantidade: " + quantidade));
                document.add(new Paragraph("Valor Unitário: " + valorUnitario));
                document.add(new Paragraph("Empresa: " + empresa));
                document.add(new Paragraph("Veículo: " + veiculo));
                document.add(new Paragraph("Placa do Veículo: " + placaVeiculo));
                document.add(new Paragraph("Funcionário: " + funcionario));
                document.add(new Paragraph("Data: " + data));

                // Adicione aqui outros campos relevantes ao relatório, conforme necessário
            }
            float valorTotal = calcularValorTotal(placa);

            // Adicionar valor total ao relatório
            document.add(new Paragraph("\n\n\n\nValor Total: " + valorTotal));

            
            if(!resultSet.isBeforeFirst()) {
                // Caso não exista um veículo com a placa fornecida, adicione uma mensagem de erro ao relatório
                document.add(new Paragraph(" "));
            }

            // Fechar o documento
            document.close();

            // Fechar conexão com o banco de dados
            resultSet.close();
            statement.close();
            Conexao.desconectar();

            // Abrir o arquivo PDF
            try {
                File pdfFile = new File("relatorio.pdf");
                if (pdfFile.exists()) {
                    Desktop.getDesktop().open(pdfFile);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
   
    
      private float calcularValorTotal(String placa) {
    // Conectar ao banco de dados e calcular o valor total
    float valorTotal = 0;

    try {
        // Consulta SQL para buscar os dados do veículo
        String sql = "SELECT quantidade, valor_unitario FROM requisicao WHERE placa_veiculo = ?";
        PreparedStatement statement = Conexao.con.prepareStatement(sql);
        statement.setString(1, placa);
        ResultSet resultSet = statement.executeQuery();

        // Iterar sobre as linhas do resultado da consulta
        while (resultSet.next()) {
            float quantidade = resultSet.getFloat("quantidade");
            float valorUnitario = resultSet.getFloat("valor_unitario");

            // Calcular o valor total para cada registro
            float valorRegistro = quantidade * valorUnitario;

            // Somar ao valor total
            valorTotal += valorRegistro;
        }

        // Fechar o resultado e a declaração
        resultSet.close();
        statement.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return valorTotal;
}

    
    
    
    
}
