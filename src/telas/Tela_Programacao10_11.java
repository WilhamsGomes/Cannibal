/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

/**
 *
 * @author aluno
 */
public class Tela_Programacao10_11 extends javax.swing.JFrame {

    /**
     * Creates new form Tela_Programacao10_11
     */
    public Tela_Programacao10_11() {
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

        lbl_programacao = new javax.swing.JLabel();
        lbl_dia10 = new javax.swing.JLabel();
        lbl_dia11 = new javax.swing.JLabel();
        lbl_abertura1 = new javax.swing.JLabel();
        lbl_abertura = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_14hr = new javax.swing.JLabel();
        lbl_avancar = new javax.swing.JLabel();
        lbl_voltar = new javax.swing.JLabel();
        lbl_fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_programacao.setFont(new java.awt.Font("Bauhaus 93", 0, 36)); // NOI18N
        getContentPane().add(lbl_programacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 250, 80));

        lbl_dia10.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        lbl_dia10.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(lbl_dia10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 220, 30));

        lbl_dia11.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        lbl_dia11.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(lbl_dia11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 220, 30));

        lbl_abertura1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_abertura1.setText("9hrs");
        getContentPane().add(lbl_abertura1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 40, -1));

        lbl_abertura.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(lbl_abertura, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 40, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 260, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 440, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 260, 20));

        lbl_14hr.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(lbl_14hr, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 50, 20));

        lbl_avancar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/setinha.png"))); // NOI18N
        lbl_avancar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_avancar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_avancarMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_avancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 50, 60, 40));

        lbl_voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.png"))); // NOI18N
        lbl_voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_voltarMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 70, 60));

        lbl_fundo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Programação-2.png"))); // NOI18N
        getContentPane().add(lbl_fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1030, 670));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_avancarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_avancarMouseClicked

        Tela_Programacao12 obj = new Tela_Programacao12();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_lbl_avancarMouseClicked

    private void lbl_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_voltarMouseClicked

        Tela_Programacao09 obj = new  Tela_Programacao09();
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
            java.util.logging.Logger.getLogger(Tela_Programacao10_11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Programacao10_11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Programacao10_11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Programacao10_11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Programacao10_11().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbl_14hr;
    private javax.swing.JLabel lbl_abertura;
    private javax.swing.JLabel lbl_abertura1;
    private javax.swing.JLabel lbl_avancar;
    private javax.swing.JLabel lbl_dia10;
    private javax.swing.JLabel lbl_dia11;
    private javax.swing.JLabel lbl_fundo;
    private javax.swing.JLabel lbl_programacao;
    private javax.swing.JLabel lbl_voltar;
    // End of variables declaration//GEN-END:variables
}