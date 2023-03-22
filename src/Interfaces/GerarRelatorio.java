
package Interfaces;

import Conexoes.ProjetosMetodos;
import Conexoes.RequisitosMetodos;
import Dados.Projetos;
import Dados.Requisitos;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class GerarRelatorio extends javax.swing.JFrame {

    public GerarRelatorio() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Imagens/teste.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        relatoriotxt = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        comboSelecao = new javax.swing.JComboBox<>();
        txtBuscar = new javax.swing.JTextField();
        txtLabelBuscar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("iProject | Relatório");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        relatoriotxt.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        relatoriotxt.setForeground(new java.awt.Color(255, 255, 255));
        relatoriotxt.setText("RELATÓRIO");

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "SELECIONE O ITEM"
            }
        ));
        jScrollPane2.setViewportView(tabela);

        jLabel1.setText("Selecione o item para gerar relatório:");

        comboSelecao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Selecione", "Projetos", "Requisitos" }));

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        txtLabelBuscar.setFont(new java.awt.Font("Dialog", 2, 11)); // NOI18N
        txtLabelBuscar.setText("Buscar:");

        jLabel2.setFont(new java.awt.Font("Dialog", 2, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Digite o ID do Autor para buscar seus projetos");

        jLabel3.setFont(new java.awt.Font("Dialog", 2, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Digite o ID do Projeto para buscar seus requisitos");

        jLabel4.setFont(new java.awt.Font("Dialog", 2, 11)); // NOI18N
        jLabel4.setText("Caso selecione requisitos:");

        jLabel5.setFont(new java.awt.Font("Dialog", 2, 11)); // NOI18N
        jLabel5.setText("Caso selecione projetos:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(206, 206, 206)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(comboSelecao, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel2))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel3))))
                                    .addComponent(jLabel1))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLabelBuscar)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(465, 465, 465)
                                .addComponent(relatoriotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 197, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(relatoriotxt)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboSelecao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2))
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtLabelBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        buscarArgumentos();
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        MenuTBProjUser mpu = new MenuTBProjUser();
        mpu.setVisible(true);
    }//GEN-LAST:event_formWindowOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboSelecao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel relatoriotxt;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JLabel txtLabelBuscar;
    // End of variables declaration//GEN-END:variables
    public void mostrarProjetosParaRelatorio(){
        
           DefaultTableModel modeloTabela = (DefaultTableModel) tabela.getModel();
           tabela.setModel(new javax.swing.table.DefaultTableModel(   
                new Object[][]{
                },
                new String[]{
                    "ID", "NOME", "DESCRIÇÃO", "ID AUTOR"
                }
        ));
           
           ProjetosMetodos projetosmetodos = new ProjetosMetodos();
           modeloTabela.setNumRows(0);
           for(Projetos p: projetosmetodos.PesquisarProjetos()){
               modeloTabela.addRow(new Object[]{
               p.getIDProjeto(),
                   p.getNomeProjeto(),
                   p.getDescricaoProjeto(),
                       p.getIDAutorProjeto()
               });
               
               
           }
    }
    public void mostrarRequisitosParaRelatorio(){
           DefaultTableModel modeloTabela = (DefaultTableModel) tabela.getModel();
           tabela.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                },
                new String[]{
                    "ID", "NOME", "DESCRIÇÃO", "PROJETO", "FUNCIONALIDADES", "FASE", "ESTADO", "TEMPO GASTO", "COMPLEXIDADE", "PRIORIDADE", "MÓDULO", "AUTOR", "DATA DE CRIAÇÃO", "VERSÃO"
                }
        ));
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
    
    public void buscarArgumentos(){
        
        String escolha = comboSelecao.getSelectedItem().toString();
        
        if(escolha.equals("Projetos")){
            mostrarProjetosParaRelatorio();
            buscarProjetos();
        }
        
        if(escolha.equals("Requisitos")){
            mostrarRequisitosParaRelatorio();
            buscarRequisitos();
            
        }
        
        
    }
    public void buscarRequisitos(){
       String escolhaID = txtBuscar.getText();
       RequisitosMetodos requisitos = new RequisitosMetodos();
       DefaultTableModel modeloTabela = (DefaultTableModel) tabela.getModel();
       int l = tabela.getRowCount();
       
       if(l>0){
           while(l>0){
               ((DefaultTableModel)  tabela.getModel()).removeRow(l-1);
               l--;
           }
       }
       
        try {
            ResultSet result = requisitos.filtroRequisitosRelatorio(escolhaID);
            DefaultTableModel mt = (DefaultTableModel) tabela.getModel();
            
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
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "GerarRelatorio: BuscaRequisitos :" + erro);
        }
              
    }

    
    public void buscarProjetos(){
       String escolhaID = txtBuscar.getText();
       ProjetosMetodos projetos = new ProjetosMetodos();
       DefaultTableModel modeloTabela = (DefaultTableModel) tabela.getModel();
       int l = tabela.getRowCount();
       
       if(l>0){
           while(l>0){
               ((DefaultTableModel)  tabela.getModel()).removeRow(l-1);
               l--;
           }
       }
       
        try {
        ResultSet result = projetos.filtroProjetos(escolhaID);
        DefaultTableModel mt = (DefaultTableModel) tabela.getModel();
        
        while(result.next()){
        Projetos projeto = new Projetos();
        projeto.setIDProjeto(result.getInt("id"));
        projeto.setNomeProjeto(result.getString("nomeprojeto"));
        projeto.setDescricaoProjeto(result.getString("descricao"));
        projeto.setIDAutorProjeto(result.getInt("idautor"));
        
                       mt.addRow(new Object[]{
                       projeto.getIDProjeto(),
                       projeto.getNomeProjeto(),
                       projeto.getDescricaoProjeto(),
                       projeto.getIDAutorProjeto()
                        
                });
             }
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "GerarRelatorio: BuscaProjetos :" + erro);
        }
    }
    
   
}
