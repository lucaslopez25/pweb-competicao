<%-- 
    Document   : recebeForm
    Created on : 11/02/2020, 17:41:12
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Competição</title>
    </head>
    <body>
        <h1>Obrigado por deixar seus dados conosco!</h1>
        
        <jsp:useBean id="nadador" class="model.Nadador" scope="session"/>
        
        <jsp:setProperty name="nadador" property="*"/>
        
        
        <p><jsp:getProperty name="nadador" property="nome"/></p>
        <p><jsp:getProperty name="nadador" property="tempo"/></p>
        <form name="recebeFormulario" action="CompeticaoServlet" method="POST">
            <input type="submit" name="pedido" value="Retornar"/>
        </form>
    </body>
</html>