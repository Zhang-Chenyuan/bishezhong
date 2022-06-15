<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.db.conn"%>
<%@ page import="java.sql.*"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>



<jsp:include flush="true" page="${basePath}/admin/head.jsp"></jsp:include>


<form action="<%=path %>/admin_Pass" method="post">



	    <div class="rows" style="margin-bottom: 1%; border: 1px solid #e6e6e6; overflow: hidden;  padding-left: 1px;">
        <div class="panel panel-default">
            <div class="panel-heading">
               <i class="fa fa-thumbs-o-up fa-lg" style="padding-right: 5px;"></i>
               change Password
            </div>
            <div class="panel-body">
                
                <table style="width:100%;"><tr><td align="center">
                    
					  <table class="layui-table" style="width:98%;margin-left:10px;" align="center">
                    <tbody>
          <tr>
    <td  style=" text-align:right; width:30%;"><font style='color:red'>*&nbsp;</font>old password:</td>
        <td class="tbright"><div style="display:inline;float:left;"><input name="txt_pwd" id="txt_pwd" type="password" required /></div> </td>
    </tr>
    <tr>
        <td  style=" text-align:right; width:30%;"><font style='color:red'>*&nbsp;</font>new password:</td>
        <td class="tbright"><div style="display:inline;float:left;"><input name="txt_pwd2" id="txt_pwd2" type="password" required /></div></td>
    </tr>
        <tr>
        <td  style=" text-align:right; width:30%;"><font style='color:red'>*&nbsp;</font>Confirm Password:</td>
        <td class="tbright"><div style="display:inline;float:left;"><input name="txt_pwd3"  id="txt_pwd3" type="password" required /></div> </td>
    </tr>


    <tr>
        <td>&nbsp;</td>
        <td align="left">
        <input type="submit" name="btnAdd" value="Sure"  id="btnAdd"  class="layui-layer-btn0 btn btn-primary" />
     
               </td>
    </tr>
                    </tbody>
                </table>


                           </td></tr></table>

            </div>
        </div>
    </div>
	
</form>

