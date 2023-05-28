///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package relatorios;
//import com.itextpdf.text.Document;
//import com.itextpdf.text.DocumentException;
//import com.itextpdf.text.Paragraph;
//import com.itextpdf.text.pdf.PdfWriter;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import model.RequisicaoModel;
//import view.Principal;
//import util.Conexao;
///**
// *
// * @author luixc
// */
//public class Relatorios {
//    
//    
//    
//    
//    public void gerarRelatorio(String placa) {
//        // Conectar ao banco de dados (exemplo usando JDBC)
//        try {
//            Connection connection = DriverManager.getConnection("jdbc:seu_banco_de_dados");
//
//            // Consulta SQL para buscar os dados do veículo
//            String sql = "SELECT id_veiculo, placa, ano, montadora FROM sua_tabela WHERE placa = ?";
//            PreparedStatement statement = connection.prepareStatement(sql);
//            statement.setString(1, placa);
//            ResultSet resultSet = statement.executeQuery();
//
//            // Criar documento PDF
//            Document document = new Document();
//            PdfWriter.getInstance(document, new FileOutputStream("relatorio.pdf"));
//            document.open();
//
//            // Adicionar título do relatório
//            document.add(new Paragraph("Relatório de Veículo"));
//
//            // Verificar se existe um veículo com a placa fornecida
//            if (resultSet.next()) {
//                // Obter os valores dos campos do resultado da consulta
//                int idVeiculo = resultSet.getInt("id_veiculo");
//                String placaVeiculo = resultSet.getString("placa");
//                int anoVeiculo = resultSet.getInt("ano");
//                String montadoraVeiculo = resultSet.getString("montadora");
//
//                // Adicionar informações do veículo ao relatório
//                document.add(new Paragraph("ID: " + idVeiculo));
//                document.add(new Paragraph("Placa: " + placaVeiculo));
//                document.add(new Paragraph("Ano: " + anoVeiculo));
//                document.add(new Paragraph("Montadora: " + montadoraVeiculo));
//
//                // Adicione aqui outros campos relevantes ao relatório, conforme necessário
//            } else {
//                // Caso não exista um veículo com a placa fornecida, adicione uma mensagem de erro ao relatório
//                document.add(new Paragraph("Não foi encontrado nenhum veículo com a placa informada."));
//            }
//
//            // Fechar o documento
//            document.close();
//
//            // Fechar conexão com o banco de dados
//            resultSet.close();
//            statement.close();
//            connection.close();
//        } catch (DocumentException e) {
//            e.printStackTrace();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//    
//}
