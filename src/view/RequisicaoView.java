/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import controller.MovimentacaoController;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
<<<<<<< Updated upstream
import javax.swing.table.DefaultTableModel;
import model.EmpresasModel;
import model.MovimentacaoModel;
=======
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.EmpresasModel;
import model.FuncionarioModel;
import model.MovimentacaoModel;
import model.RequisicaoModel;
import model.VeiculoModel;
>>>>>>> Stashed changes
import util.Pesquisa;

/**
 *
 * @author luixc
 */
public class RequisicaoView extends javax.swing.JInternalFrame {
    MovimentacaoController controller = new MovimentacaoController();
    MovimentacaoModel  model = new MovimentacaoModel();
<<<<<<< Updated upstream
=======
    RequisicaoTM Model;
>>>>>>> Stashed changes
    
    boolean tabelaAtiva = true;

    public RequisicaoView() {
        initComponents();
<<<<<<< Updated upstream
    }

=======
        Model = new RequisicaoTM();
        TabelaCompras.setModel(Model);
    }

   

>>>>>>> Stashed changes
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbNovo = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
<<<<<<< Updated upstream
        jbPesquisar = new javax.swing.JButton();
=======
        JBpesquisarEmpresa = new javax.swing.JButton();
>>>>>>> Stashed changes
        jbLimpar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jlTitulo1 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        textCampoEmpresa = new javax.swing.JTextField();
<<<<<<< Updated upstream
        jTextField11 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jbPesquisar1 = new javax.swing.JButton();
        jbPesquisar2 = new javax.swing.JButton();
        textCampoVeiculo = new javax.swing.JTextField();
        textCampoFuncionario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
=======
        JTquantidade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jbPesquisar1 = new javax.swing.JButton();
        JbPesquisarFuncionario = new javax.swing.JButton();
        textCampoVeiculo = new javax.swing.JTextField();
        textCampoFuncionario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
>>>>>>> Stashed changes
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaCompras = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
<<<<<<< Updated upstream
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jbPesquisar3 = new javax.swing.JButton();

=======
        JTitens = new javax.swing.JTextField();
        JtValorUnitario = new javax.swing.JTextField();
        jbPesquisar3 = new javax.swing.JButton();
        JbAdicionar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Textplaca = new javax.swing.JTextField();
        JFT_date = new javax.swing.JFormattedTextField();

        setClosable(true);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
        getContentPane().add(jbSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 76, -1));
=======
        getContentPane().add(jbSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 76, -1));
>>>>>>> Stashed changes

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

<<<<<<< Updated upstream
        jbPesquisar.setText("Pesquisar");
        jbPesquisar.setMaximumSize(new java.awt.Dimension(72, 22));
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(jbPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));
=======
        JBpesquisarEmpresa.setText("Pesquisar");
        JBpesquisarEmpresa.setMaximumSize(new java.awt.Dimension(72, 22));
        JBpesquisarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBpesquisarEmpresaActionPerformed(evt);
            }
        });
        getContentPane().add(JBpesquisarEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));
>>>>>>> Stashed changes

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
<<<<<<< Updated upstream
        getContentPane().add(jbCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, 76, -1));
=======
        getContentPane().add(jbCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 76, -1));
>>>>>>> Stashed changes

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 830, 10));

        jLabel2.setText("Nome da Empresa:");
<<<<<<< Updated upstream
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 110, 30));

        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 70, 620));
=======
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 100, 30));

        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 10, 710));
>>>>>>> Stashed changes

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 830, 20));

        jlTitulo1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        jlTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
<<<<<<< Updated upstream
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
=======
        jlTitulo1.setText("Requisição de Compras");
        jlTitulo1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, -1));

        jSeparator5.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, -20, 10, 740));
        getContentPane().add(textCampoEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 200, -1));

        JTquantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTquantidadeActionPerformed(evt);
            }
        });
        getContentPane().add(JTquantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 150, -1));

        jLabel1.setText("Nome do Veiculo:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 100, 20));

        jLabel5.setText("Nome Funcionario");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, -1, 20));
>>>>>>> Stashed changes

        jbPesquisar1.setText("Pesquisar");
        jbPesquisar1.setMaximumSize(new java.awt.Dimension(72, 22));
        jbPesquisar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisar1ActionPerformed(evt);
            }
        });
<<<<<<< Updated upstream
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
=======
        getContentPane().add(jbPesquisar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        JbPesquisarFuncionario.setText("Pesquisar");
        JbPesquisarFuncionario.setMaximumSize(new java.awt.Dimension(72, 22));
        JbPesquisarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbPesquisarFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(JbPesquisarFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, -1, -1));
        getContentPane().add(textCampoVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 90, -1));
>>>>>>> Stashed changes

        textCampoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCampoFuncionarioActionPerformed(evt);
            }
        });
<<<<<<< Updated upstream
        getContentPane().add(textCampoFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 80, 210, -1));
=======
        getContentPane().add(textCampoFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 80, 200, -1));
>>>>>>> Stashed changes

        jLabel8.setText("Data:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 30, 30));

<<<<<<< Updated upstream
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 130, -1));

=======
>>>>>>> Stashed changes
        jSeparator4.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 830, 10));

        TabelaCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
<<<<<<< Updated upstream
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
=======
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Itens", "Quantidade", "Valor Unitario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
>>>>>>> Stashed changes

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TabelaCompras);
        if (TabelaCompras.getColumnModel().getColumnCount() > 0) {
<<<<<<< Updated upstream
            TabelaCompras.getColumnModel().getColumn(0).setResizable(false);
            TabelaCompras.getColumnModel().getColumn(1).setResizable(false);
            TabelaCompras.getColumnModel().getColumn(2).setResizable(false);
            TabelaCompras.getColumnModel().getColumn(3).setResizable(false);
            TabelaCompras.getColumnModel().getColumn(4).setResizable(false);
            TabelaCompras.getColumnModel().getColumn(5).setResizable(false);
            TabelaCompras.getColumnModel().getColumn(6).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 830, 400));
=======
            TabelaCompras.getColumnModel().getColumn(1).setMinWidth(100);
            TabelaCompras.getColumnModel().getColumn(1).setMaxWidth(120);
            TabelaCompras.getColumnModel().getColumn(2).setMinWidth(100);
            TabelaCompras.getColumnModel().getColumn(2).setMaxWidth(120);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 830, 470));
>>>>>>> Stashed changes

        jLabel10.setText("Quantidade:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, 30));

        jLabel12.setText("Itens:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, 40));

        jLabel13.setText("Valor Unitario:");
<<<<<<< Updated upstream
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
=======
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, -1, 30));

        JTitens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTitensActionPerformed(evt);
            }
        });
        getContentPane().add(JTitens, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 240, -1));

        JtValorUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtValorUnitarioActionPerformed(evt);
            }
        });
        getContentPane().add(JtValorUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 160, -1));
>>>>>>> Stashed changes

        jbPesquisar3.setText("Pesquisar");
        jbPesquisar3.setMaximumSize(new java.awt.Dimension(72, 22));
        jbPesquisar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisar3ActionPerformed(evt);
            }
        });
        getContentPane().add(jbPesquisar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, -1));

<<<<<<< Updated upstream
=======
        JbAdicionar.setText("Adicionar");
        JbAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbAdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(JbAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, -1, -1));

        jButton2.setText("Excluir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, -1, -1));
        getContentPane().add(Textplaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 90, -1));

        try {
            JFT_date.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(JFT_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, -1, -1));

>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
        jbPesquisar.setEnabled(false);
=======
        JBpesquisarEmpresa.setEnabled(false);
>>>>>>> Stashed changes

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
<<<<<<< Updated upstream
        jbPesquisar.setEnabled(true);
=======
        JBpesquisarEmpresa.setEnabled(true);
>>>>>>> Stashed changes

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

<<<<<<< Updated upstream
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
=======
//     s
>>>>>>> Stashed changes
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

<<<<<<< Updated upstream
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
=======
    
    private void JBpesquisarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBpesquisarEmpresaActionPerformed
      Pesquisa p = new Pesquisa();
        String[] opcoesBusca = {"ID", "Nome"};
        List<EmpresasModel> lista = p.pesquisaEmpresas(opcoesBusca);
        
         if (lista.size() == 0 || lista == null) {
            JOptionPane.showMessageDialog(null, "Veículo não encontrado no banco de dados.");
            textCampoEmpresa.setText("");
        }
        
        else if (lista.size() == 1) {
            EmpresasModel v = lista.get(0);
            JOptionPane.showMessageDialog(this, "Empresa Encontrada: \n  " + v.getNomeEmpresa()+ "\n" + v.getCnpj() + "\n" + v.getEndereco()+ "\n" + v.getFax()+"\n"+ v.getUf() );
            textCampoEmpresa.setText(v.getNomeEmpresa());
        }
    }//GEN-LAST:event_JBpesquisarEmpresaActionPerformed

    private void JTquantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTquantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTquantidadeActionPerformed
>>>>>>> Stashed changes

    private void jbPesquisar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbPesquisar1ActionPerformed

<<<<<<< Updated upstream
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
=======
    private void JbPesquisarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbPesquisarFuncionarioActionPerformed
        Pesquisa p = new Pesquisa();
        String[] opcoesBusca = {"ID", "Placa"};
        List<FuncionarioModel> lista = p.pesquisaFuncionario(opcoesBusca);
        
        if (lista == null) {
            textCampoFuncionario.setText("");
        }
        
        else if (lista.size() == 0) {
            JOptionPane.showMessageDialog(null, "Funcionario não encontrado no banco de dados.");
            textCampoFuncionario.setText("");
        }
        
        else if (lista.size() == 1) {
            FuncionarioModel v = lista.get(0);
            JOptionPane.showMessageDialog(this, "Funcionario Encontrado:\n  " + v.getNome()+ "\n" + v.getCPF() + "\n"+ v.getSetor() + " ");
            textCampoFuncionario.setText(v.getNome());
         
        }
    }//GEN-LAST:event_JbPesquisarFuncionarioActionPerformed

    private void JTitensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTitensActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTitensActionPerformed

    private void JtValorUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtValorUnitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtValorUnitarioActionPerformed

    private void jbPesquisar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisar3ActionPerformed
       Pesquisa p = new Pesquisa();
        String[] opcoesBusca = {"ID", "Placa"};
        List<VeiculoModel> lista = p.pesquisaVeiculo(opcoesBusca);
        
        if (lista == null) {
            textCampoVeiculo.setText("");
        }
        
        else if (lista.size() == 0) {
            JOptionPane.showMessageDialog(null, "Veículo não encontrado no banco de dados.");
            textCampoVeiculo.setText("");
        }
        
        else if (lista.size() == 1) {
            VeiculoModel v = lista.get(0);
            JOptionPane.showMessageDialog(this, "Veículo encontrado: \n " + v.getMarca() + "\n " + v.getModelo() + "\n " + v.getAno() + " ");
            textCampoVeiculo.setText(v.getModelo());
            Textplaca.setText(v.getPlaca());
        }
>>>>>>> Stashed changes
    }//GEN-LAST:event_jbPesquisar3ActionPerformed

    private void textCampoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCampoFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCampoFuncionarioActionPerformed

<<<<<<< Updated upstream

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaCompras;
=======
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    RequisicaoModel requisicaoModel = new RequisicaoModel();
    Model.remove(HEIGHT);
        
        
        //((DefaultTableModel) TabelaCompras.getModel()).removeRow(TabelaCompras.getSelectedRow());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void JbAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbAdicionarActionPerformed
    RequisicaoModel requisicao = new RequisicaoModel();
    requisicao.setItens(JTitens.getText());
    requisicao.setQuantidade(Integer.valueOf(JTquantidade.getText()));
    requisicao.setValorUnitario(Float.parseFloat(JtValorUnitario.getText()));
    
    Model.addCompras(requisicao);
    }//GEN-LAST:event_JbAdicionarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBpesquisarEmpresa;
    private javax.swing.JFormattedTextField JFT_date;
    private javax.swing.JTextField JTitens;
    private javax.swing.JTextField JTquantidade;
    private javax.swing.JButton JbAdicionar;
    private javax.swing.JButton JbPesquisarFuncionario;
    private javax.swing.JTextField JtValorUnitario;
    private javax.swing.JTable TabelaCompras;
    private javax.swing.JTextField Textplaca;
    private javax.swing.JButton jButton2;
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField3;
=======
>>>>>>> Stashed changes
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbNovo;
<<<<<<< Updated upstream
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JButton jbPesquisar1;
    private javax.swing.JButton jbPesquisar2;
=======
    private javax.swing.JButton jbPesquisar1;
>>>>>>> Stashed changes
    private javax.swing.JButton jbPesquisar3;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JLabel jlTitulo1;
    private javax.swing.JTextField textCampoEmpresa;
    private javax.swing.JTextField textCampoFuncionario;
    private javax.swing.JTextField textCampoVeiculo;
    // End of variables declaration//GEN-END:variables
}
