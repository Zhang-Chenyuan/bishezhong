<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'reg.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">


  </head>
  
  <body>
 <form  action="<%=path %>/member_Add?flag=1" method="post">
				  <table class="layui-table" style="width:98%;margin-left:10px;font-size:12px;line-height:32px;" align="center">
                    <tbody>
                    <tr>
<td  style=" text-align:right; width:20%;"><font style='color:red'>*&nbsp;</font>username:</td>
<td class="tbright"><div style="display:inline;float:left;">
<input name="txt_lname" type="text" id="txt_lname" style="width: 200px; " required /></div>
</div> 
 </td></tr>

<tr>
<td  style=" text-align:right; width:20%;"><font style='color:red'>*&nbsp;</font>loginpassword:</td>
<td class="tbright"><div style="display:inline;float:left;">
<input name="txt_password" type="password"   id="txt_password" style="width: 200px; " required /></div>
</div> 
 </td></tr>
 
 
<tr>
<td  style=" text-align:right; width:20%;"><font style='color:red'>*&nbsp;</font>ConfirmPassword:</td>
<td class="tbright"><div style="display:inline;float:left;">
<input name="txt_password2" type="password"   id="txt_password2" style="width: 200px; " required /></div>
</div> 
 </td></tr>

<tr>
<td  style=" text-align:right; width:20%;"><font style='color:red'>*&nbsp;</font>Name:</td>
<td class="tbright"><div style="display:inline;float:left;">
<input name="txt_mname" type="text" id="txt_mname" style="width: 200px; " required /></div>
</div> 
 </td></tr>

<tr>
<td  style=" text-align:right; width:20%;"><font style='color:red'>*&nbsp;</font>phone number:</td>
<td class="tbright"><div style="display:inline;float:left;">
<input name="txt_tel" type="text" id="txt_tel" style="width: 200px; " required /></div>
</div> 
 </td></tr>

<tr>
<td  style=" text-align:right; width:20%;"><font style='color:red'>*&nbsp;</font>E-mail:</td>
<td class="tbright"><div style="display:inline;float:left;">
<input name="txt_email" type="text" id="txt_email" style="width: 200px; " required /></div>
</div> 
 </td></tr>

<tr>
<td  style=" text-align:right; width:20%;"><font style='color:red'>*&nbsp;</font>Home address:</td>
<td class="tbright"><div style="display:inline;float:left;">
<input name="txt_address" type="text" id="txt_address" style="width: 200px; " required /></div>
</div> 
 </td></tr>



    <tr>
        <td>&nbsp;</td>
        <td align="left">
        <input type="submit" name="btnAdd" value="register"  id="btnAdd"  class="layui-layer-btn0 btn btn-primary" />
    
               </td>
    </tr>
                    </tbody>
                </table>
                </form>
  </body>
</html>
