
package inf;

import codes.DBconect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class register extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    
    public register() {
        initComponents();
        conn = DBconect.connect();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pwrdbox1 = new javax.swing.JPasswordField();
        unamebox1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        createbtn.setBackground(new java.awt.Color(51, 51, 51));
        createbtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        createbtn.setForeground(new java.awt.Color(255, 255, 0));
        createbtn.setText("CREATE");
        createbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createbtnActionPerformed(evt);
            }
        });
        getContentPane().add(createbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 595, -1, -1));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("CREATE USER NAME");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("CREATE PASSWORD");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, -1, -1));

        pwrdbox1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        pwrdbox1.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(pwrdbox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, 307, -1));

        unamebox1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        unamebox1.setForeground(new java.awt.Color(51, 51, 51));
        unamebox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unamebox1ActionPerformed(evt);
            }
        });
        getContentPane().add(unamebox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 307, -1));

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("SIGN UP TO STUDENT MANAGEMENT SYSTEM");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Screenshot 2024-06-13 000454.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void unamebox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unamebox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unamebox1ActionPerformed

    private void createbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createbtnActionPerformed
           
        login lg1 = new login();
        lg1.setVisible(true);
        this.dispose();
           
           String cuname;
           String cpword;
           
           cuname = unamebox1.getText();
           cpword = pwrdbox1.getText();
           
           try {
               String sql = "INSERT INTO register(Uname,Password)VALUES ('"+cuname+"' ,' "+cpword+"')";
               pst = conn.prepareStatement(sql);
               pst.execute();
               JOptionPane.showMessageDialog(null, "Registered successfully");
            
        } catch (Exception e) {
               JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_createbtnActionPerformed

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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField pwrdbox1;
    private javax.swing.JTextField unamebox1;
    // End of variables declaration//GEN-END:variables
}
