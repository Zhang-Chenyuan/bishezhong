<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.db.conn"%>
<%@ page import="java.sql.*"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>




<jsp:include flush="true" page="${basePath}/admin/head.jsp"></jsp:include>


<form  action="<%=path %>/asks_Edit" method="post">


    <div class="rows" style="margin-bottom: 1%; border: 1px solid #e6e6e6; overflow: hidden;  padding-left: 1px;">
        <div class="panel panel-default">
            <div class="panel-heading">
               <i class="fa fa-thumbs-o-up fa-lg" style="padding-right: 5px;"></i>
                Reply to message feedback
            </div>
            <div class="panel-body">
                
                <table style="width:100%;"><tr><td align="center">
                    

					  <table class="layui-table" style="width:98%;margin-left:10px;" align="center">
                    <tbody>
                        <% 			conn cn=new conn();
    
     			String id = request.getParameter("id");
				String sql = "select * from asks where aid=" + id ;
				ResultSet rs = cn.query(sql);
				rs.next();
			%>
 <tr>
	<td height="25" width="20%" align="right">username：</td>
	<td height="25" width="*" align="left" style="text-align:left"><%=rs.getString("lname") %></td>
	</tr>
 <tr>
	<td height="25" width="20%" align="right">Feedback content：</td>
	<td height="25" width="*" align="left" style="text-align:left"><%=rs.getString("ask") %></td>
	</tr>
 <tr>
	<td height="25" width="20%" align="right">feedback time：</td>
	<td height="25" width="*" align="left" style="text-align:left"><%=rs.getString("atime") %></td>
	</tr>

<tr>
<td  style=" text-align:right; width:20%;"><font style='color:red'>*&nbsp;</font>admin reply:</td>
<td class="tbright"><div style="display:inline;float:left;">


<textarea  name="txt_ans" type="text" id="txt_ans" style="width: 400px; height:110px; "  value='<%= rs.getString("ans") %>' required></textarea>
</div>
</div> 
 </td></tr>



    <tr>
        <td>&nbsp;</td>
        <td align="left"><input name="id" type="hidden" id="id" value='<%= request.getParameter("id") %>'> 
        <input type="submit" name="btt" id="btnAdd"  value="Reply" class="layui-layer-btn0 btn btn-primary" />
    <input name="btnReturn" type="button" value="return"  class="layui-layer-btn0 btn btn-primary"  onclick="location.href='<%=path %>/admin/asks/asks_Manage.jsp';"  />
    
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

