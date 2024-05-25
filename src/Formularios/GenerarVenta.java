package Formularios;

import Clases.Producto;
import Conexion.Conexion_Oracle;
import Modulos.Listar_prod;
import Modulos.Registro_producto;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import javafx.scene.control.ComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class GenerarVenta extends javax.swing.JPanel {

    public GenerarVenta() {
        initComponents();
        tablaventa.getColumnModel().getColumn(0).setPreferredWidth(8);
        tablaventa.getColumnModel().getColumn(0).setResizable(false);
        tablaventa.getColumnModel().getColumn(4).setPreferredWidth(8);
        tablaventa.getColumnModel().getColumn(4).setResizable(false);
        tablaventa.setRowHeight(30);

        generarserie();

        //CODIGO PARA MOSTRAR FECHA , TODO COMO UNS STRING;
        Calendar calendar = new GregorianCalendar();
        txtfecha.setText("" + calendar.get(Calendar.YEAR) + "-" + calendar.get(Calendar.MONTH) + "-" + calendar.get(Calendar.DATE));
        Listarcombo(cbcategoria);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtserie = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtprecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        txtcodigo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtcategoria = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtdescripcion = new javax.swing.JTextField();
        btnagregar = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        btngenerarventa = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btneliminarproducto = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        spinnercantidad = new javax.swing.JSpinner();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaventa = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        txtfecha = new javax.swing.JTextField();
        cbproducto = new javax.swing.JComboBox<>();
        cbcategoria = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtigv = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtsubtotal = new javax.swing.JTextField();
        txtdescuento = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txttotal4 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtimporte = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtcambio = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(112, 8, 24));
        jLabel1.setText("Venta N°");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, 40));

        txtserie.setEditable(false);
        txtserie.setFont(new java.awt.Font("Times New Roman", 0, 23)); // NOI18N
        txtserie.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtserie.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtserie, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 210, 40));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 19)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(112, 8, 24));
        jLabel4.setText("Cantidad requerida :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(112, 8, 24));
        jLabel5.setText("Detalles del producto seleccionado :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        txtprecio.setEditable(false);
        txtprecio.setFont(new java.awt.Font("Times New Roman", 0, 19)); // NOI18N
        txtprecio.setForeground(new java.awt.Color(0, 0, 255));
        txtprecio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtprecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecioActionPerformed(evt);
            }
        });
        jPanel1.add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 200, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 19)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(112, 8, 24));
        jLabel6.setText("Precio del producto :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        txtcantidad.setEditable(false);
        txtcantidad.setFont(new java.awt.Font("Times New Roman", 0, 19)); // NOI18N
        txtcantidad.setForeground(new java.awt.Color(0, 0, 255));
        txtcantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcantidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 200, 30));

        txtcodigo.setEditable(false);
        txtcodigo.setFont(new java.awt.Font("Times New Roman", 0, 19)); // NOI18N
        txtcodigo.setForeground(new java.awt.Color(0, 0, 255));
        txtcodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 390, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 19)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(112, 8, 24));
        jLabel7.setText("Stock del producto :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        txtcategoria.setEditable(false);
        txtcategoria.setFont(new java.awt.Font("Times New Roman", 0, 19)); // NOI18N
        txtcategoria.setForeground(new java.awt.Color(0, 0, 255));
        txtcategoria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcategoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtcategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 280, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 19)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(112, 8, 24));
        jLabel8.setText("Categoria :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 19)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(112, 8, 24));
        jLabel15.setText("Descripcion :");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        txtdescripcion.setEditable(false);
        txtdescripcion.setFont(new java.awt.Font("Times New Roman", 0, 19)); // NOI18N
        txtdescripcion.setForeground(new java.awt.Color(0, 0, 255));
        txtdescripcion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtdescripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtdescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 195, 280, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 460, 310));

        btnagregar.setBackground(new java.awt.Color(112, 8, 24));
        btnagregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnagregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnagregarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnagregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnagregarMouseExited(evt);
            }
        });
        btnagregar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregarproductoventa.png"))); // NOI18N
        btnagregar.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 50));

        add(btnagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 180, 50));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 19)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(112, 8, 24));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Total a pagar ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 650, 140, 30));

        txttotal.setEditable(false);
        txttotal.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N
        txttotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txttotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 680, 140, -1));

        btngenerarventa.setBackground(new java.awt.Color(112, 8, 24));
        btngenerarventa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btngenerarventa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btngenerarventaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btngenerarventaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btngenerarventaMouseExited(evt);
            }
        });
        btngenerarventa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/generarventa.png"))); // NOI18N
        btngenerarventa.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 50));

        add(btngenerarventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 730, 180, 50));

        btneliminarproducto.setBackground(new java.awt.Color(112, 8, 24));
        btneliminarproducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btneliminarproducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btneliminarproductoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btneliminarproductoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btneliminarproductoMouseExited(evt);
            }
        });
        btneliminarproducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminarproductoventa.png"))); // NOI18N
        btneliminarproducto.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 50));

        add(btneliminarproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 730, 180, 50));

        spinnercantidad.setFont(new java.awt.Font("Times New Roman", 0, 19)); // NOI18N
        spinnercantidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        spinnercantidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(spinnercantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 130, 40));

        tablaventa.setFont(new java.awt.Font("Times New Roman", 0, 19)); // NOI18N
        tablaventa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Codigo", "Producto", "Cantidad", "Precio", "Total"
            }
        ));
        jScrollPane2.setViewportView(tablaventa);
        if (tablaventa.getColumnModel().getColumnCount() > 0) {
            tablaventa.getColumnModel().getColumn(0).setMinWidth(60);
            tablaventa.getColumnModel().getColumn(0).setPreferredWidth(60);
            tablaventa.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 980, 270));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 19)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(112, 8, 24));
        jLabel13.setText("Seleccione la categoria :");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        txtfecha.setEditable(false);
        txtfecha.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtfecha.setForeground(new java.awt.Color(0, 51, 204));
        txtfecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtfecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 140, 30));

        cbproducto.setFont(new java.awt.Font("Times New Roman", 0, 19)); // NOI18N
        cbproducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbproductoKeyPressed(evt);
            }
        });
        add(cbproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 191, 240, 40));

        cbcategoria.setFont(new java.awt.Font("Times New Roman", 0, 19)); // NOI18N
        cbcategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione la categoria :", "Bebidas", "Tecnologia", "Cereales", "Productos Higienicos" }));
        cbcategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbcategoriaKeyPressed(evt);
            }
        });
        add(cbcategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 131, 240, 40));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 19)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(112, 8, 24));
        jLabel14.setText("Seleccione el producto :");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 19)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(112, 8, 24));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("I.G.V");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 650, 130, 30));

        txtigv.setEditable(false);
        txtigv.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N
        txtigv.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtigv.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtigv, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 680, 130, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 19)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(112, 8, 24));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("SubTotal");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 650, 130, 30));

        txtsubtotal.setEditable(false);
        txtsubtotal.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N
        txtsubtotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtsubtotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtsubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 680, 130, -1));

        txtdescuento.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N
        txtdescuento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtdescuento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtdescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 680, 130, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 19)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(112, 8, 24));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Descuento");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 650, 130, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txttotal4.setEditable(false);
        txttotal4.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N
        txttotal4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txttotal4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txttotal4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 680, 140, -1));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 19)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(112, 8, 24));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Importe");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 140, 30));

        txtimporte.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N
        txtimporte.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtimporte.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtimporte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtimporteKeyPressed(evt);
            }
        });
        jPanel2.add(txtimporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 140, -1));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 19)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(112, 8, 24));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Cambio");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 140, 30));

        txtcambio.setEditable(false);
        txtcambio.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N
        txtcambio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcambio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtcambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 140, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, 330, 120));

        jPanel3.setBackground(new java.awt.Color(112, 8, 24));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });
        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 40, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void txtprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecioActionPerformed

    private void btnagregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnagregarMouseClicked
        if (txtcodigo.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "SELECCIONE UN PRODUCTO");
        } else {
            agregar_producto();
        }
    }//GEN-LAST:event_btnagregarMouseClicked

    private void btngenerarventaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btngenerarventaMouseClicked
        if (cbproducto.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(this, "INGRESE UN PRODUCTO");
        } else {
            actualizarstock();
            generarserie();
        }
    }//GEN-LAST:event_btngenerarventaMouseClicked

    private void btneliminarproductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneliminarproductoMouseClicked

    }//GEN-LAST:event_btneliminarproductoMouseClicked

    private void btnagregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnagregarMouseExited
        btnagregar.setBackground(new Color(112, 8, 24));
    }//GEN-LAST:event_btnagregarMouseExited

    private void btneliminarproductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneliminarproductoMouseExited
        btneliminarproducto.setBackground(new Color(112, 8, 24));
    }//GEN-LAST:event_btneliminarproductoMouseExited

    private void btngenerarventaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btngenerarventaMouseExited
        btngenerarventa.setBackground(new Color(112, 8, 24));
    }//GEN-LAST:event_btngenerarventaMouseExited

    private void btnagregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnagregarMouseEntered
        btnagregar.setBackground(new Color(74, 7, 17));
    }//GEN-LAST:event_btnagregarMouseEntered

    private void btneliminarproductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneliminarproductoMouseEntered
        btneliminarproducto.setBackground(new Color(74, 7, 17));
    }//GEN-LAST:event_btneliminarproductoMouseEntered

    private void btngenerarventaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btngenerarventaMouseEntered
        btngenerarventa.setBackground(new Color(74, 7, 17));
    }//GEN-LAST:event_btngenerarventaMouseEntered

    private void cbproductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbproductoKeyPressed
        bucarproducto2();
        limpiarcombo(cbproducto);
    }//GEN-LAST:event_cbproductoKeyPressed

    private void cbcategoriaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbcategoriaKeyPressed
        limpiarcombo(cbproducto);
        Listarcombo(cbproducto);
        cbproducto.requestFocus();
    }//GEN-LAST:event_cbcategoriaKeyPressed

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        limpiarcombo(cbproducto);
    }//GEN-LAST:event_jPanel3MouseClicked

    private void txtimporteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtimporteKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            calcular_importe();
        }
    }//GEN-LAST:event_txtimporteKeyPressed

    //Calcular Descuento;
    void descuento() {

    }

    void calcular_importe() {
        double totalcompra = Double.parseDouble(txttotal.getText());
        double ingreso = 0;
        double totaladar = 0;
        ingreso = Double.parseDouble(txtimporte.getText());
        totaladar = ingreso - totalcompra;
        txtcambio.setText("" + totaladar);
    }

//LISTAR PRODUCTO
    Registro_producto objmoudlocategoria = new Registro_producto();
    String categoria1 = null;
    Conexion_Oracle objconexion = new Conexion_Oracle();
    Producto objrutas = new Producto();
    DefaultComboBoxModel combito = new DefaultComboBoxModel();
    DefaultTableModel modelo = new DefaultTableModel();

    void generarserie() {
        String serie = objmoudlocategoria.NroSerieVentas();
        if (serie == null) {
            txtserie.setText("000001");
        } else {
            int increment = Integer.parseInt(serie);
            increment = increment + 1;
            txtserie.setText("00000" + increment);
        }
    }

    TableRowSorter<DefaultTableModel> sorter;

    void limpiarcombo(JComboBox c) {
        for (int y = 0; y < cbproducto.getSelectedIndex(); y++) {
            combito.removeAllElements();
            y = y - 1;
        }
    }
    //METODO LISTAR UN SOLO PRODUCTO...............................................------------------------------------------

    Listar_prod objlista = new Listar_prod();

    //METODO LLAMAR DATOS POR MEDIO DEL NOMBRE
//METODO PARA BUSCAR DATOS PO MEDIO DE LAS BUSQUEDA DEL PRODUCTO---------------------------------------------------------------------------------------
    void bucarproducto2() {
        String produ = cbproducto.getSelectedItem().toString();
        if (cbproducto.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(this, "DEBE INGRESAR NOMBRE DEL PRODUCTO");
        } else {
            Producto objproduc2 = objlista.ListarNombrePro(produ);
            if (objproduc2.getNombre_pro() != null) {
                txtcodigo.setText(objproduc2.getCod_pro());
                txtprecio.setText("" + objproduc2.getPrecio());
                txtcantidad.setText("" + objproduc2.getCantidad());
                txtdescripcion.setText(objproduc2.getDescripcion());
                txtcategoria.setText(objproduc2.getCategoria());

            } else {
                JOptionPane.showMessageDialog(this, "PRODUCTO NO ENCONTRADO");
            }
        }
    }

    String nombre_producto;
//METODO PARA AGREGAR PRODUCTO EN TABLA DE VENTAS ----------------------------------------------------------------------------------------

    void agregar_producto() {
        double total = 0;
        int item = 0;
        modelo = (DefaultTableModel) tablaventa.getModel();
        item = item + 1;
        nombre_producto = objrutas.getCod_pro();
        String codigo = txtcodigo.getText();
        String producto1 = cbproducto.getSelectedItem().toString();
        double precio = Double.parseDouble(txtprecio.getText());
        int cantidad = Integer.parseInt(spinnercantidad.getValue().toString());
        int stock = Integer.parseInt(txtcantidad.getText());
        total = cantidad * precio;
        ArrayList lista = new ArrayList();
        if (stock > 0) {
            lista.add(item);
            lista.add(codigo);
            lista.add(producto1);
            lista.add(cantidad);
            lista.add(precio);
            lista.add(total);
            Object[] objeto = new Object[6];
            objeto[0] = lista.get(0);
            objeto[1] = lista.get(1);
            objeto[2] = lista.get(2);
            objeto[3] = lista.get(3);
            objeto[4] = lista.get(4);
            objeto[5] = lista.get(5);
            modelo.addRow(objeto);
            tablaventa.setModel(modelo);
            calculartotal();
        } else {
            JOptionPane.showMessageDialog(this, "STOCK DEL PRODUCTO NO DISPONIBLE");
        }

    }
    double tpagar = 0;
    int cat;
    double preciosuma;
//METODO CALCULAR EL TOTAL DE DATOS SELECCIONADOS EN LA TABLA VENTA -----------------------------------------------------------------------------

    void calculartotal() {
        for (int i = 0; i < tablaventa.getRowCount(); i++) {
            cat = Integer.parseInt(tablaventa.getValueAt(i, 3).toString());
            preciosuma = Double.parseDouble(tablaventa.getValueAt(i, 4).toString());
            tpagar = tpagar + (cat * preciosuma);
            txttotal.setText("" + tpagar);
            double igv = (tpagar * 18) / 100;
            txtigv.setText("" + igv);
            double subtotal = (tpagar * 85) / 100;
            txtsubtotal.setText("" + subtotal);

        }

    }

    String producto2 = null;
    int cant2 = 0;

    //METODO ACTUALIAR STOCK --------------------------------------------------------------------------------------------------
    void actualizarstock() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            Producto productooo = new Producto();
            producto2 = tablaventa.getValueAt(i, 2).toString();
            cant2 = Integer.parseInt(tablaventa.getValueAt(i, 3).toString());

            productooo = objlista.ListarNombrePro(producto2);

            int sa = productooo.getCantidad() - cant2;
            objlista.actualizarstock(sa, producto2);

        }

    }

    //LISTAR COMBOBOX -----------------------------------------------------------------------------------------------------------------------
    public void Listarcombo(JComboBox comb) {

        String categoriatipo = null;
        if (cbcategoria.getSelectedItem().equals("Bebidas")) {
            limpiarcombo(cbproducto);
            combito = (DefaultComboBoxModel) this.cbproducto.getModel();
            ArrayList<Producto> datos = objlista.listarcombo("Bebidas");

            for (int x = 0; x < datos.size(); x++) {
                combito.addElement(datos.get(x).getNombre_pro());
            }

        } else {
            if (cbcategoria.getSelectedItem().equals("Cereales")) {

                combito = (DefaultComboBoxModel) this.cbproducto.getModel();
                ArrayList<Producto> datos = objlista.listarcombo("Cereales");
                limpiarcombo(cbproducto);
                for (int x = 0; x < datos.size(); x++) {
                    combito.addElement(datos.get(x).getNombre_pro());

                }

            } else {
                if (cbcategoria.getSelectedItem().equals("Tecnologia")) {

                    combito = (DefaultComboBoxModel) this.cbproducto.getModel();
                    ArrayList<Producto> datos = objlista.listarcombo("Tecnologia");
                    limpiarcombo(cbproducto);
                    for (int x = 0; x < datos.size(); x++) {
                        combito.addElement(datos.get(x).getNombre_pro());

                    }

                } else {
                    if (cbcategoria.getSelectedItem().equals("Productos Higienicos")) {
                        limpiarcombo(cbproducto);
                        combito = (DefaultComboBoxModel) this.cbproducto.getModel();
                        ArrayList<Producto> datos = objlista.listarcombo("Productos Higienicos");

                        for (int x = 0; x < datos.size(); x++) {
                            combito.addElement(datos.get(x).getNombre_pro());

                        }

                    }
                }
            }

        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnagregar;
    private javax.swing.JPanel btneliminarproducto;
    private javax.swing.JPanel btngenerarventa;
    private javax.swing.JComboBox<String> cbcategoria;
    private javax.swing.JComboBox<String> cbproducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner spinnercantidad;
    private javax.swing.JTable tablaventa;
    private javax.swing.JTextField txtcambio;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtcategoria;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txtdescuento;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtigv;
    private javax.swing.JTextField txtimporte;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txtserie;
    private javax.swing.JTextField txtsubtotal;
    private javax.swing.JTextField txttotal;
    private javax.swing.JTextField txttotal4;
    // End of variables declaration//GEN-END:variables
}
