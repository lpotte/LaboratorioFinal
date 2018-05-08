
import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiantes
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        botonInicio.setBackground(new java.awt.Color(214, 177, 161));
        contrasena.setBackground(null);
      
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        contrasena = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        botonInicio = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        linea = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        err = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contrasena.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        contrasena.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contrasena.setBorder(null);
        contrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contrasenaMouseClicked(evt);
            }
        });
        jPanel1.add(contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 220, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 220, 310));

        botonInicio.setBackground(new java.awt.Color(214, 177, 161));
        botonInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonInicio.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonInicioMouseMoved(evt);
            }
        });
        botonInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonInicioMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonInicioMouseExited(evt);
            }
        });
        botonInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Iniciar Sesión");
        botonInicio.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 10));

        jPanel1.add(botonInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 190, 30));

        linea.setBackground(new java.awt.Color(214, 177, 161));
        linea.setForeground(new java.awt.Color(214, 177, 161));
        jPanel1.add(linea, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 220, 20));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("X");
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 50, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32306402.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, -310, 570, 740));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/acua.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, 400, 400, 330));
        jPanel1.add(err, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 210, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 653));

        pack();
    }// </editor-fold>//GEN-END:initComponents
String contra = "aherrera";
    private void botonInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonInicioMouseExited
      botonInicio.setBackground(new java.awt.Color(232, 190, 168));
    }//GEN-LAST:event_botonInicioMouseExited

    private void botonInicioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonInicioMouseMoved
         botonInicio.setBackground(new java.awt.Color(214, 177, 161));
    }//GEN-LAST:event_botonInicioMouseMoved

    private void botonInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonInicioMouseClicked
     contrasena.getText();
       err.setText("");
     if(contrasena.getText().equals(contra)){
        Menú_principal mn = new Menú_principal();
        mn.setVisible(true);
        mn.setLocationRelativeTo(null);
        this.dispose();
        }else{
        if(contrasena.getText().equals("")){
        err.setText("*Por favor digite la contraseña");
        }else{
            err.setText("*Contraseña errónea");
            contrasena.setText("");
        }
        }   // TODO add your handling code here:
    }//GEN-LAST:event_botonInicioMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void contrasenaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contrasenaMouseClicked
        linea.setBackground(Color.yellow);
    }//GEN-LAST:event_contrasenaMouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
     linea.setBackground(new java.awt.Color(214, 177, 161));   // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botonInicio;
    private javax.swing.JPasswordField contrasena;
    private javax.swing.JLabel err;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator linea;
    // End of variables declaration//GEN-END:variables
}
