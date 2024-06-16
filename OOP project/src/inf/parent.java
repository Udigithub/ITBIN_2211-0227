
package inf;

import codes.DBconect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class parent extends javax.swing.JFrame {
    
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public parent() {
        initComponents();
        conn = DBconect.connect();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        enamebox = new javax.swing.JTextField();
        addressbox = new javax.swing.JTextField();
        mnumberbox = new javax.swing.JTextField();
        einsertbtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        snamebox = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Screenshot 2024-06-13 000454.png"))); // NOI18N
        jLabel5.setText("jLabel5");

        jButton1.setText("jButton1");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Screenshot 2024-06-13 000454.png"))); // NOI18N
        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("EMERGRNCY CONTACT PERSON");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 590, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, -1));

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Contact Person Name");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, -1));

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Address");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Mobile Number");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, -1, -1));

        enamebox.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        enamebox.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(enamebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 420, -1));

        addressbox.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        addressbox.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(addressbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 420, -1));

        mnumberbox.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        mnumberbox.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(mnumberbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, 420, -1));

        einsertbtn.setBackground(new java.awt.Color(51, 51, 51));
        einsertbtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        einsertbtn.setForeground(new java.awt.Color(255, 255, 0));
        einsertbtn.setText("INSERT");
        einsertbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                einsertbtnActionPerformed(evt);
            }
        });
        getContentPane().add(einsertbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, -1, -1));

        jLabel6.setBackground(new java.awt.Color(51, 51, 51));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("Student Full Name");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        snamebox.setBackground(new java.awt.Color(240, 240, 240));
        snamebox.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        snamebox.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(snamebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 420, -1));

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 0));
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 520, -1, -1));

        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Screenshot 2024-06-13 000454.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void einsertbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_einsertbtnActionPerformed
       String sname;
       String pname;
       String address;
       String mobile;

       
       sname = snamebox.getText();
       pname = enamebox.getText();
       address = addressbox.getText();
       mobile = mnumberbox.getText();
       
        try {
            String sql ="INSERT INTO person (Studentname,Name,Address,Mobile)VALUES ('" +sname+ "','" +pname+ "','" +address+ "','" +mobile+ "')";
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Inserted");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Incomplete");
        }
    }//GEN-LAST:event_einsertbtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        home m1 = new home();
        m1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(parent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(parent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(parent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(parent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new parent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressbox;
    private javax.swing.JButton einsertbtn;
    private javax.swing.JTextField enamebox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField mnumberbox;
    private javax.swing.JTextField snamebox;
    // End of variables declaration//GEN-END:variables
}
