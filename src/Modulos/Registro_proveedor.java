package Modulos;

import Clases.Proveedores;
import Conexion.Conexion_Oracle;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Registro_proveedor {

    Connection con;
    PreparedStatement ps;
    Conexion_Oracle objconexion = new Conexion_Oracle();
    ResultSet rs;

    public int agregarproveedor(Proveedores ru) {
        int r = 0;
        String sql = "insert into proveedores(codigo,nombre_proveedor,tipo_proveedor,nombre_empresa,distrito,telefonocontacto,correo,fecha,frecuencia)\n"
                + "                values(?,?,?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, ru.getCodigo());
            ps.setString(2, ru.getNombre_proveedor());
            ps.setString(3, ru.getTipo_proveedor());
            ps.setString(4, ru.getNombre_empresa());
            ps.setString(5, ru.getDistrito());
            ps.setString(6, ru.getTelefonocontacto());
            ps.setString(7, ru.getCorreo());
            ps.setString(8, ru.getFecha());
            ps.setString(9, ru.getFrecuencia());

            r = ps.executeUpdate();
            con.close();
            rs.close();
            ps.close();
        } catch (Exception e) {
            System.out.println("ERROR  EN DAO" + "\n");
        }
        if (r == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public List Listarproveedor() {
        List<Proveedores> datos = new ArrayList<>();
        try {
            con = objconexion.abrirConexion();
            ps = con.prepareStatement("select*from proveedores ORDER BY codigo");
            rs = ps.executeQuery();
            while (rs.next()) {
                Proveedores objrutas = new Proveedores();
                objrutas.setCodigo(rs.getInt(1));
                objrutas.setNombre_proveedor(rs.getString(2));
                objrutas.setTipo_proveedor(rs.getString(3));
                objrutas.setNombre_empresa(rs.getString(4));
                objrutas.setDistrito(rs.getString(5));
                objrutas.setTelefonocontacto(rs.getString(6));
                objrutas.setCorreo(rs.getString(7));
                objrutas.setFecha(rs.getString(8));
                objrutas.setFrecuencia(rs.getString(9));

                datos.add(objrutas);
            }
        } catch (SQLException e) {
            System.out.println("ERROR EN LISTAR" + "\n");
        }
        return datos;
    }

    public int ActualizarProveedor(Proveedores ru) {
        int r = 0;
        String sql = "UPDATE proveedores set nombre_proveedor=?,tipo_proveedor=?,nombre_empresa=?,distrito=?,telefonocontacto=?,correo=?,fecha=?,frecuencia=?"
                + "WHERE codigo=?";
        try {
            con = objconexion.abrirConexion();
            ps = con.prepareStatement(sql);

            ps.setString(1, ru.getNombre_proveedor());
            ps.setString(2, ru.getTipo_proveedor());
            ps.setString(3, ru.getNombre_empresa());
            ps.setString(4, ru.getDistrito());
            ps.setString(5, ru.getTelefonocontacto());
            ps.setString(6, ru.getCorreo());
            ps.setString(7, ru.getFecha());
            ps.setString(8, ru.getFrecuencia());
            ps.setInt(9, ru.getCodigo());
            r = ps.executeUpdate();
            if (r == 1) {
                return 1;
            } else {
                return 0;
            }
        } catch (SQLException e) {
            System.out.println("ERROR EN DAO" + "\n");
        }
        return r;
    }

    String mensaje;

    public String eliminarproveedor(Connection con, int id) {
        PreparedStatement ps = null;
        String sql = "DELETE FROM proveedores WHERE codigo=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            mensaje = "BORRADO CORRECTAMENTE";
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            mensaje = "ERROR AL ELIMMINAR" + e.getMessage();
        }
        return mensaje;
    }

    public int getMaxId(Connection con) {
        int id = 0;

        try {
            ps = con.prepareStatement("SELECT MAX(codigo)+1 as id FROM proveedores");
            rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt(1);
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println("ERROR AL MOSTRAR ID");
        }

        return id;
    }

}
