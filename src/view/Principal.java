package view;

import controller.UsuarioController;
import javax.swing.JOptionPane;
import model.UsuarioModel;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        UsuarioController usuario = new UsuarioController();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        Area_trabalho = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jmbMenuPrincipal = new javax.swing.JMenuBar();
        Cadastro = new javax.swing.JMenu();
        Cadastro_Funcionario = new javax.swing.JMenuItem();
        Cadastro_veiculo = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        Controle_Entrada_Saida = new javax.swing.JMenu();
        Nova_Entrada_Saida = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jmOutros = new javax.swing.JMenu();
        Sobre = new javax.swing.JMenuItem();
        jmiLogout = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Area_trabalho.setBackground(new java.awt.Color(50, 50, 50));
        Area_trabalho.setPreferredSize(new java.awt.Dimension(809, 606));
        Area_trabalho.setLayout(null);
        Area_trabalho.add(jSeparator1);
        jSeparator1.setBounds(1030, 20, 0, 180);

        Cadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cog_add.png"))); // NOI18N
        Cadastro.setText("Cadastros");
        Cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroActionPerformed(evt);
            }
        });

        Cadastro_Funcionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user_add.png"))); // NOI18N
        Cadastro_Funcionario.setText("Funcionários");
        Cadastro_Funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cadastro_FuncionarioActionPerformed(evt);
            }
        });
        Cadastro.add(Cadastro_Funcionario);

        Cadastro_veiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/car_add.png"))); // NOI18N
        Cadastro_veiculo.setText("Veículos");
        Cadastro_veiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cadastro_veiculoActionPerformed(evt);
            }
        });
        Cadastro.add(Cadastro_veiculo);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/report_user.png"))); // NOI18N
        jMenuItem2.setText("Empresas");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        Cadastro.add(jMenuItem2);

        jmbMenuPrincipal.add(Cadastro);

        Controle_Entrada_Saida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/book_open.png"))); // NOI18N
        Controle_Entrada_Saida.setText("Movimentações de Veículos");

        Nova_Entrada_Saida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/page_paintbrush.png"))); // NOI18N
        Nova_Entrada_Saida.setText("Controle de Entradas/Saídas");
        Nova_Entrada_Saida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nova_Entrada_SaidaActionPerformed(evt);
            }
        });
        Controle_Entrada_Saida.add(Nova_Entrada_Saida);

        jmbMenuPrincipal.add(Controle_Entrada_Saida);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/money.png"))); // NOI18N
        jMenu3.setText("Controle de Gastos");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bullet_wrench.png"))); // NOI18N
        jMenuItem1.setText("Requisição de compras");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jmbMenuPrincipal.add(jMenu3);

        jmOutros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/plugin.png"))); // NOI18N
        jmOutros.setText("Outros");

        Sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/information.png"))); // NOI18N
        Sobre.setText("Sobre");
        Sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SobreActionPerformed(evt);
            }
        });
        jmOutros.add(Sobre);

        jmiLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/status_busy.png"))); // NOI18N
        jmiLogout.setText("Logout");
        jmiLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiLogoutActionPerformed(evt);
            }
        });
        jmOutros.add(jmiLogout);

        jmbMenuPrincipal.add(jmOutros);

        setJMenuBar(jmbMenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Area_trabalho, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Area_trabalho, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Cadastro_FuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cadastro_FuncionarioActionPerformed
        FuncionarioView cadastro = new FuncionarioView();
        Area_trabalho.add(cadastro);
        cadastro.setVisible(true);
    }//GEN-LAST:event_Cadastro_FuncionarioActionPerformed

    private void Cadastro_veiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cadastro_veiculoActionPerformed
        VeiculoView veiculo = new VeiculoView();
        Area_trabalho.add(veiculo);
        veiculo.setVisible(true);
    }//GEN-LAST:event_Cadastro_veiculoActionPerformed

    private void Nova_Entrada_SaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nova_Entrada_SaidaActionPerformed
        MovimentacaoView entrada = new MovimentacaoView();
        Area_trabalho.add(entrada);
        entrada.setVisible(true);
    }//GEN-LAST:event_Nova_Entrada_SaidaActionPerformed

    private void jmiLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiLogoutActionPerformed
        setVisible(false);
        LoginView login = new LoginView();
        login.setVisible(true);
    }//GEN-LAST:event_jmiLogoutActionPerformed


    private void SobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SobreActionPerformed

        JOptionPane.showMessageDialog(this, "O software de controle de frota de veículos e gastos é uma solução \n "
                + "completa para empresas que precisam gerenciar sua frota de forma \n"
                + "eficiente e econômica. Com este software, é possível monitorar o uso \n"
                + "dos veículos, programar manutenções preventivas, controlar o consumo\n"
                + "de combustível e registrar todas as despesas relacionadas à frota.\n"
                + "Além disso, o software oferece relatórios detalhados que ajudam na \n"
                + "tomada de decisões estratégicas para reduzir custos e aumentar a produtividade.\n"
                + "Com uma interface fácil de usar e suporte técnico especializado, o software é\n"
                + "uma escolha ideal para empresas de todos os tamanhos que desejam maximizar o\n"
                + "desempenho de sua frota.\n"
                + "Entre em contato conosco para saber mais e solicitar uma demonstração.\n"
                + "Desenvolvido por: Talles.R & Luiz.C\n"
                + "ζξ\n"
                + "┌─┬┐\n"
                + "│☆├┘\n"
                + "└─┘\n"
                + "Cafe", "Sobre", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_SobreActionPerformed


    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed

    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        RequisicaoView manutencao = new RequisicaoView();
        Area_trabalho.add(manutencao);
        manutencao.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void CadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroActionPerformed

    }//GEN-LAST:event_CadastroActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        EmpresasView emp = new EmpresasView();
        Area_trabalho.add(emp);
        emp.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Area_trabalho;
    private javax.swing.JMenu Cadastro;
    private javax.swing.JMenuItem Cadastro_Funcionario;
    private javax.swing.JMenuItem Cadastro_veiculo;
    private javax.swing.JMenu Controle_Entrada_Saida;
    private javax.swing.JMenuItem Nova_Entrada_Saida;
    private javax.swing.JMenuItem Sobre;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenu jmOutros;
    private javax.swing.JMenuBar jmbMenuPrincipal;
    private javax.swing.JMenuItem jmiLogout;
    // End of variables declaration//GEN-END:variables
}
