/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import controller.EmpresasController;
import java.util.ArrayList;
import model.EmpresasModel;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.FuncionarioModel;

import util.Pesquisa;

public class EmpresasView extends javax.swing.JInternalFrame {

    EmpresasModel empresa = new EmpresasModel();
    EmpresasController controller = new EmpresasController();
    boolean tabelaAtiva = true;

    /**
     * Creates new form EmpresasView
     */
    public EmpresasView() {
        initComponents();
        textID.setEditable(false);
        resetTela();
    }

    public void carregarTabela() {

        ArrayList<EmpresasModel> empresa = controller.selecionarTodos();
        DefaultTableModel modelo = (DefaultTableModel) Tabela_Empresa.getModel();
        modelo.setRowCount(0);

        for (int i = 0; i < empresa.size(); i++) {
            modelo.addRow(new String[]{
                String.valueOf(empresa.get(i).getId()),
                empresa.get(i).getNomeEmpresa(),
                empresa.get(i).getCnpj(),
                empresa.get(i).getFax(),
                empresa.get(i).getEndereco(),
                empresa.get(i).getUf()
            });
        }
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

        textCnpj.setEditable(false);
        textEndereco.setEditable(false);
        textNomeEmpresa.setEditable(false);
        textFax.setEditable(false);
        textUf.setEditable(false);

        //Recarrega a tabela, limpa os campos e ativa a flag do evento de clique da tabela
        carregarTabela();
        limparCampos();
        tabelaAtiva = true;
    }

    private void limparCampos() {
        textID.setText("");
        textCnpj.setText("");
        textEndereco.setText("");
        textFax.setText("");
        textUf.setSelectedItem("");
        textNomeEmpresa.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textUf = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela_Empresa = new javax.swing.JTable();
        jbNovo = new javax.swing.JButton();
        ID = new javax.swing.JLabel();
        jbSalvar = new javax.swing.JButton();
        textCnpj = new javax.swing.JFormattedTextField();
        jbEditar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbPesquisar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbLimpar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jbCancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        textID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textEndereco = new javax.swing.JTextField();
        textNomeEmpresa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textFax = new javax.swing.JTextField();

        setClosable(true);

        textUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre (AC)", "Alagoas (AL)", "Amapá (AP)", "Amazonas (AM)", "Bahia (BA)", "Ceará (CE)", "Distrito Federal (DF)", "Espírito Santo (ES)", "Goiás (GO)", "Maranhão (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Pará (PA)", "Paraíba (PB)", "Paraná (PR)", "Pernambuco (PE)", "Piauí (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rondônia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "São Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)" }));

        Tabela_Empresa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID ", "Nome da Empresa", "CNPJ", "Fax/Celular", "Endereço", "UF"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabela_Empresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabela_EmpresaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabela_Empresa);
        if (Tabela_Empresa.getColumnModel().getColumnCount() > 0) {
            Tabela_Empresa.getColumnModel().getColumn(0).setMinWidth(35);
            Tabela_Empresa.getColumnModel().getColumn(0).setMaxWidth(45);
        }

        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        ID.setText("ID:");

        jbSalvar.setText("Salvar");
        jbSalvar.setMinimumSize(null);
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        try {
            textCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCnpjActionPerformed(evt);
            }
        });

        jbEditar.setText("Editar");
        jbEditar.setMinimumSize(null);
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbPesquisar.setText("Pesquisar");
        jbPesquisar.setMaximumSize(new java.awt.Dimension(72, 22));
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });

        jLabel1.setText("Fax/Celular");

        jbLimpar.setText("Limpar");
        jbLimpar.setMinimumSize(null);
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        jLabel2.setText("CNPJ:");

        jbCancelar.setText("Cancelar");
        jbCancelar.setMaximumSize(new java.awt.Dimension(72, 22));
        jbCancelar.setMinimumSize(null);
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jLabel3.setText("Endereço:");

        jLabel4.setText("UF:");

        textNomeEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomeEmpresaActionPerformed(evt);
            }
        });

        jLabel5.setText("Nome da Empresa :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jbNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textUf, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(ID))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(textFax, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(textNomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(textCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(textEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbNovo)
                    .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbExcluir))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(textNomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(textFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(textCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Tabela_EmpresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabela_EmpresaMouseClicked

        if (tabelaAtiva == true) {
            int linha = Tabela_Empresa.getSelectedRow();
            DefaultTableModel modelo = (DefaultTableModel) Tabela_Empresa.getModel();

            textID.setText((modelo.getValueAt(linha, 0)).toString());
            textNomeEmpresa.setText((modelo.getValueAt(linha, 1)).toString());
            textCnpj.setText((modelo.getValueAt(linha, 2)).toString());
            textFax.setText((modelo.getValueAt(linha, 3)).toString());
            textEndereco.setText((modelo.getValueAt(linha, 4)).toString());
            textUf.setSelectedItem((modelo.getValueAt(linha, 5)).toString());

            jbEditar.setEnabled(true);
            jbExcluir.setEnabled(true);
            jbLimpar.setEnabled(true);
            jbCancelar.setEnabled(false);
        }
    }//GEN-LAST:event_Tabela_EmpresaMouseClicked

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

        textNomeEmpresa.setEditable(true);
        textCnpj.setEditable(true);
        textEndereco.setEditable(true);
        textFax.setEditable(true);
        textUf.setEditable(true);

        //Desativa a flag do evento de clique da tabela
        tabelaAtiva = false;
    }


    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        limparCampos();
        carregarTabela();
        ativarEdicao();
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed

        EmpresasModel Empresa = new EmpresasModel();
        String nome = textNomeEmpresa.getText();
        String cnpj = textCnpj.getText();
        
        String cpfSemMascara = cnpj.replaceAll("[^0-9]", "");

        if (nome.isEmpty() || cpfSemMascara.isEmpty() ) {
            JOptionPane.showMessageDialog(this, "Por favor, prencha todos os campos solicitados.");
        } else if ("".equals(textID.getText().trim())) {
            Empresa.setNomeEmpresa(textNomeEmpresa.getText());
            Empresa.setCnpj(textCnpj.getText());
            Empresa.setFax(textFax.getText());
            Empresa.setEndereco(textEndereco.getText());
            Empresa.setUf((String)textUf.getSelectedItem());

            if (controller.inserir(Empresa)) {
                JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso.");
                carregarTabela();

            } else {
                JOptionPane.showMessageDialog(this, "Falha no cadastro.");
                carregarTabela();
            }

        } else {
            Empresa.setId(Integer.parseInt(textID.getText().trim()));
            Empresa.setNomeEmpresa(textNomeEmpresa.getText());
            Empresa.setCnpj(textCnpj.getText());
            Empresa.setFax(textFax.getText());
            Empresa.setEndereco(textEndereco.getText());
            Empresa.setUf((String) textUf.getSelectedItem());
            
            if (controller.editar(Empresa)) {
                JOptionPane.showMessageDialog(this, "O cadastro do empresa foi atualizado com sucesso.");
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao atualizar o Cadastro.");
            }
        }

        resetTela();
        carregarTabela();
        limparCampos();
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed

        String nome = textNomeEmpresa.getText();
        String cnpj = textCnpj.getText();

        String cpfSemMascara = cnpj.replaceAll("[^0-9]", "");

        if (nome.isEmpty() || cpfSemMascara.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Não a nada para ser editado ");
        } else {
            carregarTabela();
            ativarEdicao();

        }
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed

        String nome = textNomeEmpresa.getText();
        String cpf = textCnpj.getText();

        String setor = (String) textUf.getSelectedItem();

        String cpfSemMascara = cpf.replaceAll("[^0-9]", "");

        if (nome.isEmpty() || setor.isEmpty() && cpfSemMascara.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Não há nada para ser excluído.");

        } else if (JOptionPane.showConfirmDialog(null, "Tem certeza de que deseja excluir esse Cadastro ?", "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Funcionário apagado com sucesso.");

            EmpresasModel empresa = new EmpresasModel();
            empresa.setId(Integer.parseInt(textID.getText()));

            resetTela();
            limparCampos();

            controller.excluir(empresa);

        } else if (JOptionPane.CLOSED_OPTION == JOptionPane.CLOSED_OPTION) {
            JOptionPane.showMessageDialog(this, "Operação cancelada.");
            limparCampos();
            resetTela();

        }

        carregarTabela();
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
       Pesquisa p = new Pesquisa();
        String[] opcoesBusca = {"ID","CNPJ","Nome","UF"};
        List<EmpresasModel> lista = p.pesquisaEmpresas(opcoesBusca);
        
        // Se a pesquisa retornar null o usuário pesquisou um valor vazio ou inválido (a mensagem especificando qual o valor inválido é exibida no método pesquisarFuncionario)
        if (lista == null) {
            resetTela();
        }
        
        // Se a pesquisa retornar uma lista com tamanho 0 o usuário não digitou nenhum valor inválido, mas não foi encontrado nenhum funcionário no banco
        else if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Funcionário não encontrado no banco de dados.");
            resetTela();
        }
        
        // Se a pesquisa retornar uma lista de tamanho 1, apenas um funcionário foi encontrado na busca e os campos de texto são preenchidos
        else if (lista.size() == 1) {
            JOptionPane.showMessageDialog(this, "1 funcionário encontrado.\nExibindo o resultado nos campos de texto.");
            resetTela();
            EmpresasModel empresa = lista.get(0);
           
            textID.setText(Integer.toString(empresa.getId()));
            textNomeEmpresa.setText(empresa.getNomeEmpresa());
            textCnpj.setText(empresa.getCnpj());
            textFax.setText(empresa.getFax());
            textEndereco.setText(empresa.getEndereco());
            textUf.setSelectedItem(empresa.getUf());
                
            jbEditar.setEnabled(true);
            jbExcluir.setEnabled(true);
            jbLimpar.setEnabled(true);
        }
        
        // Se a pesquisa retornar uma lista de tamanho maior que 1, vários funcionários foram encontrados e a tabela é preenchida com os resultados
        else {
            JOptionPane.showMessageDialog(this, lista.size() + " funcionários encontrados.\nExibindo os resultados na tabela.");
            resetTela();
            DefaultTableModel model = (DefaultTableModel) Tabela_Empresa.getModel();
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

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        resetTela();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        resetTela();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void textNomeEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomeEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNomeEmpresaActionPerformed

    private void textCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCnpjActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ID;
    private javax.swing.JTable Tabela_Empresa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JFormattedTextField textCnpj;
    private javax.swing.JTextField textEndereco;
    private javax.swing.JTextField textFax;
    private javax.swing.JTextField textID;
    private javax.swing.JTextField textNomeEmpresa;
    private javax.swing.JComboBox<String> textUf;
    // End of variables declaration//GEN-END:variables
}
