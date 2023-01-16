package csPetSmile;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import csPetSmile.SQLMetodos;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
 		SQLMetodos metodos = new SQLMetodos();
 		String n=request.getParameter("username");
		String p=request.getParameter("password");
 		boolean status = metodos.buscarUsuarioRegistrado(n, p);
 		
		if(status)
		{
			response.sendRedirect("iniciosesion.jsp");
		}
		else
		{
			PrintWriter out=response.getWriter();
			response.setContentType("text/html");
			out.println("<font color=red size=16>*Login fallido*<br>");
			out.println("<a href=login.jsp>Volver a Login");
		}	
	}
}
