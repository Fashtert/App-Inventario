package Modulos;

import Clases.Producto;
import Conexion.Conexion_Oracle;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javafx.scene.control.ComboBox;

public class Listar_prod {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion_Oracle objconexion = new Conexion_Oracle();

    public Producto ListarNombrePro(String prod) {
        Producto objproducto = new Producto();
        String sql = "select*from producto where nombre_pro=?";
        try {
            con = objconexion.abrirConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, prod);
            rs = ps.executeQuery();
            while (rs.next()) {
                objproducto.setCod_pro(rs.getString(1));
                objproducto.setNombre_pro(rs.getString(2));
                objproducto.setDescripcion(rs.getString(3));
                objproducto.setCantidad(rs.getInt(4));
                objproducto.setPrecio(rs.getDouble(5));
                objproducto.setCategoria(rs.getString(6));
                objproducto.setCod_ubicacion(rs.getInt(7));
            }
        } catch (Exception e) {
        }
        return objproducto;
    }

    public ArrayList listarcombo(String categoriaa) {
          ArrayList<Producto> datos = new ArrayList<>();
       
        String sql = "select nombre_pro from producto where categoria=?";
        try {
            con = objconexion.abrirConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, categoriaa);
            rs = ps.executeQuery();
            while (rs.next()) {
                 Producto objproductoombo = new Producto();
                objproductoombo.setNombre_pro(rs.getString(1));
                datos.add(objproductoombo);
            }
        } catch (Exception e) {
            System.err.println("ERROR AL LSITAR AL COMBO");
        }
        return datos;
    }

    int r = 0;

    public int actualizarstock(int canti, String produ) {
        String sql = "update producto set cantidad=? where nombre_pro=?";
        try {
            con = objconexion.abrirConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, canti);
            ps.setString(2, produ);
            ps.executeUpdate();

        } catch (Exception e) {
        }
        return r;

    }

}
