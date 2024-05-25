package Formularios;

import Clases.Empleado;
import Conexion.Conexion_Oracle;

import Modulos.EmpleadoBO;
import Modulos.Registro_empleados;
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

public class admin_empleado extends javax.swing.JPanel {

    Registro_empleados objempleado = new Registro_empleados();
    EmpleadoBO eob = new EmpleadoBO();
    TableRowSorter<DefaultTableModel> sorter;

    public admin_empleado() {
        initComponents();
        Listar(tabla);
        Idmax();
        tabla.getColumnModel().getColumn(0).setPreferredWidth(3);
        tabla.getColumnModel().getColumn(0).setResizable(false);
        tabla.getColumnModel().getColumn(1).setResizable(false);
        tabla.getColumnModel().getColumn(2).setResizable(false);
        tabla.getColumnModel().getColumn(3).setResizable(false);
        tabla.getColumnModel().getColumn(4).setResizable(false);
        tabla.getColumnModel().getColumn(5).setResizable(false);
        tabla.getColumnModel().getColumn(6).setPreferredWidth(3);
        tabla.getColumnModel().getColumn(6).setResizable(false);
        tabla.getColumnModel().getColumn(7).setPreferredWidth(3);
        tabla.getColumnModel().getColumn(7).setResizable(false);
        tabla.getColumnModel().getColumn(8).setPreferredWidth(60);
        tabla.getColumnModel().getColumn(8).setResizable(false);
        tabla.getColumnModel().getColumn(9).setPreferredWidth(30);
        tabla.getColumnModel().getColumn(9).setResizable(false);
        tabla.setRowHeight(30);

    }

    public void Idmax() {
        txtcodigo.setText(eob.getMaxId() + "");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        group_puesto_empleo = new javax.swing.ButtonGroup();
        group_genero = new javax.swing.ButtonGroup();
        group_estado = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtdni = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtapellido = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtnombre = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        txtcodigo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtcorreo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        txtcontraseña = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rbgenero = new javax.swing.JRadioButton();
        rbgenerof = new javax.swing.JRadioButton();
        rbsoltero = new javax.swing.JRadioButton();
        rbcasado = new javax.swing.JRadioButton();
        rbobrero = new javax.swing.JRadioButton();
        rbadmin = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        clean = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        add = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        delete = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        ACTUALIZAR = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtfecha = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        txtfiltrar = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 30)); // NOI18N
        jLabel2.setText("Administracion de empleado");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(112, 8, 24));
        jLabel3.setText("Codigo empleado :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(112, 8, 24));
        jLabel10.setText("Nombres del empleado :");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(112, 8, 24));
        jLabel4.setText("Apellidos del empleado :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(112, 8, 24));
        jLabel5.setText("DNI del empleado :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        txtdni.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtdni.setForeground(new java.awt.Color(102, 102, 102));
        txtdni.setText("Ingrese su DNI");
        txtdni.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtdni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtdniFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtdniFocusLost(evt);
            }
        });
        txtdni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdniActionPerformed(evt);
            }
        });
        txtdni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdniKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdniKeyTyped(evt);
            }
        });
        add(txtdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 270, 50));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 270, 20));

        txtapellido.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtapellido.setForeground(new java.awt.Color(102, 102, 102));
        txtapellido.setText("Ingrese sus apellidos");
        txtapellido.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtapellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtapellidoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtapellidoFocusLost(evt);
            }
        });
        txtapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtapellidoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidoKeyTyped(evt);
            }
        });
        add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 270, 50));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 270, 20));

        txtnombre.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtnombre.setForeground(new java.awt.Color(102, 102, 102));
        txtnombre.setText("Ingrese sus nombres");
        txtnombre.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtnombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnombreFocusLost(evt);
            }
        });
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });
        add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 270, 50));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 270, 20));

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
        add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 270, 50));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 270, 20));

        txtcorreo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtcorreo.setForeground(new java.awt.Color(102, 102, 102));
        txtcorreo.setText("Ingrese su correo electronico");
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
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcorreoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcorreoKeyTyped(evt);
            }
        });
        add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 270, 50));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(112, 8, 24));
        jLabel7.setText("Correo electronico :");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 270, 20));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(112, 8, 24));
        jLabel11.setText("Ingrese su usuario :");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, -1, -1));

        txtusuario.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtusuario.setForeground(new java.awt.Color(102, 102, 102));
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
        add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 270, 50));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 120, 270, 20));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(112, 8, 24));
        jLabel6.setText("Ingrese su contraseña :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, -1, -1));

        txtcontraseña.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtcontraseña.setForeground(new java.awt.Color(102, 102, 102));
        txtcontraseña.setText("Ingrese su contraseña");
        txtcontraseña.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtcontraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtcontraseñaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcontraseñaFocusLost(evt);
            }
        });
        txtcontraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcontraseñaKeyTyped(evt);
            }
        });
        add(txtcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, 270, 50));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 180, 270, 20));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(112, 8, 24));
        jLabel8.setText("Puesto del empleado :");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(112, 8, 24));
        jLabel12.setText("Estado civil :");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(112, 8, 24));
        jLabel9.setText("Fecha de ingreso :");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        rbgenero.setBackground(new java.awt.Color(255, 255, 255));
        group_genero.add(rbgenero);
        rbgenero.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        rbgenero.setForeground(new java.awt.Color(112, 8, 24));
        rbgenero.setText("Masculino");
        add(rbgenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 320, -1, -1));

        rbgenerof.setBackground(new java.awt.Color(255, 255, 255));
        group_genero.add(rbgenerof);
        rbgenerof.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        rbgenerof.setForeground(new java.awt.Color(112, 8, 24));
        rbgenerof.setText("Femenino");
        add(rbgenerof, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 320, -1, -1));

        rbsoltero.setBackground(new java.awt.Color(255, 255, 255));
        group_estado.add(rbsoltero);
        rbsoltero.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        rbsoltero.setForeground(new java.awt.Color(112, 8, 24));
        rbsoltero.setText("Soltero");
        add(rbsoltero, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 270, -1, -1));

        rbcasado.setBackground(new java.awt.Color(255, 255, 255));
        group_estado.add(rbcasado);
        rbcasado.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        rbcasado.setForeground(new java.awt.Color(112, 8, 24));
        rbcasado.setText("Casado");
        add(rbcasado, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 270, 80, -1));

        rbobrero.setBackground(new java.awt.Color(255, 255, 255));
        group_puesto_empleo.add(rbobrero);
        rbobrero.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        rbobrero.setForeground(new java.awt.Color(112, 8, 24));
        rbobrero.setText("Obrero");
        add(rbobrero, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 220, -1, -1));

        rbadmin.setBackground(new java.awt.Color(255, 255, 255));
        group_puesto_empleo.add(rbadmin);
        rbadmin.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        rbadmin.setForeground(new java.awt.Color(112, 8, 24));
        rbadmin.setText("Administrador");
        rbadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbadminActionPerformed(evt);
            }
        });
        add(rbadmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 220, -1, -1));

        tabla.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Nombres", "Apellidos", "Correo Electronico", "DNI", "Puesto", "EC", "G", "Usuario", "Contraseña", "Fecha"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 920, 320));

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

        txtfecha.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 180, 40));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(112, 8, 24));
        jLabel17.setText("Buscar empleado :");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, -1, -1));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(112, 8, 24));
        jLabel18.setText("Genero :");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, -1, -1));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, 270, 20));

        txtfiltrar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtfiltrar.setForeground(new java.awt.Color(102, 102, 102));
        txtfiltrar.setText("Ingrese empleado a buscar");
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
    }// </editor-fold>//GEN-END:initComponents

    private void txtdniFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdniFocusGained
        if (txtdni.getText().equals("Ingrese su DNI")) {
            txtdni.setForeground(Color.gray);
            txtdni.setText("");
        }
    }//GEN-LAST:event_txtdniFocusGained

    private void txtdniFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdniFocusLost
        if (txtdni.getText().equals("")) {
            txtdni.setForeground(Color.gray);
            txtdni.setText("Ingrese su DNI");
        }
    }//GEN-LAST:event_txtdniFocusLost

    private void txtdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdniActionPerformed

    private void txtdniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdniKeyTyped
        txtdni.setForeground(Color.black);
    }//GEN-LAST:event_txtdniKeyTyped

    private void txtapellidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtapellidoFocusGained
        if (txtapellido.getText().equals("Ingrese sus apellidos")) {
            txtapellido.setForeground(Color.gray);
            txtapellido.setText("");
        }
    }//GEN-LAST:event_txtapellidoFocusGained

    private void txtapellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtapellidoFocusLost
        if (txtapellido.getText().equals("")) {
            txtapellido.setForeground(Color.gray);
            txtapellido.setText("Ingrese sus apellidos");
        }
    }//GEN-LAST:event_txtapellidoFocusLost

    private void txtapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyTyped
        txtapellido.setForeground(Color.black);
    }//GEN-LAST:event_txtapellidoKeyTyped

    private void txtnombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnombreFocusGained
        if (txtnombre.getText().equals("Ingrese sus nombres")) {
            txtnombre.setForeground(Color.gray);
            txtnombre.setText("");
        }
    }//GEN-LAST:event_txtnombreFocusGained

    private void txtnombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnombreFocusLost
        if (txtnombre.getText().equals("")) {
            txtnombre.setForeground(Color.gray);
            txtnombre.setText("Ingrese sus nombres");
        }
    }//GEN-LAST:event_txtnombreFocusLost

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        txtnombre.setForeground(Color.black);
    }//GEN-LAST:event_txtnombreKeyTyped

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

    private void txtcodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoKeyTyped
        txtcodigo.setForeground(Color.black);
    }//GEN-LAST:event_txtcodigoKeyTyped

    private void txtcorreoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcorreoFocusGained
        if (txtcorreo.getText().equals("Ingrese su correo electronico")) {
            txtcorreo.setForeground(Color.gray);
            txtcorreo.setText("");
        }
    }//GEN-LAST:event_txtcorreoFocusGained

    private void txtcorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcorreoFocusLost
        if (txtcorreo.getText().equals("")) {
            txtcorreo.setForeground(Color.gray);
            txtcorreo.setText("Ingrese su correo electronico");
        }
    }//GEN-LAST:event_txtcorreoFocusLost

    private void txtcorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcorreoKeyTyped
        txtcorreo.setForeground(Color.black);
    }//GEN-LAST:event_txtcorreoKeyTyped

    private void txtusuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtusuarioFocusGained
        if (txtusuario.getText().equals("Ingrese su usuario")) {
            txtusuario.setForeground(Color.gray);
            txtusuario.setText("");
        }
    }//GEN-LAST:event_txtusuarioFocusGained

    private void txtusuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtusuarioFocusLost
        if (txtusuario.getText().equals("")) {
            txtusuario.setForeground(Color.gray);
            txtusuario.setText("Ingrese su usuario");
        }
    }//GEN-LAST:event_txtusuarioFocusLost

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void txtusuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusuarioKeyTyped
        txtusuario.setForeground(Color.black);
    }//GEN-LAST:event_txtusuarioKeyTyped

    private void txtcontraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcontraseñaFocusGained
        if (txtcontraseña.getText().equals("Ingrese su contraseña")) {
            txtcontraseña.setForeground(Color.gray);
            txtcontraseña.setText("");
        }
    }//GEN-LAST:event_txtcontraseñaFocusGained

    private void txtcontraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcontraseñaFocusLost
        if (txtcontraseña.getText().equals("")) {
            txtcontraseña.setForeground(Color.gray);
            txtcontraseña.setText("Ingrese su contraseña");
        }
    }//GEN-LAST:event_txtcontraseñaFocusLost

    private void txtcontraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontraseñaKeyTyped
        txtcontraseña.setForeground(Color.black);
    }//GEN-LAST:event_txtcontraseñaKeyTyped

    private void rbadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbadminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbadminActionPerformed

    private void cleanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cleanMouseExited
        clean.setBackground(new Color(112, 8, 24));
    }//GEN-LAST:event_cleanMouseExited

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        add.setBackground(new Color(112, 8, 24));
    }//GEN-LAST:event_addMouseExited

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        delete.setBackground(new Color(112, 8, 24));
    }//GEN-LAST:event_deleteMouseExited

    private void ACTUALIZARMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ACTUALIZARMouseExited
        ACTUALIZAR.setBackground(new Color(112, 8, 24));
    }//GEN-LAST:event_ACTUALIZARMouseExited

    private void cleanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cleanMouseEntered
        clean.setBackground(new Color(74, 7, 17));
    }//GEN-LAST:event_cleanMouseEntered

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        add.setBackground(new Color(74, 7, 17));
    }//GEN-LAST:event_addMouseEntered

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        delete.setBackground(new Color(74, 7, 17));
    }//GEN-LAST:event_deleteMouseEntered

    private void ACTUALIZARMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ACTUALIZARMouseEntered
        ACTUALIZAR.setBackground(new Color(74, 7, 17));
    }//GEN-LAST:event_ACTUALIZARMouseEntered

    private void cleanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cleanMouseClicked
        limpiar();
    }//GEN-LAST:event_cleanMouseClicked

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        if (!validarcantidadcaracteres(txtdni.getText().trim())) {
            JOptionPane.showMessageDialog(this, "REDUZCA EL NUMERO DE CARACTERESAL INGRESAR EL DNI");
        } else {

            registrarEmplea();
            tiempo_listar();

        }


    }//GEN-LAST:event_addMouseClicked

    private void ACTUALIZARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ACTUALIZARMouseClicked
        if (!validarcantidadcaracteres(txtdni.getText().trim())) {
            JOptionPane.showMessageDialog(this, "REDUZCA EL NUMERO DE CARACTERES AL INGRESAR EL DNI");
        } else {

            Modificar();
            tiempo_listar();

        }
    }//GEN-LAST:event_ACTUALIZARMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked

        eliminar();
        limpiartabla();
        tiempo_listar();
    }//GEN-LAST:event_deleteMouseClicked

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        txtcodigo.setForeground(Color.black);
        txtnombre.setForeground(Color.black);
        txtapellido.setForeground(Color.black);
        txtcorreo.setForeground(Color.black);
        txtdni.setForeground(Color.black);
        txtusuario.setForeground(Color.black);
        txtcontraseña.setForeground(Color.black);

        int selection = tabla.rowAtPoint(evt.getPoint());
        txtcodigo.setText(tabla.getValueAt(selection, 0) + "");
        txtnombre.setText(tabla.getValueAt(selection, 1) + "");
        txtapellido.setText(tabla.getValueAt(selection, 2) + "");
        txtcorreo.setText(tabla.getValueAt(selection, 3) + "");
        txtdni.setText(tabla.getValueAt(selection, 4) + "");
        String puesto = tabla.getValueAt(selection, 5) + "";
        if (puesto.equals("Obrero")) {
            rbobrero.setSelected(true);
        } else {
            rbadmin.setSelected(true);
        }
        String estado = tabla.getValueAt(selection, 6) + "";
        if (estado.equals("S")) {
            rbsoltero.setSelected(true);
        } else {
            rbcasado.setSelected(true);
        }
        String gender = tabla.getValueAt(selection, 7) + "";
        if (gender.equals("M")) {
            rbgenero.setSelected(true);
        } else {
            rbgenerof.setSelected(true);
        }
        txtusuario.setText(tabla.getValueAt(selection, 8) + "");
        txtcontraseña.setText(tabla.getValueAt(selection, 9) + "");

    }//GEN-LAST:event_tablaMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Listar(tabla);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void txtcodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtnombre.requestFocus();
        }
    }//GEN-LAST:event_txtcodigoKeyPressed

    private void txtnombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtapellido.requestFocus();
        }
    }//GEN-LAST:event_txtnombreKeyPressed

    private void txtapellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtdni.requestFocus();
        }
    }//GEN-LAST:event_txtapellidoKeyPressed

    private void txtdniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdniKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtcorreo.requestFocus();
        }
    }//GEN-LAST:event_txtdniKeyPressed

    private void txtcorreoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcorreoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtusuario.requestFocus();
        }
    }//GEN-LAST:event_txtcorreoKeyPressed

    private void txtusuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusuarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtcontraseña.requestFocus();
        }
    }//GEN-LAST:event_txtusuarioKeyPressed

    private void txtfiltrarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfiltrarFocusGained
        if (txtfiltrar.getText().equals("Ingrese empleado a buscar")) {
            txtfiltrar.setForeground(Color.gray);
            txtfiltrar.setText("");
        }
    }//GEN-LAST:event_txtfiltrarFocusGained

    private void txtfiltrarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfiltrarFocusLost
        if (txtfiltrar.getText().equals("")) {
            txtfiltrar.setForeground(Color.gray);
            txtfiltrar.setText("Ingrese empleado a buscar");
        }
    }//GEN-LAST:event_txtfiltrarFocusLost

    private void txtfiltrarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfiltrarKeyReleased
        filtrar();
    }//GEN-LAST:event_txtfiltrarKeyReleased

    private void txtfiltrarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfiltrarKeyTyped
        txtfiltrar.setForeground(Color.black);
    }//GEN-LAST:event_txtfiltrarKeyTyped

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        mostrar_reporte();
    }//GEN-LAST:event_jPanel1MouseClicked
    public void mostrar_reporte() {
        try {
            Conexion_Oracle cone = new Conexion_Oracle();
            Connection con = cone.abrirConexion();
            JasperReport reporte = null;
            String path = "C:\\Users\\Ernestina\\Documents\\NetBeansProjects\\Inventario_Oracle\\src\\Reportes\\Empleado_Re.jasper";
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint = JasperFillManager.fillReport(reporte, null, con);
            JasperViewer view = new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            view.setVisible(true);
        } catch (JRException e) {

        }
    }

    public void filtrar() {
        try {
            sorter.setRowFilter(RowFilter.regexFilter(txtfiltrar.getText()));
        } catch (Exception e) {
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

    public void limpiar() {

        txtcodigo.setForeground(Color.gray);
        txtnombre.setText("Ingrese sus nombres");
        txtnombre.setForeground(Color.gray);
        txtapellido.setText("Ingrese sus apellidos");
        txtapellido.setForeground(Color.gray);
        txtcorreo.setText("Ingrese su correo electronico");
        txtcorreo.setForeground(Color.gray);
        txtdni.setText("Ingrese su DNI");
        txtdni.setForeground(Color.gray);
        txtusuario.setText("Ingrese su usuario");
        txtusuario.setForeground(Color.gray);
        txtcontraseña.setText("Ingrese su contraseña");
        txtcontraseña.setForeground(Color.gray);
        group_estado.clearSelection();
        group_genero.clearSelection();
        group_puesto_empleo.clearSelection();
        txtfecha.cleanup();
        Idmax();
    }

    void limpiartabla() {
        for (int y = 0; y < tabla.getRowCount(); y++) {
            modelo.removeRow(y);
            y = y - 1;
        }
    }

    DefaultTableModel modelo = new DefaultTableModel();

    public void Listar(JTable tabla) {
        limpiartabla();
        modelo = (DefaultTableModel) this.tabla.getModel();
        List<Empleado> datos = objempleado.listarEmpleado();
        Object[] objeto = new Object[11];
        for (int x = 0; x < datos.size(); x++) {
            objeto[0] = datos.get(x).getCod_emp();
            objeto[1] = datos.get(x).getNombre();
            objeto[2] = datos.get(x).getApellido();
            objeto[3] = datos.get(x).getCorreo();
            objeto[4] = datos.get(x).getDni();
            objeto[5] = datos.get(x).getPuesto();
            objeto[6] = datos.get(x).getEstado_civil();
            objeto[7] = datos.get(x).getGenero();
            objeto[8] = datos.get(x).getUsuario();
            objeto[9] = datos.get(x).getContraseña();
            objeto[10] = datos.get(x).getFecha();
            modelo.addRow(objeto);
            tabla.setAutoCreateRowSorter(true);
            sorter = new TableRowSorter<>(modelo);
            tabla.setRowSorter(sorter);
        }
    }

    public void registrarEmplea() {
        String fechaa1 = ((JTextField) txtfecha.getDateEditor().getUiComponent()).getText();
        if (txtcodigo.getText().isEmpty() || txtnombre.getText().isEmpty() || txtapellido.getText().isEmpty() || txtcorreo.getText().isEmpty()
                || txtdni.getText().isEmpty() || txtusuario.getText().isEmpty() || txtcontraseña.getText().isEmpty() || fechaa1.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Rellene todos los campos con informacion");

        } else {
            String puesto = null;
            String estate = null;
            String gender = null;

            if (rbobrero.isSelected()) {
                puesto = "Obrero";
            } else {
                puesto = "Administrador";
            }

            if (rbsoltero.isSelected()) {
                estate = "S";
            } else {
                estate = "C";
            }
            if (rbgenero.isSelected()) {
                gender = "M";
            } else {
                gender = "F";
            }

            Empleado objemp1 = new Empleado();
            int codigo1 = Integer.parseInt(txtcodigo.getText());
            String nombre = txtnombre.getText();
            String ape = txtapellido.getText();
            String correo = txtcorreo.getText();
            String dni = txtdni.getText();
            String usu = txtusuario.getText();
            String contra = txtcontraseña.getText();

            objemp1.setCod_emp(codigo1);
            objemp1.setNombre(nombre);
            objemp1.setApellido(ape);
            objemp1.setCorreo(correo);
            objemp1.setDni(dni);
            objemp1.setPuesto(puesto);
            objemp1.setEstado_civil(estate);
            objemp1.setGenero(gender);
            objemp1.setUsuario(usu);
            objemp1.setContraseña(contra);
            objemp1.setFecha(fechaa1);

            int r = objempleado.agregarEmpleado(objemp1);
            if (r == 1) {
                JOptionPane.showMessageDialog(this, "LOS DATOS FUERON INGRESADOS EXITOSAMENTE");
            } else {
                JOptionPane.showMessageDialog(this, "ERROR AL REGISTRAR");
            }
        }
    }

    //METODO ELIMINAR JUNTOS CON EMPLEADOBO;
    String mensaje = "";
    EmpleadoBO ebo = new EmpleadoBO();

    public void eliminar() {

        if (txtcodigo.getText().isEmpty() || txtnombre.getText().isEmpty() || txtapellido.getText().isEmpty() || txtcorreo.getText().isEmpty()
                || txtdni.getText().isEmpty() || txtusuario.getText().isEmpty() || txtcontraseña.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Rellene todos los campos con informacion");
        } else {
            String mensaje = ebo.Eliminarempleado(Integer.parseInt(txtcodigo.getText()));
            JOptionPane.showMessageDialog(null, mensaje);

        }
    }

    public void Modificar() {
        if (txtcodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR UN CODIGO");
        } else {
            String puesto;
            String estate;
            String gender;

            if (rbobrero.isSelected()) {
                puesto = "Obrero";
            } else {
                puesto = "Administrador";
            }

            if (rbsoltero.isSelected()) {
                estate = "S";
            } else {
                estate = "C";
            }
            if (rbgenero.isSelected()) {
                gender = "M";
            } else {
                gender = "F";
            }

            Empleado objemp1 = new Empleado();
            int codigo1 = Integer.parseInt(txtcodigo.getText());
            String nombre = txtnombre.getText();
            String ape = txtapellido.getText();
            String correo = txtcorreo.getText();
            String dni = txtdni.getText();
            String usu = txtusuario.getText();
            String contra = txtcontraseña.getText();
            String fechaa = ((JTextField) txtfecha.getDateEditor().getUiComponent()).getText();

            objemp1.setCod_emp(codigo1);
            objemp1.setNombre(nombre);
            objemp1.setApellido(ape);
            objemp1.setCorreo(correo);
            objemp1.setDni(dni);
            objemp1.setPuesto(puesto);
            objemp1.setEstado_civil(estate);
            objemp1.setGenero(gender);
            objemp1.setUsuario(usu);
            objemp1.setContraseña(contra);
            objemp1.setFecha(fechaa);

            Registro_empleados objemp = new Registro_empleados();
            int r = objemp.ActualizarEmpleado(objemp1);
            if (r == 1) {
                JOptionPane.showMessageDialog(null, "LOS DATOS FUERON ACTUALIZADOS EXITOSAMENTE");
            } else {
                JOptionPane.showMessageDialog(null, "ERROR AL MODIFICAR");

            }
        }
    }
//METODO PARA ACEPTAR UNA CIERTA CANTIDAD DE CARACTERES

    public static boolean validarcantidadcaracteres(String datos) {
        return datos.matches("[0-9]{1,8}");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ACTUALIZAR;
    private javax.swing.JPanel add;
    private javax.swing.JPanel clean;
    private javax.swing.JPanel delete;
    private javax.swing.ButtonGroup group_estado;
    private javax.swing.ButtonGroup group_genero;
    private javax.swing.ButtonGroup group_puesto_empleo;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JRadioButton rbadmin;
    private javax.swing.JRadioButton rbcasado;
    private javax.swing.JRadioButton rbgenero;
    private javax.swing.JRadioButton rbgenerof;
    private javax.swing.JRadioButton rbobrero;
    private javax.swing.JRadioButton rbsoltero;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtcontraseña;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdni;
    private com.toedter.calendar.JDateChooser txtfecha;
    private javax.swing.JTextField txtfiltrar;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
