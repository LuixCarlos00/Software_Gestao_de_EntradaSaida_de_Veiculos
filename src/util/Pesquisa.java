package util;

import controller.EmpresasController;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

import model.FuncionarioModel;
import controller.FuncionarioController;
import controller.MovimentacaoController;
import controller.RequisicaoControlle;

import model.VeiculoModel;
import controller.VeiculoController;
import model.EmpresasModel;
import model.MovimentacaoModel;
import model.RequisicaoModel;

import util.JOptionPaneCustom;

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
                    String idBusca = JOptionPaneCustom.showInputDialog("Digite o ID do funcionário (número inteiro positivo):", "Pesquisa por ID").trim();
                    if (idBusca == null || idBusca.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Operação Cancelada");
                    } else {
                        try {
                            int id = Integer.parseInt(idBusca);

                            if (idBusca.length() > 0 && id > 0) {
                                funcionario.setId(id);
                                FuncionarioModel funcionario_encontrado = funcionarioController.selecionarID(funcionario);

                                List<FuncionarioModel> lista = new ArrayList<>();;
                                if (funcionario_encontrado != null) {
                                    lista.add(funcionario_encontrado);
                                }
                                return lista;
                            } else {
                                JOptionPane.showMessageDialog(null, "O ID digitado deve ser um número inteiro positivo.");
                            }
                        } catch (NumberFormatException n) {
                            JOptionPane.showMessageDialog(null, "O ID digitado deve ser um número inteiro positivo.");
                        }
                    }
                }
                break;

                case "CPF": {
                    String cpfBusca = JOptionPaneCustom.showInputDialog("Digite o CPF do funcionário (formato xxx.xxx.xxx-xx):", "Pesquisa por CPF").trim();
                    if (cpfBusca == null || cpfBusca.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Operação Cancelada");
                    } else {
                        if (cpfBusca.length() == 14) {
                            funcionario.setCPF(cpfBusca);
                            FuncionarioModel funcionario_encontrado = funcionarioController.selecionarCPF(funcionario);

                            List<FuncionarioModel> lista = new ArrayList<>();;
                            if (funcionario_encontrado != null) {
                                lista.add(funcionario_encontrado);
                            }
                            return lista;
                        } else {
                            JOptionPane.showMessageDialog(null, "O CPF deve conter exatamente 14 caracteres (inclua os pontos e traços na busca).");
                        }
                    }
                }
                break;

                case "Nome": {
                    String nomeBusca = JOptionPaneCustom.showInputDialog("Digite o nome do funcionário: ", "Pesquisa por nome").trim();
                    if (nomeBusca == null || nomeBusca.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Operação Cancelada");
                    } else {
                        if (nomeBusca.length() > 0 && nomeBusca.matches("[a-zA-Z]+")) {
                            funcionario.setNome(nomeBusca);
                            List<FuncionarioModel> lista = funcionarioController.selecionarNome(funcionario);
                            return lista;
                        } else {
                            JOptionPane.showMessageDialog(null, "O nome digitado não é valido.");
                        }
                    }
                }
                break;

                case "Setor": {

                    String setorBusca = JOptionPaneCustom.showInputDialog("Digite o setor do funcionário:", "Pesquisa por setor").trim();
                    if (setorBusca == null || setorBusca.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Operação Cancelada");
                    } else {
                        if (setorBusca.length() > 0 && setorBusca.matches("[a-zA-ZçÇáÁéÉíÍóÓúÚâÂêÊôÔûÛãÃõÕàÀèÈìÌòÒùÙ]+")) {
                            funcionario.setSetor(setorBusca);
                            List<FuncionarioModel> lista = funcionarioController.selecionarSetor(funcionario);
                            return lista;
                        } else {
                            JOptionPane.showMessageDialog(null, "O setor digitado não é válido.");
                        }
                    }
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
                    if (idBusca == null || idBusca.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Operação Cancelada");
                    } else {
                        try {
                            int id = Integer.parseInt(idBusca);

                            if (idBusca.length() > 0 && id > 0) {
                                veiculo.setId(id);
                                VeiculoModel veiculo_encontrado = veiculoController.selecionarID(veiculo);

                                List<VeiculoModel> lista = new ArrayList<>();;
                                if (veiculo_encontrado != null) {
                                    lista.add(veiculo_encontrado);
                                }
                                return lista;
                            } else {
                                JOptionPane.showMessageDialog(null, "O ID digitado deve ser um número inteiro positivo.");
                            }
                        } catch (NumberFormatException n) {
                            JOptionPane.showMessageDialog(null, "O ID digitado deve ser um número inteiro positivo.");
                        }
                    }
                }
                break;

                case "Placa": {
                    String placaBusca = JOptionPaneCustom.showInputDialog("Digite a placa do veículo (sem o traço):", "Pesquisa por placa").trim();
                    if (placaBusca == null || placaBusca.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Operação Cancelada");
                    } else {
                        if (placaBusca.length() == 7 /* && !placaBusca.matches("^[a-zA-Z0-9_]{3}-[a-zA-Z0-9_]{4}$") */) {
                            veiculo.setPlaca(placaBusca);
                            VeiculoModel veiculo_encontrado = veiculoController.selecionarPlaca(veiculo);

                            List<VeiculoModel> lista = new ArrayList<>();;
                            if (veiculo_encontrado != null) {
                                lista.add(veiculo_encontrado);
                            }
                            return lista;
                        } /*
                    // Verifica se o usuário cancelou a operação
                    else if (placaBusca == null || placaBusca.isEmpty() || placaBusca == IS_CLOSED_PROPERTY) 
                        JOptionPane.showMessageDialog(null, "Operação Cancelada");
                         */ else {
                            JOptionPane.showMessageDialog(null, "A placa digitada deve ter 7 caracteres.");
                        }
                    }
                }
                break;

                case "Marca": {
                    String marcaBusca = JOptionPaneCustom.showInputDialog("Digite a marca do veículo ", "Pesquisa por Marca ").trim();
                    if (marcaBusca == null || marcaBusca.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Operação Cancelada");
                    } else {
                        if (marcaBusca.length() > 0 && marcaBusca.matches("[a-zA-Z]+")) {
                            veiculo.setMarca(marcaBusca);
                            List<VeiculoModel> veiculo_encontrado = veiculoController.selecionarMarca(veiculo);
                            return veiculo_encontrado;
                        } else {
                            JOptionPane.showMessageDialog(null, "A marca digitada não é valida.");
                        }
                    }
                }
                break;

                case "Modelo": {
                    String modeloBusca = JOptionPaneCustom.showInputDialog("Digite o modelo do veiculo ", "Pesquisa por Modelo ").trim();
                    if (modeloBusca == null || modeloBusca.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Operação Cancelada");
                    } else {
                        if (modeloBusca.length() > 0 && modeloBusca.matches("[a-zA-Z]+")) {//verificar se tem apenas letras no campo
                            veiculo.setModelo(modeloBusca);
                            List<VeiculoModel> veiculo_encontrado = veiculoController.selecionarModelo(veiculo);
                            return veiculo_encontrado;
                        } else {
                            JOptionPane.showMessageDialog(null, "O Modelo digitado não é valido.");
                        }
                    }
                }
                break;

                case "Ano": {
                    String anoBusca = JOptionPaneCustom.showInputDialog("Digite o Ano do veículo", "Pesquisa por Ano").trim();
                    if (anoBusca == null || anoBusca.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Operação Cancelada");
                    } else {
                        try {
                            int ano = Integer.parseInt(anoBusca);
                            if (ano > 0) {
                                veiculo.setAno(ano);
                                List<VeiculoModel> veiculoEncontrado = veiculoController.selecionarAno(veiculo);
                                return veiculoEncontrado;
                            } else {
                                JOptionPane.showMessageDialog(null, "O ano deve ser um número inteiro positivo.");
                            }
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null, "O ano deve ser um número inteiro positivo.");
                        }
                    }
                }
                break;

                case "Status": {
                    String statusBusca = JOptionPaneCustom.showInputDialog("Informe o status do veículo (DISPONIVEL ou OCUPADO):", "Pesquisa por Status").trim();
                    if (statusBusca == null || statusBusca.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Operação Cancelada");
                    } else {
                        if (statusBusca.length() > 0 && (statusBusca.equals("DISPONIVEL") || statusBusca.equals("OCUPADO"))) {
                            veiculo.setStatus(statusBusca);
                            List<VeiculoModel> veiculo_encontrado = veiculoController.selecionarStatus(veiculo);
                            return veiculo_encontrado;
                        } else {
                            JOptionPane.showMessageDialog(null, "O status digitado não é válido.");
                        }
                    }
                }
                break;
            }
        }
        return null;
    }

    public List<EmpresasModel> pesquisaEmpresas(String[] opcoesBuscaEmpresa) {
        EmpresasController controller = new EmpresasController();
        EmpresasModel Model = new EmpresasModel();

        int escolha = JOptionPane.showOptionDialog(null, "Escolha o tipo de pesquisa:", "Pesquisa de Empresas ",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoesBuscaEmpresa, opcoesBuscaEmpresa[0]);

        if (escolha >= 0) { //Se o usuário selecionou uma opção
            String opcaoBusca = opcoesBuscaEmpresa[escolha];

            switch (opcaoBusca) {
                case "ID": {
                    String idBusca = JOptionPaneCustom.showInputDialog("Digite o ID do veículo (número inteiro positivo):", "Pesquisa por ID").trim();
                    if (idBusca == null || idBusca.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Operação Cancelada");
                    } else {
                        try {
                            int id = Integer.parseInt(idBusca);

                            if (idBusca.length() > 0 && id > 0) {
                                Model.setId(id);
                                EmpresasModel empresasModel = controller.selecionarID(Model);

                                List<EmpresasModel> lista = new ArrayList<>();;
                                if (empresasModel != null) {
                                    lista.add(empresasModel);
                                }
                                return lista;
                            } else {
                                JOptionPane.showMessageDialog(null, "O ID digitado deve ser um número inteiro positivo.");
                            }
                        } catch (NumberFormatException n) {
                            JOptionPane.showMessageDialog(null, "O ID digitado deve ser um número inteiro positivo.");
                        }
                    }
                }
                break;

                case "CNPJ": {
                    String cnpjBusca = JOptionPaneCustom.showInputDialog("Digite o CNPJ da Empresa (formato xx.xxx.xxx/xxxx-xx):", "Pesquisa por CNPJ").trim();
                    if (cnpjBusca == null || cnpjBusca.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Operação Cancelada");
                    } else {
                        if (cnpjBusca.length() == 18) {
                            Model.setCnpj(cnpjBusca);
                            EmpresasModel empresa = controller.selecionarCNPJ(Model);

                            List<EmpresasModel> lista = new ArrayList<>();;
                            if (empresa != null) {
                                lista.add(empresa);
                            }
                            return lista;
                        } else {
                            JOptionPane.showMessageDialog(null, "O CNPJ deve conter exatamente 18 caracteres (inclua os pontos e traços na busca).");
                        }
                    }
                }
                break;

                case "Nome": {
                    String nomeBusca = JOptionPaneCustom.showInputDialog("Digite o nome da Empresa: ", "Pesquisa por nome").trim();
                    if (nomeBusca == null || nomeBusca.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Operação Cancelada");
                    } else {
                        if (nomeBusca.length() > 0 && nomeBusca.matches("[a-zA-Z]+")) {
                            Model.setNomeEmpresa(nomeBusca);
                            List<EmpresasModel> lista = controller.selecionarNome(Model);
                            return lista;
                        } else {
                            JOptionPane.showMessageDialog(null, "O nome digitado não é valido.");
                        }
                    }
                }
                break;

                case "UF": {

                    String BuscaUF = JOptionPaneCustom.showInputDialog("Digite o UF da Empresa:", "Pesquisa por UF").trim();
                    if (BuscaUF == null || BuscaUF.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Operação Cancelada");
                    } else {
                        if (BuscaUF.length() > 0 && BuscaUF.matches("[a-zA-ZçÇáÁéÉíÍóÓúÚâÂêÊôÔûÛãÃõÕàÀèÈìÌòÒùÙ]+")) {
                            Model.setUf(BuscaUF);
                            List<EmpresasModel> lista = controller.selecionarUF(Model);
                            return lista;
                        } else {
                            JOptionPane.showMessageDialog(null, "O UF digitado não é válido.");
                        }
                    }
                }
                break;
            }
        }
        return null;
    }
   
    public List<RequisicaoModel> pesquisaRequisicao(String[] opcoesBuscaRequisicao) {
        
        RequisicaoControlle controlle = new RequisicaoControlle();
        RequisicaoModel Model = new RequisicaoModel();

        int escolha = JOptionPane.showOptionDialog(null, "Escolha o tipo de pesquisa:", "Pesquisa de Requisição ",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoesBuscaRequisicao, opcoesBuscaRequisicao[0]);

        if (escolha >= 0) { //Se o usuário selecionou uma opção
            String opcaoBusca = opcoesBuscaRequisicao[escolha];

            switch (opcaoBusca) {
                case "ID": {
                    String idBusca = JOptionPaneCustom.showInputDialog("Digite o ID da Requisição (número inteiro positivo):", "Pesquisa por ID").trim();
                    if (idBusca == null || idBusca.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Operação Cancelada");
                    } else {
                        try {
                            int id = Integer.parseInt(idBusca);

                            if (idBusca.length() > 0 && id > 0) {
                                Model.setId(id);
                                RequisicaoModel requisicaoModel = controlle.selecionarID(Model);

                                List<RequisicaoModel> lista = new ArrayList<>();;
                                if (requisicaoModel != null) {
                                    lista.add(requisicaoModel);
                                }
                                return lista;
                            } else {
                                JOptionPane.showMessageDialog(null, "O ID digitado deve ser um número inteiro positivo.");
                            }
                        } catch (NumberFormatException n) {
                            JOptionPane.showMessageDialog(null, "O ID digitado deve ser um número inteiro positivo.");
                        }
                    }
                }
                break;

                case "Placa": {
                    String PlacaBusca = JOptionPaneCustom.showInputDialog("Digite a Placa do veiculo (formato XXXXXXX):", "Pesquisa por Placa").trim();
                    if (PlacaBusca == null || PlacaBusca.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Operação Cancelada");
                    } else {
                        if (PlacaBusca.length() == 7) {
                            Model.setPlacaveiculo(PlacaBusca);
                           
                            List<RequisicaoModel> lista = controlle.selecionarPlacaVeiculo(Model);
                           
                            return lista;
                        } else {
                            JOptionPane.showMessageDialog(null, "a Placa deve conter exatamente 7 caracteres .");
                        }
                    }
                }
                break;

                case "Empresa": {
                    String nomeBusca = JOptionPaneCustom.showInputDialog("Digite o nome da Empresa: ", "Pesquisa por nome").trim();
                    if (nomeBusca == null || nomeBusca.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Operação Cancelada");
                    } else {
                        if (nomeBusca.length() > 0 && nomeBusca.matches("[a-zA-Z]+")) {
                            Model.setEmpresa(nomeBusca);
                            List<RequisicaoModel> lista = controlle.selecionarNome(Model);
                            return lista;
                        } else {
                            JOptionPane.showMessageDialog(null, "O nome digitado não é valido.");
                        }
                    }
                }
                break;

                case "Data": {

                    String DataBusca = JOptionPaneCustom.showInputDialog("Digite a Data Formato(##/##/####)", "Pesquisa por Data").trim();
                    if (DataBusca == null || DataBusca.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Operação Cancelada");
                    } else {
                        if (DataBusca.length() == 10) {
                            Model.setData(DataBusca);
                            List<RequisicaoModel> lista = controlle.selecionarData(Model);
                            return lista;
                        } else {
                            JOptionPane.showMessageDialog(null, "O campo Data deve conter 10 caracters(inclua os pontos e traços na busca).");
                        }
                    }
                }
                break;
            }
        }
        return null;
    }

    public List<MovimentacaoModel> pesquisaMovimentacao(String[] opcoesBusca) {
        MovimentacaoController movController = new MovimentacaoController();
        MovimentacaoModel movimentacao = new MovimentacaoModel();

        int escolha = JOptionPane.showOptionDialog(null, "Escolha o tipo de pesquisa:", "Pesquisa de Movimentações",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoesBusca, opcoesBusca[0]);

        if (escolha >= 0) { //Se o usuário selecionou uma opção
            String opcaoBusca = opcoesBusca[escolha];

            switch (opcaoBusca) {

                case "ID": {
                    String idBusca = JOptionPaneCustom.showInputDialog("Digite o ID da movimentação (número inteiro positivo):", "Pesquisa por ID").trim();
                    if (idBusca == null || idBusca.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Operação Cancelada");
                    } else {
                        try {
                            int id = Integer.parseInt(idBusca);

                            if (idBusca.length() > 0 && id > 0) {
                                movimentacao.setId(id);
                                MovimentacaoModel mov_encontrada = movController.selecionar(movimentacao);

                                List<MovimentacaoModel> lista = new ArrayList<>();;
                                if (mov_encontrada != null) {
                                    lista.add(mov_encontrada);
                                }
                                return lista;
                            } else {
                                JOptionPane.showMessageDialog(null, "O ID digitado deve ser um número inteiro positivo.");
                            }
                        } catch (NumberFormatException n) {
                            JOptionPane.showMessageDialog(null, "O ID digitado deve ser um número inteiro positivo.");
                        }
                    }
                }
                break;
                              
                case "Veiculo": {
                    String idBusca = JOptionPaneCustom.showInputDialog("Digite o ID do veículo (número inteiro positivo):", "Pesquisa por veículo").trim();
                    if (idBusca == null || idBusca.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Operação Cancelada");
                    } else {
                        try {
                            int id = Integer.parseInt(idBusca);

                            if (idBusca.length() > 0 && id > 0) {
                                movimentacao.setIdVeiculo(id);
                                List<MovimentacaoModel> lista = movController.selecionarVeiculo(movimentacao);
                                return lista;
                            } else {
                                JOptionPane.showMessageDialog(null, "O ID digitado deve ser um número inteiro positivo.");
                            }
                        } catch (NumberFormatException n) {
                            JOptionPane.showMessageDialog(null, "O ID digitado deve ser um número inteiro positivo.");
                        }
                    }
                }
                break;
                
                case "Data": {
                    String dataBusca = JOptionPaneCustom.showInputDialog("Digite a data das movimentações (formato XX/XX/XXXX):", "Pesquisa por data").trim();
                    if (dataBusca == null || dataBusca.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Operação Cancelada");
                    } else {
                        if (dataBusca.length() == 10) {
                            movimentacao.setData(dataBusca); 

                            List<MovimentacaoModel> lista = movController.selecionarData(movimentacao);
                            return lista;
                        } 
                        
                        else {
                            JOptionPane.showMessageDialog(null, "A data digitada deve ter 10 caracteres.");
                        }
                    }
                }
                break;
                
            }
        }
        return null;
    }
    
    
    
    
    
    
    
    
}

