/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Usuario
 */
@WebServlet(urlPatterns = {"/RegistroUsuarios"})
public class RegistroUsuarios extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter salida = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
		
            salida.println("<html><head><link rel=\"stylesheet\" type=\"text/css\" href=\"main.css\">");
		
            salida.println("<h2>Nombre(s) introducido: </h2>" + request.getParameter("nombre"));
		
            salida.println("<br><br>");
		
            salida.println("<h2>Apellido(s) introducido: </h2>" + request.getParameter("apellidos"));
		
            salida.println("<br><br>");
           
            salida.println("<h2>Email introducido: </h2>" + request.getParameter("email"));
		
            salida.println("<br><br>");
		
            salida.println("<h2>Contraseña introducida: <h2>" + request.getParameter("contraseña"));
		
            salida.println("<br><br>");
		
            salida.println("<h2>Fecha de nacimiento introducida: </h2>" + request.getParameter("nacimiento"));
		
            salida.println("</body></html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        PrintWriter salida=response.getWriter();
		
            salida.println("<html><head><link rel=\"stylesheet\" type=\"text/css\" href=\"main.css\">");
		
            salida.println("Nombre introducido " + request.getParameter("nombre"));
		
            salida.println("<br><br>");
		
            salida.println("Apellido introducido " + request.getParameter("apellidos"));
		
            salida.println("<br><br>");
           
            salida.println("Email introducido " + request.getParameter("email"));
		
            salida.println("<br><br>");
		
            salida.println("Contraseña introducida" + request.getParameter("contraseña"));
		
            salida.println("<br><br>");
		
            salida.println("Fecha de nacimiento introducida" + request.getParameter("nacimiento"));
		
            salida.println("</body></html>");
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
