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
import javax.naming.Context;
import javax.swing.JOptionPane;


/**
 *
 * @author ganesh_pradhan
 */
public class Change_Password extends javax.swing.JFrame {

    /**
     * Creates new form resetpassword
     */
    String ph = null;
     String Name;
     String Id = null;
     String emll = null;
    
     void change ( String mng_Id) {
      
     //   Name = fullname;
        
        Id = mng_Id;
        
        
        
//        System.out.println("fullnamegggggg" + fullname);
//      
//     
//       System.out.println("mng_Idhhhhhhhhh " + mng_Id);
//       
//        System.out.println("emailjjjjjjj" + email );
        
    }
    public Change_Password() {
        initComponents();
        pt2.setVisible(false);
                pt1.setVisible(false);
                 pass2.setEchoChar((char)0);
         pass1.setEchoChar((char)0);

    }
     private static final String A ="^(?:(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])|" +
			"(?=.*\\d)(?=.*[^A-Za-z0-9])(?=.*[a-z])|" +
			"(?=.*[^A-Za-z0-9])(?=.*[A-Z])(?=.*[a-z])|" +
			"(?=.*\\d)(?=.*[A-Z])(?=.*[^A-Za-z0-9]))(?!.*(.)\\1{2,})" +
			"[A-Za-z0-9!~<>,;:_=?*+#.\"&§%°()\\|\\[\\]\\-\\$\\^\\@\\/]" +
			"{8,30}$";
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
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        pt1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        pass1 = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        hh = new javax.swing.JLabel();
        ss = new javax.swing.JLabel();
        pt2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        pass2 = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        hh1 = new javax.swing.JLabel();
        ss1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Close_bb = new javax.swing.JPanel();
        Close_b = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(47, 68, 187));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(47, 68, 187)));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Reset password-rafiki.png"))); // NOI18N
        jPanel7.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 590, 560));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(47, 68, 187));
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

        jPanel8.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 350, 50));

        pt1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        pt1.setForeground(new java.awt.Color(128, 128, 128));
        pt1.setText("Enter Your Password");
        jPanel8.add(pt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 230, 30));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(47, 68, 187)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pass1.setBackground(new java.awt.Color(255, 255, 255));
        pass1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        pass1.setForeground(new java.awt.Color(128, 128, 128));
        pass1.setText("Enter Your Password");
        pass1.setBorder(null);
        pass1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pass1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pass1FocusLost(evt);
            }
        });
        jPanel5.add(pass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 250, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/lock.png"))); // NOI18N
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 50));

        hh.setForeground(new java.awt.Color(102, 102, 102));
        hh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/visibility (1).png"))); // NOI18N
        hh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hhMouseClicked(evt);
            }
        });
        jPanel5.add(hh, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 40, 30));

        ss.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/visibility.png"))); // NOI18N
        ss.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ss.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ssMouseClicked(evt);
            }
        });
        jPanel5.add(ss, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 40, 30));

        jPanel8.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 350, 50));

        pt2.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        pt2.setForeground(new java.awt.Color(128, 128, 128));
        pt2.setText("Confirm  Your Password");
        jPanel8.add(pt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 280, 30));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(47, 68, 187)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pass2.setBackground(new java.awt.Color(255, 255, 255));
        pass2.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        pass2.setForeground(new java.awt.Color(128, 128, 128));
        pass2.setText("Confirm  Your Password");
        pass2.setBorder(null);
        pass2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pass2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pass2FocusLost(evt);
            }
        });
        jPanel4.add(pass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 250, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/lock.png"))); // NOI18N
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 50));

        hh1.setForeground(new java.awt.Color(102, 102, 102));
        hh1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/visibility (1).png"))); // NOI18N
        hh1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hh1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hh1MouseClicked(evt);
            }
        });
        jPanel4.add(hh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 40, 30));

        ss1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/visibility.png"))); // NOI18N
        ss1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ss1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ss1MouseClicked(evt);
            }
        });
        jPanel4.add(ss1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 40, 30));

        jPanel8.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 350, 50));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(47, 68, 187));
        jLabel4.setText("Change");
        jPanel8.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 320, 50));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(47, 68, 187));
        jLabel2.setText("Your Password");
        jPanel8.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, 50));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 520, 560));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 1060, 580));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Close_bb.setBackground(new java.awt.Color(255, 255, 255));
        Close_bb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Close_b.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        Close_b.setForeground(new java.awt.Color(255, 51, 0));
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
            .addGroup(Close_bbLayout.createSequentialGroup()
                .addComponent(Close_b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Close_bbLayout.setVerticalGroup(
            Close_bbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Close_b, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.add(Close_bb, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 0, 40, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 370));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 760));

        setSize(new java.awt.Dimension(1200, 760));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        String pp1= pass1.getText();
        String pp2=pass2.getText();
      if(pp1.equals("")||pp2.equals("")){
          
        //  String status = "CP";
          
           
              //   new Succes(status).setVisible(true);
        
       new Warning("Please Fill The All Fild First").setVisible(true);
        
               
               //  this.dispose();
                 
       //  JOptionPane.showMessageDialog(null, "Please Fill The All Fild First");
        }else{
        if(PASSWORD_PATTERN.matcher(pp1).matches()){
        if(pp1.equals(pp2)){
            int sta=0;
            try {
                Connection con=DATABASE_CONNECTION.getConnection();
                //  UPDATE `admin` SET `Password`='123' WHERE `mng_id`='123';
                //String v ="1";
                PreparedStatement ps=con.prepareStatement("UPDATE admin set Password =?, status ="+'1'+" where mng_id = ?");

                ps.setString(1, pp1);
                //ps.setString(2, v);
                ps.setString(2, Id);

                sta=ps.executeUpdate();
                con.close();
                // System.out.println("sta"+sta);
                if(sta==1){

                   // String newline = System.lineSeparator();
                // new Succes(newline).setVisible(true);
                   Succes we=new Succes();
          we.ss("<html><p align= center > Your password changed successfully  You Can Login Now.</p> </html>","lg");
         we.setVisible(true); 
                    this.dispose();
                  
                // JOptionPane.showMessageDialog(null, "Your password changed successfully."+newline+"You Can Login Now.","Succes",JOptionPane.PLAIN_MESSAGE);
                   
                }
            } catch (SQLException ex) {
                Logger.getLogger(Change_Password.class.getName()).log(Level.SEVERE, null, ex);
            }

        }else{
             Warning we=new Warning();
         we.msg("Both password must be same!");
         we.setVisible(true);
            //JOptionPane.showMessageDialog(null,"Both password must be same","Error",JOptionPane.ERROR_MESSAGE);
        }
        }else {
//         Warning we=new Warning();
//         we.msg("<html><p align= center > Password between 8 and 30 characters\\nPassword must contain at least one lowercase letter\\none uppercase letter\\none numeric digit\\none special character.</p> </html>");
//         we.setVisible(true);
               JOptionPane.showMessageDialog(null, "Password between 8 and 30 characters\nPassword must contain at least one lowercase letter\none uppercase letter\none numeric digit\none special character.","Worning!",JOptionPane.ERROR_MESSAGE);    
        }
        
         }
    }//GEN-LAST:event_jLabel16MouseClicked

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

    private void Close_bMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Close_bMouseClicked
        // TODO add your handling code here:
      Login lg =new Login();
        lg.wel("2");
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Close_bMouseClicked

    private void Close_bMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Close_bMouseEntered
        // TODO add your handling code here:
        Close_bb.setBackground(new Color(255, 0, 0));
        Close_b.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Close_bMouseEntered

    private void Close_bMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Close_bMouseExited
        // TODO add your handling code here:
        Close_bb.setBackground(new Color(255, 255, 255));
        Close_b.setForeground(new Color(255,0,0));
    }//GEN-LAST:event_Close_bMouseExited

    private void pass1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pass1FocusGained
        // TODO add your handling code here:
         if(pass1.getText().equals("Enter Your Password")){
            pt1.setVisible(true);
            pt1.setForeground( Color.decode("#2F44BB"));
            pass1.setText("");
            pass1.setEchoChar('*');
            pass1.setForeground(Color.decode("#2F44BB"));
        }
    }//GEN-LAST:event_pass1FocusGained

    private void pass1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pass1FocusLost
        // TODO add your handling code here:
          if(pass1.getText().equals("")){
            pt1.setVisible(false);
            pass1.setText("Enter Your Password");
            pass1.setEchoChar((char)0);
            pass1.setForeground(Color.decode("#808080"));
        }else{
            pass1.setVisible(true);
        }
    }//GEN-LAST:event_pass1FocusLost

    private void pass2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pass2FocusGained
        // TODO add your handling code here:
        if(pass2.getText().equals("Confirm  Your Password")){
            pt2.setVisible(true);
            pt2.setForeground( Color.decode("#2F44BB"));
            pass2.setText("");
            pass2.setEchoChar('*');
            pass2.setForeground(Color.decode("#2F44BB"));
        }
    }//GEN-LAST:event_pass2FocusGained

    private void pass2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pass2FocusLost
        // TODO add your handling code here:
         if(pass2.getText().equals("")){
            pt2.setVisible(false);
            pass2.setText("Confirm  Your Password");
            pass2.setEchoChar((char)0);
            pass2.setForeground(Color.decode("#808080"));
        }else{
            pass2.setVisible(true);
        }
    }//GEN-LAST:event_pass2FocusLost

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
            java.util.logging.Logger.getLogger(Change_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Change_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Change_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Change_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Change_Password().setVisible(true);
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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPasswordField pass1;
    private javax.swing.JPasswordField pass2;
    private javax.swing.JLabel pt1;
    private javax.swing.JLabel pt2;
    private javax.swing.JLabel ss;
    private javax.swing.JLabel ss1;
    // End of variables declaration//GEN-END:variables
}
