<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">


		   <link href="<%=path %>/image/css/framework-font.css" rel="stylesheet" />
    <link href="<%=path %>/image/css/framework-ui.css" rel="stylesheet" />
    <link href="<%=path %>/image/css/framework-theme.css" rel="stylesheet" />
    <link href="<%=path %>/image/js/bootstrap/bootstrap.min.css" rel="stylesheet" />
    <link href="<%=path %>/image/css/framework-theme.css" rel="stylesheet" />
    <link href="<%=path %>/image/css/framework-about.css" rel="stylesheet" />
  </head>
  
  <body>


            <div class="rows" style="margin-bottom: 1%; border: 1px solid #e6e6e6; overflow: hidden;  padding-left: 1px;">
        <div class="panel panel-default">
            <div class="panel-heading">
               <i class="fa fa-thumbs-o-up fa-lg" style="padding-right: 5px;"></i>
                Welcome Home
            </div>
            <div class="panel-body">
               <table align="center" class="style1"  style=" line-height:35px;">
               <tr>
                   <td>
                       &nbsp;</td>
               </tr>
               <tr>
                   <td>
                       &nbsp;</td>
               </tr>
               <tr>
                   <td>
                       welcome your login！</td>
               </tr>
               <tr>
                   <td>
                      Your login IP is：<%=  request.getRemoteAddr() %></td>
               </tr>
               <tr>
                   <td>
                      Login time：<%=new java.sql.Timestamp(System.currentTimeMillis()).toString() %></td>
               </tr>
               <tr>
                   <td>
                       &nbsp;</td>
               </tr>
               <tr>
                   <td>
                       &nbsp;</td>
               </tr>
           </table>
            </div>
        </div>
    </div>

  </body>
</html>
