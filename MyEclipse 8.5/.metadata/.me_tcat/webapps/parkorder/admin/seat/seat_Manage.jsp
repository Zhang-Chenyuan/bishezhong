<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
                管理车位信息
            </div>
            <div class="panel-body">
                
                <table style="width:100%;"><tr><td align="center">
                    

		  <table class="layui-table" style="width:98%;margin-left:10px;" align="center">
                    <tbody>
                 <tr>
                <td align="center">
                                    <form action="<%=path %>/admin/seat/seat_Manage.jsp" method="post">

<strong> 所属停车场:</strong><select name="se_pid" style='width:150px' id="pidid">
<option value="">全部</option>
<%
 conn cnpid=new conn();
 ResultSet rspid=cnpid.query("select  pid,pname from parks ");
 while (rspid.next()) {
%>
<option value=" <%= rspid.getString("pid") %> "><%=rspid.getString("pname")%></option>
<%} %>
</select>
<strong> 车位名称:</strong><input name="txt_sname" type="text" id="txt_sname" style="width:150px;"  />

                <input name="search" type="submit" border="0" class="layui-layer-btn0 btn btn-primary"	value='查询' />
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

if(request.getParameter("txt_sname")!=null)
{
 String sname= new String(request.getParameter("txt_sname").getBytes("ISO8859_1"), "UTF-8");
where+=" and sname like '%"+sname+"%' ";
}


conn cn=new conn();


ResultSet rs=cn.query("select count(*) from seat a where "+where);
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
 
rs=cn.query("select  a.*,b.pname from seat a  left join parks b on a.pid=b.pid  where "+where+" order by sid desc limit "+pageSize*(pageNow-1)+", "+pageSize);

%>

	<table cellspacing="0" border="0" style="width:100%;border-collapse:collapse;">
		<tr>
    <th >所属停车场</th>
    <th >车位名称</th>
    <th >车位规格</th>
			<th scope="col">操作</th>		</tr>
		<%
while(rs.next()){
%>
		<tr align="center" >
 			<td><%=rs.getString("pname") %></td>
  			<td><%=rs.getString("sname") %></td>
  			<td><%=rs.getString("guig") %></td>
			<td >
           <a href="<%=path %>/admin/seat/seat_Edit.jsp?id=<%=rs.getString("sid") %>">编辑</a>&nbsp;
           <a href="<%=path %>/seat_Delete?id=<%=rs.getString("sid") %>">删除</a>
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

