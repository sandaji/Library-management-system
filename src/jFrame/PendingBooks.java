/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jFrame;

/**
 *
 * @author IJAMY
 */
public class PendingBooks extends javax.swing.JFrame {

    /**
     * Creates new form PendingBooks
     */
    public PendingBooks() {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        input_BookId = new app.bolivia.swing.JCTextField();
        jLabel13 = new javax.swing.JLabel();
        username2 = new javax.swing.JLabel();
        input_BookAuthor = new app.bolivia.swing.JCTextField();
        jLabel14 = new javax.swing.JLabel();
        username3 = new javax.swing.JLabel();
        input_BookTitle = new app.bolivia.swing.JCTextField();
        jLabel15 = new javax.swing.JLabel();
        username4 = new javax.swing.JLabel();
        input_BookQuantity = new app.bolivia.swing.JCTextField();
        login_Btn = new necesario.RSMaterialButtonCircle();
        login_Btn1 = new necesario.RSMaterialButtonCircle();
        login_Btn2 = new necesario.RSMaterialButtonCircle();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(108, 99, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(242, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/icons8_Rewind_48px.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 30));

        jPanel4.setBackground(new java.awt.Color(242, 51, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/icons8_Rewind_48px.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 30));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Account_50px.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 50, 50));

        username.setBackground(new java.awt.Color(255, 255, 255));
        username.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        username.setForeground(new java.awt.Color(240, 240, 240));
        username.setText("Book ID");
        username.setAlignmentY(10.0F);
        jPanel2.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 300, 30));

        input_BookId.setBackground(new java.awt.Color(108, 99, 255));
        input_BookId.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        input_BookId.setForeground(java.awt.Color.cyan);
        input_BookId.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        input_BookId.setText("ijamy");
        input_BookId.setCaretColor(new java.awt.Color(255, 255, 255));
        input_BookId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        input_BookId.setPhColor(new java.awt.Color(255, 255, 0));
        input_BookId.setPlaceholder("please enter your name");
        input_BookId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                input_BookIdFocusLost(evt);
            }
        });
        input_BookId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_BookIdActionPerformed(evt);
            }
        });
        jPanel2.add(input_BookId, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 300, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Account_50px.png"))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 50, 50));

        username2.setBackground(new java.awt.Color(255, 255, 255));
        username2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        username2.setForeground(new java.awt.Color(240, 240, 240));
        username2.setText("AUTHOR");
        username2.setAlignmentY(10.0F);
        jPanel2.add(username2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 300, 30));

        input_BookAuthor.setBackground(new java.awt.Color(108, 99, 255));
        input_BookAuthor.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        input_BookAuthor.setForeground(java.awt.Color.cyan);
        input_BookAuthor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        input_BookAuthor.setText("ijamy");
        input_BookAuthor.setCaretColor(new java.awt.Color(255, 255, 255));
        input_BookAuthor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        input_BookAuthor.setPhColor(new java.awt.Color(255, 255, 0));
        input_BookAuthor.setPlaceholder("please enter your name");
        input_BookAuthor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                input_BookAuthorFocusLost(evt);
            }
        });
        jPanel2.add(input_BookAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 300, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Account_50px.png"))); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 50, 50));

        username3.setBackground(new java.awt.Color(255, 255, 255));
        username3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        username3.setForeground(new java.awt.Color(240, 240, 240));
        username3.setText("TITLE");
        username3.setAlignmentY(10.0F);
        jPanel2.add(username3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 300, 30));

        input_BookTitle.setBackground(new java.awt.Color(108, 99, 255));
        input_BookTitle.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        input_BookTitle.setForeground(java.awt.Color.cyan);
        input_BookTitle.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        input_BookTitle.setText("ijamy");
        input_BookTitle.setCaretColor(new java.awt.Color(255, 255, 255));
        input_BookTitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        input_BookTitle.setPhColor(new java.awt.Color(255, 255, 0));
        input_BookTitle.setPlaceholder("please enter your name");
        input_BookTitle.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                input_BookTitleFocusLost(evt);
            }
        });
        jPanel2.add(input_BookTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 300, 30));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Account_50px.png"))); // NOI18N
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 50, 50));

        username4.setBackground(new java.awt.Color(255, 255, 255));
        username4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        username4.setForeground(new java.awt.Color(240, 240, 240));
        username4.setText("QUANTITY");
        username4.setAlignmentY(10.0F);
        jPanel2.add(username4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 570, 300, 30));

        input_BookQuantity.setBackground(new java.awt.Color(108, 99, 255));
        input_BookQuantity.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        input_BookQuantity.setForeground(java.awt.Color.cyan);
        input_BookQuantity.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        input_BookQuantity.setText("ijamy");
        input_BookQuantity.setCaretColor(new java.awt.Color(255, 255, 255));
        input_BookQuantity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        input_BookQuantity.setPhColor(new java.awt.Color(255, 255, 0));
        input_BookQuantity.setPlaceholder("please enter your name");
        input_BookQuantity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                input_BookQuantityFocusLost(evt);
            }
        });
        jPanel2.add(input_BookQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 610, 300, 30));

        login_Btn.setBackground(new java.awt.Color(62, 32, 255));
        login_Btn.setText("ADD");
        login_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_BtnActionPerformed(evt);
            }
        });
        jPanel2.add(login_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 710, 110, 40));

        login_Btn1.setBackground(new java.awt.Color(255, 29, 54));
        login_Btn1.setText("DELETE");
        login_Btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_Btn1ActionPerformed(evt);
            }
        });
        jPanel2.add(login_Btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 710, 140, 40));

        login_Btn2.setBackground(new java.awt.Color(17, 224, 21));
        login_Btn2.setText("UPDATE");
        login_Btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_Btn2ActionPerformed(evt);
            }
        });
        jPanel2.add(login_Btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 710, 130, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 880));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        HomePage home = new HomePage();
        home.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void input_BookIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_BookIdFocusLost
        //        if (checkDublicateUsers()== true){
            //            JOptionPane.showMessageDialog(this,"user already exist");
            //        }
    }//GEN-LAST:event_input_BookIdFocusLost

    private void input_BookIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_BookIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_BookIdActionPerformed

    private void input_BookAuthorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_BookAuthorFocusLost
        //        if (checkDublicateUsers()== true){
            //            JOptionPane.showMessageDialog(this,"user already exist");
            //        }
    }//GEN-LAST:event_input_BookAuthorFocusLost

    private void input_BookTitleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_BookTitleFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_input_BookTitleFocusLost

    private void input_BookQuantityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_BookQuantityFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_input_BookQuantityFocusLost

    private void login_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_BtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_login_BtnActionPerformed

    private void login_Btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_Btn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_login_Btn1ActionPerformed

    private void login_Btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_Btn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_login_Btn2ActionPerformed

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
            java.util.logging.Logger.getLogger(PendingBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PendingBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PendingBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PendingBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PendingBooks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private app.bolivia.swing.JCTextField input_BookAuthor;
    private app.bolivia.swing.JCTextField input_BookId;
    private app.bolivia.swing.JCTextField input_BookQuantity;
    private app.bolivia.swing.JCTextField input_BookTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private necesario.RSMaterialButtonCircle login_Btn;
    private necesario.RSMaterialButtonCircle login_Btn1;
    private necesario.RSMaterialButtonCircle login_Btn2;
    private javax.swing.JLabel username;
    private javax.swing.JLabel username2;
    private javax.swing.JLabel username3;
    private javax.swing.JLabel username4;
    // End of variables declaration//GEN-END:variables
}
