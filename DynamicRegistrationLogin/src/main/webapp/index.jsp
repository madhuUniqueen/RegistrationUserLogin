<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<script>
function validate()
{
     var fullname = document.form.fullname.value;
     var email = document.form.email.value;
     var username = document.form.username.value;
     var password = document.form.password.value;
     var conpassword= document.form.conpassword.value;
     if (fullname==null || fullname=="")
     {
     alert("Full Name can't be blank");
     return false;
     }
     else if (email==null || email=="")
     {
     alert("Email can't be blank");
     return false;
     }
     else if (username==null || username=="")
     {
     alert("Username can't be blank");
     return false;
     }
     else if(password.length<6)
     {
     alert("Password must be at least 6 characters long.");
     return false;
     }
     else if (password!=conpassword)
     {
     alert("Confirm Password should match with the Password");
     return false;
     }
 }
</script>
<h2>Java Registration application using MVC and MySQL </h2>
    <form name="form" action="RegisterServlet" method="post" onsubmit="return validate()">
         <input type="text" name="fullname" placeholder="fullname"/>
         <input type="text" name="email" placeholder="email"/>
         <input type="text" name="username" placeholder="username"/>
  <input type="password" name="password" placeholder="password"/>
         <input type="password" name="conpassword"placeholder="conpassword" />
      <p><%=(request.getAttribute("errMessage") == null) ? ""
         : request.getAttribute("errMessage")%></p>
         <input type="submit" value="Register"></input>
         <input type="reset" value="Reset"></input>
    </form>   
</body>
</html>