package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion_Oracle {

    String url = "jdbc:oracle:thin:@//localhost:1521/xe";
    String user = "SYSTEM";
    String pass = "ADMIN";
    Connection con;

    public Connection abrirConexion() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(url, user, pass);
           

        } catch (Exception e) {
            System.out.println("WORKING ON THE NET YET//");
        }
        return con;
    }

}
