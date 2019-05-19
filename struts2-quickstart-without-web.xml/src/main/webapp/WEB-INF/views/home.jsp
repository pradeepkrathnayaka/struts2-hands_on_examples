<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
    
    <s:set var="namespace" scope="request">/secure</s:set>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
<meta http-equiv="x-ua-compatible" content="IE=edge,chrome=1" />
<meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<meta name="description" content="" />
<meta name="news_keywords" content="" />
<meta name="keywords" content="" />

<title>Home Page</title>
</head>
<body>
home....
<s:url action="login" namespace="%{#request.namespace}" var="loginUrl" />
<a href="<s:property value="#loginUrl" escapeHtml="true"/>" >User Login</a>
</body>
</html>