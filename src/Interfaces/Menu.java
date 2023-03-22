
package Interfaces;

import Conexoes.UsuarioMetodos;
import Dados.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;



public class Menu extends javax.swing.JFrame {

    
    public Menu() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Imagens/teste.png")).getImage());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        txtBemVindo = new javax.swing.JLabel();
        btAcessarProjetos = new javax.swing.JButton();
        btAcessarRelatorio = new javax.swing.JButton();
        btAcessarUsuarios = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txtData = new javax.swing.JLabel();
        horaAtual = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ip = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuDeslog = new javax.swing.JMenu();
        deslogMenu = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        menuDesenvolvedores = new javax.swing.JMenuItem();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("iProject | Menu principal");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtBemVindo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtBemVindo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtBemVindo.setText("Bem-Vindo!");

        btAcessarProjetos.setText("ACESSAR");
        btAcessarProjetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAcessarProjetosActionPerformed(evt);
            }
        });

        btAcessarRelatorio.setText("ACESSAR");
        btAcessarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAcessarRelatorioActionPerformed(evt);
            }
        });

        btAcessarUsuarios.setText("ACESSAR");
        btAcessarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAcessarUsuariosActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel2.setText("PROJETOS");

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel3.setText("USUÁRIOS");

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel4.setText("RELATÓRIO");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Data e hora atual:");

        txtData.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtData.setForeground(new java.awt.Color(0, 0, 102));
        txtData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtData.setText("Data");
        txtData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        horaAtual.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        horaAtual.setForeground(new java.awt.Color(0, 0, 102));
        horaAtual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        horaAtual.setText("Hora");
        horaAtual.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setText("ACESSAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel1.setText("REQUISITOS");

        ip.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        ip.setForeground(new java.awt.Color(0, 0, 0));
        ip.setText("IP:");

        menuDeslog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logoIconPequena.png"))); // NOI18N
        menuDeslog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDeslogActionPerformed(evt);
            }
        });

        deslogMenu.setText("Deslogar agora");
        deslogMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deslogMenuActionPerformed(evt);
            }
        });
        menuDeslog.add(deslogMenu);

        jMenuBar1.add(menuDeslog);

        jMenu1.setText("Informações");

        menuDesenvolvedores.setText("Desenvolvedores");
        menuDesenvolvedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDesenvolvedoresActionPerformed(evt);
            }
        });
        jMenu1.add(menuDesenvolvedores);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(19, Short.MAX_VALUE)
                        .addComponent(btAcessarProjetos, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btAcessarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btAcessarRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(txtBemVindo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(horaAtual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ip, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAcessarProjetos)
                    .addComponent(btAcessarUsuarios)
                    .addComponent(btAcessarRelatorio)
                    .addComponent(jButton1))
                .addGap(117, 117, 117))
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(txtBemVindo)
                .addGap(2, 2, 2)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(horaAtual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ip)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btAcessarProjetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAcessarProjetosActionPerformed
        MenuProjetos menuprojetos = new MenuProjetos();
        menuprojetos.setVisible(true);
        
    }//GEN-LAST:event_btAcessarProjetosActionPerformed

    private void btAcessarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAcessarRelatorioActionPerformed
        GerarRelatorio gerarRelatorio = new GerarRelatorio();
        gerarRelatorio.setVisible(true);
        
    }//GEN-LAST:event_btAcessarRelatorioActionPerformed

    private void btAcessarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAcessarUsuariosActionPerformed
        MenuUsuarios menu = new MenuUsuarios();
        menu.setVisible(true);
    }//GEN-LAST:event_btAcessarUsuariosActionPerformed

    private void menuDeslogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDeslogActionPerformed

    }//GEN-LAST:event_menuDeslogActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        Usuario u = new Usuario();
        Login log = new Login();
        Date dataAtual = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        txtData.setText(formato.format(dataAtual));
        
        
        Timer timer = new Timer(1000, new hora());
        timer.start();
        
          try {
            String ipPc = InetAddress.getLocalHost().getHostAddress();
            ip.setText("IP: " + ipPc);
        } catch (UnknownHostException ex) {
            JOptionPane.showMessageDialog(null, "Não encontramos o IP LOCAL.");
        }
        
    }//GEN-LAST:event_formWindowOpened

    private void deslogMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deslogMenuActionPerformed
        Deslogar deslog = new Deslogar();
        deslog.setVisible(true);
    }//GEN-LAST:event_deslogMenuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MenuRequisito menu = new MenuRequisito();
        menu.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void menuDesenvolvedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDesenvolvedoresActionPerformed
        Informacoes info = new Informacoes();
        info.setVisible(true);
    }//GEN-LAST:event_menuDesenvolvedoresActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAcessarProjetos;
    private javax.swing.JButton btAcessarRelatorio;
    private javax.swing.JButton btAcessarUsuarios;
    private javax.swing.JMenuItem deslogMenu;
    private javax.swing.JLabel horaAtual;
    private javax.swing.JLabel ip;
    private javax.swing.JButton jButton1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenuItem menuDesenvolvedores;
    private javax.swing.JMenu menuDeslog;
    private javax.swing.JLabel txtBemVindo;
    private javax.swing.JLabel txtData;
    // End of variables declaration//GEN-END:variables
  
    
    public class hora implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            Calendar now = Calendar.getInstance();
            horaAtual.setText(String.format("%1$tH:%1$tM:%1$tS", now));
        }
    } 
}
    
