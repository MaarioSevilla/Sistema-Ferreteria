/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaGestion;

import com.sun.awt.AWTUtilities;

/**
 *
 * @author sevilla
 */
public class JFMenuRoot extends javax.swing.JFrame {

    /**
     * Creates new form JFMenuRoot
     */
    public JFMenuRoot() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Cerrar = new javax.swing.JLabel();
        Minimizar = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Pedidos = new javax.swing.JButton();
        HistorialVentas = new javax.swing.JButton();
        ProductosDisponibles = new javax.swing.JButton();
        ConsultaAlmacen = new javax.swing.JButton();
        NewUser = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Texto1 = new javax.swing.JLabel();
        RVenta = new javax.swing.JButton();
        Deslizable = new javax.swing.JLabel();
        jabout = new javax.swing.JLabel();
        fnsesion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(880, 630));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(881, 33));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
        });
        jPanel1.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(849, 0, -1, 33));

        Minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizarMouseClicked(evt);
            }
        });
        jPanel1.add(Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(812, 0, 30, 33));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, -1));

        jPanel3.setBackground(new java.awt.Color(250, 250, 250));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setMaximumSize(new java.awt.Dimension(881, 600));
        jPanel3.setMinimumSize(new java.awt.Dimension(881, 600));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/boton2.png"))); // NOI18N
        Pedidos.setBorderPainted(false);
        Pedidos.setContentAreaFilled(false);
        Pedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PedidosMouseClicked(evt);
            }
        });
        Pedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PedidosActionPerformed(evt);
            }
        });
        jPanel3.add(Pedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 190, 120));

        HistorialVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/boton3.png"))); // NOI18N
        HistorialVentas.setBorderPainted(false);
        HistorialVentas.setContentAreaFilled(false);
        HistorialVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HistorialVentasMouseClicked(evt);
            }
        });
        HistorialVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistorialVentasActionPerformed(evt);
            }
        });
        jPanel3.add(HistorialVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 190, 120));

        ProductosDisponibles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/boton4.png"))); // NOI18N
        ProductosDisponibles.setBorderPainted(false);
        ProductosDisponibles.setContentAreaFilled(false);
        ProductosDisponibles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductosDisponiblesMouseClicked(evt);
            }
        });
        ProductosDisponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductosDisponiblesActionPerformed(evt);
            }
        });
        jPanel3.add(ProductosDisponibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 190, -1));

        ConsultaAlmacen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/boton5.png"))); // NOI18N
        ConsultaAlmacen.setBorderPainted(false);
        ConsultaAlmacen.setContentAreaFilled(false);
        ConsultaAlmacen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConsultaAlmacenMouseClicked(evt);
            }
        });
        ConsultaAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaAlmacenActionPerformed(evt);
            }
        });
        jPanel3.add(ConsultaAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 190, 120));

        NewUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/boton6.png"))); // NOI18N
        NewUser.setBorderPainted(false);
        NewUser.setContentAreaFilled(false);
        NewUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewUserMouseClicked(evt);
            }
        });
        NewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewUserActionPerformed(evt);
            }
        });
        jPanel3.add(NewUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, 190, -1));
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 130, 70));

        Texto1.setBackground(new java.awt.Color(153, 51, 0));
        Texto1.setFont(new java.awt.Font("Adobe Devanagari", 0, 12)); // NOI18N
        Texto1.setForeground(new java.awt.Color(230, 226, 219));
        Texto1.setText("Sv Technology");
        jPanel3.add(Texto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, -1, -1));

        RVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/boton1.png"))); // NOI18N
        RVenta.setBorderPainted(false);
        RVenta.setContentAreaFilled(false);
        RVenta.setPreferredSize(new java.awt.Dimension(182, 119));
        RVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RVentaMouseClicked(evt);
            }
        });
        RVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RVentaActionPerformed(evt);
            }
        });
        jPanel3.add(RVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 190, -1));

        Deslizable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/icons8-services_filled.png"))); // NOI18N
        Deslizable.setToolTipText("");
        Deslizable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.red, java.awt.Color.lightGray));
        Deslizable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Deslizable.setPreferredSize(new java.awt.Dimension(34, 33));
        Deslizable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeslizableMouseClicked(evt);
            }
        });
        jPanel3.add(Deslizable, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jabout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jaboutMouseClicked(evt);
            }
        });
        jPanel3.add(jabout, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 70, -1, -1));

        fnsesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fnsesionMouseClicked(evt);
            }
        });
        jPanel3.add(fnsesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 130, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 880, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        
    }//GEN-LAST:event_CerrarMouseClicked

    private void MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseClicked
        
    }//GEN-LAST:event_MinimizarMouseClicked

    private void PedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PedidosMouseClicked
        
    }//GEN-LAST:event_PedidosMouseClicked

    private void PedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PedidosActionPerformed
        XPedidos pe = new XPedidos ();
        pe.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_PedidosActionPerformed

    private void HistorialVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HistorialVentasMouseClicked
        
    }//GEN-LAST:event_HistorialVentasMouseClicked

    private void HistorialVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistorialVentasActionPerformed
        int solouno=0;
        if(solouno<1){
        XVentas V=new XVentas();
        V.setVisible(true);
        this.setVisible(false);
        solouno++;}
    }//GEN-LAST:event_HistorialVentasActionPerformed

    private void ProductosDisponiblesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductosDisponiblesMouseClicked
        
    }//GEN-LAST:event_ProductosDisponiblesMouseClicked

    private void ProductosDisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductosDisponiblesActionPerformed
        XProdDisponibles Pd=new XProdDisponibles();
        Pd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ProductosDisponiblesActionPerformed

    private void ConsultaAlmacenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsultaAlmacenMouseClicked
        
    }//GEN-LAST:event_ConsultaAlmacenMouseClicked

    private void ConsultaAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaAlmacenActionPerformed
        XConsultaAlmacen Ca=new XConsultaAlmacen();
        Ca.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ConsultaAlmacenActionPerformed

    private void NewUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewUserMouseClicked
        RUsuario rg=new RUsuario();
        rg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_NewUserMouseClicked

    private void NewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewUserActionPerformed
        RUsuario rg=new RUsuario();
        rg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_NewUserActionPerformed

    private void RVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RVentaMouseClicked
        JFVenta rv= new JFVenta();
        rv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RVentaMouseClicked

    private void RVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RVentaActionPerformed
        JFVenta rv= new JFVenta();
        rv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RVentaActionPerformed

    private void DeslizableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeslizableMouseClicked
        
    }//GEN-LAST:event_DeslizableMouseClicked

    private void jaboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jaboutMouseClicked
        
    }//GEN-LAST:event_jaboutMouseClicked

    private void fnsesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fnsesionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_fnsesionMouseClicked

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
            java.util.logging.Logger.getLogger(JFMenuRoot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFMenuRoot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFMenuRoot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFMenuRoot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFMenuRoot().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cerrar;
    private javax.swing.JButton ConsultaAlmacen;
    private javax.swing.JLabel Deslizable;
    private javax.swing.JButton HistorialVentas;
    private javax.swing.JLabel Minimizar;
    private javax.swing.JButton NewUser;
    private javax.swing.JButton Pedidos;
    private javax.swing.JButton ProductosDisponibles;
    private javax.swing.JButton RVenta;
    private javax.swing.JLabel Texto1;
    private javax.swing.JLabel fnsesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jabout;
    // End of variables declaration//GEN-END:variables
}
