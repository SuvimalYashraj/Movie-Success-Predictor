/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author MAHE
 */
public class update extends javax.swing.JFrame {

    /**
     * Creates new form update
     */
    public update() {
        initComponents();
    }
  String arr[] = {"SHAH_RUKH_KHAN", "AAMIR_KHAN","SALMAN_KHAN","AKSHAY_KUMAR","KATRINA_KAIF","KAJOL_DEVGAN","KAREENA_KAPOOR","PRIYANKA_CHOPRA","YASH_RAJ_CHOPRA","RAJ_KUMAR_HIRANI","IMTIAZ_ALI","SANJAY_LEELA_BHANSALI","VISHAL_SHEKHAR","PRITAM","AR_REHMAN","SHANKAR_EHSAN_LOY","BELOW_50_MILLION","50_TO_100_MILLION","100_TO_150_MILLION","ABOVE_150_MILLION","ACTION","ROMANCE","COMEDY","DRAMA","CHRISTMAS","DIWALI","EID","HOLI"
};
    Connection con = null;
        Statement st = null;
        //ResultSet rs = null;
        String mn=null;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mov = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Proceed_Label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\syr\\mlr\\src\\main\\abc (2).jpg")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel2.setText("MOVIE NAME");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/addMovie.jpg"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/update.jpg"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/logout.jpg"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });

        Proceed_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/proceed.jpg"))); // NOI18N
        Proceed_Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Proceed_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Proceed_LabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel2)
                        .addGap(48, 48, 48)
                        .addComponent(mov, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(Proceed_Label)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(mov, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(Proceed_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
      adminLogin obj = new adminLogin();
obj.setVisible(true);
this.setVisible(false);  // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        MainPage obj = new MainPage();
obj.setVisible(true);
this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MousePressed

    private void Proceed_LabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Proceed_LabelMousePressed
     mn = mov.getText();
     int ct;
      try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/msp?autoReconnect=true&useSSL=false","root", "suvimal");
            Statement stmt = con.createStatement();
            ResultSet rss = stmt.executeQuery("select count(*) as ct from predict where MOVIE_NAME = '"+mn+"';");
            rss.next();
            ct = rss.getInt("ct");
            
            
            if(ct>0)
            {
            ResultSet rs = stmt.executeQuery("select * from predict where MOVIE_NAME = '"+mn+"';");
            rs.next();
            
            double r = rs.getDouble("RATING");
            String str[] = new String[7];
             //s = rss.getString("MOVIE_NAME");
             //System.out.println(s);
             int j=0;
        for (int i=0;i<arr.length;i++) {
             //System.out.println(mn);
             if ((rs.getInt(arr[i])) == 1) {
                 str[j] = arr[i];
                 j++;
             }
}
         
         for (int i=0;i<str.length;i++) {
             str[i] = str[i].replaceAll("_", " ");
             
         }
         for(int i=0;i<str.length;i++){
             System.out.println(str[i]);
         }
         
             //rs.beforeFirst();
                                             //View main menu
                     movieUpdate obj = new movieUpdate();
                    obj.setVisible(true);
                    this.setVisible(false);
                    movieUpdate.Jlabel1.setText(mn); 
                    movieUpdate.rating.setText(Double.toString(r));
                    movieUpdate.actor.setText(str[0]);
                    movieUpdate.actress.setText(str[1]);
                    movieUpdate.director.setText(str[2]);
                    movieUpdate.music.setText(str[3]);
                    movieUpdate.budget.setText(str[4]);
                    movieUpdate.release.setText(str[6]);
                    movieUpdate.genre.setText(str[5]);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Specified Movie Name Does Not Exist !!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(userlogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(userlogin.class.getName()).log(Level.SEVERE, null, ex);
        }          

         // TODO add your handling code here:
         
     /*    movieUpdate obj = new movieUpdate();
                    obj.setVisible(true);
                    this.setVisible(false);
                    movieUpdate.Jlabel1.setText(mn);
         */ 
    }//GEN-LAST:event_Proceed_LabelMousePressed

             //System.out.println(rss);
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
            java.util.logging.Logger.getLogger(update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Proceed_Label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField mov;
    // End of variables declaration//GEN-END:variables
}
