/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exform;

import Connection.DBConnection;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author RizkyHermawan
 */
public class Login extends javax.swing.JFrame {

    private PreparedStatement ps;
    private ResultSet rs;
    private Connection koneksi;

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setLocationRelativeTo(this);
        koneksi = DBConnection.DB();
        backLogin2.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backLogin2 = new background.backLogin();
        texusername = new javax.swing.JTextField();
        btnsubmit = new javax.swing.JButton();
        labelcreate = new javax.swing.JLabel();
        texpassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);
        setSize(new java.awt.Dimension(1366, 768));

        texusername.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        texusername.setForeground(new java.awt.Color(102, 102, 102));
        texusername.setText("Username");
        texusername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                texusernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                texusernameFocusLost(evt);
            }
        });

        btnsubmit.setBackground(new java.awt.Color(0, 102, 204));
        btnsubmit.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnsubmit.setText("Submit");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });

        labelcreate.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        labelcreate.setForeground(new java.awt.Color(0, 0, 204));
        labelcreate.setText("Create Account");
        labelcreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelcreateMouseClicked(evt);
            }
        });

        texpassword.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        texpassword.setText("Password");
        texpassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                texpasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                texpasswordFocusLost(evt);
            }
        });

        javax.swing.GroupLayout backLogin2Layout = new javax.swing.GroupLayout(backLogin2);
        backLogin2.setLayout(backLogin2Layout);
        backLogin2Layout.setHorizontalGroup(
            backLogin2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backLogin2Layout.createSequentialGroup()
                .addContainerGap(870, Short.MAX_VALUE)
                .addGroup(backLogin2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backLogin2Layout.createSequentialGroup()
                        .addComponent(btnsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(275, 275, 275))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backLogin2Layout.createSequentialGroup()
                        .addComponent(labelcreate)
                        .addGap(306, 306, 306))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backLogin2Layout.createSequentialGroup()
                        .addGroup(backLogin2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(texpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(texusername, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(196, 196, 196))))
        );
        backLogin2Layout.setVerticalGroup(
            backLogin2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backLogin2Layout.createSequentialGroup()
                .addContainerGap(403, Short.MAX_VALUE)
                .addComponent(texusername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(texpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(btnsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelcreate)
                .addGap(222, 222, 222))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backLogin2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backLogin2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelcreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelcreateMouseClicked
        // TODO add your handling code here:
        new Create().setVisible(true);
    }//GEN-LAST:event_labelcreateMouseClicked

    private void texusernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_texusernameFocusGained
        // TODO add your handling code here:
        if ("Username".equals(texusername.getText())) {
            texusername.setText("");
        }
        texusername.setForeground(Color.black);
    }//GEN-LAST:event_texusernameFocusGained

    private void texusernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_texusernameFocusLost
        // TODO add your handling code here:
        if ("".equals(texusername.getText())) {
            texusername.setText("Username");
        }
        texusername.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_texusernameFocusLost

    private void texpasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_texpasswordFocusGained
        // TODO add your handling code here:
        if ("Password".equals(texpassword.getText())) {
            texpassword.setText("");
        }
    }//GEN-LAST:event_texpasswordFocusGained

    private void texpasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_texpasswordFocusLost
        // TODO add your handling code here:
        if ("".equals(texpassword.getText())) {
            texpassword.setText("Password");
        }
    }//GEN-LAST:event_texpasswordFocusLost

    private void login() {
        String id = texusername.getText();
        String pass = texpassword.getText();
        try {
            String sql = "select * from createaccount where id_karyawan = '" + id + "'";
            ps = koneksi.prepareStatement(sql);
            rs = ps.executeQuery(sql);
            if (rs.next()){
                String a = rs.getString("id_karyawan");
                String b = rs.getString("password");
                if(a.equals(id) && b.equals(pass)){
                    
                }else if(!(a.equals(id) && b.equals(pass))){
                    JOptionPane.showMessageDialog(null, "Login Gagal");
                    texpassword.setText("");
                    texpassword.requestFocus();
                }
            }else if (!(rs.next())){
                JOptionPane.showMessageDialog(null, "Username Salah");
                texusername.setText("");
                texusername.requestFocus();
            }
        } catch (Exception e) {
        }
    }

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsubmitActionPerformed

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
    private background.backLogin backLogin2;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JLabel labelcreate;
    private javax.swing.JPasswordField texpassword;
    private javax.swing.JTextField texusername;
    // End of variables declaration//GEN-END:variables
}
