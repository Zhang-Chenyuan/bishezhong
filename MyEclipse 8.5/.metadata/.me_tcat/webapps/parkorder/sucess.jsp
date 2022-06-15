<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'sucess.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style>
tr { font-family: Verdana; font-size: 12px; }

td { font-family: Verdana; font-size: 12px; }
A { color: #06A; text-decoration: none; }
A:hover { color: #039; text-decoration: underline; }</style>
  </head>
  
  <body style="  font-family: Verdana; font-size: 12px;margin: 0px; padding: 0px;">
<table align="center" border="0" cellpadding="0" cellspacing="0" width="60%" height="60%">
        <tbody><tr>
            <td>
                <table align="center" border="0" cellpadding="2" cellspacing="1" bgcolor="#ccdaf8">
                    <tbody><tr>
                        <td bgcolor="#ffffff">
                            <table cellpadding="2" cellspacing="1" border="0" width="400">
                                <tbody><tr>
                                    <td bgcolor="#edf2fc" colspan="2">
                                        <span style="margin-left: 165px; line-height: 22px">
                                            Operation Tips</span>
                                    </td>
                                </tr>
                                <tr>
                                    <td width="25%" align="center" height="100">
                                        <font color="green" id="f24"><b>
                                            √</b></font>
                                    </td>
                                    <td style="line-height: 200%; word-break: break-all; word-wrap: break-word; font-size:12px;">
                                        <li>Congratulations on your successful operation</li><li><a href="<%= request.getParameter("url") %>_Add.jsp">add information</a>&nbsp;&nbsp; <a href="<%= request.getParameter("url") %>_Manage.jsp">Back to list</a></li>
                                         
                                    </td>
                                </tr>
                            </tbody></table>
                        </td>
                    </tr>
                </tbody></table>
            </td>
        </tr>
    </tbody></table>
  </body>
</html>
