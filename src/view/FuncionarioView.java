/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import controller.FuncionarioController;
import javax.swing.JOptionPane;
import model.FuncionarioModel;

/**
 *
 * @author luixc
 */
public class FuncionarioView extends javax.swing.JInternalFrame {

    /**
     * Creates new form FuncionarioView
     */
    public FuncionarioView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbNovo = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbApagar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela_funcionarios = new javax.swing.JTable();
        textSetor = new javax.swing.JFormattedTextField();
        textNome = new javax.swing.JFormattedTextField();
        ID = new javax.swing.JLabel();
        textID = new javax.swing.JTextField();
        textCPF = new javax.swing.JFormattedTextField();
        textData_nascimento = new javax.swing.JFormattedTextField();
        jbPesquisar = new javax.swing.JButton();

        setClosable(true);

        jbNovo.setText("NOVO");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jbSalvar.setText("SALVAR");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbEditar.setText("EDITAR");
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbApagar.setText("APAGAR");
        jbApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbApagarActionPerformed(evt);
            }
        });

        jLabel1.setText("NOME:");

        jLabel2.setText("CPF:");

        jLabel3.setText("DATA DE NACIMENTO :");

        jLabel4.setText("SETOR:");

        Tabela_funcionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "CPF", "IDADE", "SETOR"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabela_funcionarios);

        ID.setText("ID:");

        try {
            textCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            textData_nascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jbPesquisar.setText("PESQUISAR");
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbNovo)
                        .addGap(60, 60, 60)
                        .addComponent(jbApagar)
                        .addGap(85, 85, 85)
                        .addComponent(jbEditar)
                        .addGap(102, 102, 102)
                        .addComponent(jbSalvar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(ID)
                        .addGap(6, 6, 6)
                        .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jbPesquisar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1)
                        .addGap(2, 2, 2)
                        .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)
                        .addComponent(textCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel3)
                        .addGap(5, 5, 5)
                        .addComponent(textData_nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel4)
                        .addGap(3, 3, 3)
                        .addComponent(textSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbNovo)
                    .addComponent(jbApagar)
                    .addComponent(jbEditar)
                    .addComponent(jbSalvar))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPesquisar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textData_nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        limparCampos();
        jbSalvar.setEnabled(true);
        textID.setEditable(true);
        textNome.setEditable(true);
        textCPF.setEditable(true);
        textData_nascimento.setEditable(true);
        textSetor.setEditable(true);
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed

        FuncionarioModel funcionario = new FuncionarioModel();
        String nome = textNome.getText();
        String cpf = textCPF.getText();
        String data_nascimento = textData_nascimento.getText();
        String setor= textSetor.getText();

        String dataSemMascara = data_nascimento.replaceAll("[^0-9]","");
        String cpfSemMascara = cpf.replaceAll("[^0-9]","");

        if (nome.isEmpty()|| setor.isEmpty()|| cpfSemMascara.isEmpty() || dataSemMascara.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, prencha todos os campos solicitados.");
        }

        else if ("".equals(textID.getText())) {
            funcionario.setNome(textNome.getText());
            funcionario.setSetor(textSetor.getText());
            funcionario.setCPF(textCPF.getText());
            funcionario.setData_nascimento(textData_nascimento.getText());

            if (FuncionarioController.inserir(funcionario)) {
                JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso.");
            }

            else {
                JOptionPane.showMessageDialog(this, "Falha no cadastro.");
            }

        }

        else  {
            funcionario.setId(Integer.parseInt(textID.getText()));
            funcionario.setNome(textNome.getText());
            funcionario.setSetor(textSetor.getText());
            funcionario.setCPF(textCPF.getText());
            funcionario.setData_nascimento(textData_nascimento.getText());

            if (FuncionarioController.editar(funcionario)) {
                JOptionPane.showMessageDialog(this, "O cadastro do funcionario foi atualizado com sucesso.");
            }

            else {
                JOptionPane.showMessageDialog(this, "Erro ao atualizar o Cadastro.");
            }
        }

        jbNovo.setEnabled(true);
        jbEditar.setEnabled(true);
        jbApagar.setEnabled(true);
        jbPesquisar.setEnabled(true);

        limparCampos();
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed

        jbSalvar.setEnabled(true);
        textNome.setEditable(true);
        textSetor.setEditable(true);
        textData_nascimento.setEditable(true);
        textCPF.setEditable(true);

        textID.setEditable(false);
        jbPesquisar.setEnabled(false);
        jbNovo.setEnabled(false);
        jbEditar.setEnabled(false);
        jbApagar.setEnabled(false);
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbApagarActionPerformed
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar ?", "Confirmação", JOptionPane.YES_NO_OPTION);

        if (resposta == JOptionPane.CLOSED_OPTION) {
            JOptionPane.showMessageDialog(this, "Operação cancelada.");
            limparCampos();
        }

        else if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Funcionário apagado com sucesso.");

            FuncionarioModel funcionario = new FuncionarioModel();
            funcionario.setId(Integer.parseInt(textID.getText()));

            jbNovo.setEnabled(true);
            jbPesquisar.setEnabled(true);
            textID.setEditable(true);

            jbSalvar.setEnabled(false);
            jbEditar.setEnabled(false);
            jbApagar.setEnabled(false);

            textNome.setEditable(false);
            textSetor.setEditable(false);
            textCPF.setEditable(false);
            textData_nascimento.setEditable(false);

            limparCampos();

            FuncionarioController.excluir(funcionario);

        }

        else {
            JOptionPane.showMessageDialog(this, "Ação Revogada.");
            limparCampos();
        }
        jbSalvar.setEnabled(true);
        jbEditar.setEnabled(true);
        jbApagar.setEnabled(true);
    }//GEN-LAST:event_jbApagarActionPerformed

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
        FuncionarioModel funcionario = new FuncionarioModel();
        funcionario.setId(Integer.parseInt(textID.getText()));
        FuncionarioModel funcionario_encontrado = FuncionarioController.selecionar(funcionario);

        if (funcionario_encontrado == null) {
            limparCampos();
            JOptionPane.showMessageDialog(this, "Funcionário não encontrado no banco de dados.");
        }

        else {
            textNome.setText(funcionario_encontrado.getNome());
            textCPF.setText(funcionario_encontrado.getCPF());
            textData_nascimento.setText(funcionario_encontrado.getData_nascimento());
            textSetor.setText(funcionario_encontrado.getSetor());

            //Habilita os botões Editar e Excluir
            jbEditar.setEnabled(true);
            jbApagar.setEnabled(true);
            jbSalvar.setEnabled(false);

            textNome.setEditable(false);
            textID.setEditable(false);
            textData_nascimento.setEditable(false);
            textSetor.setEditable(false);
        }
    }//GEN-LAST:event_jbPesquisarActionPerformed

   
    private void limparCampos() {
        textID.setText("");
        textCPF.setText("");
        textData_nascimento.setText("");
        textNome.setText("");
        textSetor.setText("");
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ID;
    private javax.swing.JTable Tabela_funcionarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbApagar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JFormattedTextField textCPF;
    private javax.swing.JFormattedTextField textData_nascimento;
    private javax.swing.JTextField textID;
    private javax.swing.JFormattedTextField textNome;
    private javax.swing.JFormattedTextField textSetor;
    // End of variables declaration//GEN-END:variables
}
