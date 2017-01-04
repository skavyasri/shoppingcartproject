<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>sign up</title>
</head>
<body>
       
<div class="container">
  <h2>Registration</h2>
  <form:form method="POST" commandName="user" action="register/add" role="form">
   <div class="form-group">
      <label for="name">id:  </label>
      <form:input type="text" path="id" class="form-control" id="id" placeholder="Enter your id"/>
    </div>
  
    <div class="form-group">
      <label for="name">Name:  </label>
      <form:input type="text" path="name" class="form-control" id="name" placeholder="Enter your name"/>
    </div>
    <div class="form-group">
      <label for="phn no">pswd:   </label>
      <form:input type="password" path="pswd" class="form-control" id="pswd" placeholder="Enter the pswd"/>
    </div>
    <div class="form-group">
      <label for="email id">addr:  </label>
      <form:input type="text" path="addr" class="form-control" id="addr" placeholder="Enter your addr"/>
    </div>
    
     <div class="form-group">
      <label for="email id">phnum:  </label>
      <form:input type="text" path="phnum" class="form-control" id="phnum" placeholder="Enter the phnum"/>
    </div>
   
    <div class="form-group">
      <label for="pwd">email:</label>
      <form:input type="text" path="email" class="form-control" id="email" placeholder="Enter the email" />
    </div>
    <div class="checkbox">
      <label><input type="checkbox"> I agree for the terms and conditions</label>
    </div>
    <button type="submit" class="btn btn-default">Register</button>
  </form:form>


</div>
</body>
</html>