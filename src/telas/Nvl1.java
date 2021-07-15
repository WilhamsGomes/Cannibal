package telas;

import static telas.Tela_Iniciar.score;
import static telas.Cartinha_acerto.cartinha;
import static telas.Tela_Iniciar.replay;

public class Nvl1 extends javax.swing.JFrame {

   
    public Nvl1() {
        initComponents();
        Piscar();
        
        if (replay>0) {
        lbl_replay.setVisible(false);
        }
        
        lbl_azul.setVisible(false);
        lbl_verde.setVisible(false);
        lbl_amarelo.setVisible(false);
        lbl_vermelho.setVisible(false);
        
        lbl_azulescuro.setVisible(false);
        lbl_verdeescuro.setVisible(false);
        lbl_amareloEscuro.setVisible(false);
        lbl_vermelhoEscuro.setVisible(false);
        
    
    }     
        int aux = 0;
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_verdeescuro = new javax.swing.JLabel();
        lbl_verde = new javax.swing.JLabel();
        lbl_amareloEscuro = new javax.swing.JLabel();
        lbl_amarelo = new javax.swing.JLabel();
        lbl_azulescuro = new javax.swing.JLabel();
        lbl_azul = new javax.swing.JLabel();
        lbl_vermelhoEscuro = new javax.swing.JLabel();
        lbl_vermelho = new javax.swing.JLabel();
        lbl_pnt = new javax.swing.JLabel();
        lbl_pntsNome = new javax.swing.JLabel();
        lbl_replay = new javax.swing.JLabel();
        lbl_tempo = new javax.swing.JLabel();
        lbl_cenario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_verdeescuro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_cores/verdeesc.png"))); // NOI18N
        getContentPane().add(lbl_verdeescuro, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 470, 30));

        lbl_verde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_cores/verde claro.png"))); // NOI18N
        lbl_verde.setText("jLabel1");
        lbl_verde.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_verde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_verdeMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_verde, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 470, 30));

        lbl_amareloEscuro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_cores/amareloforte.png"))); // NOI18N
        getContentPane().add(lbl_amareloEscuro, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 430, 30));

        lbl_amarelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_cores/amareloclaro.png"))); // NOI18N
        lbl_amarelo.setText("jLabel2");
        lbl_amarelo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_amarelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_amareloMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_amarelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 430, 30));

        lbl_azulescuro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_cores/azulforte.png"))); // NOI18N
        getContentPane().add(lbl_azulescuro, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 500, 530, 40));

        lbl_azul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_cores/azulclaro.png"))); // NOI18N
        lbl_azul.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_azul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_azulMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_azul, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 500, 530, 40));

        lbl_vermelhoEscuro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_cores/vermforte.png"))); // NOI18N
        getContentPane().add(lbl_vermelhoEscuro, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 390, 40));

        lbl_vermelho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_cores/vermclaro.png"))); // NOI18N
        lbl_vermelho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_vermelho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_vermelhoMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_vermelho, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 390, 40));

        lbl_pnt.setFont(new java.awt.Font("Bauhaus 93", 0, 48)); // NOI18N
        lbl_pnt.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbl_pnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 100, 40));

        lbl_pntsNome.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        lbl_pntsNome.setForeground(new java.awt.Color(255, 255, 255));
        lbl_pntsNome.setText("SCORE:");
        getContentPane().add(lbl_pntsNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 130, 40));

        lbl_replay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/replay.png"))); // NOI18N
        lbl_replay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_replay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_replayMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_replay, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 70, 70));

        lbl_tempo.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lbl_tempo.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbl_tempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 70, 70));

        lbl_cenario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cenario cinza certo.png"))); // NOI18N
        getContentPane().add(lbl_cenario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_vermelhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_vermelhoMouseClicked
             
        if (aux == 3){
          
         lbl_vermelhoEscuro.setVisible(true); 
         Cartinha_acerto obj = new Cartinha_acerto();
         obj.setVisible(true);
         dispose();
         cartinha++;
         score +=10;
         lbl_pnt.setText(String.valueOf(score));
         
        } else {
            lbl_vermelhoEscuro.setVisible(true);
            Cartinha_erro obj = new Cartinha_erro();
            obj.setVisible(true);
            dispose();
            
        }
    }//GEN-LAST:event_lbl_vermelhoMouseClicked

    private void lbl_amareloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_amareloMouseClicked
        if (aux == 2){
       
         aux++;
         lbl_amareloEscuro.setVisible(true);  
         score +=10;
         lbl_pnt.setText(String.valueOf(score));
         
        } else {
           
            Cartinha_erro obj = new Cartinha_erro();
            obj.setVisible(true);
            dispose();
            lbl_amareloEscuro.setVisible(true);
        }
    }//GEN-LAST:event_lbl_amareloMouseClicked

    private void lbl_verdeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_verdeMouseClicked
        if (aux == 1){
        
         aux++;
         lbl_verdeescuro.setVisible(true);
         score +=10;
         lbl_pnt.setText(String.valueOf(score));
         
        } else {
           
            Cartinha_erro obj = new Cartinha_erro();
            obj.setVisible(true);
            dispose();
            lbl_verdeescuro.setVisible(true);
            
        }
    }//GEN-LAST:event_lbl_verdeMouseClicked

    private void lbl_azulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_azulMouseClicked
        
        if (aux == 0){
        
         aux++;
         lbl_azulescuro.setVisible(true);
         score +=10;
         lbl_pnt.setText(String.valueOf(score));
         
        } else {
           
            Cartinha_erro obj = new Cartinha_erro();
            obj.setVisible(true);
            dispose();
            lbl_azulescuro.setVisible(true);
            
        }
        
    }//GEN-LAST:event_lbl_azulMouseClicked

    private void lbl_replayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_replayMouseClicked
                
        if (replay == 0){   
        lbl_azul.setVisible(false);
        lbl_verde.setVisible(false);
        lbl_amarelo.setVisible(false);
        lbl_vermelho.setVisible(false);
        Piscar();
        lbl_replay.setVisible(false);
        replay++;
        
        }
    }//GEN-LAST:event_lbl_replayMouseClicked

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
            java.util.logging.Logger.getLogger(Nvl1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nvl1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nvl1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nvl1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nvl1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl_amarelo;
    private javax.swing.JLabel lbl_amareloEscuro;
    private javax.swing.JLabel lbl_azul;
    private javax.swing.JLabel lbl_azulescuro;
    private javax.swing.JLabel lbl_cenario;
    private javax.swing.JLabel lbl_pnt;
    private javax.swing.JLabel lbl_pntsNome;
    private javax.swing.JLabel lbl_replay;
    private javax.swing.JLabel lbl_tempo;
    private javax.swing.JLabel lbl_verde;
    private javax.swing.JLabel lbl_verdeescuro;
    private javax.swing.JLabel lbl_vermelho;
    private javax.swing.JLabel lbl_vermelhoEscuro;
    // End of variables declaration//GEN-END:variables

       
    
public void Piscar() {
        
        new Thread() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 6; i++) {
                        if (i == 1) {
                            lbl_azul.setVisible(true);
                        }
                        if (i == 2) {
                            lbl_azul.setVisible(false);
                            lbl_verde.setVisible(true);
                        }
                        if (i == 3) {
                            lbl_azul.setVisible(false);
                            lbl_verde.setVisible(false);
                            lbl_amarelo.setVisible(true);
                        }
                        if (i == 4) {
                            lbl_azul.setVisible(false);
                            lbl_verde.setVisible(false);
                            lbl_amarelo.setVisible(false);
                            lbl_vermelho.setVisible(true);
                        }
                        if (i == 5){
                            lbl_azul.setVisible(true);
                            lbl_vermelho.setVisible(true);
                            lbl_verde.setVisible(true);
                            lbl_amarelo.setVisible(true);
                            
                        }

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            System.out.println(e);
                        }
                    }
                    Thread.sleep(0);
                } catch (InterruptedException ex) {
                }
            }
        }.start();
   }
}
