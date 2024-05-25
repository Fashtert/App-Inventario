package Formularios;

import Clases.Producto;
import Conexion.Conexion_Oracle;
import Modulos.ProductoBO;
import Modulos.Registro_producto;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.util.List;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Productos_empleados extends javax.swing.JPanel {

    TableRowSorter<DefaultTableModel> sorter;

    public Productos_empleados() {
        initComponents();
        tabla.getColumnModel().getColumn(0).setPreferredWidth(5);
        tabla.getColumnModel().getColumn(0).setResizable(false);
        tabla.getColumnModel().getColumn(1).setResizable(false);
        tabla.getColumnModel().getColumn(2).setResizable(false);
        tabla.getColumnModel().getColumn(3).setResizable(false);
        tabla.getColumnModel().getColumn(4).setResizable(false);
        tabla.getColumnModel().getColumn(5).setResizable(false);
        tabla.getColumnModel().getColumn(6).setPreferredWidth(9);
        tabla.getColumnModel().getColumn(6).setResizable(false);
        tabla.getColumnModel().getColumn(7).setResizable(false);
        tabla.setRowHeight(30);
        Listar(tabla);
    }
    ProductoBO eob = new ProductoBO();
//METODO LLAMANDO ProductoBO PARA OBTENER CODIGO MAYOR ---------------------------------------------------------------------------------------

 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgcategoria = new javax.swing.ButtonGroup();
        bgubi = new javax.swing.ButtonGroup();
        jLabel7 = new javax.swing.JLabel();
        txtprecio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        txtnombrepro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtdescripcion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        add = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        clean = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        delete = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        rbbebidas = new javax.swing.JRadioButton();
        rbtecnologia = new javax.swing.JRadioButton();
        rbcereales = new javax.swing.JRadioButton();
        rbhigiene = new javax.swing.JRadioButton();
        rb1000 = new javax.swing.JRadioButton();
        rb3000 = new javax.swing.JRadioButton();
        rb4000 = new javax.swing.JRadioButton();
        rb2000 = new javax.swing.JRadioButton();
        imprimir = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtfecha = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        txtfiltrar = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        generar = new javax.swing.JCheckBox();
        txtcodigo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(112, 8, 24));
        jLabel7.setText("Precio del producto :");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        txtprecio.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtprecio.setForeground(new java.awt.Color(102, 102, 102));
        txtprecio.setText("Ingrese precio");
        txtprecio.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtprecio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtprecioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtprecioFocusLost(evt);
            }
        });
        txtprecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprecioKeyTyped(evt);
            }
        });
        add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 270, 50));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 30)); // NOI18N
        jLabel2.setText("Administracion de productos");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 270, 20));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 270, 20));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(112, 8, 24));
        jLabel4.setText("Descripcion del producto :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        txtcantidad.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtcantidad.setForeground(new java.awt.Color(102, 102, 102));
        txtcantidad.setText("Ingrese cantidad");
        txtcantidad.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtcantidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtcantidadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcantidadFocusLost(evt);
            }
        });
        txtcantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidadActionPerformed(evt);
            }
        });
        txtcantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcantidadKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcantidadKeyTyped(evt);
            }
        });
        add(txtcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 270, 50));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 270, 20));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(112, 8, 24));
        jLabel10.setText("Nombres del producto :");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        txtnombrepro.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtnombrepro.setForeground(new java.awt.Color(102, 102, 102));
        txtnombrepro.setText("Ingrese nombre del producto");
        txtnombrepro.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtnombrepro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnombreproFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnombreproFocusLost(evt);
            }
        });
        txtnombrepro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnombreproKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreproKeyTyped(evt);
            }
        });
        add(txtnombrepro, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 270, 50));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(112, 8, 24));
        jLabel5.setText("Cantidad  del producto:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 270, 20));

        txtdescripcion.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtdescripcion.setForeground(new java.awt.Color(102, 102, 102));
        txtdescripcion.setText("Ingrese la descripcion");
        txtdescripcion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtdescripcion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtdescripcionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtdescripcionFocusLost(evt);
            }
        });
        txtdescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdescripcionKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdescripcionKeyTyped(evt);
            }
        });
        add(txtdescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 270, 50));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(112, 8, 24));
        jLabel8.setText("Elija una categoria :");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(112, 8, 24));
        jLabel12.setText("Elija una ubicacion :");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, -1, -1));

        add.setBackground(new java.awt.Color(112, 8, 24));
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.png"))); // NOI18N

        javax.swing.GroupLayout addLayout = new javax.swing.GroupLayout(add);
        add.setLayout(addLayout);
        addLayout.setHorizontalGroup(
            addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(addLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel14)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        addLayout.setVerticalGroup(
            addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
            .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(addLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel14)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 500, -1, -1));

        clean.setBackground(new java.awt.Color(112, 8, 24));
        clean.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clean.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cleanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cleanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cleanMouseExited(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CLEAN.png"))); // NOI18N

        javax.swing.GroupLayout cleanLayout = new javax.swing.GroupLayout(clean);
        clean.setLayout(cleanLayout);
        cleanLayout.setHorizontalGroup(
            cleanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        cleanLayout.setVerticalGroup(
            cleanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(clean, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 420, 70, 70));

        delete.setBackground(new java.awt.Color(112, 8, 24));
        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete2 (1).png"))); // NOI18N

        javax.swing.GroupLayout deleteLayout = new javax.swing.GroupLayout(delete);
        delete.setLayout(deleteLayout);
        deleteLayout.setHorizontalGroup(
            deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(deleteLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel15)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        deleteLayout.setVerticalGroup(
            deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(deleteLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel15)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 590, 70, 70));

        tabla.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre Producto", "Descripcion", "Cantidad", "Precio", "Categoria", "Codigo Ubicacion", "Fecha Ingreso"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 890, 340));

        rbbebidas.setBackground(new java.awt.Color(255, 255, 255));
        bgcategoria.add(rbbebidas);
        rbbebidas.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rbbebidas.setForeground(new java.awt.Color(112, 8, 24));
        rbbebidas.setText("Bebidas");
        add(rbbebidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, -1, -1));

        rbtecnologia.setBackground(new java.awt.Color(255, 255, 255));
        bgcategoria.add(rbtecnologia);
        rbtecnologia.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rbtecnologia.setForeground(new java.awt.Color(112, 8, 24));
        rbtecnologia.setText("Tecnologia");
        add(rbtecnologia, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 80, -1, -1));

        rbcereales.setBackground(new java.awt.Color(255, 255, 255));
        bgcategoria.add(rbcereales);
        rbcereales.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rbcereales.setForeground(new java.awt.Color(112, 8, 24));
        rbcereales.setText("Cereales");
        add(rbcereales, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, -1, -1));

        rbhigiene.setBackground(new java.awt.Color(255, 255, 255));
        bgcategoria.add(rbhigiene);
        rbhigiene.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rbhigiene.setForeground(new java.awt.Color(112, 8, 24));
        rbhigiene.setText("Productos Higienicos");
        add(rbhigiene, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 120, -1, -1));

        rb1000.setBackground(new java.awt.Color(255, 255, 255));
        bgubi.add(rb1000);
        rb1000.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rb1000.setForeground(new java.awt.Color(112, 8, 24));
        rb1000.setText("RACK 1 - 1000");
        add(rb1000, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, -1, -1));

        rb3000.setBackground(new java.awt.Color(255, 255, 255));
        bgubi.add(rb3000);
        rb3000.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rb3000.setForeground(new java.awt.Color(112, 8, 24));
        rb3000.setText("RACK 3 - 3000");
        add(rb3000, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 220, -1, -1));

        rb4000.setBackground(new java.awt.Color(255, 255, 255));
        bgubi.add(rb4000);
        rb4000.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rb4000.setForeground(new java.awt.Color(112, 8, 24));
        rb4000.setText("RACK 4 - 4000");
        add(rb4000, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 220, -1, -1));

        rb2000.setBackground(new java.awt.Color(255, 255, 255));
        bgubi.add(rb2000);
        rb2000.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rb2000.setForeground(new java.awt.Color(112, 8, 24));
        rb2000.setText("RACK 2 - 2000");
        add(rb2000, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 180, -1, -1));

        imprimir.setBackground(new java.awt.Color(112, 8, 24));
        imprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imprimirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imprimirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imprimirMouseExited(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IMPRIMIR_1.png"))); // NOI18N

        javax.swing.GroupLayout imprimirLayout = new javax.swing.GroupLayout(imprimir);
        imprimir.setLayout(imprimirLayout);
        imprimirLayout.setHorizontalGroup(
            imprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imprimirLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        imprimirLayout.setVerticalGroup(
            imprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imprimirLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(imprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 670, 70, 70));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(112, 8, 24));
        jLabel17.setText("Fecha de Ingreso :");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, -1, -1));

        txtfecha.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 280, 190, 40));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(112, 8, 24));
        jLabel13.setText("Buscar productos :");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, -1, -1));

        txtfiltrar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtfiltrar.setForeground(new java.awt.Color(102, 102, 102));
        txtfiltrar.setText("Ingrese producto a buscar");
        txtfiltrar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtfiltrar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtfiltrarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfiltrarFocusLost(evt);
            }
        });
        txtfiltrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtfiltrarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfiltrarKeyTyped(evt);
            }
        });
        add(txtfiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 340, 210, 40));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 380, 210, 20));

        generar.setBackground(new java.awt.Color(255, 255, 255));
        generar.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        generar.setText("Generar Codigo");
        generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarActionPerformed(evt);
            }
        });
        add(generar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        txtcodigo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtcodigo.setForeground(new java.awt.Color(102, 102, 102));
        txtcodigo.setText("Ingrese nuevo codigo");
        txtcodigo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtcodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtcodigoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcodigoFocusLost(evt);
            }
        });
        txtcodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcodigoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcodigoKeyTyped(evt);
            }
        });
        add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 330, 50));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 330, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void txtprecioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtprecioFocusGained
        if (txtprecio.getText().equals("Ingrese precio")) {
            txtprecio.setForeground(Color.gray);
            txtprecio.setText("");
        }
    }//GEN-LAST:event_txtprecioFocusGained

    private void txtprecioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtprecioFocusLost
        if (txtprecio.getText().equals("")) {
            txtprecio.setForeground(Color.gray);
            txtprecio.setText("Ingrese precio");
        }
    }//GEN-LAST:event_txtprecioFocusLost

    private void txtprecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecioKeyTyped
        txtprecio.setForeground(Color.black);
    }//GEN-LAST:event_txtprecioKeyTyped

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Listar(tabla);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void txtcantidadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcantidadFocusGained
        if (txtcantidad.getText().equals("Ingrese cantidad")) {
            txtcantidad.setForeground(Color.gray);
            txtcantidad.setText("");
        }
    }//GEN-LAST:event_txtcantidadFocusGained

    private void txtcantidadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcantidadFocusLost
        if (txtcantidad.getText().equals("")) {
            txtcantidad.setForeground(Color.gray);
            txtcantidad.setText("Ingrese cantidad");
        }
    }//GEN-LAST:event_txtcantidadFocusLost

    private void txtcantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidadActionPerformed

    private void txtcantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantidadKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtprecio.requestFocus();
        }
    }//GEN-LAST:event_txtcantidadKeyPressed

    private void txtcantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantidadKeyTyped
        txtcantidad.setForeground(Color.black);
    }//GEN-LAST:event_txtcantidadKeyTyped

    private void txtnombreproFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnombreproFocusGained
        if (txtnombrepro.getText().equals("Ingrese nombre del producto")) {
            txtnombrepro.setForeground(Color.gray);
            txtnombrepro.setText("");
        }
    }//GEN-LAST:event_txtnombreproFocusGained

    private void txtnombreproFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnombreproFocusLost
        if (txtnombrepro.getText().equals("")) {
            txtnombrepro.setForeground(Color.gray);
            txtnombrepro.setText("Ingrese nombre del producto");
        }
    }//GEN-LAST:event_txtnombreproFocusLost

    private void txtnombreproKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreproKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtdescripcion.requestFocus();
        }
    }//GEN-LAST:event_txtnombreproKeyPressed

    private void txtnombreproKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreproKeyTyped
        txtnombrepro.setForeground(Color.black);
    }//GEN-LAST:event_txtnombreproKeyTyped

    private void txtdescripcionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdescripcionFocusGained
        if (txtdescripcion.getText().equals("Ingrese la descripcion")) {
            txtdescripcion.setForeground(Color.gray);
            txtdescripcion.setText("");
        }
    }//GEN-LAST:event_txtdescripcionFocusGained

    private void txtdescripcionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdescripcionFocusLost
        if (txtdescripcion.getText().equals("")) {
            txtdescripcion.setForeground(Color.gray);
            txtdescripcion.setText("Ingrese la descripcion");
        }
    }//GEN-LAST:event_txtdescripcionFocusLost

    private void txtdescripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdescripcionKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtcantidad.requestFocus();
        }
    }//GEN-LAST:event_txtdescripcionKeyPressed

    private void txtdescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdescripcionKeyTyped
        txtdescripcion.setForeground(Color.black);
    }//GEN-LAST:event_txtdescripcionKeyTyped

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        registrarEmplea();
        tiempo_listar();
        Listar(tabla);
    }//GEN-LAST:event_addMouseClicked

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        add.setBackground(new Color(74, 7, 17));
    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        add.setBackground(new Color(112, 8, 24));
    }//GEN-LAST:event_addMouseExited

    private void cleanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cleanMouseClicked
        limpiar();
        Listar(tabla);
    }//GEN-LAST:event_cleanMouseClicked

    private void cleanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cleanMouseEntered
        clean.setBackground(new Color(74, 7, 17));
    }//GEN-LAST:event_cleanMouseEntered

    private void cleanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cleanMouseExited
        clean.setBackground(new Color(112, 8, 24));
    }//GEN-LAST:event_cleanMouseExited

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        eliminar();
        tiempo_listar();
    }//GEN-LAST:event_deleteMouseClicked

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        delete.setBackground(new Color(74, 7, 17));
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        delete.setBackground(new Color(112, 8, 24));
    }//GEN-LAST:event_deleteMouseExited

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        //CODIGO PARA OBTENER DATOS DE LA TABLA AL SER CLICKEADA ---------------------------------------------------------------------------------------
        txtcodigo.setForeground(Color.black);
        txtnombrepro.setForeground(Color.black);
        txtdescripcion.setForeground(Color.black);
        txtcantidad.setForeground(Color.black);
        txtprecio.setForeground(Color.black);

        //OBTENER DATOS DE LA TABLA
        int selection = tabla.rowAtPoint(evt.getPoint());
        txtcodigo.setText(tabla.getValueAt(selection, 0) + "");
        txtnombrepro.setText(tabla.getValueAt(selection, 1) + "");
        txtdescripcion.setText(tabla.getValueAt(selection, 2) + "");
        txtcantidad.setText(tabla.getValueAt(selection, 3) + "");
        txtprecio.setText(tabla.getValueAt(selection, 4) + "");
        String categoria = tabla.getValueAt(selection, 5) + "";
        if (categoria.equals("Bebidas")) {
            rbbebidas.setSelected(true);
        } else {
            if (categoria.equals("Cereales")) {
                rbcereales.setSelected(true);
            } else {
                if (categoria.equals("Tecnologia")) {
                    rbtecnologia.setSelected(true);
                } else {
                    if (categoria.equals("Productos Higienicos")) {
                        rbhigiene.setSelected(true);
                    }
                }
            }
        }

        int ubicacion = Integer.parseInt(tabla.getValueAt(selection, 6) + "");

        if (ubicacion == 1000) {
            rb1000.setSelected(true);
        } else {
            if (ubicacion == 2000) {
                rb2000.setSelected(true);
            } else {
                if (ubicacion == 3000) {
                    rb3000.setSelected(true);
                } else {
                    if (ubicacion == 4000) {
                        rb4000.setSelected(true);
                    }
                }
            }
        }

    }//GEN-LAST:event_tablaMouseClicked

    private void imprimirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imprimirMouseEntered
        imprimir.setBackground(new Color(74, 7, 17));

    }//GEN-LAST:event_imprimirMouseEntered

    private void imprimirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imprimirMouseExited
        imprimir.setBackground(new Color(112, 8, 24));
    }//GEN-LAST:event_imprimirMouseExited

    private void imprimirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imprimirMouseClicked

        mostrar_reporte();
    }//GEN-LAST:event_imprimirMouseClicked

    private void txtfiltrarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfiltrarFocusGained
        if (txtfiltrar.getText().equals("Ingrese producto a buscar")) {
            txtfiltrar.setForeground(Color.gray);
            txtfiltrar.setText("");
        }
    }//GEN-LAST:event_txtfiltrarFocusGained

    private void txtfiltrarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfiltrarFocusLost
        if (txtfiltrar.getText().equals("")) {
            txtfiltrar.setForeground(Color.gray);
            txtfiltrar.setText("Ingrese producto a buscar");
        }
    }//GEN-LAST:event_txtfiltrarFocusLost

    private void txtfiltrarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfiltrarKeyReleased
        filtrar();
    }//GEN-LAST:event_txtfiltrarKeyReleased

    private void txtfiltrarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfiltrarKeyTyped
        txtfiltrar.setForeground(Color.black);
    }//GEN-LAST:event_txtfiltrarKeyTyped

    private void generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarActionPerformed
        if (generar.isSelected()) {
            String uniqueID = UUID.randomUUID().toString();
            txtcodigo.setText(uniqueID);
            txtcodigo.setForeground(Color.black);
        }
    }//GEN-LAST:event_generarActionPerformed

    private void txtcodigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcodigoFocusGained
        if (txtcodigo.getText().equals("Ingrese nuevo codigo")) {
            txtcodigo.setText("");
            txtcodigo.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtcodigoFocusGained

    private void txtcodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcodigoFocusLost
        if (txtcodigo.getText().equals("")) {
            txtcodigo.setText("Ingrese nuevo codigo");
            txtcodigo.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtcodigoFocusLost

    private void txtcodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtnombrepro.requestFocus();
        }
    }//GEN-LAST:event_txtcodigoKeyPressed

    private void txtcodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoKeyTyped
        txtcodigo.setForeground(Color.black);
    }//GEN-LAST:event_txtcodigoKeyTyped

    public void mostrar_reporte() {
        try {
            Conexion_Oracle cone = new Conexion_Oracle();
            Connection con = cone.abrirConexion();
            JasperReport reporte = null;
            String path = "C:\\Users\\Ernestina\\Documents\\NetBeansProjects\\Inventario_Oracle\\src\\Reportes\\ProductoReport.jasper";
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint = JasperFillManager.fillReport(reporte, null, con);
            JasperViewer view = new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            view.setVisible(true);
        } catch (JRException e) {

        }
    }

//METODO DE TIEMPO DE ESPERA  ---------------------------------------------------------------------------------------
    public void TIEMPO_ESPERA() {
        try {
            Thread.sleep(4000);
        } catch (Exception e) {
        }
    }
//METODOS ACTUALES DE ESPERA ---------------------------------------------------------------------------------------

    public void tiempo_listar() {
        new Thread() {
            @Override
            public void run() {
                TIEMPO_ESPERA();
                Listar(tabla);

            }
        }.start();
    }

    Producto objproducto = new Producto();
    Registro_producto objdaoproducto = new Registro_producto();
//METODO LIMPIAR CAJAS DE TEXTO Y RADIOBUTTONS ---------------------------------------------------------------------------------------

    public void limpiar() {
        txtcodigo.setText("Ingrese nuevo codigo");
        txtcodigo.setForeground(Color.gray);
        txtnombrepro.setText("Ingrese nombre del producto");
        txtnombrepro.setForeground(Color.gray);
        txtdescripcion.setText("Ingrese la descripcion");
        txtdescripcion.setForeground(Color.gray);
        txtcantidad.setText("Ingrese cantidad");
        txtcantidad.setForeground(Color.gray);
        txtprecio.setText("Ingrese precio");
        txtprecio.setForeground(Color.gray);
        bgubi.clearSelection();
        bgcategoria.clearSelection();

    }
//METODO LIMPIAR RESIDUOS DE TABLA ---------------------------------------------------------------------------------------

    void limpiartabla() {
        for (int y = 0; y < tabla.getRowCount(); y++) {
            modelo.removeRow(y);
            y = y - 1;
        }
    }
//METODO LISTAR ---------------------------------------------------------------------------------------
    DefaultTableModel modelo = new DefaultTableModel();

    public void Listar(JTable tabla) {
        limpiartabla();
        modelo = (DefaultTableModel) this.tabla.getModel();
        List<Producto> datos = objdaoproducto.listarProducto1();
        Object[] objeto = new Object[8];
        for (int x = 0; x < datos.size(); x++) {
            objeto[0] = datos.get(x).getCod_pro();
            objeto[1] = datos.get(x).getNombre_pro();
            objeto[2] = datos.get(x).getDescripcion();
            objeto[3] = datos.get(x).getCantidad();
            objeto[4] = datos.get(x).getPrecio();
            objeto[5] = datos.get(x).getCategoria();
            objeto[6] = datos.get(x).getCod_ubicacion();
            objeto[7] = datos.get(x).getFechaven();

            modelo.addRow(objeto);
            //ACTIVANDR FUNCION DE FILTRAR DATOS;
            tabla.setAutoCreateRowSorter(true);
            sorter = new TableRowSorter<>(modelo);
            tabla.setRowSorter(sorter);
        }
    }
//METODO REGISTRAR ---------------------------------------------------------------------------------------

    public void registrarEmplea() {
        String fechaa1 = ((JTextField) txtfecha.getDateEditor().getUiComponent()).getText();
        if (txtcodigo.getText().isEmpty() || txtnombrepro.getText().isEmpty() || txtdescripcion.getText().isEmpty() || txtcantidad.getText().isEmpty()
                || txtprecio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Rellene todos los campos con informacion");

        } else {
//  SINTAXIS PARA SELECCIONAR CATEGORIA SEGUN LO SELECCIONADO;

            int ubicacion = 0;
            String cate2 = null;

            if (rbbebidas.isSelected()) {
                cate2 = "Bebidas";
            } else {
                if (rbcereales.isSelected()) {
                    cate2 = "Cereales";
                } else {
                    if (rbhigiene.isSelected()) {
                        cate2 = "Productos Higienicos";
                    } else {
                        if (rbtecnologia.isSelected()) {
                            cate2 = "Tecnologia";
                        }
                    }
                }
            }
// SINTAXIS PARA ELEGIR EL TIPO DE RACK SELECCIONADO;

            if (rb1000.isSelected()) {
                ubicacion = 1000;
            } else {
                if (rb2000.isSelected()) {
                    ubicacion = 2000;
                } else {
                    if (rb3000.isSelected()) {
                        ubicacion = 3000;
                    } else {
                        if (rb4000.isSelected()) {
                            ubicacion = 4000;
                        }
                    }
                }
            }

            Producto objemp1 = new Producto();
            String codigo1 = txtcodigo.getText();
            String nombre = txtnombrepro.getText();
            String descrip = txtdescripcion.getText();
            int cant = Integer.parseInt(txtcantidad.getText());
            double prec = Double.parseDouble(txtprecio.getText());

            objemp1.setCod_pro(codigo1);
            objemp1.setNombre_pro(nombre);
            objemp1.setDescripcion(descrip);
            objemp1.setCantidad(cant);
            objemp1.setPrecio(prec);
            objemp1.setCategoria(cate2);
            objemp1.setCod_ubicacion(ubicacion);
            objemp1.setFechaven(fechaa1);

            int r = objdaoproducto.agregarProducto(objemp1);
            if (r == 1) {
                JOptionPane.showMessageDialog(this, "LOS DATOS FUERON INGRESADOS EXITOSAMENTE");
            } else {
                JOptionPane.showMessageDialog(this, "ERROR AL REGISTRAR");
            }
        }
    }

//METODO ELIMINAR USANDO ProductoBO ---------------------------------------------------------------------------------------
    String mensaje = "";
    ProductoBO ebo = new ProductoBO();

    public void eliminar() {

        if (txtcodigo.getText().isEmpty() || txtnombrepro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Rellene todos los campos con informacion");
        } else {
            String mensaje = ebo.Eliminarproducto(txtcodigo.getText());
            JOptionPane.showMessageDialog(null, mensaje);
        }
    }

    public void filtrar() {
        try {
            sorter.setRowFilter(RowFilter.regexFilter(txtfiltrar.getText()));
        } catch (Exception e) {
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel add;
    private javax.swing.ButtonGroup bgcategoria;
    private javax.swing.ButtonGroup bgubi;
    private javax.swing.JPanel clean;
    private javax.swing.JPanel delete;
    private javax.swing.JCheckBox generar;
    private javax.swing.JPanel imprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JRadioButton rb1000;
    private javax.swing.JRadioButton rb2000;
    private javax.swing.JRadioButton rb3000;
    private javax.swing.JRadioButton rb4000;
    private javax.swing.JRadioButton rbbebidas;
    private javax.swing.JRadioButton rbcereales;
    private javax.swing.JRadioButton rbhigiene;
    private javax.swing.JRadioButton rbtecnologia;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdescripcion;
    private com.toedter.calendar.JDateChooser txtfecha;
    private javax.swing.JTextField txtfiltrar;
    private javax.swing.JTextField txtnombrepro;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables
}
