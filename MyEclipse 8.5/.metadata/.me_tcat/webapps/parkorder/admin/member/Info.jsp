<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.db.conn"%>
<%@ page import="java.sql.*"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>




<jsp:include flush="true" page="${basePath}/admin/head.jsp"></jsp:include>


<form  action="<%=path %>/member_Edit?flag=1" method="post">


    <div class="rows" style="margin-bottom: 1%; border: 1px solid #e6e6e6; overflow: hidden;  padding-left: 1px;">
        <div class="panel panel-default">
            <div class="panel-heading">
               <i class="fa fa-thumbs-o-up fa-lg" style="padding-right: 5px;"></i>
                edit personal information
            </div>
            <div class="panel-body">
                
                <table style="width:100%;"><tr><td align="center">
                    

					  <table class="layui-table" style="width:98%;margin-left:10px;" align="center">
                    <tbody>
                        <% 			conn cn=new conn();
    
     			String id =(String) session.getAttribute("adminId");
				String sql = "select * from member where lname='" + id +"' ";
				ResultSet rs = cn.query(sql);
				rs.next();
			%>
<tr>
<td  style=" text-align:right; width:20%;"><font style='color:red'>*&nbsp;</font>username:</td>
<td class="tbright"><div style="display:inline;float:left;">
<input name="txt_lname" type="text" id="txt_lname" style="width: 200px; " required  value='<%= rs.getString("lname") %>' /></div>
</div> 
 </td></tr>


<tr>
<td  style=" text-align:right; width:20%;"><font style='color:red'>*&nbsp;</font>Name:</td>
<td class="tbright"><div style="display:inline;float:left;">
<input name="txt_mname" type="text" id="txt_mname" style="width: 200px; " required  value='<%= rs.getString("mname") %>' /></div>
</div> 
 </td></tr>

<tr>
<td  style=" text-align:right; width:20%;"><font style='color:red'>*&nbsp;</font>phone number:</td>
<td class="tbright"><div style="display:inline;float:left;">
<input name="txt_tel" type="text" id="txt_tel" style="width: 200px; " required  value='<%= rs.getString("tel") %>' /></div>
</div> 
 </td></tr>

<tr>
<td  style=" text-align:right; width:20%;"><font style='color:red'>*&nbsp;</font>E-mail:</td>
<td class="tbright"><div style="display:inline;float:left;">
<input name="txt_email" type="text" id="txt_email" style="width: 200px; " required  value='<%= rs.getString("email") %>' /></div>
</div> 
 </td></tr>

<tr>
<td  style=" text-align:right; width:20%;"><font style='color:red'>*&nbsp;</font>Home address:</td>
<td class="tbright"><div style="display:inline;float:left;">
<input name="txt_address" type="text" id="txt_address" style="width: 200px; " required  value='<%= rs.getString("address") %>' /></div>
</div> 
 </td></tr>



    <tr>
        <td>&nbsp;</td>
        <td align="left"><input name="id" type="hidden" id="id" value='<%= id %>'> 
        <input type="submit" name="btnAdd" value="save"  id="btnAdd"  class="layui-layer-btn0 btn btn-primary" />
    
               </td>
    </tr>
                    </tbody>
                </table>


                           </td></tr></table>

            </div>
        </div>
    </div>





	<%
				if (rs != null)
					rs.close();
				if (cn != null)
					cn.close();
			%>

	
</form>

