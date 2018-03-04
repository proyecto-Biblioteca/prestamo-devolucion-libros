
package Windows;


public class DevolverLibro extends javax.swing.JFrame {

  
    public DevolverLibro() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        numCarnetDevolucion = new javax.swing.JTextField();
        codLibroDevolucion = new javax.swing.JTextField();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        morosityReturn = new javax.swing.JButton();
        verifyReturn = new javax.swing.JButton();
        confirmReturn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(750, 600));
        setMinimumSize(new java.awt.Dimension(750, 600));
        setPreferredSize(new java.awt.Dimension(750, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Devolución de Libros");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Digite su número de Carnet");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Digite el código del libro");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha de devolución ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));
        getContentPane().add(numCarnetDevolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 140, -1));
        getContentPane().add(codLibroDevolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 140, -1));
        getContentPane().add(jXDatePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 150, -1));

        morosityReturn.setBackground(new java.awt.Color(0, 153, 255));
        morosityReturn.setText("Verificar Morosidad");
        getContentPane().add(morosityReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, -1, -1));

        verifyReturn.setBackground(new java.awt.Color(0, 153, 255));
        verifyReturn.setText("Verificar");
        verifyReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifyReturnActionPerformed(evt);
            }
        });
        getContentPane().add(verifyReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 130, -1));

        confirmReturn.setBackground(new java.awt.Color(0, 153, 255));
        confirmReturn.setText("Confirmar Multa");
        confirmReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmReturnActionPerformed(evt);
            }
        });
        getContentPane().add(confirmReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 140, -1));

        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 90, 50));

        jButton2.setBackground(new java.awt.Color(51, 153, 0));
        jButton2.setText("Confirmar");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, 90, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blue-gradient-2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-380, -160, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verifyReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifyReturnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verifyReturnActionPerformed

    private void confirmReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmReturnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmReturnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DevolverLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DevolverLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DevolverLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DevolverLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DevolverLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codLibroDevolucion;
    private javax.swing.JButton confirmReturn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private javax.swing.JButton morosityReturn;
    private javax.swing.JTextField numCarnetDevolucion;
    private javax.swing.JButton verifyReturn;
    // End of variables declaration//GEN-END:variables
}
