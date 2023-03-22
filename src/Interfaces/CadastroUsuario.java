
package Interfaces;

import Conexoes.UsuarioMetodos;
import Dados.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class CadastroUsuario extends javax.swing.JFrame {

    public CadastroUsuario() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Imagens/teste.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtEmail = new javax.swing.JTextField();
        botaoSalvarDados = new javax.swing.JButton();
        escritaCadastroUsuario = new javax.swing.JLabel();
        txtCadastroUsuario = new javax.swing.JTextField();
        escritaCadastroSenha = new javax.swing.JLabel();
        telefoneLabel = new javax.swing.JLabel();
        txtCadastroSenha = new javax.swing.JTextField();
        txtNomeCompleto = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        botaoCancelar = new javax.swing.JButton();
        escritaNome = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CADASTRO DE USUÁRIO");

        botaoSalvarDados.setText("Salvar");
        botaoSalvarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarDadosActionPerformed(evt);
            }
        });

        escritaCadastroUsuario.setText("Nome de usuário:");

        escritaCadastroSenha.setText("Senha:");

        telefoneLabel.setText("Telefone:");

        emailLabel.setText("E-mail:");

        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        escritaNome.setText("Nome completo:");

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(escritaNome)
                        .addComponent(emailLabel)
                        .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                        .addComponent(escritaCadastroUsuario)
                        .addComponent(txtCadastroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(escritaCadastroSenha)
                        .addComponent(txtCadastroSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(telefoneLabel)
                        .addComponent(botaoSalvarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNomeCompleto)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(escritaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(escritaCadastroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCadastroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(escritaCadastroSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCadastroSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telefoneLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoSalvarDados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoCancelar)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSalvarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarDadosActionPerformed

        condicaoPraSalvar();
        this.setVisible(false);
        
    }//GEN-LAST:event_botaoSalvarDadosActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed

        this.dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoSalvarDados;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel escritaCadastroSenha;
    private javax.swing.JLabel escritaCadastroUsuario;
    private javax.swing.JLabel escritaNome;
    private javax.swing.JLabel telefoneLabel;
    private javax.swing.JTextField txtCadastroSenha;
    private javax.swing.JTextField txtCadastroUsuario;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNomeCompleto;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables


private void condicaoPraSalvar(){
try {
            Usuario usuario = new Usuario();
            usuario.setUsuario(txtCadastroUsuario.getText());
            UsuarioMetodos metodos = new UsuarioMetodos();
            ResultSet resultadologin = metodos.verificarUsuario(usuario);
            
            if(resultadologin.next()){
                JOptionPane.showMessageDialog(null, "Usuário já cadastrado, por favor, tente outro nome de usuário.");
                
            }else{
                salvarUsuario();
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "CadastroUsuario: condicaoPraSalvar" + erro);
            
        }

}

private void salvarUsuario(){
        Usuario up = new Usuario();
        
        if(txtCadastroUsuario.getText().isEmpty() || txtNomeCompleto.getText().isEmpty() || txtCadastroSenha.getText().isEmpty() ||txtEmail.getText().isEmpty() || txtTelefone.getText().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Digite em todos os campos.");
                
            
        } else {
        up.setUsuario(txtCadastroUsuario.getText());
        up.setNomeCompleto(txtNomeCompleto.getText());
        up.setSenha(txtCadastroSenha.getText());
        up.setEmail(txtEmail.getText());
        up.setTelefone(txtTelefone.getText());
        UsuarioMetodos cadastro = new UsuarioMetodos();
        cadastro.salvarUsuarios(up);
        this.setVisible(false);
        }
    }


  private void limparDados(){
      txtCadastroUsuario.setText("");
      txtNomeCompleto.setText("");
      txtCadastroSenha.setText("");      
      txtEmail.setText("");       
      txtTelefone.setText("");      
  }
}
