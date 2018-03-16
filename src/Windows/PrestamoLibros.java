
package Windows;
import java.util.ArrayList;
import java.util.List;
import proyecto.biblioteca.Biblioteca;
import proyecto.biblioteca.Estudiante;
import proyecto.biblioteca.Libro;

public class PrestamoLibros extends javax.swing.JFrame {
    private List<Libro> listaLibros = new ArrayList<Libro>() ;
    private List<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();
    
    Libro l1 = new Libro("Harry Potter", "JK Rowling", "32AB");
    Libro l2 = new Libro("Señor de los anillos", "JR Tolkien", "35AB");
    Libro l3 = new Libro("El Principito", "Antonie de Saint", "45TR");
    Libro l4 = new Libro("Codigo Da Vinci", "Dan Brown", "19TY");
    Libro l5 = new Libro("It", "Stephen King", "15FR");
    Libro l6 = new Libro("Romeo y Julieta", "William Shakespeare", "11BV");
    Estudiante e1 = new Estudiante("Joseph", "2016146661");
    Estudiante e2 = new Estudiante("Alberto", "2016140420");
    Estudiante e3 = new Estudiante("Juan", "2016020304");
    Estudiante e4 = new Estudiante("Carlos", "2016171819");
    
    
        
    public PrestamoLibros() {
        initComponents();
        listaLibros.add(l1);
        listaLibros.add(l1);
        listaLibros.add(l1);
        listaLibros.add(l1);
        listaLibros.add(l1);
 
    }
  
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
        jLabel4.setText("Seleccione código del Libro");
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

        librosDisponibles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { l1.getNombre(), l2.getNombre(), l3.getNombre(), l4.getNombre(), l5.getNombre(), l6.getNombre() }));
        librosDisponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                librosDisponiblesActionPerformed(evt);
            }
        });
        getContentPane().add(librosDisponibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 130, -1));

        backButton.setText("Atras");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, 80, 40));

        confirmButton.setBackground(new java.awt.Color(51, 153, 0));
        confirmButton.setText("Confirmar");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });
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

    private void librosDisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_librosDisponiblesActionPerformed

    }//GEN-LAST:event_librosDisponiblesActionPerformed

    private void morosityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_morosityButtonActionPerformed
        for (int i = 0; i< listaLibros.size(); i++)
        {
            System.out.println(listaLibros.get(i).getNombre());
        }
    }//GEN-LAST:event_morosityButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        MainMenu menu = new MainMenu();
        menu.setVisible(true);
        PrestamoLibros.super.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void selectBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectBookButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectBookButtonActionPerformed

    private void codCarnetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codCarnetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codCarnetActionPerformed

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
