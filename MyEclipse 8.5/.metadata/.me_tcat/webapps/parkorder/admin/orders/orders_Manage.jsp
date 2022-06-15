<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.db.conn"%>
<%@ page import="com.db.Pagination"%>
<%@ page import="java.sql.*"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<jsp:include flush="true" page="${basePath}/admin/head.jsp"></jsp:include>
<script src="<%=path %>/My97DatePicker/WdatePicker.js" type="text/javascript"></script>

<form >


    <div class="rows" style="margin-bottom: 1%; border: 1px solid #e6e6e6; overflow: hidden;  padding-left: 1px;">
        <div class="panel panel-default">
            <div class="panel-heading">
               <i class="fa fa-thumbs-o-up fa-lg" style="padding-right: 5px;"></i>
                Manage parking space reservation information
            </div>
            <div class="panel-body">
                
                <table style="width:100%;"><tr><td align="center">
                    

		  <table class="layui-table" style="width:98%;margin-left:10px;" align="center">
                    <tbody>
                 <tr>
                <td align="center">
                                    <form action="<%=path %>/admin/orders/orders_Manage.jsp" method="post">

<strong> Owned parking lot:</strong><select name="se_pid" style='width:150px' id="pidid">
<option value="">all</option>
<%
 conn cnpid=new conn();
 ResultSet rspid=cnpid.query("select  pid,pname from parks ");
 while (rspid.next()) {
%>
<option value=" <%= rspid.getString("pid") %> "><%=rspid.getString("pname")%></option>
<%} %>
</select>
<strong> Starting time:</strong><input name="txt_stime" type="text" id="txt_stime" style="width:150px;"   class="Wdate" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"   />
<strong>End Time:</strong><input name="txt_etime" type="text" id="txt_etime" style="width:150px;"  class="Wdate" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"    />
<strong> username:</strong><input name="txt_lname" type="text" id="txt_lname" style="width:150px;"  />

                <input name="search" type="submit" border="0" class="layui-layer-btn0 btn btn-primary"	value='Inquire' />
                </form>

   </td>
            </tr>
             <tr>
                <td align="center">
                      <%
//定义四个分页会用到的变量
int pageSize=15;
int pageNow=1;//默认显示第一页
int rowCount=0;//该值从数据库中查询
int pageCount=0;//该值是通过pageSize和rowCount
//接受用户希望显示的页数（pageNow）
String s_pageNow=request.getParameter("pageNum");
if(s_pageNow!=null){
//接收到了pageNow
pageNow=Integer.parseInt(s_pageNow);
}

String where="  1=1 ";

if(request.getParameter("se_pid")!=null  && request.getParameter("se_pid")!="")
{
where+=" and a.pid="+request.getParameter("se_pid");
}

if(request.getParameter("txt_stime")!=null && request.getParameter("txt_stime").length()>0)
{
 String stime= new String(request.getParameter("txt_stime").getBytes("ISO8859_1"), "UTF-8");
where+=" and stime >='"+stime+"' ";
}

if(request.getParameter("txt_etime")!=null && request.getParameter("txt_etime").length()>0)
{
 String etime= new String(request.getParameter("txt_etime").getBytes("ISO8859_1"), "UTF-8");
where+=" and etime <= '"+etime+"' ";
}

if(request.getParameter("txt_lname")!=null)
{
 String lname= new String(request.getParameter("txt_lname").getBytes("ISO8859_1"), "UTF-8");
where+=" and a.lname like '%"+lname+"%' ";
}


conn cn=new conn();


ResultSet rs=cn.query("select count(*) from orders a where "+where);
if(rs.next()){
rowCount=rs.getInt(1);
}

//计算pageCount
if(rowCount%pageSize==0){
pageCount=rowCount/pageSize;
}else{
pageCount=rowCount/pageSize+1;
}
//查询出需要显示的记录
 
rs=cn.query("select  a.*,b.pname,c.* from orders a  left join parks b on a.pid=b.pid left join member c on a.lname=c.lname  where "+where+" order by id desc limit "+pageSize*(pageNow-1)+", "+pageSize);

%>

	<table cellspacing="0" border="0" style="width:100%;border-collapse:collapse;">
		<tr>
    <th >Owned parking lot</th>
    <th >parking space</th>
    <th >Starting time</th>
    <th >End Time</th>
    <th >username</th>
        <th >Name</th>
    <th >phone number</th>
    <th >Appointment</th>
			<th scope="col">operate</th>		</tr>
		<%
while(rs.next()){
%>
		<tr align="center" >
 			<td><%=rs.getString("pname") %></td>
  			<td><%=rs.getString("sid") %></td>
  			<td><%=rs.getString("stime") %></td>
  			<td><%=rs.getString("etime") %></td>
  			<td><%=rs.getString("lname") %></td>
  					<td><%=rs.getString("mname") %></td>
  			<td><%=rs.getString("tel") %></td>
  			<td><%=rs.getString("oitme") %></td>
			<td >
           <a href="<%=path %>/admin/orders/orders_Detail.jsp?id=<%=rs.getString("id") %>">detailed</a>&nbsp;
           <a href="<%=path %>/orders_Delete?id=<%=rs.getString("id") %>">delete</a>
		</tr>
<%} %>
  
					   </table>
              </td>
              </tr>
               <tr>
                <td align="center">
                       <%= Pagination.getPagination(pageNow,pageCount,rowCount,request.getRequestURI()) %>    
              </td>
              </tr>
                    </tbody>
                </table>

                           </td></tr></table>

            </div>
        </div>
    </div>


</form>

