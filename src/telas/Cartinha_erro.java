package telas;

import static telas.Tela_Iniciar.replay;
import static telas.Tela_Iniciar.score;

public class Cartinha_erro extends javax.swing.JFrame {

    
    public Cartinha_erro() {
        initComponents();
        lbl_pnt.setText(String.valueOf(score));
        score = 0;
        replay=1;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_erro = new javax.swing.JLabel();
        lbl_texto = new javax.swing.JLabel();
        lbl_pnt = new javax.swing.JLabel();
        lbl_voltar = new javax.swing.JLabel();
        lbl_cartinha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_erro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_cannibal/erro.png"))); // NOI18N
        getContentPane().add(lbl_erro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 340, 80));

        lbl_texto.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        lbl_texto.setText("Sua Pontuação:");
        getContentPane().add(lbl_texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 506, 180, 30));

        lbl_pnt.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        getContentPane().add(lbl_pnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 510, 90, 20));

        lbl_voltar.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        lbl_voltar.setText("Voltar ao inicio");
        lbl_voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_voltarMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 150, 30));

        lbl_cartinha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_cannibal/Cartinha_erro.png"))); // NOI18N
        getContentPane().add(lbl_cartinha, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_voltarMouseClicked
       
        Tela_creditos obj = new Tela_creditos();
        obj.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_lbl_voltarMouseClicked

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
            java.util.logging.Logger.getLogger(Cartinha_erro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cartinha_erro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cartinha_erro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cartinha_erro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cartinha_erro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl_cartinha;
    private javax.swing.JLabel lbl_erro;
    private javax.swing.JLabel lbl_pnt;
    private javax.swing.JLabel lbl_texto;
    private javax.swing.JLabel lbl_voltar;
    // End of variables declaration//GEN-END:variables


}
