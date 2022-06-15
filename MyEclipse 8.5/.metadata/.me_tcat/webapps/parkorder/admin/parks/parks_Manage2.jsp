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
                Parking lot search
            </div>
            <div class="panel-body">
                
                <table style="width:100%;"><tr><td align="center">
                    

		  <table class="layui-table" style="width:98%;margin-left:10px;" align="center">
                    <tbody>
                 <tr>
                <td align="center">
                                    <form action="<%=path %>/admin/parks/parks_Manage2.jsp" method="post">

<strong> PARKING LOT:</strong><select name="se_pid" style='width:150px' id="pidid">
<option value="">all</option>
<%
String p=request.getParameter("se_pid");
 conn cnpid=new conn();
 ResultSet rspid=cnpid.query("select  pid,pname from parks ");
 while (rspid.next()) {
 
 if(p!=null && p.equals(rspid.getString("pid"))){
%>
<option value="<%= rspid.getString("pid") %>"  selected = "selected"><%=rspid.getString("pname")%></option>
<%} else { %>
<option value="<%= rspid.getString("pid") %>"><%=rspid.getString("pname")%></option>
<%}} %>
</select>
<strong> address:</strong><input name="txt_address" type="text" id="txt_address" style="width:150px;" value="<%=request.getParameter("txt_address")==null?"":new String(request.getParameter("txt_address").getBytes("ISO8859_1"), "UTF-8") %>"  />
   <strong> Parking time begins:</strong><input name="txt_t1" type="text" id="txt_t1" style="width:150px;" class="Wdate" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',minDate:'%y-%M-%d'})" value="<%=request.getParameter("txt_t1")==null?"":new String(request.getParameter("txt_t1").getBytes("ISO8859_1"), "UTF-8") %>"  />
     <strong> Finish:</strong><input name="txt_t2" type="text" id="txt_t2" style="width:150px;"  class="Wdate" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',minDate:'%y-%M-%d'})"  value="<%=request.getParameter("txt_t2")==null?"":new String(request.getParameter("txt_t2").getBytes("ISO8859_1"), "UTF-8") %>"  />
         
       <input type="hidden" name = "flag" value="1"/>
                <input name="search" type="submit" border="0" class="layui-layer-btn0 btn btn-primary"	value='Inquire' />
                </form>

   </td>
            </tr>
             <tr>
                <td align="center">
                
                <%
                                     if( request.getParameter("flag")!=null )
{

                 %>
                 
             <%
                                  if( request.getParameter("flag")!=null && ( request.getParameter("txt_t1").length()==0 || request.getParameter("txt_t2").length()==0))
{
  %>

	<b style="color:red;">Please set the parking time</b>

<%} else { %>  
                 
                
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
if(request.getParameter("se_pid")!=null)
{
 String pname= new String(request.getParameter("se_pid").getBytes("ISO8859_1"), "UTF-8");
where+=" and a.pid="+pname;
}

if(request.getParameter("txt_address")!=null)
{
 String pname= new String(request.getParameter("txt_address").getBytes("ISO8859_1"), "UTF-8");
where+=" and address like '%"+pname+"%' ";
}


conn cn=new conn();


ResultSet rs=cn.query("select count(*) from parks a where "+where);
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
 
rs=cn.query("select a.*,ifnull(null,tt) as tt from parks a left join (select pid,count(*) as tt from seat group by pid) b on a.pid=b.pid where "+where+" order by pid desc limit "+pageSize*(pageNow-1)+", "+pageSize);

%>

	<table cellspacing="0" border="0" style="width:100%;border-collapse:collapse;">
		<tr>
    <th >Parking lot name</th>
    <th >photo</th>
    <th >price</th>
    <th >Contact information</th>
    <th >address</th>
       <th >number of parking spaces</th>
             <th >Number of spares</th>
			<th scope="col">operate</th>		</tr>
		<%
while(rs.next()){
%>
		<tr align="center" >
  			<td><%=rs.getString("pname") %></td>
 <td align="center"><img alt="" src="<%=path %>//<%=rs.getString("pic") %>" width="80"  height="80" /></td>
  			<td><%=rs.getString("price") %></td>
  			<td><%=rs.getString("tel") %></td>
  			<td><%=rs.getString("address") %></td>
  				<td><%=rs.getString("tt") %></td>
  				
  					<td><% String pid=rs.getString("pid"); 
  					String tt=rs.getString("tt");
  					String s1=new String(request.getParameter("txt_t1").getBytes("ISO8859_1"), "UTF-8"); 
  					String s2=new String(request.getParameter("txt_t2").getBytes("ISO8859_1"), "UTF-8"); 
  					
  					ResultSet rs2 = cn.query("select count(*) as tt from orders where ( stime<='"+s1+"' and etime>='"+s1+"' or stime<='"+s2+"' and etime>='"+s2+"') and pid="+pid+" group by sid ");
				
				String temp="0";
				 if(rs2.next())
				 {
				 temp=rs2.getString("tt");
				 }
				
				
				int tt2= Integer.valueOf (tt)-Integer.valueOf(temp);
  					 %>
  					 <%= tt2 %>
  					 </td>
			<td >
			
			<% if(tt2>0){ %>
           <a href="<%=path %>/admin/parks/yy.jsp?id=<%=rs.getString("pid") %>&s1=<%=s1 %>&s2=<%=s2 %>">book now</a>&nbsp;
           <%} else { %>
           No vacancy
           <%} %>
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
                
                <%} } %>

                           </td></tr></table>

            </div>
        </div>
    </div>


</form>

