<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.db.conn"%>
<%@ page import="java.sql.*"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>




<jsp:include flush="true" page="${basePath}/admin/head.jsp"></jsp:include>


<form  action="<%=path %>/seat_Add" method="post">



    <div class="rows" style="margin-bottom: 1%; border: 1px solid #e6e6e6; overflow: hidden;  padding-left: 1px;">
        <div class="panel panel-default">
            <div class="panel-heading">
               <i class="fa fa-thumbs-o-up fa-lg" style="padding-right: 5px;"></i>
                添加车位信息
            </div>
            <div class="panel-body">
                
                <table style="width:100%;"><tr><td align="center">
                    

					  <table class="layui-table" style="width:98%;margin-left:10px;" align="center">
                    <tbody>
                    <tr>
<td  style=" text-align:right; width:20%;"><font style='color:red'>*&nbsp;</font>所属停车场:</td>
<td class="tbright"><div style="display:inline;float:left;">
<select name="se_pid" id="pidid" style='width:200px'>
<%
 conn cnpid=new conn();
 ResultSet rspid=cnpid.query("select  pid,pname from parks ");
 while (rspid.next()) {
%>
<option value="<%= rspid.getString("pid") %>"><%=rspid.getString("pname")%></option>
<%} %>
</select>
 </td></tr>

<tr>
<td  style=" text-align:right; width:20%;"><font style='color:red'>*&nbsp;</font>车位名称:</td>
<td class="tbright"><div style="display:inline;float:left;">
<input name="txt_sname" type="text" id="txt_sname" style="width: 200px; " required /></div>
</div> 
 </td></tr>

<tr>
<td  style=" text-align:right; width:20%;">车位规格:</td>
<td class="tbright"><div style="display:inline;float:left;">
<input name="txt_guig" type="text" id="txt_guig" style="width: 200px; "  /></div>
</div> 
 </td></tr>



    <tr>
        <td>&nbsp;</td>
        <td align="left">
        <input type="submit" name="btnAdd" value="添 加"  id="btnAdd"  class="layui-layer-btn0 btn btn-primary" />
    <input name="btnReturn" type="button" value="返 回"  class="layui-layer-btn0 btn btn-primary"  onclick="location.href='<%=path %>/admin/seat/seat_Manage.jsp';"  />
    
               </td>
    </tr>
                    </tbody>
                </table>


                           </td></tr></table>

            </div>
        </div>
    </div>



    </form>


