/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mateo
 */
public class calcservlet extends HttpServlet {

    @EJB
    private calcbeanLocal calcbean;

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
         double resultado = 0;
            int a = Integer.parseInt(request.getParameter("t1"));
            int b = Integer.parseInt(request.getParameter("t2"));
        String opcion = request.getParameter("action");
        if (opcion.equals("suma")){
            resultado = a+b;
        }else if (opcion.equals("resta")) {
            resultado = a-b;
        }else if (opcion.equals("multiplicacion")) {
            resultado = a*b;
        }else if (opcion.equals("division")) {
            resultado = a/b;
        }else if (opcion.equals("modulo")) {
            resultado = a%b;
        }
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet calcservlet</title>");            
            out.println("</head>");
            out.println("<body>");
          
            
            
            out.println("<div style='position: absolute; top: 115px; left: 110px;'>"); // abrir div y definir posición
            out.println("<img src='https://www.supercoloring.com/sites/default/files/styles/coloring_full/public/cif/2022/01/calculator-coloring-page.png/' alt='Imagen de ejemplo'>"); // imagen de la calculadora
            out.println("<div style='position: absolute; top: 115px; left: 150px; font-size: 100px;'>"); // abrir div para el resultado y definir posición
            out.println( resultado  );
            out.println("</div>"); // cerrar div del resultado
            out.println("</div>"); // cerrar div de la imagen
            out.println("<img src='https://www.supercoloring.com/sites/default/files/styles/coloring_full/public/cif/2022/01/calculator-coloring-page.png/' alt='Imagen de ejemplo'>");
            out.println("</body>");
            out.println("</html>");
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
