package telas;


public class Intro1 extends javax.swing.JFrame {

    
    public Intro1() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_proximo = new javax.swing.JLabel();
        lbl_pular = new javax.swing.JLabel();
        lbl_intro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_proximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/setinha.png"))); // NOI18N
        lbl_proximo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_proximo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_proximoMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_proximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, -1, 60));

        lbl_pular.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        lbl_pular.setText("Pular para o jogo");
        lbl_pular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_pular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_pularMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_pular, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 170, 20));

        lbl_intro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_intro/intro1.jpg"))); // NOI18N
        getContentPane().add(lbl_intro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_pularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_pularMouseClicked
        
        Nvl1 obj = new Nvl1();
        obj.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_lbl_pularMouseClicked

    private void lbl_proximoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_proximoMouseClicked
        
        Intro2 obj = new Intro2();
        obj.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_lbl_proximoMouseClicked

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
            java.util.logging.Logger.getLogger(Intro1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Intro1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Intro1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Intro1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Intro1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl_intro;
    private javax.swing.JLabel lbl_proximo;
    private javax.swing.JLabel lbl_pular;
    // End of variables declaration//GEN-END:variables
}
