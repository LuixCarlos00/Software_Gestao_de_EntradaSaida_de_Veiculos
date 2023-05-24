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

    MovimentacaoController controller = new MovimentacaoController();
    MovimentacaoModel model = new MovimentacaoModel();
    RequisicaoTM Modelo;

    boolean tabelaAtiva = true;

    public RequisicaoView() {
        initComponents();

        Modelo = new RequisicaoTM();
        TabelaCompras.setModel(Modelo);
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
        JtfQuantidade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jbPesquisar1 = new javax.swing.JButton();
        JBPesquisarFuncionario = new javax.swing.JButton();
        JtfPlaca = new javax.swing.JTextField();
        textCampoFuncionario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        JtfItens = new javax.swing.JTextField();
        JtfValorUnitario = new javax.swing.JTextField();
        JBPesquisarVeiculo = new javax.swing.JButton();
        JbExcluir = new javax.swing.JButton();
        JbAdicionar = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        textCampoVeiculo1 = new javax.swing.JTextField();
        textData_nascimento = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaCompras = new javax.swing.JTable();

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
        jlTitulo1.setText("Ordem de Compras");
        jlTitulo1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        jSeparator5.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 10, 680));
        getContentPane().add(textCampoEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 220, -1));

        JtfQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtfQuantidadeActionPerformed(evt);
            }
        });
        getContentPane().add(JtfQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 70, -1));

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
        getContentPane().add(JtfPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 90, -1));

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
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, -1, 30));

        jLabel12.setText("Itens:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 40));

        jLabel13.setText("Valor Unitario:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, -1, 30));

        JtfItens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtfItensActionPerformed(evt);
            }
        });
        getContentPane().add(JtfItens, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 240, -1));

        JtfValorUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtfValorUnitarioActionPerformed(evt);
            }
        });
        getContentPane().add(JtfValorUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, 80, -1));

        JBPesquisarVeiculo.setText("Pesquisar");
        JBPesquisarVeiculo.setMaximumSize(new java.awt.Dimension(72, 22));
        JBPesquisarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPesquisarVeiculoActionPerformed(evt);
            }
        });
        getContentPane().add(JBPesquisarVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        JbExcluir.setText("Excluir");
        getContentPane().add(JbExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 170, -1, -1));

        JbAdicionar.setText("Adicionar ");
        JbAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbAdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(JbAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 170, -1, -1));

        jSeparator6.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, -1, 660));
        getContentPane().add(textCampoVeiculo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 90, -1));

        try {
            textData_nascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(textData_nascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 110, 90, -1));

        TabelaCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Itens", "Quantidade", "Valor Unitario", "Empresa", "Veiculo", "Placa", "Funcionario", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TabelaCompras);
        if (TabelaCompras.getColumnModel().getColumnCount() > 0) {
            TabelaCompras.getColumnModel().getColumn(0).setResizable(false);
            TabelaCompras.getColumnModel().getColumn(1).setResizable(false);
            TabelaCompras.getColumnModel().getColumn(2).setResizable(false);
            TabelaCompras.getColumnModel().getColumn(3).setResizable(false);
            TabelaCompras.getColumnModel().getColumn(4).setResizable(false);
            TabelaCompras.getColumnModel().getColumn(5).setResizable(false);
            TabelaCompras.getColumnModel().getColumn(6).setResizable(false);
            TabelaCompras.getColumnModel().getColumn(7).setMinWidth(35);
            TabelaCompras.getColumnModel().getColumn(7).setMaxWidth(40);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 990, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limparCampos() {
        textCampoEmpresa.setText("");
        textCampoFuncionario.setText("");
        JtfPlaca.setText("");
    }

    public void ativarEdicao() {
        //Desabilita os botões Novo, Editar, Excluir, Limpar e Pesquisar
        jbNovo.setEnabled(false);
        jbEditar.setEnabled(false);
        jbExcluir.setEnabled(false);
        jbLimpar.setEnabled(false);
        jbPesquisarEmpresa.setEnabled(false);

        //Habilita o botão Salvar e Cancelar e os campos de texto
     
        jbCancelar.setEnabled(true);

        textCampoEmpresa.setEditable(true);
        textCampoFuncionario.setEditable(true);
        JtfPlaca.setEditable(true);

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

        textCampoEmpresa.setEditable(false);
        textCampoFuncionario.setEditable(false);
        JtfPlaca.setEditable(false);

        //Recarrega a tabela, limpa os campos e ativa a flag do evento de clique da tabela
        //l carregarTabela();
        limparCampos();
        tabelaAtiva = true;
    }


    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed

//        String nome = textNome.getText();
//        String cpf = textCPF.getText();
//        String data_nascimento = textData_nascimento.getText();
//        String setor = (String) textSetor.getSelectedItem();
//
//        String dataSemMascara = data_nascimento.replaceAll("[^0-9]", "");
//        String cpfSemMascara = cpf.replaceAll("[^0-9]", "");
//
//        if (nome.isEmpty() || setor.isEmpty() && cpfSemMascara.isEmpty() || dataSemMascara.isEmpty()) {
//            JOptionPane.showMessageDialog(this, "Não há nada para ser excluído.");
//
//        } else if (JOptionPane.showConfirmDialog(null, "Tem certeza de que deseja excluir esse Cadastro ?", "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
//            JOptionPane.showMessageDialog(this, "Funcionário apagado com sucesso.");
//
//            FuncionarioModel funcionario = new FuncionarioModel();
//            funcionario.setId(Integer.parseInt(textID.getText()));
//
//            resetTela();
//            limparCampos();
//
//            funcionarioController.excluir(funcionario);
//
//        } else if (JOptionPane.CLOSED_OPTION == JOptionPane.CLOSED_OPTION) {
//            JOptionPane.showMessageDialog(this, "Operação cancelada.");
//            limparCampos();
//            resetTela();
//
//        }
//
//        carregarTabela();
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed

//        String nome = textNome.getText();
//        String cpf = textCPF.getText();
//        String data_nascimento = textData_nascimento.getText();
//
//        String dataSemMascara = data_nascimento.replaceAll("[^0-9]", "");
//        String cpfSemMascara = cpf.replaceAll("[^0-9]", "");
//
//        if (nome.isEmpty() || cpfSemMascara.isEmpty() || dataSemMascara.isEmpty()) {
//            JOptionPane.showMessageDialog(this, "Não a nada para ser editado ");
//        } else {
//            carregarTabela();
//            ativarEdicao();
//
//        }
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
//        limparCampos();
//        carregarTabela();
//        ativarEdicao();
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        //  resetTela();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        //  resetTela();
    }//GEN-LAST:event_jbLimparActionPerformed

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

    private void JtfQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtfQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtfQuantidadeActionPerformed

    private void jbPesquisar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbPesquisar1ActionPerformed

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

    private void JtfItensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtfItensActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtfItensActionPerformed

    private void JtfValorUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtfValorUnitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtfValorUnitarioActionPerformed

    private void JBPesquisarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPesquisarVeiculoActionPerformed
        Pesquisa p = new Pesquisa();
        String[] opcoesBusca = {"ID", "Placa"};
        List<VeiculoModel> lista = p.pesquisaVeiculo(opcoesBusca);

        if (lista == null) {
            JtfPlaca.setText("");
        } else if (lista.size() == 0) {
            JOptionPane.showMessageDialog(null, "Veículo não encontrado no banco de dados.");
            JtfPlaca.setText("");
        } else if (lista.size() == 1) {
            VeiculoModel v = lista.get(0);
            JOptionPane.showMessageDialog(this, "Veículo encontrado: \n" + "Modelo: " + v.getModelo() + "\n" + "Marca: " + v.getMarca() + "\n" + "Placa: " + v.getPlaca() + "\n" + "Ano: " + v.getAno() + " ");
            textCampoVeiculo1.setText(v.getModelo());
            JtfPlaca.setText(v.getPlaca());
        }
    }//GEN-LAST:event_JBPesquisarVeiculoActionPerformed

    private void textCampoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCampoFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCampoFuncionarioActionPerformed

    private void JbAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbAdicionarActionPerformed
        RequisicaoModel R = new RequisicaoModel();
       
        R.setItens(JtfItens.getText());
        R.setQuantidade(Float.parseFloat(JtfQuantidade.getText()));
        R.setValorUnitario(Float.parseFloat(JtfValorUnitario.getText()));
        R.setEmpresa(textCampoEmpresa.getText());
        R.setVeiculo(textCampoVeiculo1.getText());
        R.setPlacaveiculo(JtfPlaca.getText());
        R.setFuncionario(textCampoFuncionario.getText());
        R.setDate(textData_nascimento.getText());
   
        
        
        RequisicaoControlle controll = new RequisicaoControlle();
        boolean m = controll.salvarItens(R);
        if (m) {
            JOptionPane.showMessageDialog(this, "Inserido com sucesso");
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao inserir!");
        }

        Modelo.addCompras(R);
        LimparCampos();
        JtfItens.requestFocus();

    }//GEN-LAST:event_JbAdicionarActionPerformed

    public void LimparCampos() {
        JtfItens.setText("");
        JtfQuantidade.setText("");
        JtfValorUnitario.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBPesquisarFuncionario;
    private javax.swing.JButton JBPesquisarVeiculo;
    private javax.swing.JButton JbAdicionar;
    private javax.swing.JButton JbExcluir;
    private javax.swing.JTextField JtfItens;
    private javax.swing.JTextField JtfPlaca;
    private javax.swing.JTextField JtfQuantidade;
    private javax.swing.JTextField JtfValorUnitario;
    private javax.swing.JTable TabelaCompras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JTextField textCampoEmpresa;
    private javax.swing.JTextField textCampoFuncionario;
    private javax.swing.JTextField textCampoVeiculo1;
    private javax.swing.JFormattedTextField textData_nascimento;
    // End of variables declaration//GEN-END:variables
}
