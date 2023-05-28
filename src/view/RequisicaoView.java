/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import controller.MovimentacaoController;
import controller.RequisicaoControlle;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.EmpresasModel;
import model.FuncionarioModel;
import model.MovimentacaoModel;
import model.RequisicaoModel;
import model.VeiculoModel;
import util.Pesquisa;

/**
 *
 * @author luixc
 */
public class RequisicaoView extends javax.swing.JInternalFrame {

    RequisicaoControlle controller = new RequisicaoControlle();

    boolean tabelaAtiva = true;

    public RequisicaoView() {
        initComponents();
        carregarTabela();

        texCampoPlaca.setEditable(false);
        textCampoVeiculo.setEditable(false);
        textCampoFuncionario.setEditable(false);
        textCampoEmpresa.setEditable(false);

        jbPesquisarEmpresa.setEnabled(false);
        JBPesquisarVeiculo.setEnabled(false);
        JBPesquisarFuncionario.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbNovo = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbPesquisarEmpresa = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jlTitulo1 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        textCampoEmpresa = new javax.swing.JTextField();
        JtfID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jbPesquisar1 = new javax.swing.JButton();
        JBPesquisarFuncionario = new javax.swing.JButton();
        texCampoPlaca = new javax.swing.JTextField();
        textCampoFuncionario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        JtfItens = new javax.swing.JTextField();
        JtfValorUnitario = new javax.swing.JTextField();
        JBPesquisarVeiculo = new javax.swing.JButton();
        JbAdicionar = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        textCampoVeiculo = new javax.swing.JTextField();
        textData = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaCompras = new javax.swing.JTable();
        JtfQuantidade1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });
        getContentPane().add(jbNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 76, -1));

        jbEditar.setText("Editar");
        jbEditar.setMinimumSize(null);
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });
        getContentPane().add(jbEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 76, -1));

        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(jbExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 80, -1));

        jbPesquisarEmpresa.setText("Pesquisar");
        jbPesquisarEmpresa.setMaximumSize(new java.awt.Dimension(72, 22));
        jbPesquisarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarEmpresaActionPerformed(evt);
            }
        });
        getContentPane().add(jbPesquisarEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 90, -1));

        jbLimpar.setText("Limpar");
        jbLimpar.setMinimumSize(null);
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });
        getContentPane().add(jbLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 80, -1));

        jbCancelar.setText("Cancelar");
        jbCancelar.setMaximumSize(new java.awt.Dimension(72, 22));
        jbCancelar.setMinimumSize(null);
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jbCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 80, -1));

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1000, 10));

        jLabel2.setText("Nome da Empresa:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 110, 30));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 10));

        jlTitulo1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        jlTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo1.setText("Compras");
        jlTitulo1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, -1));

        jSeparator5.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 10, 680));
        getContentPane().add(textCampoEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 220, -1));

        JtfID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtfIDActionPerformed(evt);
            }
        });
        getContentPane().add(JtfID, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 40, -1));

        jLabel1.setText("Nome do Veiculo:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, 20));

        jLabel5.setText("Nome Funcionario");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, -1, 30));

        jbPesquisar1.setText("Pesquisar");
        jbPesquisar1.setMaximumSize(new java.awt.Dimension(72, 22));
        jbPesquisar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisar1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbPesquisar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 80, -1));

        JBPesquisarFuncionario.setText("Pesquisar");
        JBPesquisarFuncionario.setMaximumSize(new java.awt.Dimension(72, 22));
        JBPesquisarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPesquisarFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(JBPesquisarFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, -1, -1));
        getContentPane().add(texCampoPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 90, -1));

        textCampoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCampoFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(textCampoFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 200, -1));

        jLabel8.setText("Data:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 80, 30, 30));

        jSeparator4.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1000, 10));

        jLabel10.setText("Quantidade:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, -1, 30));

        jLabel12.setText("ID:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 40));

        jLabel13.setText("Valor Unitario:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, -1, 30));

        JtfItens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtfItensActionPerformed(evt);
            }
        });
        getContentPane().add(JtfItens, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 290, -1));

        JtfValorUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtfValorUnitarioActionPerformed(evt);
            }
        });
        getContentPane().add(JtfValorUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 170, 80, -1));

        JBPesquisarVeiculo.setText("Pesquisar");
        JBPesquisarVeiculo.setMaximumSize(new java.awt.Dimension(72, 22));
        JBPesquisarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPesquisarVeiculoActionPerformed(evt);
            }
        });
        getContentPane().add(JBPesquisarVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        JbAdicionar.setText("Adicionar ");
        JbAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbAdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(JbAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 170, -1, -1));

        jSeparator6.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, -1, 660));
        getContentPane().add(textCampoVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 90, -1));

        try {
            textData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(textData, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 110, 90, -1));

        TabelaCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Itens", "Quantidade", "Valor Unitario", "Empresa", "Veiculo", "Placa", "Funcionario", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaComprasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaCompras);
        if (TabelaCompras.getColumnModel().getColumnCount() > 0) {
            TabelaCompras.getColumnModel().getColumn(0).setMinWidth(35);
            TabelaCompras.getColumnModel().getColumn(0).setMaxWidth(45);
            TabelaCompras.getColumnModel().getColumn(1).setResizable(false);
            TabelaCompras.getColumnModel().getColumn(2).setMinWidth(70);
            TabelaCompras.getColumnModel().getColumn(2).setMaxWidth(70);
            TabelaCompras.getColumnModel().getColumn(3).setMinWidth(90);
            TabelaCompras.getColumnModel().getColumn(3).setMaxWidth(90);
            TabelaCompras.getColumnModel().getColumn(4).setMinWidth(170);
            TabelaCompras.getColumnModel().getColumn(4).setMaxWidth(170);
            TabelaCompras.getColumnModel().getColumn(5).setMinWidth(70);
            TabelaCompras.getColumnModel().getColumn(5).setMaxWidth(70);
            TabelaCompras.getColumnModel().getColumn(6).setMinWidth(70);
            TabelaCompras.getColumnModel().getColumn(6).setMaxWidth(70);
            TabelaCompras.getColumnModel().getColumn(7).setMinWidth(90);
            TabelaCompras.getColumnModel().getColumn(7).setMaxWidth(90);
            TabelaCompras.getColumnModel().getColumn(8).setMinWidth(90);
            TabelaCompras.getColumnModel().getColumn(8).setMaxWidth(90);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 990, 470));

        JtfQuantidade1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtfQuantidade1ActionPerformed(evt);
            }
        });
        getContentPane().add(JtfQuantidade1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 70, -1));

        jLabel14.setText("Itens:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void LimparTodosoCampos() {

        textCampoEmpresa.setText("");
        texCampoPlaca.setText("");
        textCampoVeiculo.setText("");
        textData.setText("");
        textCampoFuncionario.setText("");

        JtfID.setText("");
        JtfItens.setText("");
        JtfValorUnitario.setText("");
        JtfQuantidade1.setText("");
    }

    public void LimparCampos() {
        JtfItens.setText("");
        JtfID.setText("");
        JtfValorUnitario.setText("");
        JtfQuantidade1.setText("");
    }

    public void ativarEdicao() {
        //Desabilita os botões Novo, Editar, Excluir, Limpar e Pesquisar
        jbNovo.setEnabled(false);
        jbEditar.setEnabled(false);
        jbExcluir.setEnabled(false);
        jbLimpar.setEnabled(false);

        //Habilita o botão Salvar e Cancelar e os campos de texto
        jbCancelar.setEnabled(true);

        jbPesquisarEmpresa.setEnabled(true);
        JBPesquisarVeiculo.setEnabled(true);
        JBPesquisarFuncionario.setEnabled(true);

        textCampoEmpresa.setEditable(false);
        textCampoFuncionario.setEditable(false);
        texCampoPlaca.setEditable(false);
        textCampoVeiculo.setEditable(false);

        textData.setEditable(true);

        JtfID.setEditable(false);

        JtfItens.setEditable(true);
        JtfQuantidade1.setEditable(true);
        JtfValorUnitario.setEditable(true);

        //Desativa a flag do evento de clique da tabela
        tabelaAtiva = false;
    }

    public void resetTela() {
        //Ativa os botões Novo, Limpar e Pesquisar
        jbNovo.setEnabled(true);
        jbLimpar.setEnabled(true);
        jbPesquisarEmpresa.setEnabled(true);

        //Desativa os outros botões e campos de texto
        jbEditar.setEnabled(false);
        jbCancelar.setEnabled(false);
        jbExcluir.setEnabled(false);

        jbPesquisarEmpresa.setEnabled(false);
        JBPesquisarVeiculo.setEnabled(false);
        JBPesquisarFuncionario.setEnabled(false);

        textCampoEmpresa.setEditable(false);
        textCampoFuncionario.setEditable(false);
        texCampoPlaca.setEditable(false);
        textCampoVeiculo.setEditable(false);
        textData.setEditable(false);
        JtfItens.setEditable(false);
        JtfID.setEditable(false);
        JtfValorUnitario.setEditable(false);

        //Recarrega a tabela, limpa os campos e ativa a flag do evento de clique da tabela
        //l carregarTabela();
        tabelaAtiva = true;
    }

    public void carregarTabela() {

        ArrayList<RequisicaoModel> requisicaoModels = controller.selecionarTodos();
        DefaultTableModel modelo = (DefaultTableModel) TabelaCompras.getModel();
        modelo.setRowCount(0);

        for (int i = 0; i < requisicaoModels.size(); i++) {
            modelo.addRow(new String[]{
                String.valueOf(requisicaoModels.get(i).getId()),
                requisicaoModels.get(i).getItens(),
                String.valueOf(requisicaoModels.get(i).getQuantidade()),
                String.valueOf(requisicaoModels.get(i).getValorUnitario()),
                requisicaoModels.get(i).getEmpresa(),
                requisicaoModels.get(i).getVeiculo(),
                requisicaoModels.get(i).getPlacaveiculo(),
                requisicaoModels.get(i).getFuncionario(),
                requisicaoModels.get(i).getData()

            });
        }
    }


    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed

        RequisicaoModel requisicao = new RequisicaoModel();
        String Veiculo = textCampoVeiculo.getText();
        String Placa = texCampoPlaca.getText();
        String Empresa = textCampoEmpresa.getText();
        String Funcionario = textCampoFuncionario.getText();
        String data = textData.getText();

        String Itens = JtfItens.getText();
        String Quantidade = String.valueOf(JtfID);
        String Valor = String.valueOf(JtfValorUnitario);

        String dataSemMascara = data.replaceAll("[^0-9]", "");

        if (Veiculo.isEmpty() || Placa.isEmpty() || dataSemMascara.isEmpty() || Empresa.isEmpty() || Funcionario.isEmpty() || Itens.isEmpty() || Valor.isEmpty() || Quantidade.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Não a nada para ser excluido.");
        } else if (JOptionPane.showConfirmDialog(null, "Tem certeza de que deseja excluir esse Cadastro ?", "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Funcionário apagado com sucesso.");

            RequisicaoModel requisicaoModel = new RequisicaoModel();
            requisicaoModel.setId(Integer.parseInt(JtfID.getText()));

            resetTela();
            LimparTodosoCampos();

            controller.excluir(requisicaoModel);

        } else if (JOptionPane.CLOSED_OPTION == JOptionPane.CLOSED_OPTION) {
            JOptionPane.showMessageDialog(this, "Operação cancelada.");
            LimparTodosoCampos();
            resetTela();

        }

        carregarTabela();
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed

        String Veiculo = textCampoVeiculo.getText();
        String Placa = texCampoPlaca.getText();
        String Empresa = textCampoEmpresa.getText();
        String Funcionario = textCampoFuncionario.getText();
        String data = textData.getText();

        String Itens = JtfItens.getText();
        String Quantidade = String.valueOf(JtfID);
        String Valor = String.valueOf(JtfValorUnitario);

        String dataSemMascara = data.replaceAll("[^0-9]", "");
        if (Veiculo.isEmpty() || Placa.isEmpty() || dataSemMascara.isEmpty() || Empresa.isEmpty() || Funcionario.isEmpty() || Itens.isEmpty() || Valor.isEmpty() || Quantidade.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Não a nada para ser editado ");
        } else {
            carregarTabela();
            ativarEdicao();

        }
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        LimparCampos();
        carregarTabela();
        ativarEdicao();

    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        resetTela();
        LimparTodosoCampos();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        resetTela();
        LimparTodosoCampos();
        carregarTabela();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void JtfIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtfIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtfIDActionPerformed

    private void jbPesquisar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisar1ActionPerformed

        Pesquisa p = new Pesquisa();
        String[] opcoesBusca = {"ID", "Placa", "Data", "Empresa"};
        List<RequisicaoModel> lista = p.pesquisaRequisicao(opcoesBusca);

        // Se a pesquisa retornar null o usuário pesquisou um valor vazio ou inválido (a mensagem especificando qual o valor inválido é exibida no método pesquisarFuncionario)
        if (lista == null) {
            resetTela();
        } // Se a pesquisa retornar uma lista com tamanho 0 o usuário não digitou nenhum valor inválido, mas não foi encontrado nenhum funcionário no banco
        else if (lista.size() == 0) {
            JOptionPane.showMessageDialog(null, "Requisição não encontrado no banco de dados.");
            resetTela();
        } // Se a pesquisa retornar uma lista de tamanho 1, apenas um funcionário foi encontrado na busca e os campos de texto são preenchidos
        else if (lista.size() == 1) {
            JOptionPane.showMessageDialog(this, "1 Requisição encontrado.\nExibindo o resultado nos campos de texto.");
            resetTela();
            RequisicaoModel wp = lista.get(0);

            JtfID.setText(Integer.toString(wp.getId()));
            JtfItens.setText(wp.getItens());
            JtfValorUnitario.setText(Float.toString(wp.getValorUnitario()));
            JtfQuantidade1.setText(Float.toString(wp.getQuantidade()));

            textCampoEmpresa.setText(wp.getEmpresa());
            textCampoVeiculo.setText(wp.getVeiculo());
            texCampoPlaca.setText(wp.getPlacaveiculo());
            textCampoFuncionario.setText(wp.getFuncionario());
            textData.setText(wp.getData());

            jbEditar.setEnabled(true);
            jbExcluir.setEnabled(true);
            jbLimpar.setEnabled(true);
        } // Se a pesquisa retornar uma lista de tamanho maior que 1, vários funcionários foram encontrados e a tabela é preenchida com os resultados
        else {
            JOptionPane.showMessageDialog(this, lista.size() + " Requisicãoes encontradas.\nExibindo os resultados na tabela.");
            resetTela();
            DefaultTableModel model = (DefaultTableModel) TabelaCompras.getModel();
            model.setRowCount(0);

            for (RequisicaoModel requisicaoModel : lista) {
                model.addRow(new Object[]{
                    requisicaoModel.getId(),
                    requisicaoModel.getItens(),
                    requisicaoModel.getValorUnitario(),
                    requisicaoModel.getQuantidade(),
                    requisicaoModel.getEmpresa(),                 
                    requisicaoModel.getVeiculo(),
                    requisicaoModel.getPlacaveiculo(),
                    requisicaoModel.getFuncionario(),
                    requisicaoModel.getData()
                });
            }

        }

//        Pesquisa p = new Pesquisa();
//        String[] opcoesBusca = {"Placa", "Data"};
//
//        List<RequisicaoModel> lista = p.pesquisaRequisicao(opcoesBusca);
//
//        if (lista == null) {
//            textCampoFuncionario.setText("");
//        } else if (lista.size() == 0) {
//            JOptionPane.showMessageDialog(null, "Funcionario não encontrado no banco de dados.");
//            textCampoFuncionario.setText("");
//        } else if (lista.size() == 1) {
//            //  FuncionarioModel v = lista.get(0);
//            // JOptionPane.showMessageDialog(this, "Funcionario  encontrado: \n" + "Nome: " + v.getNome() + "\n" + "CPF: " + v.getCPF() + "\n" + "Setor: " + v.getSetor() + "\n" + "Data Nacimento: " + v.getData_nascimento() + " ");
//            // textCampoFuncionario.setText(v.getNome());
//        }
    }//GEN-LAST:event_jbPesquisar1ActionPerformed

    private void JtfItensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtfItensActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtfItensActionPerformed

    private void JtfValorUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtfValorUnitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtfValorUnitarioActionPerformed

    private void JbAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbAdicionarActionPerformed

        RequisicaoModel requisicao = new RequisicaoModel();
        String Veiculo = textCampoVeiculo.getText();
        String Placa = texCampoPlaca.getText();
        String Empresa = textCampoEmpresa.getText();
        String Funcionario = textCampoFuncionario.getText();
        String data = textData.getText();

        String Itens = JtfItens.getText();
        String Quantidade = String.valueOf(JtfID);
        String Valor = String.valueOf(JtfValorUnitario);

        String dataSemMascara = data.replaceAll("[^0-9]", "");

        if (Veiculo.isEmpty() || Placa.isEmpty() || dataSemMascara.isEmpty() || Empresa.isEmpty() || Funcionario.isEmpty() || Itens.isEmpty() || Valor.isEmpty() || Quantidade.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, prencha todos os campos solicitados.");
        } else if ("".equals(JtfID.getText().trim())) {
            requisicao.setVeiculo(textCampoVeiculo.getText());
            requisicao.setPlacaveiculo(texCampoPlaca.getText());
            requisicao.setEmpresa(textCampoEmpresa.getText());
            requisicao.setFuncionario(textCampoFuncionario.getText());
            requisicao.setData(textData.getText());
            requisicao.setItens(JtfItens.getText());
            requisicao.setQuantidade(Float.parseFloat(JtfQuantidade1.getText()));
            requisicao.setValorUnitario(Float.parseFloat(JtfValorUnitario.getText()));

            if (controller.inserir(requisicao)) {
                JOptionPane.showMessageDialog(this, "Iten registrado com sucesso.");
                carregarTabela();

            } else {
         
                JOptionPane.showMessageDialog(this, "Falha ao inserir.");
                carregarTabela();
            }

        } else {
            requisicao.setId(Integer.parseInt(JtfID.getText()));
            requisicao.setVeiculo(textCampoVeiculo.getText());
            requisicao.setPlacaveiculo(texCampoPlaca.getText());
            requisicao.setEmpresa(textCampoEmpresa.getText());
            requisicao.setFuncionario(textCampoFuncionario.getText());
            requisicao.setData(textData.getText());
            requisicao.setItens(JtfItens.getText());
            
            requisicao.setQuantidade(Float.parseFloat(JtfQuantidade1.getText()));
            requisicao.setValorUnitario(Float.parseFloat(JtfValorUnitario.getText()));

            if (controller.editar(requisicao)) {
                JOptionPane.showMessageDialog(this, "O cadastro do funcionario foi atualizado com sucesso.");
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao atualizar o Cadastro.");
            }
        }

//        
//        else if ("".equals(JtfID.getText().trim())) {
//            requisicao.setVeiculo(textCampoVeiculo.getText());
//            requisicao.setPlacaveiculo(texCampoPlaca.getText());
//            requisicao.setEmpresa(textCampoEmpresa.getText());
//            requisicao.setFuncionario(textCampoFuncionario.getText());
//            requisicao.setData(textData.getText());
//            requisicao.setItens(JtfItens.getText());
//            requisicao.setQuantidade(Float.parseFloat(JtfID.getText()));
//            requisicao.setValorUnitario(Float.parseFloat(JtfValorUnitario.getText()));
//
//            if (controller.inserir(requisicao)) {
//                JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso.");
//                carregarTabela();
//            } else {
//                JOptionPane.showMessageDialog(this, "Falha no cadastro.");
//            }
//
//        } else {
//
//            requisicao.setVeiculo(textCampoVeiculo.getText());
//            requisicao.setPlacaveiculo(texCampoPlaca.getText());
//            requisicao.setEmpresa(textCampoEmpresa.getText());
//            requisicao.setFuncionario(textCampoFuncionario.getText());
//            requisicao.setData(textData.getText());
//            requisicao.setItens(JtfItens.getText());
//            requisicao.setQuantidade(Float.parseFloat(JtfID.getText()));
//            requisicao.setValorUnitario(Float.parseFloat(JtfValorUnitario.getText()));
//
//            if (controller.editar(requisicao)) {
//                JOptionPane.showMessageDialog(this, "O iten fo editado com sucesso.");
//            } else {
//                JOptionPane.showMessageDialog(this, "Erro ao editar o itens .");
//            }
//
//        }
        resetTela();
        carregarTabela();
        LimparCampos();


    }//GEN-LAST:event_JbAdicionarActionPerformed

    private void TabelaComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaComprasMouseClicked
        if (tabelaAtiva == true) {
            int linha = TabelaCompras.getSelectedRow();
            DefaultTableModel modelo = (DefaultTableModel) TabelaCompras.getModel();

            JtfID.setText((modelo.getValueAt(linha, 0)).toString());
            JtfItens.setText((modelo.getValueAt(linha, 1)).toString());
            JtfQuantidade1.setText((modelo.getValueAt(linha, 2)).toString());
            JtfValorUnitario.setText((modelo.getValueAt(linha, 3)).toString());
            textCampoEmpresa.setText((modelo.getValueAt(linha, 4)).toString());
            textCampoVeiculo.setText((modelo.getValueAt(linha, 5)).toString());

            texCampoPlaca.setText((modelo.getValueAt(linha, 6)).toString());
            textCampoFuncionario.setText((modelo.getValueAt(linha, 7)).toString());
            textData.setText((modelo.getValueAt(linha, 8)).toString());

            jbEditar.setEnabled(true);
            jbExcluir.setEnabled(true);
            jbLimpar.setEnabled(true);
            jbCancelar.setEnabled(false);
        }
    }//GEN-LAST:event_TabelaComprasMouseClicked

    private void JtfQuantidade1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtfQuantidade1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtfQuantidade1ActionPerformed

    private void JBPesquisarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPesquisarVeiculoActionPerformed
        Pesquisa p = new Pesquisa();
        String[] opcoesBusca = {"ID", "Placa"};
        List<VeiculoModel> lista = p.pesquisaVeiculo(opcoesBusca);

        if (lista == null) {
            texCampoPlaca.setText("");
        } else if (lista.size() == 0) {
            JOptionPane.showMessageDialog(null, "Veículo não encontrado no banco de dados.");
            texCampoPlaca.setText("");
        } else if (lista.size() == 1) {
            VeiculoModel v = lista.get(0);
            JOptionPane.showMessageDialog(this, "Veículo encontrado: \n" + "Modelo: " + v.getModelo() + "\n" + "Marca: " + v.getMarca() + "\n" + "Placa: " + v.getPlaca() + "\n" + "Ano: " + v.getAno() + " ");
            textCampoVeiculo.setText(v.getModelo());
            texCampoPlaca.setText(v.getPlaca());
        }
    }//GEN-LAST:event_JBPesquisarVeiculoActionPerformed

    private void textCampoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCampoFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCampoFuncionarioActionPerformed

    private void JBPesquisarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPesquisarFuncionarioActionPerformed
        Pesquisa p = new Pesquisa();
        String[] opcoesBusca = {"ID", "CPF"};
        List<FuncionarioModel> lista = p.pesquisaFuncionario(opcoesBusca);

        if (lista == null) {
            textCampoFuncionario.setText("");
        } else if (lista.size() == 0) {
            JOptionPane.showMessageDialog(null, "Funcionario não encontrado no banco de dados.");
            textCampoFuncionario.setText("");
        } else if (lista.size() == 1) {
            FuncionarioModel v = lista.get(0);
            JOptionPane.showMessageDialog(this, "Funcionario  encontrado: \n" + "Nome: " + v.getNome() + "\n" + "CPF: " + v.getCPF() + "\n" + "Setor: " + v.getSetor() + "\n" + "Data Nacimento: " + v.getData_nascimento() + " ");
            textCampoFuncionario.setText(v.getNome());
        }
    }//GEN-LAST:event_JBPesquisarFuncionarioActionPerformed

    private void jbPesquisarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarEmpresaActionPerformed

        Pesquisa p = new Pesquisa();
        String[] opcoesBusca = {"ID", "CNPJ"};
        List<EmpresasModel> lista = p.pesquisaEmpresas(opcoesBusca);

        if (lista == null) {
            textCampoEmpresa.setText("");
        } else if (lista.size() == 0) {
            JOptionPane.showMessageDialog(null, "Empresa não encontrado no banco de dados.");
            textCampoEmpresa.setText("");
        } else if (lista.size() == 1) {
            EmpresasModel v = lista.get(0);
            JOptionPane.showMessageDialog(this, "Empresa Encontrada: \n" + "Nome: " + v.getNomeEmpresa() + "\n" + "Cnpj: " + v.getCnpj() + "\n" + "Endereço: " + v.getEndereco() + "," + v.getUf() + "\n" + "Fax/Celular: " + v.getFax());
            textCampoEmpresa.setText(v.getNomeEmpresa());
        }
    }//GEN-LAST:event_jbPesquisarEmpresaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBPesquisarFuncionario;
    private javax.swing.JButton JBPesquisarVeiculo;
    private javax.swing.JButton JbAdicionar;
    private javax.swing.JTextField JtfID;
    private javax.swing.JTextField JtfItens;
    private javax.swing.JTextField JtfQuantidade1;
    private javax.swing.JTextField JtfValorUnitario;
    private javax.swing.JTable TabelaCompras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbPesquisar1;
    private javax.swing.JButton jbPesquisarEmpresa;
    private javax.swing.JLabel jlTitulo1;
    private javax.swing.JTextField texCampoPlaca;
    private javax.swing.JTextField textCampoEmpresa;
    private javax.swing.JTextField textCampoFuncionario;
    private javax.swing.JTextField textCampoVeiculo;
    private javax.swing.JFormattedTextField textData;
    // End of variables declaration//GEN-END:variables
}
