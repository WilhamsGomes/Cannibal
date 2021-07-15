package telas;


public class Tela_Iniciar extends javax.swing.JFrame {
   
    public static int score=0;
    
    public Tela_Iniciar() {
        initComponents();
    }
    
    public static int replay=0;
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_iniciar = new javax.swing.JLabel();
        lbl_progra = new javax.swing.JLabel();
        lbl_cannibal = new javax.swing.JLabel();
        lbl_tutorial = new javax.swing.JLabel();
        lbl_fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_iniciar.setFont(new java.awt.Font("Bauhaus 93", 0, 36)); // NOI18N
        lbl_iniciar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_iniciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_iniciar.setText("INICIAR JOGO");
        lbl_iniciar.setAlignmentX(0.5F);
        lbl_iniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_iniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_iniciarMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 360, 80));

        lbl_progra.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        lbl_progra.setForeground(new java.awt.Color(255, 255, 255));
        lbl_progra.setText("Sobre o Sarau");
        lbl_progra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_progra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_prograMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_progra, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 130, 20));

        lbl_cannibal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_cannibal/Cannibal_apotando.png"))); // NOI18N
        lbl_cannibal.setText("jLabel1");
        getContentPane().add(lbl_cannibal, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 280, 450));

        lbl_tutorial.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        lbl_tutorial.setForeground(new java.awt.Color(255, 255, 255));
        lbl_tutorial.setText("Tutorial");
        lbl_tutorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lbl_tutorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 100, 30));

        lbl_fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AGORAVAI.png"))); // NOI18N
        getContentPane().add(lbl_fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_iniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_iniciarMouseClicked

        Intro1 obj = new Intro1();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_lbl_iniciarMouseClicked

    private void lbl_prograMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_prograMouseClicked
        Tela_Programacao09 obj = new Tela_Programacao09();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_lbl_prograMouseClicked

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
            java.util.logging.Logger.getLogger(Tela_Iniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Iniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Iniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Iniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Iniciar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl_cannibal;
    private javax.swing.JLabel lbl_fundo;
    private javax.swing.JLabel lbl_iniciar;
    private javax.swing.JLabel lbl_progra;
    private javax.swing.JLabel lbl_tutorial;
    // End of variables declaration//GEN-END:variables


}
