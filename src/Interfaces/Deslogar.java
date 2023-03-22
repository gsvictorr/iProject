
package Interfaces;

public class Deslogar extends javax.swing.JFrame {


    public Deslogar() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Imagens/teste.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDeslogar = new javax.swing.JLabel();
        btDeslogar = new javax.swing.JButton();
        btNaoDeslogar = new javax.swing.JButton();
        txtDadosSalvos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DESLOGAR");

        txtDeslogar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDeslogar.setText("Deseja deslogar?");

        btDeslogar.setText("SIM");
        btDeslogar.setFocusPainted(false);
        btDeslogar.setFocusable(false);
        btDeslogar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btDeslogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeslogarActionPerformed(evt);
            }
        });

        btNaoDeslogar.setText("NÃO");
        btNaoDeslogar.setFocusPainted(false);
        btNaoDeslogar.setFocusable(false);
        btNaoDeslogar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btNaoDeslogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNaoDeslogarActionPerformed(evt);
            }
        });

        txtDadosSalvos.setForeground(new java.awt.Color(153, 0, 0));
        txtDadosSalvos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDadosSalvos.setText("Os dados não salvos serão perdidos.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btDeslogar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btNaoDeslogar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 15, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtDadosSalvos)
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtDeslogar)
                                .addGap(70, 70, 70))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDeslogar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDadosSalvos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNaoDeslogar)
                    .addComponent(btDeslogar))
                .addGap(14, 14, 14))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btDeslogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeslogarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btDeslogarActionPerformed

    private void btNaoDeslogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNaoDeslogarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btNaoDeslogarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDeslogar;
    private javax.swing.JButton btNaoDeslogar;
    private javax.swing.JLabel txtDadosSalvos;
    private javax.swing.JLabel txtDeslogar;
    // End of variables declaration//GEN-END:variables
}
