package Modulos;

import Clases.Empleado;
import Conexion.Conexion_Oracle;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Registro_empleados {

    Connection con;
    PreparedStatement ps;
    Conexion_Oracle objconexion = new Conexion_Oracle();
    ResultSet rs;

    public int agregarEmpleado(Empleado ru) {
        int r = 0;
        String sql = "insert into empleado(cod_em,nombre,apellido,correo,dni,puesto_emple,estado_civil,genero,usuario,contraseña,fecha)"
                + "values(?,?,?,?,?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, ru.getCod_emp());
            ps.setString(2, ru.getNombre());
            ps.setString(3, ru.getApellido());
            ps.setString(4, ru.getCorreo());
            ps.setString(5, ru.getDni());
            ps.setString(6, ru.getPuesto());
            ps.setString(7, ru.getEstado_civil());
            ps.setString(8, ru.getGenero());
            ps.setString(9, ru.getUsuario());
            ps.setString(10, ru.getContraseña());
            ps.setString(11, ru.getFecha());
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

    public List listarEmpleado() {
        List<Empleado> datos = new ArrayList<>();
        try {
            con = objconexion.abrirConexion();
            ps = con.prepareStatement("select*from empleado order by cod_em");
            rs = ps.executeQuery();
            while (rs.next()) {
                //ES NECESARIO TENER COMO PRIVADO LA INICIALIZACION DE LA CLASE DENTRO DE LISTAR , PARA EVITAR DUPLICACIOES

                Empleado objrutas = new Empleado();
                objrutas.setCod_emp(rs.getInt(1));
                objrutas.setNombre(rs.getString(2));
                objrutas.setApellido(rs.getString(3));
                objrutas.setCorreo(rs.getString(4));
                objrutas.setDni(rs.getString(5));
                objrutas.setPuesto(rs.getString(6));
                objrutas.setEstado_civil(rs.getString(7));
                objrutas.setGenero(rs.getString(8));
                objrutas.setUsuario(rs.getString(9));
                objrutas.setContraseña(rs.getString(10));
                objrutas.setFecha(rs.getString(11));
                datos.add(objrutas);
            }
        } catch (SQLException e) {
            System.out.println("ERROR" + "\n");
        }
        return datos;
    }

    public int ActualizarEmpleado(Empleado ru) {
        int r = 0;
        String sql = "UPDATE empleado set nombre=?,apellido=?,correo=?,dni=?,puesto_emple=?,estado_civil=?,genero=?,usuario=?,contraseña=?,fecha=?"
                + "WHERE cod_em=?";
        try {
            con = objconexion.abrirConexion();
            ps = con.prepareStatement(sql);

            ps.setString(1, ru.getNombre());
            ps.setString(2, ru.getApellido());
            ps.setString(3, ru.getCorreo());
            ps.setString(4, ru.getDni());
            ps.setString(5, ru.getPuesto());
            ps.setString(6, ru.getEstado_civil());
            ps.setString(7, ru.getGenero());
            ps.setString(8, ru.getUsuario());
            ps.setString(9, ru.getContraseña());
            ps.setString(10, ru.getFecha());
            ps.setInt(11, ru.getCod_emp());

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

    public String eliminarEmpleado(Connection con, int id) {
        PreparedStatement ps = null;
        String sql = "DELETE FROM empleado WHERE cod_em=?";
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
            ps = con.prepareStatement("SELECT MAX(cod_em)+1 as id FROM empleado");
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
