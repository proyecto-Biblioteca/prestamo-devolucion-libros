
package Windows;

public class PrestamoLibros extends javax.swing.JFrame {

    /**
     * Creates new form BookLoan
     */
    public PrestamoLibros() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        numCarnet = new javax.swing.JTextField();
        codCarnet = new javax.swing.JTextField();
        loanDate = new org.jdesktop.swingx.JXDatePicker();
        librosDisponibles = new javax.swing.JComboBox<>();
        backButton = new javax.swing.JButton();
        confirmButton = new javax.swing.JButton();
        morosityButton = new javax.swing.JButton();
        selectBookButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 600));
        setPreferredSize(new java.awt.Dimension(750, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Préstamo de Libros");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Digite su número de carnet");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Digite el código del libro");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha de préstamo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ver lista de libros disponibles");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, -1, -1));
        getContentPane().add(numCarnet, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 140, -1));

        codCarnet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codCarnetActionPerformed(evt);
            }
        });
        getContentPane().add(codCarnet, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 140, -1));
        getContentPane().add(loanDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 160, -1));

        librosDisponibles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        librosDisponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                librosDisponiblesActionPerformed(evt);
            }
        });
        getContentPane().add(librosDisponibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 130, -1));

        backButton.setText("Atras");
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, 80, 40));

        confirmButton.setBackground(new java.awt.Color(51, 153, 0));
        confirmButton.setText("Confirmar");
        getContentPane().add(confirmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, 100, 40));

        morosityButton.setBackground(new java.awt.Color(0, 153, 255));
        morosityButton.setText("Comprobar Morosidad");
        morosityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                morosityButtonActionPerformed(evt);
            }
        });
        getContentPane().add(morosityButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, -1, -1));

        selectBookButton.setBackground(new java.awt.Color(0, 153, 255));
        selectBookButton.setText("Seleccionar");
        selectBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectBookButtonActionPerformed(evt);
            }
        });
        getContentPane().add(selectBookButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 150, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blue-gradient-2.jpg"))); // NOI18N
        jLabel1.setText("D");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codCarnetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codCarnetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codCarnetActionPerformed

    private void librosDisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_librosDisponiblesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_librosDisponiblesActionPerformed

    private void selectBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectBookButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectBookButtonActionPerformed

    private void morosityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_morosityButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_morosityButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PrestamoLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrestamoLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrestamoLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrestamoLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrestamoLibros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTextField codCarnet;
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox<String> librosDisponibles;
    private org.jdesktop.swingx.JXDatePicker loanDate;
    private javax.swing.JButton morosityButton;
    private javax.swing.JTextField numCarnet;
    private javax.swing.JButton selectBookButton;
    // End of variables declaration//GEN-END:variables
}
