package view;

import controller.UsuarioController;
import javax.swing.JOptionPane;
import model.UsuarioModel;

public class CriarContaView extends javax.swing.JFrame {

    UsuarioController usuario = new UsuarioController();

    public CriarContaView() {
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

        jpCriarConta = new javax.swing.JPanel();
        jlUsuario = new javax.swing.JLabel();
        jtfUsuario = new javax.swing.JTextField();
        jlSenha = new javax.swing.JLabel();
        jlRepetirSenha = new javax.swing.JLabel();
        jbCriarUsuario = new javax.swing.JButton();
        jlTitulo = new javax.swing.JLabel();
        jtfSenha = new javax.swing.JPasswordField();
        jtfRepetirSenha = new javax.swing.JPasswordField();
        jbVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Novo Usuário");

        jlUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jlUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/status_online.png"))); // NOI18N
        jlUsuario.setText("Usuário:");

        jtfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfUsuarioActionPerformed(evt);
            }
        });

        jlSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlSenha.setForeground(new java.awt.Color(255, 255, 255));
        jlSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/key.png"))); // NOI18N
        jlSenha.setText("Senha:");

        jlRepetirSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlRepetirSenha.setForeground(new java.awt.Color(255, 255, 255));
        jlRepetirSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/key.png"))); // NOI18N
        jlRepetirSenha.setText("Digite a senha novamente:");

        jbCriarUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbCriarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jbCriarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/accept.png"))); // NOI18N
        jbCriarUsuario.setText("Criar usuário");
        jbCriarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCriarUsuarioActionPerformed(evt);
            }
        });

        jlTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("Criar novo usuário");
        jlTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jbVoltar.setText("Voltar");
        jbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpCriarContaLayout = new javax.swing.GroupLayout(jpCriarConta);
        jpCriarConta.setLayout(jpCriarContaLayout);
        jpCriarContaLayout.setHorizontalGroup(
            jpCriarContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
            .addGroup(jpCriarContaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpCriarContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlRepetirSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfUsuario)
                    .addComponent(jtfSenha)
                    .addComponent(jtfRepetirSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpCriarContaLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jbCriarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpCriarContaLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jbVoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpCriarContaLayout.setVerticalGroup(
            jpCriarContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCriarContaLayout.createSequentialGroup()
                .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jtfUsuario)
                .addGap(18, 18, 18)
                .addComponent(jlSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlRepetirSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfRepetirSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jbCriarUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbVoltar)
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpCriarConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jpCriarConta, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbCriarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCriarUsuarioActionPerformed
        String senha = jtfSenha.getText();
        String repetirSenha = jtfRepetirSenha.getText();
        String user = jtfUsuario.getText();

        if (senha.isEmpty() || repetirSenha.isEmpty() || user.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos.");
        } else if (senha.contains(" ") || repetirSenha.contains(" ") || user.contains(" ")) {
            JOptionPane.showMessageDialog(this, "Não é possível cadastrar usuário com espaços em branco.");
        } else if (senha.equals(repetirSenha)) {
            UsuarioModel usuario = new UsuarioModel();
            usuario.setNome(jtfUsuario.getText());
            usuario.setSenha(jtfSenha.getText());
            usuario.setAdmin("N");

            if (this.usuario.inserir(usuario)) {
                JOptionPane.showMessageDialog(this, "Usuário cadastrado com sucesso.");
                LoginView login = new LoginView();
                login.setVisible(true);
                setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao cadastrar novo usuário.");
            }

        } else {
            JOptionPane.showMessageDialog(this, "As senhas correspondem .");
            limparCampos();
            jtfUsuario.requestFocus();
        }
    }//GEN-LAST:event_jbCriarUsuarioActionPerformed

    private void jtfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfUsuarioActionPerformed

    private void jbVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltarActionPerformed
        LoginView login = new LoginView();
        login.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jbVoltarActionPerformed

    private void limparCampos() {
        jtfRepetirSenha.setText("");
        jtfSenha.setText("");
        jtfUsuario.setText("");

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbCriarUsuario;
    private javax.swing.JButton jbVoltar;
    private javax.swing.JLabel jlRepetirSenha;
    private javax.swing.JLabel jlSenha;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JPanel jpCriarConta;
    private javax.swing.JPasswordField jtfRepetirSenha;
    private javax.swing.JPasswordField jtfSenha;
    private javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables
}
