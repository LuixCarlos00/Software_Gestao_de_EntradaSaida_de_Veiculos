package view;

import controller.VeiculoController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.VeiculoModel;

public class VeiculoView extends javax.swing.JInternalFrame {
    VeiculoController v = new VeiculoController();
    boolean tabelaAtiva = true;
    
    public VeiculoView() {
        initComponents();
        
        carregarTabela();
        
        //Ao abrir a janela, desabilita os campos de texto e os botões Salvar, Editar e Excluir
        jtfID.setEditable(false);
        jtfPlaca.setEditable(false);
        jtfMarca.setEditable(false);
        jtfModelo.setEditable(false);
        jftfAno.setEditable(false);
        
        jbSalvar.setEnabled(false);
        jbEditar.setEnabled(false);
        jbExcluir.setEnabled(false);
        jbCancelar.setEnabled(false);
    }

    public void resetTela() {
        //Ativa os botões Novo e Limpar
        jbNovo.setEnabled(true);
        jbLimpar.setEnabled(true);
        
        //Desativa os outros botões e campos de texto
        jbSalvar.setEnabled(false);
        jbEditar.setEnabled(false);
        jbExcluir.setEnabled(false);
        jbCancelar.setEnabled(false);
        jtfPlaca.setEditable(false);
        jtfMarca.setEditable(false);
        jtfModelo.setEditable(false);
        jftfAno.setEditable(false);
        
        //Esvazia todos os campos de texto
        jtfID.setText("");
        jtfPlaca.setText("");
        jtfMarca.setText("");
        jtfModelo.setText("");
        jftfAno.setText("");
        
        //Recarrega a tabela
        carregarTabela();
        //Altera o status da flag que ativa o evento de clique na tabela para true
        tabelaAtiva = true;
    }
    
    public void ativarEdicao() {
        //Desabilita os botões Novo, Editar, Excluir e Limpar
        jbNovo.setEnabled(false);
        jbEditar.setEnabled(false);
        jbExcluir.setEnabled(false);
        jbLimpar.setEnabled(false);
        
        //Habilita o botão Salvar e Cancelar e os campos de texto
        jbSalvar.setEnabled(true);
        jbCancelar.setEnabled(true);
        jtfPlaca.setEditable(true);
        jtfMarca.setEditable(true);
        jtfModelo.setEditable(true);
        jftfAno.setEditable(true);
        
        //Altera o status da flag que ativa o evento de clique na tabela para false
        tabelaAtiva = false;
    }
    
    public void carregarTabela() {
        
        ArrayList <VeiculoModel> veiculos = v.selecionarTodos();
        DefaultTableModel modelo = (DefaultTableModel)jtVeiculos.getModel();
        modelo.setRowCount(0);
        
        for (int i = 0; i < veiculos.size(); i++) {
            modelo.addRow(new String[]{
                String.valueOf(veiculos.get(i).getId()), 
                veiculos.get(i).getPlaca(),
                veiculos.get(i).getMarca(),
                veiculos.get(i).getModelo(),
                Integer.toString(veiculos.get(i).getAno()),
                veiculos.get(i).getStatus()
            });
        }
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
        jbExcluir = new javax.swing.JButton();
        jlMarca = new javax.swing.JLabel();
        jlAno = new javax.swing.JLabel();
        jlPlaca = new javax.swing.JLabel();
        jftfAno = new javax.swing.JFormattedTextField();
        jsVeiculos = new javax.swing.JScrollPane();
        jtVeiculos = new javax.swing.JTable();
        jtfMarca = new javax.swing.JTextField();
        jtfPlaca = new javax.swing.JTextField();
        jlModelo = new javax.swing.JLabel();
        jtfModelo = new javax.swing.JTextField();
        jlID = new javax.swing.JLabel();
        jtfID = new javax.swing.JTextField();
        jbLimpar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cadastro de Veículos");

        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbEditar.setText("Editar");
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

        jlMarca.setText("Marca:");

        jlAno.setText("Ano:");

        jlPlaca.setText("Placa:");

        jftfAno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jtVeiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Placa", "Marca", "Modelo", "Ano", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtVeiculos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        jtVeiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtVeiculosMouseClicked(evt);
            }
        });
        jsVeiculos.setViewportView(jtVeiculos);

        jtfMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfMarcaActionPerformed(evt);
            }
        });

        jlModelo.setText("Modelo:");

        jlID.setText("ID:");

        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlModelo)
                                .addGap(11, 11, 11))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlAno, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlMarca, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlPlaca, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlID, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfID)
                            .addComponent(jtfPlaca)
                            .addComponent(jtfMarca)
                            .addComponent(jtfModelo)
                            .addComponent(jftfAno)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jbEditar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbNovo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(jbLimpar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(jsVeiculos, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jsVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbNovo)
                            .addComponent(jbLimpar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbEditar)
                            .addComponent(jbExcluir))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbSalvar)
                            .addComponent(jbCancelar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlID))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlPlaca)
                            .addComponent(jtfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlMarca)
                            .addComponent(jtfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlModelo)
                            .addComponent(jtfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlAno)
                            .addComponent(jftfAno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        jtfID.setText("");
        jtfPlaca.setText("");
        jtfMarca.setText("");
        jtfModelo.setText("");
        jftfAno.setText("");
        ativarEdicao();
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        
        VeiculoModel veiculo = new VeiculoModel();
        
        //Se o campo ID está vazio, o botão Novo foi pressionado
        if ("".equals(jtfID.getText())) {
            veiculo.setPlaca(jtfPlaca.getText());
            veiculo.setMarca(jtfMarca.getText());
            veiculo.setModelo(jtfModelo.getText());
            veiculo.setAno(Integer.parseInt(jftfAno.getText()));
            
            if (v.inserir(veiculo)) 
                JOptionPane.showMessageDialog(this, "Veículo cadastrado com sucesso.");
            else
                JOptionPane.showMessageDialog(this, "Erro ao cadastrar o veículo.");
        }
        
        //Caso contrário, uma linha da tabela foi selecionada e o botão Editar foi pressionado
        else {
            veiculo.setId(Integer.parseInt(jtfID.getText()));
            veiculo.setPlaca(jtfPlaca.getText());
            veiculo.setMarca(jtfMarca.getText());
            veiculo.setModelo(jtfModelo.getText());

            if(v.editar(veiculo))
                JOptionPane.showMessageDialog(this, "Os dados do veículo foram atualizados com sucesso.");
            else
                JOptionPane.showMessageDialog(this, "Erro ao atualizar dados do veículo.");
        }

        resetTela();
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jtVeiculosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtVeiculosMouseClicked
        
        if(tabelaAtiva == true) {
            int linha = jtVeiculos.getSelectedRow();
            DefaultTableModel modelo = (DefaultTableModel)jtVeiculos.getModel();

            jtfID.setText((modelo.getValueAt(linha, 0)).toString());
            jtfPlaca.setText((modelo.getValueAt(linha, 1)).toString());
            jtfMarca.setText((modelo.getValueAt(linha,2)).toString());
            jtfModelo.setText((modelo.getValueAt(linha,3)).toString());
            jftfAno.setText((modelo.getValueAt(linha,4)).toString());

            jbEditar.setEnabled(true);
            jbExcluir.setEnabled(true);
        }
        
    }//GEN-LAST:event_jtVeiculosMouseClicked

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        ativarEdicao();
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        VeiculoModel veiculo = new VeiculoModel();
        veiculo.setId(Integer.parseInt(jtfID.getText()));
        
        if(v.excluir(veiculo))
            JOptionPane.showMessageDialog(this, "Veículo excluído com sucesso.");
        else
            JOptionPane.showMessageDialog(this, "Erro ao excluir o veículo.");
        
        resetTela();
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        resetTela();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jtfMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfMarcaActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        resetTela();
    }//GEN-LAST:event_jbCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JFormattedTextField jftfAno;
    private javax.swing.JLabel jlAno;
    private javax.swing.JLabel jlID;
    private javax.swing.JLabel jlMarca;
    private javax.swing.JLabel jlModelo;
    private javax.swing.JLabel jlPlaca;
    private javax.swing.JScrollPane jsVeiculos;
    private javax.swing.JTable jtVeiculos;
    private javax.swing.JTextField jtfID;
    private javax.swing.JTextField jtfMarca;
    private javax.swing.JTextField jtfModelo;
    private javax.swing.JTextField jtfPlaca;
    // End of variables declaration//GEN-END:variables
}