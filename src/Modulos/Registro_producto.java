package Modulos;

import Clases.Producto;
import Conexion.Conexion_Oracle;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Registro_producto {

    Connection con;
    PreparedStatement ps;
    Conexion_Oracle objconexion = new Conexion_Oracle();
    ResultSet rs;

    public int agregarProducto(Producto ru) {
        int r = 0;
        String sql = "insert into producto(cod_pro,nombre_pro,descripcion,cantidad,precio,categoria,cod_ubicacion,fechaven)"
                + "values(?,?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ru.getCod_pro());
            ps.setString(2, ru.getNombre_pro());
            ps.setString(3, ru.getDescripcion());
            ps.setInt(4, ru.getCantidad());
            ps.setDouble(5, ru.getPrecio());
            ps.setString(6, ru.getCategoria());
            ps.setInt(7, ru.getCod_ubicacion());
            ps.setString(8, ru.getFechaven());

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

    public List listarProducto1() {
        List<Producto> datos = new ArrayList<>();
        try {
            con = objconexion.abrirConexion();
            ps = con.prepareStatement("select*from producto order by cod_pro");
            rs = ps.executeQuery();
            while (rs.next()) {
                Producto objrutas = new Producto();
                objrutas.setCod_pro(rs.getString(1));
                objrutas.setNombre_pro(rs.getString(2));
                objrutas.setDescripcion(rs.getString(3));
                objrutas.setCantidad(rs.getInt(4));
                objrutas.setPrecio(rs.getDouble(5));
                objrutas.setCategoria(rs.getString(6));
                objrutas.setCod_ubicacion(rs.getInt(7));
                objrutas.setFechaven(rs.getString(8));

                datos.add(objrutas);
            }
        } catch (SQLException e) {
            System.out.println("ERROR" + "\n");
        }
        return datos;
    }

    public int Actualizarproducto(Producto ru) {
        int r = 0;
        String sql = "UPDATE producto set nombre_pro=?,descripcion=?,cantidad=?,precio=?,categoria=?,cod_ubicacion=?,fechaven=?"
                + "WHERE cod_pro=?";
        try {
            con = objconexion.abrirConexion();
            ps = con.prepareStatement(sql);

            ps.setString(1, ru.getNombre_pro());
            ps.setString(2, ru.getDescripcion());
            ps.setInt(3, ru.getCantidad());
            ps.setDouble(4, ru.getPrecio());
            ps.setString(5, ru.getCategoria());
            ps.setInt(6, ru.getCod_ubicacion());
            ps.setString(7, ru.getFechaven());
            ps.setString(8, ru.getCod_pro());

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

    public String eliminarProducto(Connection con, String id) {

        String sql = "DELETE FROM producto WHERE cod_pro=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, id);
            mensaje = "BORRADO CORRECTAMENTE";
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            mensaje = "ERROR AL ELIMMINAR" + e.getMessage();
        }
        return mensaje;
    }

    public String NroSerieVentas() {
        String serie = "";
        String sql = "select max(serieVenta) from venta";
        try {
            con = objconexion.abrirConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                serie = rs.getString(1);
            }
        } catch (Exception e) {
        }
        return serie;
    }

}
