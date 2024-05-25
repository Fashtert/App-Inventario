package Formularios;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;

public class MENUP extends javax.swing.JFrame {

    Bienvenida bie = new Bienvenida();

    public MENUP() {
        initComponents();

        setIconImage(getIconImage());
 
    }

    @Override
    public Image getIconImage() {

        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("IMAGENES/Soto y Ochoa.png"));
        return retValue;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        reliebe = new javax.swing.JPanel();
        bien = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Productoempleado = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        salir = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        GenerarVenta = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Productoempleado1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        MOSTRAR = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reliebe.setBackground(new java.awt.Color(112, 8, 24));
        reliebe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bien.setBackground(new java.awt.Color(112, 8, 24));
        bien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bienMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bienMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bienMouseExited(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BIENVENIDA (1).png"))); // NOI18N

        javax.swing.GroupLayout bienLayout = new javax.swing.GroupLayout(bien);
        bien.setLayout(bienLayout);
        bienLayout.setHorizontalGroup(
            bienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        bienLayout.setVerticalGroup(
            bienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        reliebe.add(bien, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 410, 110));

        Productoempleado.setBackground(new java.awt.Color(112, 8, 24));
        Productoempleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Productoempleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductoempleadoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ProductoempleadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ProductoempleadoMouseExited(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PRO.png"))); // NOI18N
        jLabel5.setAlignmentX(0.5F);

        javax.swing.GroupLayout ProductoempleadoLayout = new javax.swing.GroupLayout(Productoempleado);
        Productoempleado.setLayout(ProductoempleadoLayout);
        ProductoempleadoLayout.setHorizontalGroup(
            ProductoempleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductoempleadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ProductoempleadoLayout.setVerticalGroup(
            ProductoempleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductoempleadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        reliebe.add(Productoempleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 410, 110));

        salir.setBackground(new java.awt.Color(112, 8, 24));
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirMouseExited(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SAL.png"))); // NOI18N
        jLabel1.setAlignmentX(0.5F);

        javax.swing.GroupLayout salirLayout = new javax.swing.GroupLayout(salir);
        salir.setLayout(salirLayout);
        salirLayout.setHorizontalGroup(
            salirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE))
        );
        salirLayout.setVerticalGroup(
            salirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
        );

        reliebe.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 410, 110));

        GenerarVenta.setBackground(new java.awt.Color(112, 8, 24));
        GenerarVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GenerarVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GenerarVentaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GenerarVentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GenerarVentaMouseExited(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/generar venta (2).png"))); // NOI18N

        javax.swing.GroupLayout GenerarVentaLayout = new javax.swing.GroupLayout(GenerarVenta);
        GenerarVenta.setLayout(GenerarVentaLayout);
        GenerarVentaLayout.setHorizontalGroup(
            GenerarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GenerarVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        GenerarVentaLayout.setVerticalGroup(
            GenerarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GenerarVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        reliebe.add(GenerarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 410, 110));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MENU.png"))); // NOI18N
        reliebe.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 240));

        Productoempleado1.setBackground(new java.awt.Color(112, 8, 24));
        Productoempleado1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Productoempleado1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Productoempleado1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Productoempleado1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Productoempleado1MouseExited(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Detalles de venta.png"))); // NOI18N
        jLabel7.setAlignmentX(0.5F);

        javax.swing.GroupLayout Productoempleado1Layout = new javax.swing.GroupLayout(Productoempleado1);
        Productoempleado1.setLayout(Productoempleado1Layout);
        Productoempleado1Layout.setHorizontalGroup(
            Productoempleado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Productoempleado1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Productoempleado1Layout.setVerticalGroup(
            Productoempleado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Productoempleado1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        reliebe.add(Productoempleado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 410, 110));

        getContentPane().add(reliebe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 770));

        MOSTRAR.setBackground(new java.awt.Color(255, 255, 255));
        MOSTRAR.setPreferredSize(new java.awt.Dimension(1010, 770));

        javax.swing.GroupLayout MOSTRARLayout = new javax.swing.GroupLayout(MOSTRAR);
        MOSTRAR.setLayout(MOSTRARLayout);
        MOSTRARLayout.setHorizontalGroup(
            MOSTRARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        MOSTRARLayout.setVerticalGroup(
            MOSTRARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );

        getContentPane().add(MOSTRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 1010, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bienMouseClicked
        ShowPanel(bie);
    }//GEN-LAST:event_bienMouseClicked

    private void bienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bienMouseEntered
        bien.setBackground(new Color(74, 7, 17));
    }//GEN-LAST:event_bienMouseEntered

    private void bienMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bienMouseExited
        bien.setBackground(new Color(112, 8, 24));
    }//GEN-LAST:event_bienMouseExited

    private void ProductoempleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductoempleadoMouseClicked
        mostrar_pro();
    }//GEN-LAST:event_ProductoempleadoMouseClicked

    private void ProductoempleadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductoempleadoMouseEntered
        Productoempleado.setBackground(new Color(74, 7, 17));
    }//GEN-LAST:event_ProductoempleadoMouseEntered

    private void ProductoempleadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductoempleadoMouseExited
        Productoempleado.setBackground(new Color(112, 8, 24));
    }//GEN-LAST:event_ProductoempleadoMouseExited

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        LOGIN gg = new LOGIN();
        gg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_salirMouseClicked

    private void salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseEntered
        salir.setBackground(new Color(74, 7, 17));
    }//GEN-LAST:event_salirMouseEntered

    private void salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseExited
        salir.setBackground(new Color(112, 8, 24));
    }//GEN-LAST:event_salirMouseExited

    private void GenerarVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GenerarVentaMouseClicked
        mostrar_venta();
    }//GEN-LAST:event_GenerarVentaMouseClicked

    private void GenerarVentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GenerarVentaMouseEntered
        GenerarVenta.setBackground(new Color(74, 7, 17));
    }//GEN-LAST:event_GenerarVentaMouseEntered

    private void GenerarVentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GenerarVentaMouseExited
        GenerarVenta.setBackground(new Color(112, 8, 24));
    }//GEN-LAST:event_GenerarVentaMouseExited

    private void Productoempleado1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Productoempleado1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Productoempleado1MouseClicked

    private void Productoempleado1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Productoempleado1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Productoempleado1MouseEntered

    private void Productoempleado1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Productoempleado1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Productoempleado1MouseExited

    public void tiempo() {
        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }
    }

    public void mostrar_pro() {
        new Thread() {
            public void run() {
                Carga car = new Carga();
                ShowPanel(car);
                tiempo();
                Productos_empleados emplea = new Productos_empleados();
                ShowPanel(emplea);
            }
        }.start();

    }

    public void mostrar_venta() {
        new Thread() {
            public void run() {
                Carga car = new Carga();
                ShowPanel(car);
                tiempo();
                GenerarVenta gv = new GenerarVenta();
                ShowPanel(gv);
            }
        }.start();

    }

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
            java.util.logging.Logger.getLogger(MENUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENUP().setVisible(true);
            }
        });
    }

    private void ShowPanel(JPanel vista) {
        vista.setSize(1095, 770);
        MOSTRAR.removeAll();
        MOSTRAR.add(vista);
        MOSTRAR.revalidate();
        MOSTRAR.repaint();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel GenerarVenta;
    private javax.swing.JPanel MOSTRAR;
    private javax.swing.JPanel Productoempleado;
    private javax.swing.JPanel Productoempleado1;
    private javax.swing.JPanel bien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel reliebe;
    private javax.swing.JPanel salir;
    // End of variables declaration//GEN-END:variables
}
