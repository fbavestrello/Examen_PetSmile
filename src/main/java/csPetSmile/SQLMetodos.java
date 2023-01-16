package csPetSmile;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class SQLMetodos {
    private Connection conexion;
    private PreparedStatement sentenciaPreparada;
    private ResultSet resultado;
    public boolean buscarUsuarioRegistrado(String nombreUsuario, String password) {
        boolean iniciarSesion = false;
        try {
            conexion = ConexionBD.conectar();
            System.out.println("usuario: "+nombreUsuario+", password: "+password);
            String consulta = "SELECT nombreUsuario, password FROM usuario WHERE nombreUsuario = ? AND password = ?";
            sentenciaPreparada = conexion.prepareStatement(consulta);
            sentenciaPreparada.setString(1, nombreUsuario);
            sentenciaPreparada.setString(2, password);
            resultado = sentenciaPreparada.executeQuery();
            if (resultado.next()) {
            	nombreUsuario = resultado.getString("nombreUsuario");
            	password = resultado.getString("password");
            	iniciarSesion = true;
            	conexion.close();
            	return iniciarSesion;
            } else {
                iniciarSesion = false;
                conexion.close();
                return iniciarSesion;
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                conexion.close();
            } catch (SQLException e) {
                System.out.println("Error: " + e);
            }
        }
        iniciarSesion = false;
        System.out.println("El valor de iniciarSesion en el metodo es: " + iniciarSesion);
        return iniciarSesion;
    }
    
}
