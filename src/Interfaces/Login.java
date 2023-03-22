
package Interfaces;

import Conexoes.UsuarioMetodos;
import Dados.Usuario;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login extends javax.swing.JFrame {


    public Login() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Imagens/teste.png")).getImage());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritaLogo = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        escritaUsuario = new javax.swing.JLabel();
        escritaSenha = new javax.swing.JLabel();
        TxtUsuario = new javax.swing.JTextField();
        TxtSenha = new javax.swing.JPasswordField();
        btEntrar = new javax.swing.JButton();
        btCadastrar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("iProject - Versão 1.0");
        setMaximumSize(null);
        setMinimumSize(null);
        setPreferredSize(new java.awt.Dimension(482, 340));
        setResizable(false);
        getContentPane().setLayout(null);

        escritaLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icone Principal.png"))); // NOI18N
        getContentPane().add(escritaLogo);
        escritaLogo.setBounds(180, 60, 110, 40);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logoIcon.png"))); // NOI18N
        getContentPane().add(logo);
        logo.setBounds(190, 10, 90, 80);

        escritaUsuario.setText("Seu usuário:");
        getContentPane().add(escritaUsuario);
        escritaUsuario.setBounds(130, 100, 170, 20);

        escritaSenha.setText("Sua senha:");
        getContentPane().add(escritaSenha);
        escritaSenha.setBounds(130, 150, 190, 16);
        getContentPane().add(TxtUsuario);
        TxtUsuario.setBounds(130, 120, 219, 23);
        getContentPane().add(TxtSenha);
        TxtSenha.setBounds(130, 170, 219, 23);

        btEntrar.setText("Entrar");
        btEntrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btEntrar);
        btEntrar.setBounds(180, 200, 120, 23);

        btCadastrar.setText("Cadastrar-se");
        btCadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btCadastrar);
        btCadastrar.setBounds(180, 230, 120, 23);

        btSair.setText("Sair");
        btSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        getContentPane().add(btSair);
        btSair.setBounds(180, 260, 120, 23);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarActionPerformed
        Logar();
    }//GEN-LAST:event_btEntrarActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed

        CadastroUsuario cadastrarusuario = new CadastroUsuario();
        cadastrarusuario.setVisible(true);
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        JOptionPane.showMessageDialog(null, "Volte sempre! :D");
        System.exit(0);
    }//GEN-LAST:event_btSairActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField TxtSenha;
    private javax.swing.JTextField TxtUsuario;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btEntrar;
    private javax.swing.JButton btSair;
    private javax.swing.JLabel escritaLogo;
    private javax.swing.JLabel escritaSenha;
    private javax.swing.JLabel escritaUsuario;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
public void Logar(){
        try {
            Usuario usuario = new Usuario();
            String loginUser = TxtUsuario.getText();
            usuario.setUsuario(loginUser);
            String loginPassword = TxtSenha.getText();
            usuario.setSenha(loginPassword);
            UsuarioMetodos metodos = new UsuarioMetodos();
            ResultSet resultadologin = metodos.autenticarUsuario(usuario);
            
            if(resultadologin.next()){
                Menu menu = new Menu();
                usuario.setUsuario(loginUser);
                JOptionPane.showMessageDialog(null, "BEM-VINDO AO iProject!");
                usuario.setUsuario(loginUser);
                menu.setVisible(true);
                this.dispose();
                usuario.setUsuario(loginUser);
                new Login().setVisible(false);
  
                
                
                
            }else{
                JOptionPane.showMessageDialog(null, "USUÁRIO OU SENHA INVÁLIDOS.");
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Login: " + erro);
            
        }

}
public void setarUsuario(){
            Usuario usuario = new Usuario();
            String loginUser = TxtUsuario.getText();
            usuario.setUsuario(loginUser);
            String loginPassword = TxtSenha.getText();
            usuario.setSenha(loginPassword);
 }








}
