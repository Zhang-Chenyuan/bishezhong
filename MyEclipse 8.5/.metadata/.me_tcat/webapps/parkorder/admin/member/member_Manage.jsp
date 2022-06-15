﻿<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.db.conn"%>
<%@ page import="com.db.Pagination"%>
<%@ page import="java.sql.*"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<jsp:include flush="true" page="${basePath}/admin/head.jsp"></jsp:include>


<form >


    <div class="rows" style="margin-bottom: 1%; border: 1px solid #e6e6e6; overflow: hidden;  padding-left: 1px;">
        <div class="panel panel-default">
            <div class="panel-heading">
               <i class="fa fa-thumbs-o-up fa-lg" style="padding-right: 5px;"></i>
                Manage member information
            </div>
            <div class="panel-body">
                
                <table style="width:100%;"><tr><td align="center">
                    

		  <table class="layui-table" style="width:98%;margin-left:10px;" align="center">
                    <tbody>
                 <tr>
                <td align="center">
                                    <form action="<%=path %>/admin/member/member_Manage.jsp" method="post">

<strong> username:</strong><input name="txt_lname" type="text" id="txt_lname" style="width:150px;"  />
<strong> Name:</strong><input name="txt_mname" type="text" id="txt_mname" style="width:150px;"  />

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
if(request.getParameter("txt_lname")!=null)
{
 String lname= new String(request.getParameter("txt_lname").getBytes("ISO8859_1"), "UTF-8");
where+=" and lname like '%"+lname+"%' ";
}

if(request.getParameter("txt_mname")!=null)
{
 String mname= new String(request.getParameter("txt_mname").getBytes("ISO8859_1"), "UTF-8");
where+=" and mname like '%"+mname+"%' ";
}


conn cn=new conn();


ResultSet rs=cn.query("select count(*) from member a where "+where);
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
 
rs=cn.query("select  * from member a where "+where+" order by lname desc limit "+pageSize*(pageNow-1)+", "+pageSize);

%>

	<table cellspacing="0" border="0" style="width:100%;border-collapse:collapse;">
		<tr>
    <th >username</th>
    <th >login password</th>
    <th >Name</th>
    <th >phone number</th>
    <th >E-mail</th>
    <th >Home address</th>
    <th >Registration time</th>
			<th scope="col">operate</th>		</tr>
		<%
while(rs.next()){
%>
		<tr align="center" >
  			<td><%=rs.getString("lname") %></td>
  			<td><%=rs.getString("password") %></td>
  			<td><%=rs.getString("mname") %></td>
  			<td><%=rs.getString("tel") %></td>
  			<td><%=rs.getString("email") %></td>
  			<td><%=rs.getString("address") %></td>
  			<td><%=rs.getString("rtime") %></td>
			<td >
           <a href="<%=path %>/admin/member/member_Detail.jsp?id=<%=rs.getString("lname") %>">detailed</a>&nbsp;
           <a href="<%=path %>/admin/member/member_Edit.jsp?id=<%=rs.getString("lname") %>">edit</a>&nbsp;
           <a href="<%=path %>/member_Delete?id=<%=rs.getString("lname") %>">delete</a>
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

