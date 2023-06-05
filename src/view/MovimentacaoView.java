package view;

import controller.FuncionarioController;
import controller.MovimentacaoController;
import controller.VeiculoController;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.FuncionarioModel;
import model.MovimentacaoModel;
import model.VeiculoModel;
import util.Pesquisa;

public class MovimentacaoView extends javax.swing.JInternalFrame {
   
    MovimentacaoController movController = new MovimentacaoController();
    VeiculoController veiculoController = new VeiculoController();
    FuncionarioController funcionarioController = new FuncionarioController();
    boolean tabelaAtiva = true;

    public MovimentacaoView() {
        initComponents();
        resetTela();
        jtfId.setEditable(false);
        jtfIdVeiculo.setEditable(false);
        jtfIdFuncionario.setEditable(false);
        jtfTipoMov.setEditable(false);
    }

    private void limparCampos(){
        jtfId.setText("");
        jtfIdVeiculo.setText("");
        jtfIdFuncionario.setText("");
        jtfTipoMov.setText("");
        jftfData.setText("");
        jftfHora.setText("");
        jtfDestino.setText("");
        jftfQuilometragem.setText("");
    }
    
    public void carregarTabela() {
        
        ArrayList <MovimentacaoModel> movimentacoes = movController.selecionarTodos();
        VeiculoModel veiculo = new VeiculoModel();
        FuncionarioModel funcionario = new FuncionarioModel();
        DefaultTableModel modelo = (DefaultTableModel)jtMovimentacoes.getModel();
        modelo.setRowCount(0);
        
        for (int i = 0; i < movimentacoes.size(); i++) {
            veiculo.setId(movimentacoes.get(i).getIdVeiculo());
            funcionario.setId(movimentacoes.get(i).getIdFuncionario());
            modelo.addRow(new String[]{
                String.valueOf(movimentacoes.get(i).getId()), 
                movimentacoes.get(i).getTipo(),
                veiculoController.selecionar(veiculo).getModelo() + ' ' + veiculoController.selecionar(veiculo).getAno(),
                funcionarioController.selecionarID(funcionario).getNome(),
                movimentacoes.get(i).getData(),
                movimentacoes.get(i).getHora(),
                movimentacoes.get(i).getDestino(),
                String.valueOf(movimentacoes.get(i).getQuilometragem())
            });
        }
    }
    
    public void resetTela() {
        //Ativa os botões Novo, Limpar e Pesquisar
        jbNovo.setEnabled(true);
        jbLimpar.setEnabled(true);
        jbPesquisar.setEnabled(true);
        
        //Desativa os outros botões e campos de texto
        jbSalvar.setEnabled(false);
        jbEditar.setEnabled(false);
        jbExcluir.setEnabled(false);
        jbCancelar.setEnabled(false);
        jbPesquisarVeiculo.setEnabled(false);
        jbPesquisarFuncionario.setEnabled(false);
        
        jftfData.setEditable(false);
        jftfHora.setEditable(false);
        jtfDestino.setEditable(false);
        jftfQuilometragem.setEditable(false);
                
        //Recarrega a tabela, limpa os campos e ativa a flag do evento de clique da tabela
        carregarTabela();
        limparCampos();
        tabelaAtiva = true;
    }
    
    public void ativarEdicao() {
        //Desabilita os botões Novo, Editar, Excluir, Limpar e Pesquisar
        jbNovo.setEnabled(false);
        jbEditar.setEnabled(false);
        jbExcluir.setEnabled(false);
        jbPesquisar.setEnabled(false);
        
        //Habilita o botão Salvar e Cancelar e os campos de texto
        jbSalvar.setEnabled(true);
        jbCancelar.setEnabled(true);
        jbPesquisarVeiculo.setEnabled(true);
        jbPesquisarFuncionario.setEnabled(true);
        jftfData.setEditable(true);
        jftfHora.setEditable(true);
        jtfDestino.setEditable(true);
        jftfQuilometragem.setEditable(true);
        
        //Altera o status da flag que ativa o evento de clique na tabela para false
        tabelaAtiva = false;
    }
    
    public VeiculoModel getVeiculo() {
        VeiculoController veiculoController = new VeiculoController();
        VeiculoModel veiculoPesquisado = new VeiculoModel();
        
        veiculoPesquisado.setId(Integer.parseInt(jtfIdVeiculo.getText()));
        VeiculoModel veiculoEncontrado = veiculoController.selecionar(veiculoPesquisado);
        return veiculoEncontrado;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlId = new javax.swing.JLabel();
        jtfId = new javax.swing.JTextField();
        jlTipoMov = new javax.swing.JLabel();
        jlVeiculo = new javax.swing.JLabel();
        jlFuncionario = new javax.swing.JLabel();
        jlData = new javax.swing.JLabel();
        jftfData = new javax.swing.JFormattedTextField();
        jlHora = new javax.swing.JLabel();
        jftfHora = new javax.swing.JFormattedTextField();
        jlDestino = new javax.swing.JLabel();
        jtfDestino = new javax.swing.JTextField();
        jbNovo = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbPesquisar = new javax.swing.JButton();
        jspMovimentacoes = new javax.swing.JScrollPane();
        jtMovimentacoes = new javax.swing.JTable();
        jbPesquisarVeiculo = new javax.swing.JButton();
        jlQuilometragem = new javax.swing.JLabel();
        jtfIdVeiculo = new javax.swing.JTextField();
        jtfIdFuncionario = new javax.swing.JTextField();
        jbPesquisarFuncionario = new javax.swing.JButton();
        jtfTipoMov = new javax.swing.JTextField();
        jftfQuilometragem = new javax.swing.JFormattedTextField();

        setClosable(true);
        setTitle("Entrada e Saída de Veículos");

        jlId.setText("ID:");

        jlTipoMov.setText("Tipo de Movimentação:");

        jlVeiculo.setText("Veículo:");

        jlFuncionario.setText("Funcionário:");

        jlData.setText("Data:");

        try {
            jftfData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jlHora.setText("Hora");

        try {
            jftfHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jlDestino.setText("Destino:");

        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
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

        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbPesquisar.setText("Pesquisar");
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });

        jtMovimentacoes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tipo Mov.", "Veículo", "Funcionário", "Data", "Hora", "Destino", "KM"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtMovimentacoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtMovimentacoesMouseClicked(evt);
            }
        });
        jspMovimentacoes.setViewportView(jtMovimentacoes);

        jbPesquisarVeiculo.setText("Pesquisar");
        jbPesquisarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarVeiculoActionPerformed(evt);
            }
        });

        jlQuilometragem.setText("Quilometragem:");

        jbPesquisarFuncionario.setText("Pesquisar");
        jbPesquisarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarFuncionarioActionPerformed(evt);
            }
        });

        jftfQuilometragem.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfDestino)
                    .addComponent(jtfId, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jftfHora)
                    .addComponent(jftfData)
                    .addComponent(jlFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlTipoMov, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlDestino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlQuilometragem, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jtfIdFuncionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbPesquisarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jtfIdVeiculo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbPesquisarVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtfTipoMov)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jbNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jbPesquisar)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jftfQuilometragem, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jspMovimentacoes, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbNovo)
                            .addComponent(jbLimpar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbEditar)
                            .addComponent(jbExcluir))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbSalvar)
                            .addComponent(jbCancelar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbPesquisar)
                        .addGap(6, 6, 6)
                        .addComponent(jlId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jlTipoMov)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfTipoMov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlVeiculo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfIdVeiculo)
                            .addComponent(jbPesquisarVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addComponent(jlFuncionario)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfIdFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbPesquisarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addComponent(jlData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jftfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlHora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jftfHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlDestino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlQuilometragem, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jftfQuilometragem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jspMovimentacoes))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        limparCampos();
        ativarEdicao();
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        ativarEdicao();
        jftfData.setEditable(true);
        jftfHora.setEditable(true);
        jtfDestino.setEditable(true);
        jftfQuilometragem.setEditable(true);
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        MovimentacaoModel movimentacao = new MovimentacaoModel();
        movimentacao.setId(Integer.parseInt(jtfId.getText()));

        if (movController.excluir(movimentacao)) {
            JOptionPane.showMessageDialog(this, "Movimentação excluída com sucesso.");
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao excluir a movimentação.");
        }

        resetTela();
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
       
        MovimentacaoModel movimentacao = new MovimentacaoModel();

        //Se o campo ID está vazio, o botão Novo foi pressionado
        if ("".equals(jtfId.getText())) {
            movimentacao.setTipo(jtfTipoMov.getText());
            movimentacao.setIdVeiculo(Integer.parseInt(jtfIdVeiculo.getText()));
            movimentacao.setIdFuncionario(Integer.parseInt(jtfIdFuncionario.getText()));
            movimentacao.setData(jftfData.getText());
            movimentacao.setHora(jftfHora.getText());
            movimentacao.setDestino(jtfDestino.getText());
            movimentacao.setQuilometragem(Integer.parseInt(jftfQuilometragem.getText()));
                
            MovimentacaoModel movimentacaoAnterior = movController.selecionarVeiculoUltMov(movimentacao);
            
            if (movimentacaoAnterior == null) 
                movimentacaoAnterior = new MovimentacaoModel();
                
            if ("ENTRADA".equals(movimentacao.getTipo()) && movimentacaoAnterior.getQuilometragem() >= movimentacao.getQuilometragem())
                JOptionPane.showMessageDialog(this, "A quilometragem no retorno do veículo deve ser maior do que a quilometragem da última saída.");
            
            else if ("SAIDA".equals(movimentacao.getTipo()) && movimentacaoAnterior.getQuilometragem() > movimentacao.getQuilometragem())
                JOptionPane.showMessageDialog(this, "A quilometragem na saída do veículo deve ser maior ou igual à quilometragem da última entrada.");
            
            else {
                if (movController.inserir(movimentacao)) {
                    JOptionPane.showMessageDialog(this, "Movimentação realizada com sucesso.");
                    VeiculoController veiculoController = new VeiculoController();
                    veiculoController.atualizarStatus(getVeiculo());
                    resetTela();
                } 
                else JOptionPane.showMessageDialog(this, "Erro ao registrar a movimentação.");
            }
            
        } //Caso contrário, uma linha da tabela foi selecionada e o botão Editar foi pressionado
        else {
            movimentacao.setId(Integer.parseInt(jtfId.getText()));
            movimentacao.setIdVeiculo(Integer.parseInt(jtfIdVeiculo.getText()));
            movimentacao.setIdFuncionario(Integer.parseInt(jtfIdFuncionario.getText()));
            movimentacao.setData(jftfData.getText());
            movimentacao.setHora(jftfHora.getText());
            movimentacao.setDestino(jtfDestino.getText());
            movimentacao.setQuilometragem(Integer.parseInt(jftfQuilometragem.getText()));
            
            if (movController.editar(movimentacao)) {
                JOptionPane.showMessageDialog(this, "Os dados da movimentação foram atualizados com sucesso.");
                resetTela();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao atualizar dados do veículo.");
            }
            
        }

    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        resetTela();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
        Pesquisa p = new Pesquisa();
        String[] opcoesBusca = {"ID", "Veiculo", "Data"};
        List<MovimentacaoModel> lista = p.pesquisaMovimentacao(opcoesBusca);

        if (lista == null) {
            resetTela();
        } 
        else if (lista.size() == 0) {
            JOptionPane.showMessageDialog(null, "Nenhuma movimentação encontrada no banco de dados.");
            resetTela();
        }
        else if (lista.size() == 1) {
            JOptionPane.showMessageDialog(this, "1 Movimentação encontrada.\nExibindo o resultado nos campos de texto.");
            resetTela();
            MovimentacaoModel m = lista.get(0);
            
            jtfId.setText(Integer.toString(m.getId()));
            jtfTipoMov.setText(m.getTipo());
            jtfIdVeiculo.setText(Integer.toString(m.getIdVeiculo()));
            jtfIdFuncionario.setText(Integer.toString(m.getIdFuncionario()));
            jftfData.setText(m.getData());
            jftfHora.setText(m.getHora());
            jtfDestino.setText(m.getDestino());
            jftfQuilometragem.setText(Integer.toString(m.getQuilometragem()));
         
            jbEditar.setEnabled(true);
            jbExcluir.setEnabled(true);
            jbLimpar.setEnabled(true);
        } 
        else {
            JOptionPane.showMessageDialog(this, lista.size() + " movimentações encontradas.\nExibindo os resultados na tabela.");
            resetTela();
            DefaultTableModel model = (DefaultTableModel) jtMovimentacoes.getModel();
            model.setRowCount(0);

            for (MovimentacaoModel movEncontrada : lista) {
                model.addRow(new Object[]{
                    movEncontrada.getId(),
                    movEncontrada.getTipo(),
                    movEncontrada.getIdVeiculo(),
                    movEncontrada.getIdFuncionario(),
                    movEncontrada.getData(),
                    movEncontrada.getHora(),
                    movEncontrada.getDestino(),
                    movEncontrada.getQuilometragem()
                });
            }
        }
    }//GEN-LAST:event_jbPesquisarActionPerformed

    private void jtMovimentacoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtMovimentacoesMouseClicked
        
        if(tabelaAtiva == true) {
            int linha = jtMovimentacoes.getSelectedRow();
            DefaultTableModel modelo = (DefaultTableModel)jtMovimentacoes.getModel();
            MovimentacaoModel movimentacao = new MovimentacaoModel();
            movimentacao.setId(Integer.parseInt(modelo.getValueAt(linha, 0).toString()));
            MovimentacaoModel movEncontrada = movController.selecionar(movimentacao);
            
            jtfId.setText((modelo.getValueAt(linha, 0)).toString());
            jtfTipoMov.setText((modelo.getValueAt(linha, 1)).toString());
            jtfIdVeiculo.setText(String.valueOf(movEncontrada.getIdVeiculo()));
            jtfIdFuncionario.setText(String.valueOf(movEncontrada.getIdFuncionario()));
            jftfData.setText((modelo.getValueAt(linha,4)).toString());
            jftfHora.setText((modelo.getValueAt(linha,5)).toString());
            jtfDestino.setText((modelo.getValueAt(linha,6)).toString());
            jftfQuilometragem.setText((modelo.getValueAt(linha,7)).toString());

            jbEditar.setEnabled(true);
            jbExcluir.setEnabled(true);
        }
        
    }//GEN-LAST:event_jtMovimentacoesMouseClicked

    private void jbPesquisarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarVeiculoActionPerformed
        Pesquisa p = new Pesquisa();
        String[] opcoesBusca = {"ID", "Placa"};
        List<VeiculoModel> lista = p.pesquisaVeiculo(opcoesBusca);
        
        if (lista == null) {
            jtfIdVeiculo.setText("");
            jtfTipoMov.setText("");
        }
        
        else if (lista.size() == 0) {
            JOptionPane.showMessageDialog(null, "Veículo não encontrado no banco de dados.");
            jtfIdVeiculo.setText("");
            jtfTipoMov.setText("");
        }
        
        else if (lista.size() == 1) {
            VeiculoModel v = lista.get(0);
            JOptionPane.showMessageDialog(this, "Veículo encontrado: " + v.getMarca() + " " + v.getModelo() + " " + v.getAno() + " ");
            jtfIdVeiculo.setText(Integer.toString(v.getId()));
            if ("DISPONIVEL".equals(getVeiculo().getStatus()))
                jtfTipoMov.setText("SAIDA");
            else {
                jtfTipoMov.setText("ENTRADA");
                jtfDestino.setText("Empresa");
                MovimentacaoModel movimentacao = new MovimentacaoModel();
                movimentacao.setIdVeiculo(Integer.parseInt(jtfIdVeiculo.getText()));
                MovimentacaoModel movimentacaoAnterior = movController.selecionarVeiculoUltMov(movimentacao);
                jtfIdFuncionario.setText(Integer.toString(movimentacaoAnterior.getIdFuncionario()));
            }
                
            
            
        }
    }//GEN-LAST:event_jbPesquisarVeiculoActionPerformed

    private void jbPesquisarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarFuncionarioActionPerformed
        Pesquisa p = new Pesquisa();
        String[] opcoesBusca = {"ID","CPF"};
        List<FuncionarioModel> lista = p.pesquisaFuncionario(opcoesBusca);
        
        if (lista == null) {
            jtfIdFuncionario.setText("");
        }
        
        else if (lista.size() == 0) {
            JOptionPane.showMessageDialog(null, "Funcionário não encontrado no banco de dados.");
            jtfIdFuncionario.setText("");
        }
        
        else if (lista.size() == 1) {
            FuncionarioModel f = lista.get(0);
            JOptionPane.showMessageDialog(this, "Funcionário encontrado: " + f.getNome() + ".");
            jtfIdFuncionario.setText(Integer.toString(f.getId()));
        }
    }//GEN-LAST:event_jbPesquisarFuncionarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JButton jbPesquisarFuncionario;
    private javax.swing.JButton jbPesquisarVeiculo;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JFormattedTextField jftfData;
    private javax.swing.JFormattedTextField jftfHora;
    private javax.swing.JFormattedTextField jftfQuilometragem;
    private javax.swing.JLabel jlData;
    private javax.swing.JLabel jlDestino;
    private javax.swing.JLabel jlFuncionario;
    private javax.swing.JLabel jlHora;
    private javax.swing.JLabel jlId;
    private javax.swing.JLabel jlQuilometragem;
    private javax.swing.JLabel jlTipoMov;
    private javax.swing.JLabel jlVeiculo;
    private javax.swing.JScrollPane jspMovimentacoes;
    private javax.swing.JTable jtMovimentacoes;
    private javax.swing.JTextField jtfDestino;
    private javax.swing.JTextField jtfId;
    private javax.swing.JTextField jtfIdFuncionario;
    private javax.swing.JTextField jtfIdVeiculo;
    private javax.swing.JTextField jtfTipoMov;
    // End of variables declaration//GEN-END:variables
}
