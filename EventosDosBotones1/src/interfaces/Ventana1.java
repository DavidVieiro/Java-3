/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.awt.Color;

/**
 *
 * @author dam132
 */
public class Ventana1 extends javax.swing.JFrame {

    /**
     * Creates new form Ventana1
     */
    public Ventana1() {
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

        botonON = new javax.swing.JButton();
        botonOFF = new javax.swing.JButton();
        etiquetaClicks = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonON.setBackground(new java.awt.Color(0, 255, 0));
        botonON.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botonON.setForeground(new java.awt.Color(0, 0, 0));
        botonON.setText("ON");
        botonON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonONActionPerformed(evt);
            }
        });

        botonOFF.setBackground(new java.awt.Color(255, 0, 0));
        botonOFF.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botonOFF.setForeground(new java.awt.Color(0, 0, 0));
        botonOFF.setText("OFF");
        botonOFF.setEnabled(false);
        botonOFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOFFActionPerformed(evt);
            }
        });

        etiquetaClicks.setBackground(new java.awt.Color(204, 204, 204));
        etiquetaClicks.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        etiquetaClicks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaClicks.setText("Numero clicks: 0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaClicks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(botonON, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonOFF, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonON, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(botonOFF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etiquetaClicks, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    int numeroClicks = 0;
    
    private void botonONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonONActionPerformed
        ++numeroClicks;
        botonOFF.setEnabled(true);
        botonOFF.setBackground(Color.GREEN);
        botonOFF.setText("ON");
        botonON.setBackground(Color.RED);
        botonON.setText("OFF");
        botonON.setEnabled(false);
        etiquetaClicks.setText( "Numero clicks: " + numeroClicks );
    }//GEN-LAST:event_botonONActionPerformed

    private void botonOFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOFFActionPerformed
        ++numeroClicks;
        botonOFF.setEnabled(false);
        botonOFF.setBackground(Color.RED);
        botonOFF.setText("OFF");
        botonON.setBackground(Color.GREEN);
        botonON.setText("ON");
        botonON.setEnabled(true);
        etiquetaClicks.setText( "Numero clicks: " + numeroClicks );
    }//GEN-LAST:event_botonOFFActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonOFF;
    private javax.swing.JButton botonON;
    private javax.swing.JLabel etiquetaClicks;
    // End of variables declaration//GEN-END:variables
}
