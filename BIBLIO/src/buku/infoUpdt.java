/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buku;

import java.sql.*;
import static buku.ImproveListe.*;
import javax.swing.JOptionPane;
import static buku.fiche.*;
/**
 *
 * @author user
 */

public class infoUpdt extends javax.swing.JFrame {

    /**
     * Creates new form infoUpdt
     */ 
    public static Connection myConn;
    public static Statement myStmt; 
    public infoUpdt() {
        initComponents();
        jTextField1.setText(nom);
        jTextField5.setText(tel);
        
        
       
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(2, 155, 126));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,80));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MODIFICATION DE LA FICHE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 23, 650, 80));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NOMS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 125, 130, 40));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("FONCTION");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 204, 110, 40));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PROMOTION");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 297, 130, 50));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("FACULTE");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 110, 40));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TELEPHONE");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 100, 40));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 240, 40));

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 200, 199, 40));

        jButton1.setBackground(new java.awt.Color(0, 51, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SAUVEGARDER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, 200, 40));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PROFESSEUR", "ETUDIANT UPC", "ETUDIANT EXTERIEUR", " " }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 211, 240, 40));

        jComboBox2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "G1", "G2", "G3", "L1", "L2", "D1", "D2", "D3" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 240, 36));

        jComboBox3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INFORMATIQUE", "MEDECINE", "ECONOMIE", "DROIT" }));
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 130, 200, 30));

        jButton3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton3.setText("ANNULER");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 390, 150, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buku/Icons/icons8_home_64px_2.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 60, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 4, 1070, 700));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buku/Icons/bck.jpg"))); // NOI18N
        jLabel7.setText("jLabel");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 1070, 700));

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try{
           myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/buku", "root", "14400000");
           myStmt =  myConn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
          
           String name = jTextField1.getText();
           String fonction = jComboBox1.getSelectedItem().toString();
           String promo = jComboBox2.getSelectedItem().toString();
           String faculte = jComboBox3.getSelectedItem().toString();
           String Tel = jTextField5.getText();
           
           //String sql;
                       //sql = String.format("update subscribers set Nom = '%s', Fonction = '%s', Promotion = '%s', Faculte = '%s', Tel = '%s' Where Matricule = '%s' ", name, fonction, promo, faculte, Tel, n);
               
           if(name.isEmpty()|| fonction.isEmpty()|| promo.isEmpty()|| faculte.isEmpty()|| Tel.isEmpty()){
               JOptionPane.showMessageDialog(null, "Il y a des champs ouverts", "ERROR", JOptionPane.ERROR_MESSAGE);
           }
           else{
                ResultSet rs = myStmt.executeQuery(String.format("SELECT * FROM subscribers WHERE Matricule = '%s'", n));
         
           if(rs.next()){
               
               String sql;
                       sql = String.format("update subscribers set Nom = '%s', Fonction = '%s', Promotion = '%s', Faculte = '%s', Tel = '%s' Where Matricule = '%s' ", name, fonction, promo, faculte, Tel, n);
                         myStmt.executeUpdate(sql);
                /*while(rs.next()){
                    String nom = rs.getString("Nom");
                    rs.updateString("Nom", name);
                    rs.updateRow();
                    String function = rs.getString("Fonction");
                    rs.updateString("Fonction", fonction);
                    rs.updateRow();
                    String promotion = rs.getString("Promotion");
                    rs.updateString("Promotion", promo);
                    rs.updateRow();
                    String Faculte = rs.getString("Faculte");
                    rs.updateString("Faculte", Faculte);
                    rs.updateRow();
                   String phone = rs.getString("Tel");
                    rs.updateString("Tel", phone);
                    rs.updateRow();
                     
                }*/
                
               JOptionPane.showMessageDialog(null, "Mis a jours reussi", "INFO", JOptionPane.INFORMATION_MESSAGE);
      
                
           }
           
              else{
                   JOptionPane.showMessageDialog(null, "Mis a jours echouee", "ERROR", JOptionPane.ERROR_MESSAGE);
               
               
                 }
          
               
                 }
           
           
       }catch(Exception exc){
           exc.printStackTrace();
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTextField1.setText("");
         jComboBox1.setSelectedIndex(0);
           jComboBox2.setSelectedIndex(0);
            jComboBox3.setSelectedIndex(0);
           jTextField5.setText("");
           
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        new fiche().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel8MouseClicked

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
            java.util.logging.Logger.getLogger(infoUpdt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(infoUpdt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(infoUpdt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(infoUpdt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new infoUpdt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
