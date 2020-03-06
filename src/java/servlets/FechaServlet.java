/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author estel
 */
@WebServlet(name = "FechaServlet", urlPatterns = {"/FechaServlet"})
public class FechaServlet extends HttpServlet {

    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            response.setHeader("refresh", "1");//dado en segundos
            
            //obtenemos fecha actual y aplicamos formato
            Date fecha=new Date();
          
            //SimpleDateFormat
            SimpleDateFormat formateador=new SimpleDateFormat("'Hora actualizada' HH:mm:ss");
            String fechaConFormato=formateador.format(fecha);
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet FechaServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Fecha actualizada: "+fechaConFormato+"</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}
