<%-- 
    Document   : join_email_list.jsp
    Created on : Mar 4, 2015, 11:38:21 PM
    Author     : Alfredo Hinojosa Huerta
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@page import = "business.User" %>
<%
  User user = (User) request.getAttribute("user");
  String message = (String) request.getAttribute("message");

  if(user == null)
    user = new User();
  if(message == null)
    message = "";
%>
<!DOCTYPE html>
<html>
    
<head>
    <title>Murach's Java Servlets and JSP</title>
</head>

<body>
    <h1>Join our email list using a Servlet</h1>
  <p>To join our email list, enter your name and
     email address below. <br>
     Then, click on the Submit button.</p>

  <p><strong><%= message %></strong></p>

  <form action="addToEmailList" method="post">
  <table cellspacing="5" border="0">
    <tr>
      <td align="right">First name:</td>
      <td><input type="text" name="firstName" value="<%= user.getFirstName() %>"></td>
    </tr>
    <tr>
      <td align="right">Last name:</td>
      <td><input type="text" name="lastName" value="<%= user.getLastName() %>"></td>
    </tr>
    <tr>
      <td align="right">Email address:</td>
      <td><input type="text" name="emailAddress" value="<%= user.getEmailAddress()%>"></td>
    </tr>
    <tr>
        <td align="right">Career:</td>
        <td><select name="carrera" size="1">
                <option>INT</option>
                <option>ISC</option>
                <option>ISD</option>
                <option>ITC</option>
                <option>ITE</option>
                <option>ITIC</option>
                <option>ITM</option>
                <option>ITS</option>
                <option>LATI</option>
            </select></td>
    </tr>
    <tr>
      <td></td>
      <td><br><input type="submit" value="Submit"></td>
    </tr>
  </table>
  </form>
</body>
</html>
