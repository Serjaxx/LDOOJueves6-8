package Servlet1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "LoginServlet", urlPatterns = {"/Servlet1"})
public class LoginServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Login</title><link rel=\"stylesheet\" type=\"text/css\" href=\"main.css\">");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>LOGIN " + "</h1>");
            out.println("</body>");
            out.println("</html>");

        request.getRequestDispatcher("link.html").include(request, response);
        
        String usuario=request.getParameter("usuario");
        String password=request.getParameter("password");
        
        if(usuario.equals("admin")&&password.equals("admin")){
            out.print("<br>Acceso Exitoso!");
            Cookie ck = new Cookie("name", usuario);
            
            response.addCookie(ck);
        }else{
            out.print("<b><br>UPS! Usuario o Contraseña incorrectos</b>");
            request.getRequestDispatcher("login.html").include(request, response);
        }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
            
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        PrintWriter out=response.getWriter();
        request.getRequestDispatcher("link.html").include(request, response);
        
        String usuario=request.getParameter("usuario");
        String password=request.getParameter("password");
        
        if(password.equals("admin")){
            out.print("Bienvenido");
            Cookie ck = new Cookie("name", usuario);
            
            response.addCookie(ck);
        }else{
            out.print("Contraseña o Usuario incorrectos");
            request.getRequestDispatcher("login.html").include(request, response);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
