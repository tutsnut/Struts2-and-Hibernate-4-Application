<%-- 
    Document   : Welcome
    Created on : Nov 28, 2012, 4:00:26 PM
    Author     : sumit sharma
--%>
<%@taglib  uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Page</title>
    </head>
    <body>
        <h1>Welcome <s:property value="userName" />!</h1>
    </body>
</html>
