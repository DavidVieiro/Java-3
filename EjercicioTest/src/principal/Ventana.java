/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import javax.swing.JOptionPane;

/**
 *
 * @author dam132
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
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

        botonIniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        botonIniciar.setText("Iniciar Test");
        botonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarActionPerformed
        
        Object[] hombreMujer = {"Hombre","Mujer"};
        
        int opcionInicial = JOptionPane.showConfirmDialog(this, "Has empezado deseas continuar?",
                "Paso 1", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        int opcionHM = 0;
        String opcionFinal = "";
        String hm = "";
        
        switch ( opcionInicial ) {
            case JOptionPane.YES_OPTION:
                opcionHM = JOptionPane.showOptionDialog(this, "Eres hombre o mujer?",
                "Paso 2", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, hombreMujer, hombreMujer[0]);
                break;
            case JOptionPane.NO_OPTION:
                this.dispose();
            case JOptionPane.CLOSED_OPTION:
                break;
            default:
        }
        
        switch ( opcionHM ) {
            case JOptionPane.NO_OPTION:
            case JOptionPane.YES_OPTION:
                opcionFinal = JOptionPane.showInputDialog(this, "Introduce tu nombre:", "Paso 3", JOptionPane.INFORMATION_MESSAGE);
                break;
            case JOptionPane.CLOSED_OPTION:
                break;
            default:
        }
        
        if ( opcionHM == 0 ) {
            hm = "o";
        }
        else {
            hm = "a";
        }
        
        if ( !"".equals( opcionFinal ) ) {
            JOptionPane.showMessageDialog(this, "Bienvenid" + hm + " " + opcionFinal, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
        else if ( "".equals( opcionFinal ) ) {
            JOptionPane.showMessageDialog(this, "No has introducido ningun valor...", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_botonIniciarActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIniciar;
    // End of variables declaration//GEN-END:variables
}