/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import controller.MovimentacaoController;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.EmpresasModel;
import model.MovimentacaoModel;
import util.Pesquisa;

/**
 *
 * @author luixc
 */
public class RequisicaoView extends javax.swing.JInternalFrame {
    MovimentacaoController controller = new MovimentacaoController();
    MovimentacaoModel  model = new MovimentacaoModel();
    
    boolean tabelaAtiva = true;

    public RequisicaoView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbNovo = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbPesquisar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jlTitulo1 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        textCampoEmpresa = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jbPesquisar1 = new javax.swing.JButton();
        jbPesquisar2 = new javax.swing.JButton();
        textCampoVeiculo = new javax.swing.JTextField();
        textCampoFuncionario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaCompras = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jbPesquisar3 = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });
        getContentPane().add(jbNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 76, -1));

        jbSalvar.setText("Salvar");
        jbSalvar.setMinimumSize(null);
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jbSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 76, -1));

        jbEditar.setText("Editar");
        jbEditar.setMinimumSize(null);
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });
        getContentPane().add(jbEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 76, -1));

        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(jbExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 76, -1));

        jbPesquisar.setText("Pesquisar");
        jbPesquisar.setMaximumSize(new java.awt.Dimension(72, 22));
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(jbPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));

        jbLimpar.setText("Limpar");
        jbLimpar.setMinimumSize(null);
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });
        getContentPane().add(jbLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 76, -1));

        jbCancelar.setText("Cancelar");
        jbCancelar.setMaximumSize(new java.awt.Dimension(72, 22));
        jbCancelar.setMinimumSize(null);
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jbCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, 76, -1));

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 830, 10));

        jLabel2.setText("Nome da Empresa:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 110, 30));

        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 70, 620));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 830, 20));

        jlTitulo1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        jlTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo1.setText("Pedido de Compras");
        jlTitulo1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        jSeparator5.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, -20, 20, 640));
        getContentPane().add(textCampoEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 210, -1));

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 150, -1));

        jLabel1.setText("Nome do Veiculo:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, 20));

        jLabel5.setText("Nome Funcionario");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, -1, 20));

        jbPesquisar1.setText("Pesquisar");
        jbPesquisar1.setMaximumSize(new java.awt.Dimension(72, 22));
        jbPesquisar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisar1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbPesquisar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jbPesquisar2.setText("Pesquisar");
        jbPesquisar2.setMaximumSize(new java.awt.Dimension(72, 22));
        jbPesquisar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisar2ActionPerformed(evt);
            }
        });
        getContentPane().add(jbPesquisar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, -1, -1));
        getContentPane().add(textCampoVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 210, -1));

        textCampoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCampoFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(textCampoFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 80, 210, -1));

        jLabel8.setText("Data:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 30, 30));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 130, -1));

        jSeparator4.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 830, 10));

        TabelaCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Funcionario", "Veiculo", "Empresa", "Data", "Itens", "Quantidade", "Valor Unitario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, false, false
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
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 830, 400));

        jLabel10.setText("Quantidade:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, 30));

        jLabel12.setText("Itens:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, 40));

        jLabel13.setText("Valor Unitario:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, -1, 30));

        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 240, -1));

        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 160, -1));

        jbPesquisar3.setText("Pesquisar");
        jbPesquisar3.setMaximumSize(new java.awt.Dimension(72, 22));
        jbPesquisar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisar3ActionPerformed(evt);
            }
        });
        getContentPane().add(jbPesquisar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limparCampos() {
        textCampoEmpresa.setText("");
        textCampoFuncionario.setText("");
        textCampoVeiculo.setText("");
    }

    public void ativarEdicao() {
        //Desabilita os botões Novo, Editar, Excluir, Limpar e Pesquisar
        jbNovo.setEnabled(false);
        jbEditar.setEnabled(false);
        jbExcluir.setEnabled(false);
        jbLimpar.setEnabled(false);
        jbPesquisar.setEnabled(false);

        //Habilita o botão Salvar e Cancelar e os campos de texto
        jbSalvar.setEnabled(true);
        jbCancelar.setEnabled(true);

        textCampoEmpresa.setEditable(true);
        textCampoFuncionario.setEditable(true);
        textCampoVeiculo.setEditable(true);

        //Desativa a flag do evento de clique da tabela
        tabelaAtiva = false;
    }

    
    
    public void resetTela() {
        //Ativa os botões Novo, Limpar e Pesquisar
        jbNovo.setEnabled(true);
        jbLimpar.setEnabled(true);
        jbPesquisar.setEnabled(true);

        //Desativa os outros botões e campos de texto
        jbEditar.setEnabled(false);
        jbSalvar.setEnabled(false);
        jbCancelar.setEnabled(false);
        jbExcluir.setEnabled(false);

        textCampoEmpresa.setEditable(false);
        textCampoFuncionario.setEditable(false);
        textCampoVeiculo.setEditable(false);

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

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed

//        FuncionarioModel funcionario = new FuncionarioModel();
//        String nome = textNome.getText();
//        String cpf = textCPF.getText();
//        String data_nascimento = textData_nascimento.getText();
//
//        String dataSemMascara = data_nascimento.replaceAll("[^0-9]", "");
//        String cpfSemMascara = cpf.replaceAll("[^0-9]", "");
//
//        if (nome.isEmpty() || cpfSemMascara.isEmpty() || dataSemMascara.isEmpty()) {
//            JOptionPane.showMessageDialog(this, "Por favor, prencha todos os campos solicitados.");
//        } else if ("".equals(textID.getText().trim())) {
//            funcionario.setNome(textNome.getText());
//            funcionario.setSetor((String) textSetor.getSelectedItem());
//            funcionario.setCPF(textCPF.getText());
//            funcionario.setData_nascimento(textData_nascimento.getText());
//
//            if (funcionarioController.inserir(funcionario)) {
//                JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso.");
//                carregarTabela();
//
//            } else {
//                JOptionPane.showMessageDialog(this, "Falha no cadastro.");
//                carregarTabela();
//            }
//
//        } else {
//            funcionario.setId(Integer.parseInt(textID.getText().trim()));
//            funcionario.setNome(textNome.getText());
//            funcionario.setSetor((String) textSetor.getSelectedItem());
//            funcionario.setCPF(textCPF.getText());
//            funcionario.setData_nascimento(textData_nascimento.getText());
//
//            if (funcionarioController.editar(funcionario)) {
//                JOptionPane.showMessageDialog(this, "O cadastro do funcionario foi atualizado com sucesso.");
//            } else {
//                JOptionPane.showMessageDialog(this, "Erro ao atualizar o Cadastro.");
//            }
//        }
//
//        resetTela();
//        carregarTabela();
//        limparCampos();
    }//GEN-LAST:event_jbSalvarActionPerformed

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

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed

        Pesquisa p = new Pesquisa();
        String[] opcoesBusca = {"ID", "CNPJ", "Nome", "UF"};
        List<EmpresasModel> lista = p.pesquisaEmpresas(opcoesBusca);

        // Se a pesquisa retornar null o usuário pesquisou um valor vazio ou inválido (a mensagem especificando qual o valor inválido é exibida no método pesquisarFuncionario)
        if (lista == null) {
            resetTela();
        } // Se a pesquisa retornar uma lista com tamanho 0 o usuário não digitou nenhum valor inválido, mas não foi encontrado nenhum funcionário no banco
        else if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Funcionário não encontrado no banco de dados.");
            resetTela();
        } // Se a pesquisa retornar uma lista de tamanho 1, apenas um funcionário foi encontrado na busca e os campos de texto são preenchidos
        else if (lista.size() == 1) {
            JOptionPane.showMessageDialog(this, "1 funcionário encontrado.\nExibindo o resultado nos campos de texto.");
            resetTela();
            EmpresasModel empresa = lista.get(0);

//            textID.setText(Integer.toString(empresa.getId()));
//            textNomeEmpresa.setText(empresa.getNomeEmpresa());
//            textCnpj.setText(empresa.getCnpj());
//            textFax.setText(empresa.getFax());
//            textEndereco.setText(empresa.getEndereco());
//            textUf.setSelectedItem(empresa.getUf());

            jbEditar.setEnabled(true);
            jbExcluir.setEnabled(true);
            jbLimpar.setEnabled(true);
        } // Se a pesquisa retornar uma lista de tamanho maior que 1, vários funcionários foram encontrados e a tabela é preenchida com os resultados
        else {
            JOptionPane.showMessageDialog(this, lista.size() + " funcionários encontrados.\nExibindo os resultados na tabela.");
            resetTela();
            DefaultTableModel model = (DefaultTableModel) TabelaCompras.getModel();
            model.setRowCount(0);

            for (EmpresasModel EmpresaEncontrada : lista) {
                model.addRow(new Object[]{
                    EmpresaEncontrada.getId(),
                    EmpresaEncontrada.getNomeEmpresa(),
                    EmpresaEncontrada.getCnpj(),
                    EmpresaEncontrada.getFax(),
                    EmpresaEncontrada.getEndereco(),
                    EmpresaEncontrada.getUf()
                });
            }

        }
    }//GEN-LAST:event_jbPesquisarActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jbPesquisar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbPesquisar1ActionPerformed

    private void jbPesquisar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbPesquisar2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jbPesquisar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbPesquisar3ActionPerformed

    private void textCampoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCampoFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCampoFuncionarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JButton jbPesquisar1;
    private javax.swing.JButton jbPesquisar2;
    private javax.swing.JButton jbPesquisar3;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JLabel jlTitulo1;
    private javax.swing.JTextField textCampoEmpresa;
    private javax.swing.JTextField textCampoFuncionario;
    private javax.swing.JTextField textCampoVeiculo;
    // End of variables declaration//GEN-END:variables
}
