﻿<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.db.conn"%>
<%@ page import="java.sql.*"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>




<jsp:include flush="true" page="${basePath}/admin/head.jsp"></jsp:include>


<form  action="<%=path %>/member_Add" method="post">



    <div class="rows" style="margin-bottom: 1%; border: 1px solid #e6e6e6; overflow: hidden;  padding-left: 1px;">
        <div class="panel panel-default">
            <div class="panel-heading">
               <i class="fa fa-thumbs-o-up fa-lg" style="padding-right: 5px;"></i>
                Add member information
            </div>
            <div class="panel-body">
                
                <table style="width:100%;"><tr><td align="center">
                    

					  <table class="layui-table" style="width:98%;margin-left:10px;" align="center">
                    <tbody>
                    <tr>
<td  style=" text-align:right; width:20%;"><font style='color:red'>*&nbsp;</font>username:</td>
<td class="tbright"><div style="display:inline;float:left;">
<input name="txt_lname" type="text" id="txt_lname" style="width: 200px; " required /></div>
</div> 
 </td></tr>

<tr>
<td  style=" text-align:right; width:20%;"><font style='color:red'>*&nbsp;</font>login password:</td>
<td class="tbright"><div style="display:inline;float:left;">
<input name="txt_password" type="text" id="txt_password" style="width: 200px; " required /></div>
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
        <input type="submit" name="btnAdd" value="add"  id="btnAdd"  class="layui-layer-btn0 btn btn-primary" />
    <input name="btnReturn" type="button" value="return"  class="layui-layer-btn0 btn btn-primary"  onclick="location.href='<%=path %>/admin/member/member_Manage.jsp';"  />
    
               </td>
    </tr>
                    </tbody>
                </table>


                           </td></tr></table>

            </div>
        </div>
    </div>



    </form>


