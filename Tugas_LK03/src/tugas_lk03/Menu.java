/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_lk03;
import javax.swing.JOptionPane;
/**
 *
 * @author zaenalalfian
 */
public class Menu extends javax.swing.JFrame {
    menumethod mn = new menumethod();
    
    /**
     * Creates new form Menu
     */
    public Menu() {
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

        soal1 = new javax.swing.JButton();
        soal2 = new javax.swing.JButton();
        soal3 = new javax.swing.JButton();
        soal4 = new javax.swing.JButton();
        soal5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        copy = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU APPS");
        setBackground(new java.awt.Color(204, 204, 204));

        soal1.setBackground(new java.awt.Color(153, 204, 255));
        soal1.setForeground(new java.awt.Color(0, 0, 0));
        soal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/applications-all.png"))); // NOI18N
        soal1.setText("Soal 1");
        soal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soal1ActionPerformed(evt);
            }
        });

        soal2.setBackground(new java.awt.Color(153, 204, 255));
        soal2.setForeground(new java.awt.Color(0, 0, 0));
        soal2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/comp.png"))); // NOI18N
        soal2.setText("Soal 2");
        soal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soal2ActionPerformed(evt);
            }
        });

        soal3.setBackground(new java.awt.Color(153, 204, 255));
        soal3.setForeground(new java.awt.Color(0, 0, 0));
        soal3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/hitung.png"))); // NOI18N
        soal3.setText("Soal 3");
        soal3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soal3ActionPerformed(evt);
            }
        });

        soal4.setBackground(new java.awt.Color(153, 204, 255));
        soal4.setForeground(new java.awt.Color(0, 0, 0));
        soal4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/nilai.png"))); // NOI18N
        soal4.setText("Soal 4");
        soal4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soal4ActionPerformed(evt);
            }
        });

        soal5.setBackground(new java.awt.Color(153, 204, 255));
        soal5.setForeground(new java.awt.Color(0, 0, 0));
        soal5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/logika.png"))); // NOI18N
        soal5.setText("Soal 5");
        soal5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soal5ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Silahkan Pilih Tombol Berikut !");

        copy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/zaenal.png"))); // NOI18N
        copy.setText("ZAENAL ALFIAN");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/app.png"))); // NOI18N
        jLabel2.setText("Menu");

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/exit.png"))); // NOI18N
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/info.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(soal1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(soal2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(soal3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(soal4)
                                        .addGap(12, 12, 12)
                                        .addComponent(soal5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel1))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(copy)))
                        .addGap(0, 35, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(soal5)
                            .addComponent(soal4)
                            .addComponent(soal3)
                            .addComponent(soal2)
                            .addComponent(soal1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(copy)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    private void soal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soal2ActionPerformed
        // soal 2
        NO02 lk = new NO02();
        lk.setVisible(true);
        lk.setEnabled(true);
        lk.setLocation(10,10);
        this.dispose();
    }//GEN-LAST:event_soal2ActionPerformed

    private void soal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soal1ActionPerformed
            //soal 1
        
        NO01 lk = new NO01();
        lk.setVisible(true);
        lk.setEnabled(true);
        lk.setLocation(10, 10);
        this.dispose();
    }//GEN-LAST:event_soal1ActionPerformed

    private void soal3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soal3ActionPerformed
        //soal 3
        NO03 lk = new NO03();
        lk.setVisible(true);
        lk.setEnabled(true);
         lk.setLocation(10, 10);
        this.dispose();
    }//GEN-LAST:event_soal3ActionPerformed

    private void soal4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soal4ActionPerformed
        //soal 4
        NO04 lk = new NO04();
        lk.setVisible(true);
        lk.setEnabled(true);
         lk.setLocation(10, 10);
         this.dispose();
    }//GEN-LAST:event_soal4ActionPerformed

    private void soal5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soal5ActionPerformed
       NO05 lk = new NO05();
       lk.setVisible(true);
       lk.setEnabled(true);
        lk.setLocation(10, 10);
        this.dispose();
    }//GEN-LAST:event_soal5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JOptionPane.showMessageDialog(null,"Halo !"
                + "\nNama saya Zaenal Alfian"
                + "\nBerikut merupakan Aplikasi sederhana"
                + "\nMenu Apps"
                + "\nTerima Kasih"
                + "\n© Zaenal Alfian XII RPL 1.");
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel copy;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton soal1;
    private javax.swing.JButton soal2;
    private javax.swing.JButton soal3;
    private javax.swing.JButton soal4;
    private javax.swing.JButton soal5;
    // End of variables declaration//GEN-END:variables
}
