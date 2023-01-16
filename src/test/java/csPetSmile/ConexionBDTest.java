package csPetSmile;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class ConexionBDTest {
	@BeforeClass
	public static void setUpClass() {
	}
	@AfterClass
	public static void tearDownClass() {
	}
	@Before
	public void setUp() {
	}
	@After
	public void tearDown() {
	}
	@Test
	void testConectar() {
        Connection conexion = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/clinica","root","iplacex");     
            System.out.println("Conexión establecida");
            assertTrue( true );
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: " + e);
            assertTrue( false );
         }
		}
}
