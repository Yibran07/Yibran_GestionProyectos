package mx.ulsa.controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mx.ulsa.modelo.Usuario;

import java.io.IOException;

public class LoginControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginControlador() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procesar(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	protected void procesar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String action = request.getPathInfo();
			System.out.println("action: " + action);
			switch(action) {
			case "/ingresar" -> ingresar(request, response);
			case "/login" -> login(request, response);
			case "/logout" -> logout(request, response);
			default -> response.sendRedirect(request.getContextPath() + "/index.jsp");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	private void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = "";
		Cookie[] cookies = request.getCookies();
		if(cookies != null) {
			for(int i = 0; i<cookies.length; i++) {
				Cookie cookie = cookies[i];
				if(cookie.getName().equals("correo")) {
					email = cookie.getValue();
				}
			}
		}
		
		response.sendRedirect(request.getContextPath()+"/vista/login.jsp?email="+email);
	}
	
	protected void ingresar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String username = request.getParameter("username");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		Usuario usuario = new Usuario();
		usuario.setEmail(email);
		usuario.setPassword(password);
				
		
		if(usuario.isValido() || usuario.isValidoEmail()) {
			Cookie cookie = new Cookie("correo", email);
			cookie.setMaxAge(120); //tiempo de vida de la cookie en el navegador
			response.addCookie(cookie);
			response.sendRedirect(request.getContextPath() + "/vista/privado/dashboard.jsp?email="+email+"&opcionDashboard=dashboard");
			//response.sendRedirect(request.getContextPath() + "/vista/privado/panel.jsp?usuario="+username);
		} else {
			request.setAttribute("errorMessage", "Usuario o contraseña Incorrectos");
			request.getRequestDispatcher("vista/login.jsp").forward(request, response);
		}
		
	}
	
	private void logout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("haz presionado logout");	}
}
