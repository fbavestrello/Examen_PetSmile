package csPetSmile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    private static String url = "jdbc:mysql://127.0.0.1:3307/clinica"; //127.0.0.1 = localhost
    private static String username = "root";
    private static String password = "iplacex";
    
    public static Connection conectar(){
        Connection conexion = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url,username,password);     
            System.out.println("Conexión establecida");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: " + e);
         }
        return conexion;
    }
    
    public static void desconectar() {
    	Connection conexion = null;
    	if (conexion == null) {
    		System.out.println("La variable conexión ha sido puesta en null");
    	}
    }
	
}
