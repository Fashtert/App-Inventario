package Formularios;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;

public class MENU extends javax.swing.JFrame {
// COLOR USADO EN LOS PANELES DE OPCIONES ES EL RGB (112,8,24)

    Bienvenida bi = new Bienvenida();

    public MENU() {
        initComponents();
      
        setIconImage(getIconImage());
    }
//METODO PARA CAMBIAR EL TIPO DE IMAGEN COMO ICONO

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("IMAGENES/Soto y Ochoa.png"));
        return retValue;

    }
    LOGIN gg = new LOGIN();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        reliebe = new javax.swing.JPanel();
        bien = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        admin_produ = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        salir = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        admin_empe = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        diseño = new javax.swing.JLabel();
        admin_proveedor = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        MOSTRAR = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        admin_produ.setBackground(new java.awt.Color(112, 8, 24));
        admin_produ.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        admin_produ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                admin_produMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                admin_produMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                admin_produMouseExited(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PRO.png"))); // NOI18N
        jLabel7.setAlignmentX(0.5F);

        javax.swing.GroupLayout admin_produLayout = new javax.swing.GroupLayout(admin_produ);
        admin_produ.setLayout(admin_produLayout);
        admin_produLayout.setHorizontalGroup(
            admin_produLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, admin_produLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        admin_produLayout.setVerticalGroup(
            admin_produLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, admin_produLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        reliebe.add(admin_produ, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 410, 110));

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
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        salirLayout.setVerticalGroup(
            salirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        reliebe.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 690, 410, 110));

        admin_empe.setBackground(new java.awt.Color(112, 8, 24));
        admin_empe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        admin_empe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                admin_empeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                admin_empeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                admin_empeMouseExited(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/EMP.png"))); // NOI18N

        javax.swing.GroupLayout admin_empeLayout = new javax.swing.GroupLayout(admin_empe);
        admin_empe.setLayout(admin_empeLayout);
        admin_empeLayout.setHorizontalGroup(
            admin_empeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(admin_empeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        admin_empeLayout.setVerticalGroup(
            admin_empeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(admin_empeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        reliebe.add(admin_empe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 410, 110));

        diseño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MENU.png"))); // NOI18N
        reliebe.add(diseño, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 240));

        admin_proveedor.setBackground(new java.awt.Color(112, 8, 24));
        admin_proveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        admin_proveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                admin_proveedorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                admin_proveedorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                admin_proveedorMouseExited(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregarproveedor.png"))); // NOI18N
        jLabel5.setAlignmentX(0.5F);

        javax.swing.GroupLayout admin_proveedorLayout = new javax.swing.GroupLayout(admin_proveedor);
        admin_proveedor.setLayout(admin_proveedorLayout);
        admin_proveedorLayout.setHorizontalGroup(
            admin_proveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        admin_proveedorLayout.setVerticalGroup(
            admin_proveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(admin_proveedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        reliebe.add(admin_proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 410, 110));

        getContentPane().add(reliebe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, -1));

        MOSTRAR.setBackground(new java.awt.Color(255, 255, 255));
        MOSTRAR.setPreferredSize(new java.awt.Dimension(1010, 770));

        javax.swing.GroupLayout MOSTRARLayout = new javax.swing.GroupLayout(MOSTRAR);
        MOSTRAR.setLayout(MOSTRARLayout);
        MOSTRARLayout.setHorizontalGroup(
            MOSTRARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1017, Short.MAX_VALUE)
        );
        MOSTRARLayout.setVerticalGroup(
            MOSTRARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        getContentPane().add(MOSTRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 1017, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void admin_empeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admin_empeMouseExited
        admin_empe.setBackground(new Color(112, 8, 24));
    }//GEN-LAST:event_admin_empeMouseExited

    private void admin_empeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admin_empeMouseEntered
        admin_empe.setBackground(new Color(74, 7, 17));
    }//GEN-LAST:event_admin_empeMouseEntered

    private void admin_empeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admin_empeMouseClicked
        mostrar_emple();
    }//GEN-LAST:event_admin_empeMouseClicked

    private void salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseExited
        salir.setBackground(new Color(112, 8, 24));
    }//GEN-LAST:event_salirMouseExited

    private void salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseEntered
        salir.setBackground(new Color(74, 7, 17));
    }//GEN-LAST:event_salirMouseEntered

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        gg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_salirMouseClicked

    private void admin_produMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admin_produMouseExited
        admin_produ.setBackground(new Color(112, 8, 24));
    }//GEN-LAST:event_admin_produMouseExited

    private void admin_produMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admin_produMouseEntered
        admin_produ.setBackground(new Color(74, 7, 17));
    }//GEN-LAST:event_admin_produMouseEntered

    private void admin_produMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admin_produMouseClicked

        mostrar_producto();

    }//GEN-LAST:event_admin_produMouseClicked

    private void bienMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bienMouseExited
        bien.setBackground(new Color(112, 8, 24));

    }//GEN-LAST:event_bienMouseExited

    private void bienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bienMouseEntered
        bien.setBackground(new Color(74, 7, 17));
    }//GEN-LAST:event_bienMouseEntered

    private void bienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bienMouseClicked
        Bienvenida bie = new Bienvenida();
        ShowPanel(bie);
    }//GEN-LAST:event_bienMouseClicked

    private void admin_proveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admin_proveedorMouseClicked
        mostrar_proveedor();

    }//GEN-LAST:event_admin_proveedorMouseClicked

    private void admin_proveedorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admin_proveedorMouseEntered
        admin_proveedor.setBackground(new Color(74, 7, 17));
    }//GEN-LAST:event_admin_proveedorMouseEntered

    private void admin_proveedorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admin_proveedorMouseExited
        admin_proveedor.setBackground(new Color(112, 8, 24));
    }//GEN-LAST:event_admin_proveedorMouseExited

    public void tiempo_carga() {
        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }
    }

    public void mostrar_proveedor() {
        new Thread() {
            @Override
            public void run() {
                Carga car = new Carga();
                ShowPanel(car);
                tiempo_carga();
                Admin_proveedor ap = new Admin_proveedor();
                ShowPanel(ap);
            }
        }.start();
    }

    public void mostrar_producto() {
        new Thread() {
            @Override
            public void run() {
                Carga car = new Carga();
                ShowPanel(car);
                tiempo_carga();
                Admin_proa rp = new Admin_proa();
                ShowPanel(rp);

            }
        }.start();
    }

    public void mostrar_emple() {
        new Thread() {
            public void run() {
                Carga car = new Carga();
                ShowPanel(car);
                tiempo_carga();
                admin_empleado em = new admin_empleado();
                ShowPanel(em);
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
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENU().setVisible(true);
            }
        });
    }

    private void ShowPanel(JPanel vista) {
        vista.setSize(1017, 800);
        MOSTRAR.removeAll();
        MOSTRAR.add(vista);
        MOSTRAR.revalidate();
        MOSTRAR.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel MOSTRAR;
    private javax.swing.JPanel admin_empe;
    private javax.swing.JPanel admin_produ;
    private javax.swing.JPanel admin_proveedor;
    private javax.swing.JPanel bien;
    private javax.swing.JLabel diseño;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel reliebe;
    private javax.swing.JPanel salir;
    // End of variables declaration//GEN-END:variables
}
