<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <form action="LoginServlet" method="post" >
         <input type="text" name="username" placeholder="username" required/>
         <input type="password" name="password" placeholder="password" required/>
         <span style="color:red"><%=(request.getAttribute("errMessage") == null) ? ""
         : request.getAttribute("errMessage")%></span>
         <input type="submit" value="Login"></input>
        <input type="reset" value="Reset"></input>
    </form> 
</body>
</html>