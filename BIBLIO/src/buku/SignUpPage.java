package buku;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
public class SignUpPage extends javax.swing.JFrame {

    /**
     * Creates new form SignUpPage
     */
    public SignUpPage() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        CreerBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,70));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CREER UN COMPTE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 480, 70));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nom");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 160, 40));

        jTextField1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 170, 250, 40));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Post-nom");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 170, 30));

        jTextField2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 230, 250, 40));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nom d'utiilisateur");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 200, 40));

        jTextField3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 300, 250, 40));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Creer un mot de passe");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 210, 40));

        jPasswordField1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jPasswordField1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jPasswordField1PropertyChange(evt);
            }
        });
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 360, 250, 40));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Confirmer mot de passe");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, 250, 40));

        jPasswordField2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jPanel1.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 420, 250, 40));

        CreerBtn.setBackground(new java.awt.Color(0, 0, 204));
        CreerBtn.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        CreerBtn.setForeground(new java.awt.Color(255, 255, 255));
        CreerBtn.setText("CREER");
        CreerBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CreerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreerBtnActionPerformed(evt);
            }
        });
        jPanel1.add(CreerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 490, 110, 40));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setForeground(new java.awt.Color(251, 0, 0));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 120, 290, 30));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton2.setText("ANNULER");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 490, 120, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buku/Icons/Account-amico2.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 420, 350));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buku/Icons/icons8_go_back_64px_1.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 60, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 1060, 570));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buku/Icons/bck.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 1360, 700));

        setSize(new java.awt.Dimension(1376, 734));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void CreerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreerBtnActionPerformed
        try{
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/buku", "root", "14400000");
            Statement myStmt = myConn.createStatement();
            String sql;
            String  name= jTextField1.getText();
            String  surname = jTextField2.getText();
            String username = jTextField3.getText();
            char[] codes = jPasswordField1.getPassword();
            String pass = String.valueOf(codes);
            char[] codecon = jPasswordField2.getPassword();
            String con = String.valueOf(codecon);
            
             if(name.isEmpty() || surname.isEmpty()|| username.isEmpty() || pass.equals("") || con.equals("")){
                 JOptionPane.showMessageDialog(null, "il y a des champs incomplet", "", JOptionPane.ERROR_MESSAGE);
             }   
             else{
                 if(con.equals(pass)){
               pass = con;
            
            sql = "insert into admin" 
                    +"(username, password, name, surname)"
                    + String.format("values('%s','%s','%s', '%s')", username, pass, name, surname);
              myStmt.execute(sql);
            
              JOptionPane.showMessageDialog(null, "Saved!!", "", JOptionPane.INFORMATION_MESSAGE); 
             
                 new LogPage().setVisible(true);
                  this.setVisible(false);
            }
            else{
                //do{
                JOptionPane.showMessageDialog(null, "passwords not matching", "", JOptionPane.ERROR_MESSAGE);
                //}while(!(pass.equals(con)));
            }   
                
            
             }
            
            
            
            
            
        }catch(Exception exc){
            exc.printStackTrace();
        }
                      
    }//GEN-LAST:event_CreerBtnActionPerformed

    private void jPasswordField1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jPasswordField1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1PropertyChange

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         jTextField1.setText("");
            jTextField2.setText("");
           jTextField3.setText("");
            jPasswordField1.setText("");
            
            jPasswordField2.setText("");
            
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        new LogPage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel10MouseClicked

    
//    
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
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreerBtn;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}