
package persondigitalassistentapp.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConexionBaseDeDatos {
    
    private static final String URL = "jdbc:mysql://localhost:3307/calculator";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    
    //método conexión
    public static Connection getConnection() throws SQLException{
    
    
        return DriverManager.getConnection(URL,USER,PASSWORD);
    
    }

}
