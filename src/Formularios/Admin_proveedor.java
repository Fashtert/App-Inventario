package Formularios;

import Clases.Proveedores;
import Conexion.Conexion_Oracle;
import Modulos.ProveedorBO;
import Modulos.Registro_proveedor;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.util.List;
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

public class Admin_proveedor extends javax.swing.JPanel {

    TableRowSorter<DefaultTableModel> sorter;
    ProveedorBO eob = new ProveedorBO();

    public Admin_proveedor() {
        initComponents();
        Idmax();
        Listar(tabla);
        tabla.getColumnModel().getColumn(0).setPreferredWidth(2);
        tabla.getColumnModel().getColumn(0).setResizable(false);
        tabla.getColumnModel().getColumn(1).setResizable(false);
        tabla.getColumnModel().getColumn(2).setResizable(false);
        tabla.getColumnModel().getColumn(3).setResizable(false);
        tabla.getColumnModel().getColumn(4).setResizable(false);
        tabla.getColumnModel().getColumn(5).setResizable(false);
        tabla.getColumnModel().getColumn(6).setPreferredWidth(60);
        tabla.getColumnModel().getColumn(6).setResizable(false);
        tabla.getColumnModel().getColumn(7).setPreferredWidth(60);
        tabla.getColumnModel().getColumn(7).setResizable(false);
        tabla.getColumnModel().getColumn(8).setPreferredWidth(60);
        tabla.getColumnModel().getColumn(8).setResizable(false);
        tabla.setRowHeight(30);
    }

    public void Idmax() {
        txtcodigo.setText(eob.getMaxId() + "");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        txtnombrepro = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        cbtipo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtrazon = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        cbdistrito = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        txtfecha = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();
        cbfrecu = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        clean = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        add = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        delete = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        ACTUALIZAR = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtfiltrar = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 30)); // NOI18N
        jLabel2.setText("Administracion de proveedores");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(112, 8, 24));
        jLabel1.setText("Codigo del proveedores :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

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
        add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 270, 50));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 270, 20));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(112, 8, 24));
        jLabel10.setText("Nombre Proveedor :");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        txtnombrepro.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtnombrepro.setForeground(new java.awt.Color(102, 102, 102));
        txtnombrepro.setText("Ingrese nombre del proveedor");
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
        add(txtnombrepro, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 270, 50));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 270, 20));

        cbtipo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cbtipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el tipo de proveedor :", "Proveedor - Sector Publico", "Proveedor - Sector Privado", " " }));
        cbtipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(cbtipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 270, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(112, 8, 24));
        jLabel5.setText("Nombre empresa :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        txtrazon.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtrazon.setForeground(new java.awt.Color(102, 102, 102));
        txtrazon.setText("Nombre de la empresa");
        txtrazon.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtrazon.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtrazonFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtrazonFocusLost(evt);
            }
        });
        txtrazon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtrazonKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtrazonKeyTyped(evt);
            }
        });
        add(txtrazon, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 270, 50));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 270, 20));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(112, 8, 24));
        jLabel6.setText("Tipo de proveedor :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        cbdistrito.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cbdistrito.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el distrito :", "Chincha Alta.", "Alto Larán.", "Chavín.", "Chincha Baja.", "El Carmen.", "Grocio Prado.", "Pueblo Nuevo.", "San Juan de Yanac.", " " }));
        cbdistrito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(cbdistrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 270, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(112, 8, 24));
        jLabel7.setText("Distrito perteneciente :");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        txttelefono.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txttelefono.setForeground(new java.awt.Color(102, 102, 102));
        txttelefono.setText("Ingrese telefono de contacto");
        txttelefono.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txttelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txttelefonoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txttelefonoFocusLost(evt);
            }
        });
        txttelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefonoActionPerformed(evt);
            }
        });
        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttelefonoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
            }
        });
        add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, 270, 50));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 130, 270, 20));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(112, 8, 24));
        jLabel8.setText("Telefono de contacto :");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(112, 8, 24));
        jLabel9.setText("Correo electronico :");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, -1, -1));

        txtcorreo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtcorreo.setForeground(new java.awt.Color(102, 102, 102));
        txtcorreo.setText("Ingrese correo electronico");
        txtcorreo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtcorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtcorreoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcorreoFocusLost(evt);
            }
        });
        txtcorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcorreoKeyTyped(evt);
            }
        });
        add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 150, 270, 50));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 200, 270, 20));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(112, 8, 24));
        jLabel17.setText("Frecuencia del proveedor :");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, -1, 20));

        txtfecha.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 230, 270, 40));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(112, 8, 24));
        jLabel18.setText("Fecha de Ingreso :");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, -1, 20));

        cbfrecu.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cbfrecu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione la frecuencia :", "Diaria", "Mensual", "Anual" }));
        add(cbfrecu, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 300, 270, -1));

        tabla.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", " Nombre Proveedor", "Tipo proveedor", "Empresa", "Distrito", "Telefono", "Correo Electronico", "Fecha de ingreso", "Frecuencia"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 900, 350));

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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CLEAN.png"))); // NOI18N

        javax.swing.GroupLayout cleanLayout = new javax.swing.GroupLayout(clean);
        clean.setLayout(cleanLayout);
        cleanLayout.setHorizontalGroup(
            cleanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        cleanLayout.setVerticalGroup(
            cleanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(clean, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 450, 70, 70));

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
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        addLayout.setVerticalGroup(
            addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 540, -1, -1));

        delete.setBackground(new java.awt.Color(112, 8, 24));
        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete.setPreferredSize(new java.awt.Dimension(70, 70));
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
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        deleteLayout.setVerticalGroup(
            deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 630, -1, -1));

        ACTUALIZAR.setBackground(new java.awt.Color(112, 8, 24));
        ACTUALIZAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ACTUALIZAR.setPreferredSize(new java.awt.Dimension(70, 70));
        ACTUALIZAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ACTUALIZARMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ACTUALIZARMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ACTUALIZARMouseExited(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UPDATE.png"))); // NOI18N

        javax.swing.GroupLayout ACTUALIZARLayout = new javax.swing.GroupLayout(ACTUALIZAR);
        ACTUALIZAR.setLayout(ACTUALIZARLayout);
        ACTUALIZARLayout.setHorizontalGroup(
            ACTUALIZARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ACTUALIZARLayout.setVerticalGroup(
            ACTUALIZARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(ACTUALIZAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 720, -1, -1));

        jPanel1.setBackground(new java.awt.Color(112, 8, 24));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imprimir.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 10, 50, 50));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(112, 8, 24));
        jLabel19.setText("Buscar Proveedor :");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, -1, -1));

        txtfiltrar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtfiltrar.setForeground(new java.awt.Color(102, 102, 102));
        txtfiltrar.setText("Ingrese proveedor a buscar");
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
        add(txtfiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 370, 270, 40));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, 270, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Listar(tabla);
    }//GEN-LAST:event_jLabel2MouseClicked

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

    private void txtnombreproFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnombreproFocusGained
        if (txtnombrepro.getText().equals("Ingrese nombre del proveedor")) {
            txtnombrepro.setForeground(Color.gray);
            txtnombrepro.setText("");
        }
    }//GEN-LAST:event_txtnombreproFocusGained

    private void txtnombreproFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnombreproFocusLost
        if (txtnombrepro.getText().equals("")) {
            txtnombrepro.setForeground(Color.gray);
            txtnombrepro.setText("Ingrese nombre del proveedor");
        }
    }//GEN-LAST:event_txtnombreproFocusLost

    private void txtnombreproKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreproKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtrazon.requestFocus();
        }
    }//GEN-LAST:event_txtnombreproKeyPressed

    private void txtnombreproKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreproKeyTyped
        txtnombrepro.setForeground(Color.black);
    }//GEN-LAST:event_txtnombreproKeyTyped

    private void txtrazonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtrazonFocusGained
        if (txtrazon.getText().equals("Nombre de la empresa")) {
            txtrazon.setForeground(Color.gray);
            txtrazon.setText("");
        }
    }//GEN-LAST:event_txtrazonFocusGained

    private void txtrazonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtrazonFocusLost
        if (txtrazon.getText().equals("")) {
            txtrazon.setForeground(Color.gray);
            txtrazon.setText("Nombre de la empresa");
        }
    }//GEN-LAST:event_txtrazonFocusLost

    private void txtrazonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrazonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txttelefono.requestFocus();
        }
    }//GEN-LAST:event_txtrazonKeyPressed

    private void txtrazonKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrazonKeyTyped
        txtrazon.setForeground(Color.black);
    }//GEN-LAST:event_txtrazonKeyTyped

    private void txttelefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txttelefonoFocusGained
        if (txttelefono.getText().equals("Ingrese telefono de contacto")) {
            txttelefono.setForeground(Color.gray);
            txttelefono.setText("");
        }
    }//GEN-LAST:event_txttelefonoFocusGained

    private void txttelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txttelefonoFocusLost
        if (txttelefono.getText().equals("")) {
            txttelefono.setForeground(Color.gray);
            txttelefono.setText("Ingrese telefono de contacto");
        }
    }//GEN-LAST:event_txttelefonoFocusLost

    private void txttelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefonoActionPerformed

    private void txttelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtcorreo.requestFocus();
        }
    }//GEN-LAST:event_txttelefonoKeyPressed

    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped
        txttelefono.setForeground(Color.black);
    }//GEN-LAST:event_txttelefonoKeyTyped

    private void txtcorreoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcorreoFocusGained
        if (txtcorreo.getText().equals("Ingrese correo electronico")) {
            txtcorreo.setForeground(Color.gray);
            txtcorreo.setText("");
        }
    }//GEN-LAST:event_txtcorreoFocusGained

    private void txtcorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcorreoFocusLost
        if (txtcorreo.getText().equals("")) {
            txtcorreo.setForeground(Color.gray);
            txtcorreo.setText("Ingrese correo electronico");
        }
    }//GEN-LAST:event_txtcorreoFocusLost

    private void txtcorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcorreoKeyTyped
        txtcorreo.setForeground(Color.black);
    }//GEN-LAST:event_txtcorreoKeyTyped

    private void cleanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cleanMouseClicked
        limpiar();
    }//GEN-LAST:event_cleanMouseClicked

    private void cleanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cleanMouseEntered
        clean.setBackground(new Color(74, 7, 17));
    }//GEN-LAST:event_cleanMouseEntered

    private void cleanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cleanMouseExited
        clean.setBackground(new Color(112, 8, 24));
    }//GEN-LAST:event_cleanMouseExited

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        if (!validarcantidadcaracteres(txttelefono.getText().trim())) {
            JOptionPane.showMessageDialog(this, "REDUZCA EL NUMERO DE CARACTERESAL INGRESAR EL DNI");
        } else {
            registrarEmplea();
            tiempo_listar();
        }

    }//GEN-LAST:event_addMouseClicked

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        add.setBackground(new Color(74, 7, 17));
    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        add.setBackground(new Color(112, 8, 24));
    }//GEN-LAST:event_addMouseExited

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked

        eliminar();
        limpiartabla();
        tiempo_listar();
    }//GEN-LAST:event_deleteMouseClicked

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        delete.setBackground(new Color(74, 7, 17));
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        delete.setBackground(new Color(112, 8, 24));
    }//GEN-LAST:event_deleteMouseExited

    private void ACTUALIZARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ACTUALIZARMouseClicked
        if (!validarcantidadcaracteres(txttelefono.getText().trim())) {
            JOptionPane.showMessageDialog(this, "REDUZCA EL NUMERO DE CARACTERES AL INGRESAR EL DNI");
        } else {

            Modificar();
            tiempo_listar();

        }
    }//GEN-LAST:event_ACTUALIZARMouseClicked

    private void ACTUALIZARMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ACTUALIZARMouseEntered
        ACTUALIZAR.setBackground(new Color(74, 7, 17));
    }//GEN-LAST:event_ACTUALIZARMouseEntered

    private void ACTUALIZARMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ACTUALIZARMouseExited
        ACTUALIZAR.setBackground(new Color(112, 8, 24));
    }//GEN-LAST:event_ACTUALIZARMouseExited

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        mostrar_reporte();
    }//GEN-LAST:event_jPanel1MouseClicked

    private void txtfiltrarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfiltrarFocusGained
        if (txtfiltrar.getText().equals("Ingrese proveedor a buscar")) {
            txtfiltrar.setForeground(Color.gray);
            txtfiltrar.setText("");
        }
    }//GEN-LAST:event_txtfiltrarFocusGained

    private void txtfiltrarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfiltrarFocusLost
        if (txtfiltrar.getText().equals("")) {
            txtfiltrar.setForeground(Color.gray);
            txtfiltrar.setText("Ingrese proveedor a buscar");
        }
    }//GEN-LAST:event_txtfiltrarFocusLost

    private void txtfiltrarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfiltrarKeyReleased
        filtrar();
    }//GEN-LAST:event_txtfiltrarKeyReleased

    private void txtfiltrarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfiltrarKeyTyped
        txtfiltrar.setForeground(Color.black);
    }//GEN-LAST:event_txtfiltrarKeyTyped

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        //ESTABLECER COLOR DE LA LETRA
        txtcodigo.setForeground(Color.black);
        txtnombrepro.setForeground(Color.black);
        txtrazon.setForeground(Color.black);
        txtcorreo.setForeground(Color.black);
        txtcorreo.setForeground(Color.black);
        txtfecha.setForeground(Color.black);
        txttelefono.setForeground(Color.black);

        int selection = tabla.rowAtPoint(evt.getPoint());
        txtcodigo.setText(tabla.getValueAt(selection, 0) + "");
        txtnombrepro.setText(tabla.getValueAt(selection, 1) + "");
        cbtipo.setSelectedItem(tabla.getValueAt(selection, 2) + "");
        txtrazon.setText(tabla.getValueAt(selection, 3) + "");
        cbdistrito.setSelectedItem(tabla.getValueAt(selection, 4) + "");
        txttelefono.setText(tabla.getValueAt(selection, 5) + "");
        txtcorreo.setText(tabla.getValueAt(selection, 6) + "");
        txtfecha.setDateFormatString(tabla.getValueAt(selection, 7) + "");
        cbfrecu.setSelectedItem(tabla.getValueAt(selection, 8) + "");


    }//GEN-LAST:event_tablaMouseClicked

    public void limpiar() {

        txtcodigo.setForeground(Color.gray);
        txtnombrepro.setText("Ingrese nombre del proveedor");
        txtnombrepro.setForeground(Color.gray);
        txtrazon.setText("Nombre de la empresa");
        txtrazon.setForeground(Color.gray);
        txtcorreo.setText("Ingrese correo electronico");
        txtcorreo.setForeground(Color.gray);
        txttelefono.setText("Ingrese telefono de contacto");
        txttelefono.setForeground(Color.gray);
        cbdistrito.setSelectedIndex(0);
        cbfrecu.setSelectedIndex(0);
        cbtipo.setSelectedIndex(0);

        txtfecha.cleanup();
        Idmax();
    }

    public void mostrar_reporte() {
        try {
            Conexion_Oracle cone = new Conexion_Oracle();
            Connection con = cone.abrirConexion();
            JasperReport reporte = null;
            String path = "C:\\Users\\Ernestina\\Documents\\NetBeansProjects\\Inventario_Oracle\\src\\Reportes\\Proveedores.jasper";
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint = JasperFillManager.fillReport(reporte, null, con);
            JasperViewer view = new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            view.setVisible(true);
        } catch (JRException e) {

        }
    }

    public void TIEMPO_ESPERA() {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
    }

    public void tiempo_listar() {
        new Thread() {
            @Override
            public void run() {
                TIEMPO_ESPERA();
                Listar(tabla);

            }
        }.start();
    }

//METODO PARA LIMITAR LA CANTIDAD DE CARACTERES
    public static boolean validarcantidadcaracteres(String datos) {
        return datos.matches("[0-9]{1,9}");
    }
//Meetodo para filtrar la busqueda

    public void filtrar() {
        try {
            sorter.setRowFilter(RowFilter.regexFilter(txtfiltrar.getText()));
        } catch (Exception e) {
        }
    }

    void limpiartabla() {
        for (int y = 0; y < tabla.getRowCount(); y++) {
            modelo.removeRow(y);
            y = y - 1;
        }
    }

    DefaultTableModel modelo = new DefaultTableModel();
    Registro_proveedor objproveedor = new Registro_proveedor();
    Proveedores objemp1 = new Proveedores();

    public void Listar(JTable tabla) {
        limpiartabla();
        modelo = (DefaultTableModel) this.tabla.getModel();
        List<Proveedores> datos = objproveedor.Listarproveedor();
        Object[] objeto = new Object[9];
        for (int x = 0; x < datos.size(); x++) {
            objeto[0] = datos.get(x).getCodigo();
            objeto[1] = datos.get(x).getNombre_proveedor();
            objeto[2] = datos.get(x).getTipo_proveedor();
            objeto[3] = datos.get(x).getNombre_empresa();
            objeto[4] = datos.get(x).getDistrito();
            objeto[5] = datos.get(x).getTelefonocontacto();
            objeto[6] = datos.get(x).getCorreo();
            objeto[7] = datos.get(x).getFecha();
            objeto[8] = datos.get(x).getFrecuencia();

            modelo.addRow(objeto);
            tabla.setAutoCreateRowSorter(true);
            sorter = new TableRowSorter<>(modelo);
            tabla.setRowSorter(sorter);
        }
    }

    public void registrarEmplea() {
        String fechaa1 = ((JTextField) txtfecha.getDateEditor().getUiComponent()).getText();
        if (txtcodigo.getText().isEmpty() || txtnombrepro.getText().isEmpty() || txtrazon.getText().isEmpty() || txtcorreo.getText().isEmpty()
                || txttelefono.getText().isEmpty() || fechaa1.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Rellene todos los campos con informacion");

        } else {

            int codigo1 = Integer.parseInt(txtcodigo.getText());
            String nombre = txtnombrepro.getText();
            String tipoprove = cbtipo.getSelectedItem().toString();
            String nomempresa = txtrazon.getText();
            String distrito = cbdistrito.getSelectedItem().toString();
            String telefono = txttelefono.getText();
            String correo = txtcorreo.getText();
            String frecuen = cbfrecu.getSelectedItem().toString();

            objemp1.setCodigo(codigo1);
            objemp1.setNombre_proveedor(nombre);
            objemp1.setTipo_proveedor(tipoprove);
            objemp1.setNombre_empresa(nomempresa);
            objemp1.setDistrito(distrito);
            objemp1.setTelefonocontacto(telefono);
            objemp1.setCorreo(correo);
            objemp1.setFrecuencia(frecuen);
            objemp1.setFecha(fechaa1);

            int r = objproveedor.agregarproveedor(objemp1);
            if (r == 1) {
                JOptionPane.showMessageDialog(this, "LOS DATOS FUERON INGRESADOS EXITOSAMENTE");
            } else {
                JOptionPane.showMessageDialog(this, "ERROR AL REGISTRAR");
            }
        }
    }

    public void Modificar() {
        String fechaa1 = ((JTextField) txtfecha.getDateEditor().getUiComponent()).getText();
        if (txtcodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR UN CODIGO");
        } else {

            int codigo1 = Integer.parseInt(txtcodigo.getText());
            String nombre = txtnombrepro.getText();
            String tipoprove = cbtipo.getSelectedItem().toString();
            String nomempresa = txtrazon.getText();
            String distrito = cbdistrito.getSelectedItem().toString();
            String telefono = txttelefono.getText();
            String correo = txtcorreo.getText();
            String frecuen = cbfrecu.getSelectedItem().toString();

            objemp1.setCodigo(codigo1);
            objemp1.setNombre_proveedor(nombre);
            objemp1.setTipo_proveedor(tipoprove);
            objemp1.setNombre_empresa(nomempresa);
            objemp1.setDistrito(distrito);
            objemp1.setTelefonocontacto(telefono);
            objemp1.setCorreo(correo);
            objemp1.setFrecuencia(frecuen);
            objemp1.setFecha(fechaa1);

            int r = objproveedor.ActualizarProveedor(objemp1);
            if (r == 1) {
                JOptionPane.showMessageDialog(null, "LOS DATOS FUERON ACTUALIZADOS EXITOSAMENTE");
            } else {
                JOptionPane.showMessageDialog(null, "ERROR AL MODIFICAR");

            }
        }
    }

    public void eliminar() {

        if (txtcodigo.getText().isEmpty() || txtcorreo.getText().isEmpty() || txtnombrepro.getText().isEmpty() || txtrazon.getText().isEmpty()
                || txttelefono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Rellene todos los campos con informacion");
        } else {
            String mensaje = eob.Eliminarproveedor(Integer.parseInt(txtcodigo.getText()));
            JOptionPane.showMessageDialog(null, mensaje);

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ACTUALIZAR;
    private javax.swing.JPanel add;
    private javax.swing.JComboBox<String> cbdistrito;
    private javax.swing.JComboBox<String> cbfrecu;
    private javax.swing.JComboBox<String> cbtipo;
    private javax.swing.JPanel clean;
    private javax.swing.JPanel delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtcorreo;
    private com.toedter.calendar.JDateChooser txtfecha;
    private javax.swing.JTextField txtfiltrar;
    private javax.swing.JTextField txtnombrepro;
    private javax.swing.JTextField txtrazon;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
