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
                Management system announcement information
            </div>
            <div class="panel-body">
                
                <table style="width:100%;"><tr><td align="center">
                    

		  <table class="layui-table" style="width:98%;margin-left:10px;" align="center">
                    <tbody>
                 <tr>
                <td align="center">
                                    <form action="<%=path %>/admin/notices/notices_Manage2.jsp" method="post">

<strong>announcement title</strong><strong>:</strong><input name="txt_title" type="text" id="txt_title" style="width:150px;"  />

                <input name="search" type="submit" border="0" class="layui-layer-btn0 btn btn-primary"	value='Inquire' />
                </form>

   </td>
            </tr>
             <tr>
                <td align="center">
                      <%
//Define the variables that will be used by the four paging
int pageSize=15;
int pageNow=1;//Display the first page by default
int rowCount=0;//The value is queried from the database
int pageCount=0;//The value is passed by pageSize and rowCount
//Accept the number of pages the user wishes to display（pageNow）
String s_pageNow=request.getParameter("pageNum");
if(s_pageNow!=null){
//received pageNow
pageNow=Integer.parseInt(s_pageNow);
}

String where="  1=1 ";
if(request.getParameter("txt_title")!=null)
{
 String title= new String(request.getParameter("txt_title").getBytes("ISO8859_1"), "UTF-8");
where+=" and title like '%"+title+"%' ";
}


conn cn=new conn();


ResultSet rs=cn.query("select count(*) from notices a where "+where);
if(rs.next()){
rowCount=rs.getInt(1);
}

//calculate pageCount
if(rowCount%pageSize==0){
pageCount=rowCount/pageSize;
}else{
pageCount=rowCount/pageSize+1;
}
//Query the records that need to be displayed
 
rs=cn.query("select  * from notices a where "+where+" order by nid desc limit "+pageSize*(pageNow-1)+", "+pageSize);

%>

	<table cellspacing="0" border="0" style="width:100%;border-collapse:collapse;">
		<tr>
    <th >announcement title</th>
    <th >release time</th>
			<th scope="col">operate</th>		</tr>
		<%
while(rs.next()){
%>
		<tr align="center" >
  			<td><%=rs.getString("title") %></td>
  			<td><%=rs.getString("ntime") %></td>
			<td >
           <a href="<%=path %>/admin/notices/notices_Detail.jsp?id=<%=rs.getString("nid") %>">detailed</a>&nbsp;
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

