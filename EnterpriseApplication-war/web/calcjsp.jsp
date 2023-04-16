<%-- 
    Document   : calcjsp
    Created on : 15/04/2023, 02:50:25 PM
    Author     : mateo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      
        <form action="calcservlet" method="POST">
            
            <h1> CALCULADORA </h1>
            <br>  
              
            <input type="text" name="t1"  />
            
            <input type="text" name="t2"  />
          
            <br>
            <input type="submit"  value="resta" name="action"/>
            <input type="submit" value="suma" name="action" />
            <input type="submit" value="multiplicacion" name="action" />
            <input type="submit" value="division" name="action" />
            <input type="submit" value="modulo" name="action" />
        </form>
          
            
       
    </body>
</html>
