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
               View parking reservation information
            </div>
            <div class="panel-body">
                
               <table class="layui-table" style="width:98%;margin-left:10px;" align="center">
                    <tbody>
                <% 			conn cn=new conn();
    
     			String id = request.getParameter("id");
				String sql = "select  a.*,b.pname,c.* from orders a  left join parks b on a.pid=b.pid left join member c on a.lname=c.lname where id=" + id ;
				ResultSet rs = cn.query(sql);
				rs.next();
			%>
 <tr>
	<td height="25" width="20%" align="right">Owned parking lot：</td>
	<td height="25" width="*" align="left" style="text-align:left"><%=rs.getString("pname") %></td>
	</tr>
 <tr>
	<td height="25" width="20%" align="right">parking space：</td>
	<td height="25" width="*" align="left" style="text-align:left"><%=rs.getString("sid") %></td>
	</tr>
 <tr>
	<td height="25" width="20%" align="right">Starting time：</td>
	<td height="25" width="*" align="left" style="text-align:left"><%=rs.getString("stime") %></td>
	</tr>
 <tr>
	<td height="25" width="20%" align="right">End Time：</td>
	<td height="25" width="*" align="left" style="text-align:left"><%=rs.getString("etime") %></td>
	</tr>
 <tr>
	<td height="25" width="20%" align="right">username：</td>
	<td height="25" width="*" align="left" style="text-align:left"><%=rs.getString("lname") %></td>
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
	<td height="25" width="20%" align="right">Appointment：</td>
	<td height="25" width="*" align="left" style="text-align:left"><%=rs.getString("oitme") %></td>
	</tr>


    <tr>
        <td>&nbsp;</td>
        <td align="left">
          <input name="btnReturn" type="button" value="return"  class="layui-layer-btn0 btn btn-primary"  onclick="history.go(-1);"  />
    
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

