<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.db.conn"%>
<%@ page import="java.sql.*"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<jsp:include flush="true" page="${basePath}/admin/head.jsp"></jsp:include>



				    <div class="rows" style="margin-bottom: 1%; border: 1px solid #e6e6e6; overflow: hidden;  padding-left: 1px;">
        <div class="panel panel-default">
            <div class="panel-heading">
               <i class="fa fa-thumbs-o-up fa-lg" style="padding-right: 5px;"></i>
               View member information
            </div>
            <div class="panel-body">
                
               <table class="layui-table" style="width:98%;margin-left:10px;" align="center">
                    <tbody>
                <% 			conn cn=new conn();
    
     			String id = request.getParameter("id");
				String sql = "select  * from member  where lname='" + id +"' ";
				ResultSet rs = cn.query(sql);
				rs.next();
			%>
 <tr>
	<td height="25" width="20%" align="right">username：</td>
	<td height="25" width="*" align="left" style="text-align:left"><%=rs.getString("lname") %></td>
	</tr>
 <tr>
	<td height="25" width="20%" align="right">login password：</td>
	<td height="25" width="*" align="left" style="text-align:left"><%=rs.getString("password") %></td>
	</tr>
 <tr>
	<td height="25" width="20%" align="right">Name：</td>
	<td height="25" width="*" align="left" style="text-align:left"><%=rs.getString("mname") %></td>
	</tr>
 <tr>
	<td height="25" width="20%" align="right">phone number：</td>
	<td height="25" width="*" align="left" style="text-align:left"><%=rs.getString("tel") %></td>
	</tr>
 <tr>
	<td height="25" width="20%" align="right">E-mail：</td>
	<td height="25" width="*" align="left" style="text-align:left"><%=rs.getString("email") %></td>
	</tr>
 <tr>
	<td height="25" width="20%" align="right">Home address：</td>
	<td height="25" width="*" align="left" style="text-align:left"><%=rs.getString("address") %></td>
	</tr>
 <tr>
	<td height="25" width="20%" align="right">Registration time：</td>
	<td height="25" width="*" align="left" style="text-align:left"><%=rs.getString("rtime") %></td>
	</tr>


    <tr>
        <td>&nbsp;</td>
        <td align="left">
          <input name="btnReturn" type="button" value="return"  class="layui-layer-btn0 btn btn-primary"  onclick="location.href='<%=path %>/admin/member/member_Manage.jsp';"  />
    
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

