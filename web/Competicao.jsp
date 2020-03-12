<%-- 
    Document   : Competicao
    Created on : 11/03/2020, 14:29:05
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
        <h1>Competicao</h1>
        
        <jsp:useBean id="competicao" class="model.Competicao" scope="session"/>
        
        <p>Nadador mais Rápido: <jsp:getProperty name="competicao" property="nadadorMaisRapido"/></p>
        <p>Nadador mais Lento: <jsp:getProperty name="competicao" property="nadadorMaisLento"/></p>
        <p>Tempo Médio: <jsp:getProperty name="competicao" property="tempoMedio"/> seg</p>
    </body>
</html>
