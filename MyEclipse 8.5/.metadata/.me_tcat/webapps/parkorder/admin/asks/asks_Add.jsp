<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.db.conn"%>
<%@ page import="java.sql.*"%>
<%@ page import="com.db.Pagination"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>




<jsp:include flush="true" page="${basePath}/admin/head.jsp"></jsp:include>


<form  action="<%=path %>/asks_Add" method="post">



    <div class="rows" style="margin-bottom: 1%; border: 1px solid #e6e6e6; overflow: hidden;  padding-left: 1px;">
        <div class="panel panel-default">
            <div class="panel-heading">
               <i class="fa fa-thumbs-o-up fa-lg" style="padding-right: 5px;"></i>
               feedback
            </div>
            <div class="panel-body">
                
                <table style="width:100%;"><tr><td align="center">
                    

					  <table class="layui-table" style="width:98%;margin-left:10px;" align="center">
                    <tbody>
     

<tr>
<td  style=" text-align:right; width:20%;"><font style='color:red'>*&nbsp;</font>Feedback content:</td>
<td class="tbright"><div style="display:inline;float:left;">


<textarea  name="txt_ask" type="text" id="txt_ask" style="width: 400px; height:110px; " required></textarea>
</div>
</div> 
 </td></tr>



    <tr>
        <td>&nbsp;</td>
        <td align="left">
        <input type="submit" name="btnAdd" value="submit"  id="btnAdd"  class="layui-layer-btn0 btn btn-primary" />
    
               </td>
    </tr>
                    </tbody>
                </table>
                
                
                
              <table class="layui-table" style="width:98%;margin-left:10px;" align="center">
                    <tbody>
         
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

  			String id =(String) session.getAttribute("adminId");
  			
String where="  lname='"+id+"' ";


conn cn=new conn();


ResultSet rs=cn.query("select count(*) from asks a where "+where);
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
 
rs=cn.query("select  * from asks a where "+where+" order by aid desc limit "+pageSize*(pageNow-1)+", "+pageSize);

%>

	<table cellspacing="0" border="0" style="width:100%;border-collapse:collapse;">
		<tr>
    <th >username</th>
    <th >Feedback content</th>
    <th >feedback time</th>
    <th >admin reply</th>
			<th scope="col">operate</th>		</tr>
		<%
while(rs.next()){
%>
		<tr align="center" >
  			<td><%=rs.getString("lname") %></td>
  			<td><%=rs.getString("ask")!=null && rs.getString("ask").length()>20?rs.getString("ask").substring(0,20)+"……": rs.getString("ask")==null ?"":rs.getString("ask") %></td>
  			<td><%=rs.getString("atime") %></td>
  			<td><%=rs.getString("ans")!=null && rs.getString("ans").length()>20?rs.getString("ans").substring(0,20)+"……": rs.getString("ans")==null ?"":rs.getString("ans") %></td>
			<td >
           <a href="<%=path %>/admin/asks/asks_Detail.jsp?id=<%=rs.getString("aid") %>">detailed</a>&nbsp;
           <a href="<%=path %>/asks_Delete?id=<%=rs.getString("aid") %>&flag=1">DELE</a>
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


