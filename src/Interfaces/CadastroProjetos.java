
package Interfaces;

import Conexoes.ProjetosMetodos;
import Conexoes.UsuarioMetodos;
import Dados.Projetos;
import Dados.Usuario;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CadastroProjetos extends javax.swing.JFrame {

    
    public CadastroProjetos() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Imagens/teste.png")).getImage());
        mostrarUsuarios();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomeprojetotxt = new javax.swing.JLabel();
        txtUsuarioProprietario = new javax.swing.JTextField();
        usuarioproprietariotxt = new javax.swing.JLabel();
        descricaotxt = new javax.swing.JLabel();
        abaDesc = new javax.swing.JScrollPane();
        txtDescProjeto = new javax.swing.JTextArea();
        btSalvarProjetos = new javax.swing.JButton();
        btCancelarProjeto = new javax.swing.JButton();
        txtNomeProjeto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbUser = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CADASTRAR PROJETO");

        nomeprojetotxt.setText("Nome do projeto:");

        usuarioproprietariotxt.setText("Usuário proprietário (ID):");

        descricaotxt.setText("Descrição:");

        txtDescProjeto.setColumns(20);
        txtDescProjeto.setRows(5);
        abaDesc.setViewportView(txtDescProjeto);

        btSalvarProjetos.setText("Salvar");
        btSalvarProjetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarProjetosActionPerformed(evt);
            }
        });

        btCancelarProjeto.setText("Cancelar");
        btCancelarProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarProjetoActionPerformed(evt);
            }
        });

        tbUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "USUÁRIO"
            }
        ));
        jScrollPane1.setViewportView(tbUser);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSalvarProjetos, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descricaotxt)
                    .addComponent(txtNomeProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeprojetotxt)
                    .addComponent(btCancelarProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(abaDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuarioproprietariotxt)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(txtUsuarioProprietario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomeprojetotxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuarioproprietariotxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuarioProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descricaotxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(abaDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btSalvarProjetos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btCancelarProjeto)
                .addGap(22, 22, 22))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarProjetoActionPerformed
    this.setVisible(false);
    }//GEN-LAST:event_btCancelarProjetoActionPerformed

    private void btSalvarProjetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarProjetosActionPerformed
        String nome,descricao, autor;
        autor = txtUsuarioProprietario.getText();
        nome = txtNomeProjeto.getText();
        descricao = txtDescProjeto.getText();
        
         if(nome.isEmpty() || descricao.isEmpty() || autor.isEmpty() ){
            JOptionPane.showMessageDialog(null, "Digite em todos os campos.");
            
        } else{  
        
          salvarProjetos();
          this.setVisible(false);
         }
    }//GEN-LAST:event_btSalvarProjetosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane abaDesc;
    private javax.swing.JButton btCancelarProjeto;
    private javax.swing.JButton btSalvarProjetos;
    private javax.swing.JLabel descricaotxt;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nomeprojetotxt;
    private javax.swing.JTable tbUser;
    private javax.swing.JTextArea txtDescProjeto;
    private javax.swing.JTextField txtNomeProjeto;
    private javax.swing.JTextField txtUsuarioProprietario;
    private javax.swing.JLabel usuarioproprietariotxt;
    // End of variables declaration//GEN-END:variables
    public void salvarProjetos(){
        String nome,descricao, autor;
        autor = txtUsuarioProprietario.getText();
        int idautor = Integer.parseInt(autor);
        nome = txtNomeProjeto.getText();
        descricao = txtDescProjeto.getText();
        
        Projetos projetos = new Projetos();
        projetos.setNomeProjeto(nome);
        projetos.setIDAutorProjeto(idautor);
        projetos.setDescricaoProjeto(descricao);
        ProjetosMetodos metodoProjetos  = new ProjetosMetodos();
        metodoProjetos.cadastrarProjetos(projetos);
    }
    
        public void mostrarUsuarios(){
        
           DefaultTableModel modeloTabela = (DefaultTableModel) tbUser.getModel();
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
    
}
