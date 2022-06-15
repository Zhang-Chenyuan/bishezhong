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
                View system announcement information
            </div>
            <div class="panel-body">
                
               <table class="layui-table" style="width:98%;margin-left:10px;" align="center">
                    <tbody>
                <% 			conn cn=new conn();
    
     			String id = request.getParameter("id");
				String sql = "select  * from notices  where nid=" + id ;
				ResultSet rs = cn.query(sql);
				rs.next();
			%>
 <tr>
	<td height="25" width="20%" align="right">announcement title：</td>
	<td height="25" width="*" align="left" style="text-align:left"><%=rs.getString("title") %></td>
	</tr>
 <tr>
	<td height="25" width="20%" align="right">Announcement content：</td>
	<td height="25" width="*" align="left" style="text-align:left"><%=rs.getString("memo") %></td>
	</tr>
 <tr>
	<td height="25" width="20%" align="right">release time：</td>
	<td height="25" width="*" align="left" style="text-align:left"><%=rs.getString("ntime") %></td>
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

