package telas;

import static telas.Tela_Iniciar.replay;

public class Cartinha_acerto extends javax.swing.JFrame {
    
    public Cartinha_acerto() {
        
        initComponents();
              
    }
        public static int cartinha=0;
         
        

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_acerto = new javax.swing.JLabel();
        lbl_avancar = new javax.swing.JLabel();
        lbl_cartinha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_acerto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_cannibal/Aceto.png"))); // NOI18N
        getContentPane().add(lbl_acerto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 340, 80));

        lbl_avancar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/setinha.png"))); // NOI18N
        lbl_avancar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_avancar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_avancarMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_avancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, 60, 50));

        lbl_cartinha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_cannibal/Carta_acerto.png"))); // NOI18N
        getContentPane().add(lbl_cartinha, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_avancarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_avancarMouseClicked
        
        if (cartinha == 0){
            
            Nvl1 obj = new Nvl1();
            obj.setVisible(true);
            dispose();
            
        }
        
        if (cartinha == 1) {
            
            Nvl2 obj = new Nvl2();
            obj.setVisible(true);
            dispose();
            
        }
        
        if (cartinha == 2) {
            
            Nvl3 obj = new Nvl3();
            obj.setVisible(true);
            dispose();
            
        }
        
        if (cartinha == 3) {
            
            Nvl4 obj = new Nvl4();
            obj.setVisible(true);
            dispose();
            
        }
        
        if (cartinha == 4) {
            
            Nvl5 obj = new Nvl5();
            obj.setVisible(true);
            dispose();
            
        }
        
    }//GEN-LAST:event_lbl_avancarMouseClicked

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
            java.util.logging.Logger.getLogger(Cartinha_acerto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cartinha_acerto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cartinha_acerto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cartinha_acerto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cartinha_acerto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl_acerto;
    private javax.swing.JLabel lbl_avancar;
    private javax.swing.JLabel lbl_cartinha;
    // End of variables declaration//GEN-END:variables

    /*public void Cartinha() {
        
        new Thread() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 2; i++) {
                        if (i == 1) {                        
                             Nvl2 obj = new Nvl2();
                             obj.setVisible(true);
                             dispose();                       
                        }
                        
                                           
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            System.out.println(e);
                        }
                    }
                    Thread.sleep(0);
                } catch (InterruptedException ex) {
                }
            }
        }.start();
   }*/

}
