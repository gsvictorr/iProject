
package Interfaces;

import Conexoes.RequisitosMetodos;
import Dados.Requisitos;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class MenuRequisito extends javax.swing.JFrame {
     
    public MenuRequisito() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Imagens/teste.png")).getImage());
        limparRequisitos();
        mostrarRequisitos();
        MenuTBProjUser menu = new MenuTBProjUser();
        menu.setVisible(true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNomeReq = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtModuloReq = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtFuncionalidadesReq = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        txtComplexidadeReq = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtVersaoReq = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricaoReq = new javax.swing.JTextArea();
        btSalvarAlteracaoReq = new javax.swing.JButton();
        btCancelarAlteracaoReq = new javax.swing.JButton();
        txtFaseReq = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtEsforcoHorasReq = new javax.swing.JTextField();
        btCarregar = new javax.swing.JButton();
        btCriar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        txtIDReq = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtProjeto = new javax.swing.JLabel();
        btFechar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelaRequisitos = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btLimpar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtDtCriado = new javax.swing.JLabel();
        txtIDAutor = new javax.swing.JLabel();
        txtEstado = new javax.swing.JComboBox<>();
        txtPrioridade = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("iProject | Menu de requisitos");

        jLabel16.setText("Estado:");

        jLabel17.setText("Fase:");

        jLabel7.setText("Data de criação:");

        jLabel14.setText("Esforço estimado em horas:");
        jLabel14.setToolTipText("");

        jLabel1.setText("Identificador (ID):");

        jLabel2.setText("Nome do requisito:");
        jLabel2.setToolTipText("");

        jLabel5.setText("Módulo:");

        jLabel6.setText("Funcionalidades:");

        txtFuncionalidadesReq.setColumns(20);
        txtFuncionalidadesReq.setRows(5);
        jScrollPane2.setViewportView(txtFuncionalidadesReq);

        jLabel13.setText("Complexidade:");

        jLabel12.setText("Prioridade:");

        txtVersaoReq.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtVersaoReq.setName(""); // NOI18N

        jLabel8.setText("Autor (ID):");

        jLabel18.setText("Descrição:");

        txtDescricaoReq.setColumns(20);
        txtDescricaoReq.setRows(5);
        jScrollPane1.setViewportView(txtDescricaoReq);

        btSalvarAlteracaoReq.setText("Salvar");
        btSalvarAlteracaoReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarAlteracaoReqActionPerformed(evt);
            }
        });

        btCancelarAlteracaoReq.setText("Cancelar");
        btCancelarAlteracaoReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarAlteracaoReqActionPerformed(evt);
            }
        });

        jLabel11.setText("Versão:");

        btCarregar.setText("Carregar");
        btCarregar.setToolTipText("");
        btCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCarregarActionPerformed(evt);
            }
        });

        btCriar.setText("Cadastrar");
        btCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCriarActionPerformed(evt);
            }
        });

        btExcluir.setText("Deletar");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btAtualizar.setText("Atualizar");
        btAtualizar.setActionCommand("");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        txtIDReq.setForeground(new java.awt.Color(0, 0, 102));
        txtIDReq.setText("id ");

        jLabel3.setText("Identificador do projeto que pertence (ID):");

        txtProjeto.setForeground(new java.awt.Color(0, 0, 102));
        txtProjeto.setText("idprojeto");

        btFechar.setText("Fechar");
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });

        tabelaRequisitos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "DESCRIÇÃO", "PROJETO", "FUNCIONALIDADES", "FASE", "ESTADO", "TEMPO GASTO", "COMPLEXIDADE", "PRIORIDADE", "MÓDULO", "AUTOR", "DATA DE CRIAÇÃO", "VERSÃO"
            }
        ));
        jScrollPane4.setViewportView(tabelaRequisitos);

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("CAMPO DE BUSCA");

        jLabel10.setFont(new java.awt.Font("Dialog", 2, 11)); // NOI18N
        jLabel10.setText("Digite o ID do Projeto para buscar seus requisitos:");

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel9.setText("Para excluir um requisito, primeiro carregue seus dados utilizando o botão \"Carregar\", depois selecione o botão \"Deletar\". ");

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 0, 0));
        jLabel15.setText("A exclusão é permanente, tome cuidado!");

        jLabel19.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 102));
        jLabel19.setText("REQUISITOS");

        txtDtCriado.setForeground(new java.awt.Color(0, 0, 102));
        txtDtCriado.setText("jLabel20");

        txtIDAutor.setForeground(new java.awt.Color(0, 0, 102));
        txtIDAutor.setText("jLabel20");

        txtEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Iniciando","Especificado", "Em andamento", "Finalizado"}));

        txtPrioridade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Baixa", "Média", "Alta" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1684, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtIDReq, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtProjeto))
                                    .addComponent(jLabel5)
                                    .addComponent(txtNomeReq, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17)
                                    .addComponent(txtModuloReq, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel14)
                                    .addComponent(txtEsforcoHorasReq, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtEstado, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtFaseReq, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)))
                                .addGap(99, 99, 99)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtIDAutor)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDtCriado)
                                        .addGap(149, 149, 149))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(txtComplexidadeReq, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel12)
                                            .addComponent(txtPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(btSalvarAlteracaoReq, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btCancelarAlteracaoReq, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(232, 232, 232)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(txtBuscar)
                                                            .addComponent(btLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGap(178, 178, 178))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(jLabel4)
                                                        .addGap(226, 226, 226))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel9)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(btCarregar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(btCriar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(btFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(txtVersaoReq, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel15)
                                        .addGap(221, 221, 221)))))
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIDReq)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProjeto)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeReq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtModuloReq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFaseReq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addGap(1, 1, 1)
                        .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEsforcoHorasReq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVersaoReq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSalvarAlteracaoReq))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(txtDtCriado)
                                    .addComponent(txtIDAutor))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addGap(10, 10, 10)
                                .addComponent(txtComplexidadeReq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btCarregar)
                                    .addComponent(btCriar)
                                    .addComponent(btExcluir)
                                    .addComponent(btAtualizar)
                                    .addComponent(btFechar))
                                .addGap(48, 48, 48)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btLimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCancelarAlteracaoReq)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarAlteracaoReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarAlteracaoReqActionPerformed
        limparRequisitos();
        
    }//GEN-LAST:event_btCancelarAlteracaoReqActionPerformed

    private void btCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCarregarActionPerformed
      carregarReq();
    }//GEN-LAST:event_btCarregarActionPerformed

    private void btCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCriarActionPerformed
       CadastroRequisitos cad = new CadastroRequisitos();
       cad.setVisible(true);
       mostrarRequisitos();
    }//GEN-LAST:event_btCriarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        excluirRequisito();
        mostrarRequisitos();
        limparRequisitos();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        limparRequisitos();
        mostrarRequisitos();
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void btSalvarAlteracaoReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarAlteracaoReqActionPerformed
        alterarRequisitos();
        mostrarRequisitos();
    }//GEN-LAST:event_btSalvarAlteracaoReqActionPerformed

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btFecharActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
       String escolhaID = txtBuscar.getText();
       RequisitosMetodos requisitos = new RequisitosMetodos();
       DefaultTableModel modeloTabela = (DefaultTableModel) tabelaRequisitos.getModel();
       int l = tabelaRequisitos.getRowCount();
       
       if(l>0){
           while(l>0){
               ((DefaultTableModel)  tabelaRequisitos.getModel()).removeRow(l-1);
               l--;
           }
       }
       
        try {
            ResultSet result = requisitos.filtroRequisitos(escolhaID);
            DefaultTableModel mt = (DefaultTableModel) tabelaRequisitos.getModel();
            
            while(result.next()){
                Requisitos re = new Requisitos();
                re.setIDReq(result.getInt("id"));
                re.setNomeReq(result.getString("nomerequisito"));
                re.setDescReq(result.getString("descricaorequisito"));
                re.setIDProjetoReq(result.getInt("idprojeto"));
                re.setFuncionalidadeReq(result.getString("funcionalidades"));
                re.setFaseReq(result.getString("fasereq"));
                re.setEstadoReq(result.getString("estadoreq"));
                re.setEsforcoHoras(result.getString("esforcohoras"));
                re.setComplexidadeReq(result.getString("complexidade"));
                re.setPrioridadeReq(result.getString("prioridade"));
                re.setModuloReq(result.getString("modulo"));
                re.setAutorReq(result.getInt("idautor_projeto"));
                re.setDtCriacaoReq(result.getString("dtcriacao"));
                re.setVersaoReq(result.getString("versao"));
                
                
                mt.addRow(new Object[]{
                   re.getIDReq(),
                   re.getNomeReq(),
                   re.getDescReq(),
                   re.getIDProjetoReq(),
                   re.getFuncionalidadeReq(),
                   re.getFaseReq(),
                   re.getEstadoReq(),
                   re.getEsforcoHoras(),
                   re.getComplexidadeReq(),
                   re.getPrioridadeReq(),
                   re.getModuloReq(),
                   re.getAutorReq(),
                   re.getDtCriacaoReq(),
                   re.getVersaoReq()
                        
                });
                
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "MenuRequisitos: Busca :" + e);
        }
       
 
       
       
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        txtBuscar.setText("");
        mostrarRequisitos();
        limparRequisitos();
    }//GEN-LAST:event_btLimparActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCancelarAlteracaoReq;
    private javax.swing.JButton btCarregar;
    private javax.swing.JButton btCriar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSalvarAlteracaoReq;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tabelaRequisitos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtComplexidadeReq;
    private javax.swing.JTextArea txtDescricaoReq;
    private javax.swing.JLabel txtDtCriado;
    private javax.swing.JTextField txtEsforcoHorasReq;
    private javax.swing.JComboBox<String> txtEstado;
    private javax.swing.JTextField txtFaseReq;
    private javax.swing.JTextArea txtFuncionalidadesReq;
    private javax.swing.JLabel txtIDAutor;
    private javax.swing.JLabel txtIDReq;
    private javax.swing.JTextField txtModuloReq;
    private javax.swing.JTextField txtNomeReq;
    private javax.swing.JComboBox<String> txtPrioridade;
    private javax.swing.JLabel txtProjeto;
    private javax.swing.JTextField txtVersaoReq;
    // End of variables declaration//GEN-END:variables
    public void mostrarRequisitos(){
        
           DefaultTableModel modeloTabela = (DefaultTableModel) tabelaRequisitos.getModel();
           RequisitosMetodos requisitosmetodos = new RequisitosMetodos();
           modeloTabela.setNumRows(0);
           for(Requisitos r: requisitosmetodos.listarRequisitos()){
               modeloTabela.addRow(new Object[]{
                   r.getIDReq(),
                   r.getNomeReq(),
                   r.getDescReq(),
                   r.getIDProjetoReq(),
                   r.getFuncionalidadeReq(),
                   r.getFaseReq(),
                   r.getEstadoReq(),
                   r.getEsforcoHoras(),
                   r.getComplexidadeReq(),
                   r.getPrioridadeReq(),
                   r.getModuloReq(),
                   r.getAutorReq(),
                   r.getDtCriacaoReq(),
                   r.getVersaoReq()
               });
               
           }
    }
    private void carregarReq(){
            int linhaSelecionada = tabelaRequisitos.getSelectedRow();
            txtIDReq.setText(tabelaRequisitos.getModel().getValueAt(linhaSelecionada, 0).toString());
            txtNomeReq.setText(tabelaRequisitos.getModel().getValueAt(linhaSelecionada, 1).toString());
            txtDescricaoReq.setText(tabelaRequisitos.getModel().getValueAt(linhaSelecionada, 2).toString());
            txtProjeto.setText(tabelaRequisitos.getModel().getValueAt(linhaSelecionada, 3).toString());
            txtFuncionalidadesReq.setText(tabelaRequisitos.getModel().getValueAt(linhaSelecionada, 4).toString());
            txtFaseReq.setText(tabelaRequisitos.getModel().getValueAt(linhaSelecionada, 5).toString());
            txtEstado.setSelectedItem(tabelaRequisitos.getModel().getValueAt(linhaSelecionada, 6).toString());
            txtEsforcoHorasReq.setText(tabelaRequisitos.getModel().getValueAt(linhaSelecionada, 7).toString());
            txtComplexidadeReq.setText(tabelaRequisitos.getModel().getValueAt(linhaSelecionada, 8).toString());
            txtPrioridade.setSelectedItem(tabelaRequisitos.getModel().getValueAt(linhaSelecionada, 9).toString());
            txtModuloReq.setText(tabelaRequisitos.getModel().getValueAt(linhaSelecionada, 10).toString());
            txtIDAutor.setText(tabelaRequisitos.getModel().getValueAt(linhaSelecionada, 11).toString());
            txtDtCriado.setText(tabelaRequisitos.getModel().getValueAt(linhaSelecionada, 12).toString());
            txtVersaoReq.setText(tabelaRequisitos.getModel().getValueAt(linhaSelecionada, 13).toString());
            
            
            
    }
    
    private void limparRequisitos(){
        txtIDReq.setText("");
        txtNomeReq.setText("");
        txtDescricaoReq.setText("");
        txtProjeto.setText("");
        txtFuncionalidadesReq.setText("");
        txtFaseReq.setText("");
        txtEstado.setSelectedItem("");
        txtEsforcoHorasReq.setText("");
        txtComplexidadeReq.setText("");
        txtPrioridade.setSelectedItem("");
        txtModuloReq.setText("");
        txtIDAutor.setText("");
        txtDtCriado.setText("");
        txtVersaoReq.setText("");
        txtNomeReq.requestFocus();
    }
    private void alterarRequisitos(){
        
        String nome, descricao, funcionalidades, fase, estado, esforco, complexidade, prioridade, modulo, versao, dtcriacao;
        int idreq, idproj, idautor;

        nome = txtNomeReq.getText();
        descricao = txtDescricaoReq.getText();
        funcionalidades = txtFuncionalidadesReq.getText();
        fase = txtFaseReq.getText();
        estado = txtEstado.getSelectedItem().toString();
        esforco = txtEsforcoHorasReq.getText();
        complexidade = txtComplexidadeReq.getText();
        prioridade = txtPrioridade.getSelectedItem().toString();
        modulo = txtModuloReq.getText();
        versao = txtVersaoReq.getText();
        idreq = Integer.parseInt(txtIDReq.getText());
        idproj = Integer.parseInt(txtProjeto.getText());
        idautor = Integer.parseInt(txtIDAutor.getText());    
        dtcriacao = txtDtCriado.getText();
        

         if(nome.isEmpty() || descricao.isEmpty() || funcionalidades.isEmpty() || estado.equals("") || esforco.isEmpty() || complexidade.isEmpty() || prioridade.equals("")  || modulo.isEmpty() || versao.isEmpty() || dtcriacao.isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite em todos os campos ou carregue os dados primeiro.");

        } else{
        
        Requisitos r = new Requisitos();
        
        r.setNomeReq(nome);
        r.setDescReq(descricao);
        r.setFuncionalidadeReq(funcionalidades);
        r.setFaseReq(fase);
        r.setEstadoReq(estado);
        r.setEsforcoHoras(esforco);
        r.setComplexidadeReq(complexidade);
        r.setPrioridadeReq(prioridade);
        r.setModuloReq(modulo);
        r.setVersaoReq(versao);
        r.setIDReq(idreq);
        r.setIDProjetoReq(idproj);
        r.setAutorReq(idautor);
        r.setDtCriacaoReq(dtcriacao);
        RequisitosMetodos req = new RequisitosMetodos();
        req.alterarRequisitos(r);
        limparRequisitos();
         }
    }
    
        public void excluirRequisito(){
        String nome, descricao, funcionalidades, fase, estado, esforco, complexidade, prioridade, modulo, versao, dtcriacao;
        int idreq = Integer.parseInt(txtIDReq.getText());
        nome = txtNomeReq.getText();
        descricao = txtDescricaoReq.getText();
        funcionalidades = txtFuncionalidadesReq.getText();
        fase = txtFaseReq.getText();
        estado = txtEstado.getSelectedItem().toString();
        esforco = txtEsforcoHorasReq.getText();
        complexidade = txtComplexidadeReq.getText();
        prioridade = txtPrioridade.getSelectedItem().toString();
        modulo = txtModuloReq.getText();
        versao = txtVersaoReq.getText();
        idreq = Integer.parseInt(txtIDReq.getText());
        dtcriacao = txtDtCriado.getText();
        
        if(nome.isEmpty() || descricao.isEmpty() || funcionalidades.isEmpty() || estado.equals("") || esforco.isEmpty() || complexidade.isEmpty() || prioridade.equals("")  || modulo.isEmpty() || versao.isEmpty() || dtcriacao.isEmpty()){
        JOptionPane.showMessageDialog(null, "Digite em todos os campos ou carregue os dados primeiro.");
        limparRequisitos();

        } else{
        Requisitos r = new Requisitos();
        r.setIDReq(idreq);
        RequisitosMetodos metodos = new RequisitosMetodos();
        metodos.excluirRequisitos(r);
        
        
               
        }
    }
        
    
}
