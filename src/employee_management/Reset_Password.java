/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee_management;


import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author ganesh_pradhan
 */
public class Reset_Password extends javax.swing.JFrame {
    String eml=null;
    public  void seet(String id) {
        eml= id;
        
    }

    /**
     * Creates new form resetpassword
     */
    public Reset_Password() {
        initComponents();
    }
     private static final String A ="^(?:(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])|" +
			"(?=.*\\d)(?=.*[^A-Za-z0-9])(?=.*[a-z])|" +
			"(?=.*[^A-Za-z0-9])(?=.*[A-Z])(?=.*[a-z])|" +
			"(?=.*\\d)(?=.*[A-Z])(?=.*[^A-Za-z0-9]))(?!.*(.)\\1{2,})" +
			"[A-Za-z0-9!~<>,;:_=?*+#.\"&§%°()\\|\\[\\]\\-\\$\\^\\@\\/]" +
			"{8,32}$";
    private static final Pattern PASSWORD_PATTERN = Pattern.compile(A);

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Close_bb = new javax.swing.JPanel();
        Close_b = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        pass1 = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        hh = new javax.swing.JLabel();
        ss = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        pass2 = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        hh1 = new javax.swing.JLabel();
        ss1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Reset password-pana1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 650, 740));

        Close_bb.setBackground(new java.awt.Color(255, 255, 255));
        Close_bb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Close_b.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        Close_b.setForeground(new java.awt.Color(255, 0, 51));
        Close_b.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Close_b.setText("×");
        Close_b.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Close_b.setPreferredSize(new java.awt.Dimension(40, 40));
        Close_b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Close_bMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Close_bMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Close_bMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Close_bbLayout = new javax.swing.GroupLayout(Close_bb);
        Close_bb.setLayout(Close_bbLayout);
        Close_bbLayout.setHorizontalGroup(
            Close_bbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Close_b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        Close_bbLayout.setVerticalGroup(
            Close_bbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Close_b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(Close_bb, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 0, 40, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 125, 254));
        jLabel2.setText("Your Password");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 380, 44));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 125, 254));
        jLabel3.setText("Reset ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 220, 40));

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 125, 254));
        jLabel4.setText("Password:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 120, 30));

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 125, 254));
        jLabel5.setText("Confirm Password:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 200, 30));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 125, 254)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pass1.setBackground(new java.awt.Color(255, 255, 255));
        pass1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pass1.setForeground(new java.awt.Color(0, 125, 254));
        pass1.setBorder(null);
        pass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass1ActionPerformed(evt);
            }
        });
        jPanel3.add(pass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 250, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/padlock (3).png"))); // NOI18N
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, 40, 50));

        hh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/h.png"))); // NOI18N
        hh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hhMouseClicked(evt);
            }
        });
        jPanel3.add(hh, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 40, 30));

        ss.setForeground(new java.awt.Color(102, 102, 102));
        ss.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/s.png"))); // NOI18N
        ss.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ss.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ssMouseClicked(evt);
            }
        });
        jPanel3.add(ss, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 40, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 350, 50));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 125, 254)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pass2.setBackground(new java.awt.Color(255, 255, 255));
        pass2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pass2.setForeground(new java.awt.Color(0, 125, 254));
        pass2.setBorder(null);
        pass2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass2ActionPerformed(evt);
            }
        });
        jPanel4.add(pass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 250, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/padlock (3).png"))); // NOI18N
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, 40, 50));

        hh1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/h.png"))); // NOI18N
        hh1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hh1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hh1MouseClicked(evt);
            }
        });
        jPanel4.add(hh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 40, 30));

        ss1.setForeground(new java.awt.Color(102, 102, 102));
        ss1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/s.png"))); // NOI18N
        ss1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ss1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ss1MouseClicked(evt);
            }
        });
        jPanel4.add(ss1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 40, 30));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 350, 50));

        jPanel6.setBackground(new java.awt.Color(0, 125, 254));
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel16.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Submit");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, 350, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 550, 740));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 738, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1200, 738));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Close_bMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Close_bMouseClicked
        // TODO add your handling code here:

  Login l = new Login();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Close_bMouseClicked

    private void Close_bMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Close_bMouseEntered
        // TODO add your handling code here:
        Close_bb.setBackground(new Color(225,0,0));
        Close_b.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Close_bMouseEntered

    private void Close_bMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Close_bMouseExited
        // TODO add your handling code here:
        Close_bb.setBackground(new Color(255, 255, 255));
        Close_b.setForeground(new Color(255,0,0));
    }//GEN-LAST:event_Close_bMouseExited

    private void pass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pass1ActionPerformed

    private void pass2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pass2ActionPerformed

    private void hh1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hh1MouseClicked
        // TODO add your handling code here:
        
         hh1.setVisible(false);
       ss1.setVisible(true);
       pass2.setEchoChar((char)0);
    }//GEN-LAST:event_hh1MouseClicked

    private void ss1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ss1MouseClicked
        // TODO add your handling code here:
         
         ss1.setVisible(false);
         hh1.setVisible(true);
         pass2.setEchoChar('*');
         
         
    }//GEN-LAST:event_ss1MouseClicked

    private void hhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hhMouseClicked
        // TODO add your handling code here:
        hh.setVisible(false);
       ss.setVisible(true);
       pass1.setEchoChar((char)0);
    }//GEN-LAST:event_hhMouseClicked

    private void ssMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ssMouseClicked
        // TODO add your handling code here:
          ss.setVisible(false);
         hh.setVisible(true);
         pass1.setEchoChar('*');
    }//GEN-LAST:event_ssMouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        String p1= pass1.getText();
        String p2 = pass2.getText();
        if(p1.equals("")||p2.equals("")){
         JOptionPane.showMessageDialog(null, "Please Fill The All Fild First");
        }else{
            if(PASSWORD_PATTERN.matcher(p1).matches()){
            if(p1.equals(p2)){
              int sta=0;
            try {
               Connection con=DATABASE_CONNECTION.getConnection(); 
           //  UPDATE `admin` SET `Password`='123' WHERE `mng_id`='123';
           //String v ="1";
                PreparedStatement ps=con.prepareStatement("UPDATE admin set Password =?  where email =?");
                   
                   ps.setString(1, p1);
                   //ps.setString(2, v);
                   System.out.println("");
                           
                   ps.setString(2, eml);
                   
                   sta=ps.executeUpdate();
                   con.close();
                 
                    if(sta==1){
                    
                    String newline = System.lineSeparator();
                    JOptionPane.showMessageDialog(null, "Your password reset successfully."+newline+"You Can Login Now.","Succes",JOptionPane.PLAIN_MESSAGE);
                    Login l = new Login();
                    l.setVisible(true);
                    this.dispose();
                }
             } catch (SQLException ex) {
                Logger.getLogger(Change_Password.class.getName()).log(Level.SEVERE, null, ex);
            }           
                
                
                
            }else{
                      JOptionPane.showMessageDialog(null, "Both Password must be same");
   
            }
            }else {
               JOptionPane.showMessageDialog(null, "Password between 8 and 32 characters\nPassword must contain at least one lowercase letter\none uppercase letter\none numeric digit\none special character.");
        }
        }
        
        
          
    }//GEN-LAST:event_jLabel16MouseClicked

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
            java.util.logging.Logger.getLogger(Reset_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reset_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reset_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reset_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reset_Password().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close_b;
    private javax.swing.JPanel Close_bb;
    private javax.swing.JLabel hh;
    private javax.swing.JLabel hh1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPasswordField pass1;
    private javax.swing.JPasswordField pass2;
    private javax.swing.JLabel ss;
    private javax.swing.JLabel ss1;
    // End of variables declaration//GEN-END:variables
}
