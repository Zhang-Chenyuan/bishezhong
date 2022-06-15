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
               View parking lot information
            </div>
            <div class="panel-body">
                
               <table class="layui-table" style="width:98%;margin-left:10px;" align="center">
                    <tbody>
                <% 			conn cn=new conn();
    
     			String id = request.getParameter("id");
     				String s1 = request.getParameter("s1");
     					String s2 = request.getParameter("s2");
				String sql = "select  * from parks  where pid=" + id ;
				ResultSet rs = cn.query(sql);
				rs.next();
			%>
 <tr>
	<td height="25" width="20%" align="right">Parking lot name：</td>
	<td height="25" width="*" align="left" style="text-align:left"><%=rs.getString("pname") %></td>
	</tr>
 <tr>
	<td height="25" width="20%" align="right">photo：</td>
	<td height="25" width="*" align="left" style="text-align:left"><img Width="120" Height="120" src='<%=path %>/<%=rs.getString("pic") %>' /></td>
	</tr>
 <tr>
	<td height="25" width="20%" align="right">price：</td>
	<td height="25" width="*" align="left" style="text-align:left"><%=rs.getString("price") %></td>
	</tr>
 <tr>
	<td height="25" width="20%" align="right">Contact information：</td>
	<td height="25" width="*" align="left" style="text-align:left"><%=rs.getString("tel") %></td>
	</tr>
 <tr>
	<td height="25" width="20%" align="right">address：</td>
	<td height="25" width="*" align="left" style="text-align:left"><%=rs.getString("address") %></td>
	</tr>


    <tr>
        <td>&nbsp;</td>
        <td align="left">
          <input name="btnReturn" type="button" value="return"  class="layui-layer-btn0 btn btn-primary"  onclick="location.href='<%=path %>/admin/parks/parks_Manage2.jsp';"  />
    
               </td>
    </tr>
    <tr><td colspan=2 align="center">
    
    <% 	String sql2 = "select  * from seat  where pid=" + id ;
				ResultSet rs2 = cn.query(sql2);
			 while(	rs2.next()){ 
			 String sid=rs2.getString("sid") ;		 

			  %>
    <% 			 if(cn.exist("select *  from orders where ( stime<='"+s1+"' and etime>='"+s1+"' or stime<='"+s2+"' and etime>='"+s2+"') and sid="+sid)) { %>
    
        <table style="width: 60px; height: 90px;  float: left;background-color: green;float: left;
    background-color: red;
        margin: 10px;
    text-align: center;
    font-size: 22px;
    color: white; "><tr><td>
        <%=rs2.getString("sname") %><br/>
    </td></tr></table>
    <%} else { %>
        <table style="width: 60px; height: 90px;  float: left;background-color: green;float: left;
    background-color: green;
    margin: 10px;
    text-align: center;
    font-size: 22px;
    color: white; "><tr><td>
        <%=rs2.getString("sname") %><br/>
        <a href="<%=path %>/orders_Add?pid=<%=id %>&sid=<%=sid %>&s1=<%=s1 %>&s2=<%=s2 %>" style='color:white;font-size:12px;'>Reserve this parking space</a>
    </td></tr></table>
    <%} %>


    
    <%} %>
    
    </td></tr>
    
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

