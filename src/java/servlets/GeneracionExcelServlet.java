 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
/**
 *
 * @author estel
 */
@WebServlet(name="GeneracionExcelService",urlPatterns={"/GeneracionExcelServlet"})

public class GeneracionExcelServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, 
            IOException{
        
        try(PrintWriter out=response.getWriter()){
            //Especificamos el tipo de documento de respuesta(MIME):
            response.setContentType("application/vnd.ms-excel");
            response.setHeader("Content-Disposition","attachment;filename=excelEjemplo.xls");
            //Para un uso mas profesional de excel usar:https://poi.apache.org/
            response.setHeader("Pragma", "no-cache");
            response.setHeader("Canche-control", "no-store");
            response.setDateHeader("Expires", -1);//se expira en automatico;
            
            //desplegamos el contenido en un excel:
            //simplemente modificnado el contentType:
            out.println("\tValores");
            out.println("\t1");
            out.println("\t2");
            out.println("Total\t=SUMA(B2:B3)");
        }
        
    }
    
}
