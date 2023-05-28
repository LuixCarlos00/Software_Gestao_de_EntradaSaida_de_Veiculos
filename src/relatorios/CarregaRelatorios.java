///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package relatorios;
//
//import java.io.File;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import net.sf.jasperreports.engine.JRException;
//import net.sf.jasperreports.engine.JasperCompileManager;
//import net.sf.jasperreports.engine.JasperExportManager;
//import net.sf.jasperreports.engine.JasperFillManager;
//import net.sf.jasperreports.engine.JasperPrint;
//import net.sf.jasperreports.engine.JasperReport;
//import net.sf.jasperreports.view.JasperViewer;
//import util.Conexao;
//
///**
// *
// * @author cristinamaria
// */
//public class CarregaRelatorios {
//    
//    //public void gerarRelatorio(String relatorio, Map<String,Object> parameters)
//    public void gerarRelatorio(String relatorio, String parametro) {
//        try {
//            Conexao conexao = new Conexao();
//            conexao.conectar();
//            //CARREGA JRXML
//            JasperReport jasperReport = JasperCompileManager.compileReport(new File(relatorio).getAbsolutePath());
//            
//            //PASSAGEM DE PARAMETROS
//            Map<String, Object> parameters = new HashMap<>();
//            if(!parametro.equals(""))
//                parameters.put("valor", Integer.parseInt(parametro));
//            
//            //COMPILA EM ARQUIVO JASPER
//            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, conexao.con);
//            
//            //ABRE JANELA DE VISUALIZAÇÃO
//            JasperViewer viewer = new JasperViewer(jasperPrint, true);
//            viewer.setVisible(true);
//            
//            //EXPORTA ARQUIVO JASPER EM PDF - SE FOR NECESSARIO!
//           // JasperExportManager.exportReportToPdfFile(jasperPrint, "Relatorio.pdf");
//            
//        } catch (JRException ex) {
//            Logger.getLogger(CarregaRelatorios.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//}
