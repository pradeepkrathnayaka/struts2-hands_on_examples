<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
    
    <s:set var="namespace" scope="request">/secure</s:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>

<s:url value="/resources/css/" var="csspath" />
<s:url value="/resources/js/" var="jspath" />

<link href="<s:property value="#csspath" escapeHtml="true"/>bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<link href="<s:property value="#csspath" escapeHtml="true"/>app.css" rel="stylesheet">

<script src="<s:property value="#jspath" escapeHtml="true"/>bootstrap.min.js"></script>
<script src="<s:property value="#jspath" escapeHtml="true"/>jquery.min.js"></script>

</head>
<body>

<div class="sidenav">
         <div class="login-main-text">
            <h2>Application<br> Login Page</h2>
            <p>Login or register from here to access.</p>
         </div>
      </div>
      <div class="main">
         <div class="col-md-6 col-sm-12">
            <div class="login-form">
               <s:form action="login" method="POST" namespace="/secure" theme="simple" focusElement="username" autocomplete="off">
                  <div class="form-group">
                     <label>User Name</label>
                     <input type="text" class="form-control" placeholder="User Name" name="username" id="username">
                  </div>
                  <div class="form-group">
                     <label>Password</label>
                     <input type="password" class="form-control" placeholder="Password" name="password" id="password">
                  </div>
                  <button type="submit" class="btn btn-black">Login</button>
                  <button type="submit" class="btn btn-secondary">Register</button>
               </s:form>
            </div>
         </div>
      </div>
      
</body>
</html>