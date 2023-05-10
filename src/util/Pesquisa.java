package util;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import static javax.swing.JInternalFrame.IS_CLOSED_PROPERTY;

import model.FuncionarioModel;
import controller.FuncionarioController;

import model.VeiculoModel;
import controller.VeiculoController;

public class Pesquisa {
    
    public List<FuncionarioModel> pesquisaFuncionario(String[] opcoesBusca) {
        FuncionarioController funcionarioController = new FuncionarioController();
        FuncionarioModel funcionario = new FuncionarioModel();
        
        int escolha = JOptionPane.showOptionDialog(null, "Escolha o tipo de pesquisa:", "Pesquisa de Funcionários",
            JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoesBusca, opcoesBusca[0]);

        if (escolha >= 0) { //Se o usuário selecionou uma opção
            String opcaoBusca = opcoesBusca[escolha];

            switch (opcaoBusca) {
                case "ID": {
                    String idBusca = JOptionPaneCustom.showInputDialog("Digite o ID do funcionário (número inteiro positivo):","Pesquisa por ID").trim();
                    try {
                        int id = Integer.parseInt(idBusca);

                        if (idBusca.length() > 0 && id > 0) {
                            funcionario.setId(id);
                            FuncionarioModel funcionario_encontrado = funcionarioController.selecionarID(funcionario);
                            
                            List<FuncionarioModel> lista = new ArrayList<>();;
                            if (funcionario_encontrado != null) 
                                lista.add(funcionario_encontrado);
                            return lista;
                        }

                        else JOptionPane.showMessageDialog(null, "O ID digitado deve ser um número inteiro positivo.");
                    }
                    catch (NumberFormatException n) {
                        JOptionPane.showMessageDialog(null, "O ID digitado deve ser um número inteiro positivo.");
                    }
                  
                }
                break;

                case "CPF": {
                    String cpfBusca = JOptionPaneCustom.showInputDialog("Digite o CPF do funcionário (formato xxx.xxx.xxx-xx):","Pesquisa por CPF").trim();
                    
                    if (cpfBusca.length() == 14) {
                        funcionario.setCPF(cpfBusca);
                        FuncionarioModel funcionario_encontrado = funcionarioController.selecionarCPF(funcionario);
                        
                        List<FuncionarioModel> lista = new ArrayList<>();;
                        if (funcionario_encontrado != null) 
                            lista.add(funcionario_encontrado);
                        return lista;
                    }
                    else JOptionPane.showMessageDialog(null, "O CPF deve conter exatamente 14 caracteres (inclua os pontos e traços na busca).");

                }
                break;

                case "Nome": {
                    String nomeBusca = JOptionPaneCustom.showInputDialog("Digite o nome do funcionário: ","Pesquisa por nome").trim();

                    if (nomeBusca.length() > 0 && nomeBusca.matches("[a-zA-Z]+")) {
                        funcionario.setNome(nomeBusca); 
                        List<FuncionarioModel> lista = funcionarioController.selecionarNome(funcionario);
                        return lista;
                    }
                                        
                    else JOptionPane.showMessageDialog(null, "O nome digitado não é valido.");
                }
                break;
                
                case "Setor": {

                    String setorBusca = JOptionPaneCustom.showInputDialog("Digite o setor do funcionário:","Pesquisa por setor").trim();

                    if (setorBusca.length() > 0 && setorBusca.matches("[a-zA-ZçÇáÁéÉíÍóÓúÚâÂêÊôÔûÛãÃõÕàÀèÈìÌòÒùÙ]+")) {
                        funcionario.setSetor(setorBusca);
                        List<FuncionarioModel> lista = funcionarioController.selecionarSetor(funcionario);
                        return lista;
                    } 
                    else  JOptionPane.showMessageDialog(null, "O setor digitado não é válido.");
                }
                break;
            }
        }
        return null;
    }
    
    
    public List<VeiculoModel> pesquisaVeiculo(String[] opcoesBusca) {
        VeiculoController veiculoController = new VeiculoController();
        VeiculoModel veiculo = new VeiculoModel();

        int escolha = JOptionPane.showOptionDialog(null, "Escolha o tipo de pesquisa:", "Pesquisa de Veículos",
            JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoesBusca, opcoesBusca[0]);

        if (escolha >= 0) { //Se o usuário selecionou uma opção
            String opcaoBusca = opcoesBusca[escolha];

            switch (opcaoBusca) {
                                
                case "ID": {
                    String idBusca = JOptionPaneCustom.showInputDialog("Digite o ID do veículo (número inteiro positivo):", "Pesquisa por ID").trim();

                    try {
                        int id = Integer.parseInt(idBusca);
                        
                        if (idBusca.length() > 0 && id > 0) {
                            veiculo.setId(id);
                            VeiculoModel veiculo_encontrado = veiculoController.selecionarID(veiculo);
                            
                            List<VeiculoModel> lista = new ArrayList<>();;
                            if (veiculo_encontrado != null) 
                                lista.add(veiculo_encontrado);
                            return lista;
                        }
                        else JOptionPane.showMessageDialog(null, "O ID digitado deve ser um número inteiro positivo.");
                    }
                    catch (NumberFormatException n) {
                        JOptionPane.showMessageDialog(null, "O ID digitado deve ser um número inteiro positivo.");
                    }
                  
                }
                break;
                
                case "Placa": {
                    String placaBusca = JOptionPaneCustom.showInputDialog("Digite a placa do veículo (sem o traço):", "Pesquisa por placa").trim();

                    if (placaBusca.length() == 7 /* && !placaBusca.matches("^[a-zA-Z0-9_]{3}-[a-zA-Z0-9_]{4}$") */) {
                        veiculo.setPlaca(placaBusca);
                        VeiculoModel veiculo_encontrado = veiculoController.selecionarPlaca(veiculo);
                        
                        List<VeiculoModel> lista = new ArrayList<>();;
                        if (veiculo_encontrado != null) 
                            lista.add(veiculo_encontrado);
                        return lista;
                    }
                    /*
                    // Verifica se o usuário cancelou a operação
                    else if (placaBusca == null || placaBusca.isEmpty() || placaBusca == IS_CLOSED_PROPERTY) 
                        JOptionPane.showMessageDialog(null, "Operação Cancelada");
                    */
                    else JOptionPane.showMessageDialog(null, "A placa digitada deve ter 7 caracteres.");
                }
                break;
                
                case "Marca": {
                    String marcaBusca = JOptionPaneCustom.showInputDialog("Digite a marca do veículo ", "Pesquisa por Marca ").trim();

                    if (marcaBusca.length() > 0 && marcaBusca.matches("[a-zA-Z]+")) {
                        veiculo.setMarca(marcaBusca);
                        List<VeiculoModel> veiculo_encontrado = veiculoController.selecionarMarca(veiculo);
                        return veiculo_encontrado;
                    }

                    else JOptionPane.showMessageDialog(null, "A marca digitada não é valida.");
                }
                break;

                case "Modelo": {
                    String modeloBusca = JOptionPaneCustom.showInputDialog("Digite o modelo do veiculo ", "Pesquisa por Modelo ").trim();

                    if (modeloBusca.length() > 0 &&  modeloBusca.matches("[a-zA-Z]+")) {//verificar se tem apenas letras no campo
                        veiculo.setModelo(modeloBusca);
                        List<VeiculoModel> veiculo_encontrado = veiculoController.selecionarModelo(veiculo);
                        return veiculo_encontrado;
                    } 
                    
                    else JOptionPane.showMessageDialog(null, "O Modelo digitado não é valido.");
                }
                break;
                
                case "Ano": {
                    String anoBusca = JOptionPaneCustom.showInputDialog("Digite o Ano do veículo", "Pesquisa por Ano").trim();

                    try {
                        int ano = Integer.parseInt(anoBusca);
                        if (ano > 0) {
                            veiculo.setAno(ano);
                            List<VeiculoModel> veiculoEncontrado = veiculoController.selecionarAno(veiculo);
                            return veiculoEncontrado;
                        }
                        
                        else JOptionPane.showMessageDialog(null, "O ano deve ser um número inteiro positivo.");
                    } 
                    
                    catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "O ano deve ser um número inteiro positivo.");
                    }
                }
                break;
                
                case "Status": {
                    String statusBusca = JOptionPaneCustom.showInputDialog("Informe o status do veículo (DISPONIVEL ou OCUPADO):", "Pesquisa por Status").trim();

                    if (statusBusca.length() > 0 && (statusBusca.equals("DISPONIVEL") || statusBusca.equals("OCUPADO"))) {
                        veiculo.setStatus(statusBusca);
                        List<VeiculoModel> veiculo_encontrado = veiculoController.selecionarStatus(veiculo);
                        return veiculo_encontrado;
                    }
                    else JOptionPane.showMessageDialog(null, "O status digitado não é válido.");
                }
                break;
            }
        }
        return null;
    }

}