package Modulos;

import Conexion.Conexion_Oracle;
import java.sql.Connection;


public class ProductoBO {

    Conexion_Oracle objetconexion = new Conexion_Oracle();
    Registro_producto objdao = new Registro_producto();
//METODO QUE NECESITA Registro_producto para generar id continuo

    String mensaje = "";

    public String Eliminarproducto(String id) {

        Connection con = objetconexion.abrirConexion();

        try {
            mensaje = objdao.eliminarProducto(con, id);

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
