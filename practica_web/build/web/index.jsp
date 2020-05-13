<%-- 
    Document   : index
    Created on : 05-09-2020, 07:55:57 PM
    Author     : PROHECO-UPE
--%>
<%
int rol_perfil=0;    
String id="";
String nombre="";
String usu="";
HttpSession sesionOK=request.getSession();

if(sesionOK.getAttribute("rol_perfil")!=null && sesionOK.getAttribute("estado")!=null)
   rol_perfil=(int)sesionOK.getAttribute("rol_perfil"); 
   nombre=(String)sesionOK.getAttribute("nombre");
   id=(String)sesionOK.getAttribute("id");
   usu=(String)sesionOK.getAttribute("usu");
if (sesionOK.getAttribute("rol_perfil")== null){
%>
<jsp:forward page="login.jsp"/>
<%
}
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
                      if (sesionOK.getAttribute("rol_perfil") != null && sesionOK.getAttribute("rol_perfil").equals(1)) {
                  %>
        <li><a href="index.jsp">Home</a></li>
        <li><a class="logout" href="servletLogeo?accion=cerrar&usu=<%=usu%>">Cerrar Sesion</li>
        
        
        <li>Agregar Productos</li>
        <li>Ver Ventas</li>
        <h1>Hola mundo de JAVA Conexion Correcta</h1>
        <%
                            } else if (sesionOK.getAttribute("rol_perfil") != null && sesionOK.getAttribute("rol_perfil").equals(3)) {

                        %>
        <li>Usuario desactivado</li>
        
         <%
                        }else{
}
                        %>
        
    </body>
</html>
