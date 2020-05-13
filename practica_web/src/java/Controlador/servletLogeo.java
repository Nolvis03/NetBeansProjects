/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Utils.Conexion;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author PROHECO-UPE
 */
public class servletLogeo extends HttpServlet {

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
     
        String accion=request.getParameter("accion");
        
        if(accion.equals("login")){
        String usu=request.getParameter("txtUsu");
        String pas=request.getParameter("txtPas");
        
        Connection cnx=Conexion.getConexion();
        
        try {
            PreparedStatement sta=cnx.prepareStatement
                    ("select u.id_roles,u.id_empleado_usuario,u.nombre_empleado,u.nombre_usuario,u.observaciones from usuarios u where u.nombre_usuario=? and u.pass=?");
            sta.setString(1, usu);
            sta.setString(2, pas);
            ResultSet rs=sta.executeQuery();
            
         
            if(rs.next()){
                HttpSession sesionOK=request.getSession();
                sesionOK.setAttribute("rol_perfil", (int)rs.getInt(1));
                sesionOK.setAttribute("id", (String)rs.getString(2));
                sesionOK.setAttribute("nombre", (String)rs.getString(3));
                sesionOK.setAttribute("usu", (String)rs.getString(4));
                sesionOK.setAttribute("observaciones", (String)rs.getString(5));
                request.getRequestDispatcher("index.jsp").forward(request, response);
                
            }else{
                
    
                request.setAttribute("msg", "¡ Error de Usuario o Contraseña intentelo nuevamente !");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
            
            
        } catch (Exception e) {System.out.print(e);}
        finally{
            try {
                Conexion.getConexion().close();
                if(Conexion.getConexion() != null ) Conexion.getConexion().close();
            } catch (Exception e) {
            }
         
        }
    }else if(accion.equals("cerrar")){
  
       
     
        HttpSession sesionOK = request.getSession();
        request.getSession().removeAttribute("rol_perfil");
        request.getSession().removeAttribute("id");
        request.getSession().removeAttribute("nombre");
        request.getSession().removeAttribute("usu");
        request.getSession().removeAttribute("observaciones");
        sesionOK.invalidate();
       
        
        
        request.getRequestDispatcher("login.jsp").forward(request, response);
        }
         else{
        
      request.getRequestDispatcher("mensaje.jsp?mens=Problema de Conexion-.<br><input style=\"background-color:#3f888f; font-size: 12px; color: #efeff0;\" type=\"button\" value=\"Inicio\" onClick=\"location.href='index.jsp'\"/>").forward(request, response);
      
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
