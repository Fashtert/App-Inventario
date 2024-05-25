package Formularios;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import Conexion.Conexion_Oracle;
import java.awt.Color;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LOGIN extends javax.swing.JFrame {
// COLOR USADO EN LOS PANELES DE OPCIONES ES EL RGB (112,8,24)

    int x, y;

    public LOGIN() {
        initComponents();
        setIconImage(getIconImage());
        time();
        date();

    }

    //METODOS PARA MSOTRAR HORA------------------------------------------------------
    DateTimeFormatter times = DateTimeFormatter.ofPattern("hh:mm a");
    LocalDateTime fecha2 = LocalDateTime.now();

    /* time();

    date();
     */
    public void time() {
        txttime.setText(times.format(fecha2));
    }
    //METODO PARA MOSTRAR FECHA------------------------------------------------------
    DateTimeFormatter dates = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDateTime now1 = LocalDateTime.now();

    public void date() {
        txtdate.setText(dates.format(now1));
    }

    //METODO PARA MOSTRAR  NUEVA IMAGEN EN EL ICONO
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("IMAGENES/Soto y Ochoa.png"));
        return retValue;

    }
    //METODO DE VALIDACION DE CREDENCIALES Y  POR TIPO DE TRABAJADOR
    Conexion_Oracle yy = new Conexion_Oracle();
    Connection con = (Connection) yy.abrirConexion();

    public void ValidarAcceso() {
        int r = 0;
        try {
            String usu = txtusuario.getText();
            String contra = String.valueOf(txtcontraseña.getPassword());
            String tipotraba = null;
            if (rbadmin.isSelected()) {
                tipotraba = "Administrador";
                String sql = "select*from empleado where usuario='" + usu + "'and contraseña='" + contra + "'and puesto_emple='" + tipotraba + "'";

                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                if (rs.next()) {
                    r = 1;
                    JOptionPane.showMessageDialog(this, "Bienvenido " + txtusuario.getText() + " al sistema de Cielo Dylan");
                    MENU oo = new MENU();
                    oo.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "NO ESTA REGISTRADO O EL PUESTO DE TRABAJADOR NO ES CORRECTO");
                }
            } else {
              if (rbemple.isSelected()) {
                    tipotraba = "Obrero";
                    String sql = "select*from empleado where usuario='" + usu + "'and contraseña='" + contra + "'and puesto_emple='" + tipotraba + "'";

                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(sql);
                    if (rs.next()) {
                        r = 1;
                        JOptionPane.showMessageDialog(this, "BIenvenido " + txtusuario.getText() + " al sistema de Cielo Dylan");
                        MENUP oo = new MENUP();
                        oo.setVisible(true);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "NO ESTA REGISTRADO O EL PUESTO DEL TRABAJADOR NO ES CORRECTO");
                    }
                }
            }

        } catch (SQLException e) {
            System.out.println("ERROR" + "\n");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtcontraseña = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtdate = new javax.swing.JLabel();
        txttime = new javax.swing.JLabel();
        rbadmin = new javax.swing.JRadioButton();
        showpassword = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        rbemple = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 40)); // NOI18N
        jLabel2.setText("Ingrese Contraseña :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 50)); // NOI18N
        jLabel3.setText("Iniciando Sesion");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 40)); // NOI18N
        jLabel4.setText("Ingrese Usuario :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        txtusuario.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        txtusuario.setForeground(new java.awt.Color(153, 153, 153));
        txtusuario.setText("Ingrese su usuario");
        txtusuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtusuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtusuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtusuarioFocusLost(evt);
            }
        });
        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        txtusuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtusuarioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtusuarioKeyTyped(evt);
            }
        });
        jPanel1.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 340, 70));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSeparator1.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 340, 20));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 340, 20));

        txtcontraseña.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        txtcontraseña.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtcontraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcontraseñaKeyPressed(evt);
            }
        });
        jPanel1.add(txtcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 340, 70));

        jPanel2.setBackground(new java.awt.Color(112, 8, 24));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel2MouseExited(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SALIR (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, 240, -1));

        jPanel4.setBackground(new java.awt.Color(112, 8, 24));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel4MouseExited(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ENTRAR.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 620, 240, -1));

        jPanel5.setBackground(new java.awt.Color(112, 8, 24));

        jLabel8.setText("jLabel5");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 620, 240, -1));

        txtdate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtdate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 210, 50));

        txttime.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txttime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txttime, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 210, 50));

        rbadmin.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbadmin);
        rbadmin.setFont(new java.awt.Font("Times New Roman", 0, 23)); // NOI18N
        rbadmin.setText("Soy Administrador");
        jPanel1.add(rbadmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 570, -1, -1));

        showpassword.setBackground(new java.awt.Color(255, 255, 255));
        showpassword.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        showpassword.setText("Mostrar Contraseña");
        showpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpasswordActionPerformed(evt);
            }
        });
        jPanel1.add(showpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 530, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agg.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, -1, -1));

        rbemple.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbemple);
        rbemple.setFont(new java.awt.Font("Times New Roman", 0, 23)); // NOI18N
        rbemple.setText("Soy Empleado");
        jPanel1.add(rbemple, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 570, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtusuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtusuarioFocusGained
        if (txtusuario.getText().equals("Ingrese su usuario")) {
            txtusuario.setText("");
            txtusuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtusuarioFocusGained

    private void txtusuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtusuarioFocusLost
        if (txtusuario.getText().equals("")) {
            txtusuario.setText("Ingrese su usuario");
            txtusuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtusuarioFocusLost

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void txtusuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusuarioKeyTyped
        txtusuario.setForeground(Color.black);
    }//GEN-LAST:event_txtusuarioKeyTyped

    private void txtusuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusuarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtcontraseña.requestFocus();
        }
    }//GEN-LAST:event_txtusuarioKeyPressed

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        iniciarsesion();
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseExited
        jPanel2.setBackground(new Color(112, 8, 24));
    }//GEN-LAST:event_jPanel2MouseExited

    private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseExited
        jPanel4.setBackground(new Color(112, 8, 24));
    }//GEN-LAST:event_jPanel4MouseExited

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
        jPanel2.setBackground(new Color(74, 7, 17));
    }//GEN-LAST:event_jPanel2MouseEntered

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
        jPanel4.setBackground(new Color(74, 7, 17));
    }//GEN-LAST:event_jPanel4MouseEntered

    private void txtcontraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontraseñaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jPanel4.requestFocus();
        }
    }//GEN-LAST:event_txtcontraseñaKeyPressed

    private void showpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpasswordActionPerformed
        if (showpassword.isSelected()) {
            txtcontraseña.setEchoChar((char) 0);
        } else {
            txtcontraseña.setEchoChar('*');
        }
    }//GEN-LAST:event_showpasswordActionPerformed
//SE USO EL MOUSEPRESSED Y DRAGGED PARA REALIZAR LA ACCION DE  MOVER FRAME

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x - x, point.y - y);
    }//GEN-LAST:event_jPanel1MouseDragged

    public void iniciarsesion() {
        ValidarAcceso();
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton rbadmin;
    private javax.swing.JRadioButton rbemple;
    private javax.swing.JCheckBox showpassword;
    private javax.swing.JPasswordField txtcontraseña;
    private javax.swing.JLabel txtdate;
    private javax.swing.JLabel txttime;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
