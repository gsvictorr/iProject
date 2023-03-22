
package Interfaces;

import Conexoes.UsuarioMetodos;
import Dados.Usuario;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class MenuUsuarios extends javax.swing.JFrame {


    public MenuUsuarios() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Imagens/teste.png")).getImage());
        mostrarUsuarios();
        limparUsuarios();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Usuariotxt = new javax.swing.JLabel();
        painelUsuarios = new javax.swing.JScrollPane();
        tabelaUsuarios = new javax.swing.JTable();
        btCadastrarUsuario = new javax.swing.JButton();
        btCarregarDados = new javax.swing.JButton();
        btDeletarUsuario = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        idusuariotxt = new javax.swing.JLabel();
        nomecompletotxt = new javax.swing.JTextField();
        usuariotxt = new javax.swing.JLabel();
        telefonetxt = new javax.swing.JTextField();
        emailtxt = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("iProject | Menu de usuários");

        Usuariotxt.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        Usuariotxt.setForeground(new java.awt.Color(0, 0, 102));
        Usuariotxt.setText("USUÁRIOS");

        tabelaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NOME COMPLETO", "USUÁRIO", "E-MAIL", "TELEFONE"
            }
        ));
        painelUsuarios.setViewportView(tabelaUsuarios);

        btCadastrarUsuario.setText("Cadastrar");
        btCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarUsuarioActionPerformed(evt);
            }
        });

        btCarregarDados.setText("Carregar");
        btCarregarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCarregarDadosActionPerformed(evt);
            }
        });

        btDeletarUsuario.setText("Deletar");
        btDeletarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarUsuarioActionPerformed(evt);
            }
        });

        btFechar.setText("Fechar");
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });

        btAtualizar.setText("Atualizar");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setText("Identificador do usuário (ID):");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("Nome completo:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("Usuário:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setText("E-mail:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setText("Telefone:");

        idusuariotxt.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        idusuariotxt.setForeground(new java.awt.Color(0, 0, 102));

        usuariotxt.setFont(new java.awt.Font("Dialog", 2, 11)); // NOI18N
        usuariotxt.setForeground(new java.awt.Color(0, 0, 102));

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Para excluir um usuário, primeiro carregue seus dados utilizando o botão \"Carregar\", depois selecione o botão \"Deletar\". ");

        jLabel7.setFont(new java.awt.Font("Dialog", 2, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("A exclusão é permanente, tome cuidado!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(painelUsuarios)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btCadastrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btCarregarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btDeletarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(usuariotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(nomecompletotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(idusuariotxt))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(telefonetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(23, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel6))
                            .addComponent(Usuariotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Usuariotxt)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(idusuariotxt))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nomecompletotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(usuariotxt))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(telefonetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(btSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btLimpar)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(painelUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btCadastrarUsuario)
                                .addComponent(btCarregarDados)
                                .addComponent(btDeletarUsuario)
                                .addComponent(btAtualizar)
                                .addComponent(btFechar)))))
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btFecharActionPerformed

    private void btCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarUsuarioActionPerformed
        CadastroUsuario cadastro = new CadastroUsuario();
        cadastro.setVisible(true);
        
    }//GEN-LAST:event_btCadastrarUsuarioActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed

        this.dispose();
        this.setVisible(true);
        mostrarUsuarios();
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limparUsuarios();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btCarregarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCarregarDadosActionPerformed
        alterarUsuarios();
    }//GEN-LAST:event_btCarregarDadosActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        salvarAlteracao();
        limparUsuarios();
        mostrarUsuarios();
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btDeletarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarUsuarioActionPerformed
       excluirUsuario();
       limparUsuarios();
       mostrarUsuarios();
    }//GEN-LAST:event_btDeletarUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Usuariotxt;
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCadastrarUsuario;
    private javax.swing.JButton btCarregarDados;
    private javax.swing.JButton btDeletarUsuario;
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JLabel idusuariotxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nomecompletotxt;
    private javax.swing.JScrollPane painelUsuarios;
    private javax.swing.JTable tabelaUsuarios;
    private javax.swing.JTextField telefonetxt;
    private javax.swing.JLabel usuariotxt;
    // End of variables declaration//GEN-END:variables
    public void mostrarUsuarios(){
        
           DefaultTableModel modeloTabela = (DefaultTableModel) tabelaUsuarios.getModel();
           UsuarioMetodos usuario = new UsuarioMetodos();
           modeloTabela.setNumRows(0);
           for(Usuario p: usuario.listarUsuarios()){
               modeloTabela.addRow(new Object[]{
                   p.getId(),
                   p.getNomeCompleto(),
                   p.getUsuario(),
                   p.getEmail(),
                   p.getTelefone()
               });
               
           }
    }
    
    private void alterarUsuarios(){
        int linhaSelecionada = tabelaUsuarios.getSelectedRow();
        idusuariotxt.setText(tabelaUsuarios.getModel().getValueAt(linhaSelecionada, 0).toString());
        nomecompletotxt.setText(tabelaUsuarios.getModel().getValueAt(linhaSelecionada, 1).toString());
        usuariotxt.setText(tabelaUsuarios.getModel().getValueAt(linhaSelecionada, 2).toString());
        emailtxt.setText(tabelaUsuarios.getModel().getValueAt(linhaSelecionada, 3).toString());
        telefonetxt.setText(tabelaUsuarios.getModel().getValueAt(linhaSelecionada, 4).toString());
    }
    
    private void limparUsuarios(){
        idusuariotxt.setText("");
        nomecompletotxt.setText("");
        telefonetxt.setText("");
        usuariotxt.setText("");
        emailtxt.setText("");
        nomecompletotxt.requestFocus();
    }
    private void salvarAlteracao(){
        
        String nome, usuario, email, telefone;
        int idusuario;
        
        nome = nomecompletotxt.getText();
        usuario = usuariotxt.getText();
        email = emailtxt.getText();
        telefone = telefonetxt.getText();
        idusuario = Integer.parseInt(idusuariotxt.getText());
        
        if(nome == null || usuario == null || email ==null ||telefone == null || idusuariotxt == null  ){
            JOptionPane.showMessageDialog(null, "Digite em todos os campos.");
            
        } else{
        
        Usuario user = new Usuario();
        user.setId(idusuario);
        user.setNomeCompleto(nome);
        user.setUsuario(usuario);
        user.setTelefone(telefone);
        user.setEmail(email);
        
        UsuarioMetodos metodos = new UsuarioMetodos();
        metodos.alterarUsuarios(user);
        }
    }
    
    public void excluirUsuario(){
       int idusuario; 
       idusuario = Integer.parseInt(idusuariotxt.getText());
       String nome, usuario, email, telefone;
        nome = nomecompletotxt.getText();
        usuario = usuariotxt.getText();
        email = emailtxt.getText();
        telefone = telefonetxt.getText();
       
       if(nome == null || usuario == null || email ==null ||telefone == null || idusuariotxt == null  ){
            JOptionPane.showMessageDialog(null, "Digite em todos os campos.");
            
        } else{
       Usuario user = new Usuario();
       user.setId(idusuario);
       UsuarioMetodos userMetodos = new UsuarioMetodos();
       userMetodos.excluirUsuarios(user);
       }
    }
}

