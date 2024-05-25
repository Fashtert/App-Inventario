package Modulos;

import Conexion.Conexion_Oracle;
import java.sql.Connection;
import java.sql.SQLException;

public class EmpleadoBO {

    Conexion_Oracle objetconexion = new Conexion_Oracle();
    Registro_empleados objdao = new Registro_empleados();

    public int getMaxId() {

        Connection con = objetconexion.abrirConexion();
        int id = objdao.getMaxId(con);
        try {
            con.close();
        } catch (SQLException e) {
            System.out.println("PROBLEMAS EN BO EN ID");
        }
        return id;
    }

    String mensaje = "";

    public String Eliminarempleado(int id) {

        Connection con = objetconexion.abrirConexion();

        try {
            mensaje = objdao.eliminarEmpleado(con, id);

        } catch (Exception e) {
            mensaje = mensaje + "" + e.getMessage();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                mensaje = mensaje + "" + e.getMessage();

            }
        }
        return mensaje;
    }
}
