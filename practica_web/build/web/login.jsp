<%-- 
    Document   : login
    Created on : 05-09-2020, 07:58:12 PM
    Author     : PROHECO-UPE
--%>

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true"%>
<%
int rol_perfil=0;    
String id="";
String nombre="";
String usu="";
HttpSession sesionOK=request.getSession();

if((sesionOK.getAttribute("rol_perfil")!=null))
   rol_perfil=(int)sesionOK.getAttribute("rol_perfil"); 
   nombre=(String)sesionOK.getAttribute("nombre");
   id=(String)sesionOK.getAttribute("id");
   usu=(String)sesionOK.getAttribute("usu");
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <form action="servletLogeo" method="post" >
      
      <input type="hidden" name="accion" value="login" />
     
      <div class="input-container">
     
        <input type="text" name="txtUsu" id="txtUsu" required="required"/>
        <label>Usuario:</label>
        <div class="bar"></div>
      </div>
      <div class="input-container">
        <input type="password" name="txtPas" id="txtPas" required="required"/>
        <label>Password:</label>
        <div class="bar"></div>
      </div>
      
      <div class="input-container">
       
  
      </div>
      
      <div class="button-container">
        <button><span>INGRESAR</span></button>
      </div>
      <!--<div class="footer"><a href="#">Forgot your password?</a></div>-->
    </form>
    </body>
</html>
