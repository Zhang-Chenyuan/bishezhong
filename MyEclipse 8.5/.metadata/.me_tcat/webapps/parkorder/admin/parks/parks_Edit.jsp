<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.db.conn"%>
<%@ page import="java.sql.*"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>



			<script type="text/javascript" src="<%=path%>/js/popup_shuaxin_no.js"></script>
	<script language="javascript">     
		    
	       function up2()
	       {
		        var pop=new Popup({ contentType:1,isReloadOnClose:false,width:400,height:200});
	            pop.setContent("contentUrl","<%=path%>/upfile/upload1.jsp");
	            pop.setContent("title","文件上传");
	            pop.build();
	            pop.show();
	       }
        </script>

<jsp:include flush="true" page="${basePath}/admin/head.jsp"></jsp:include>


<form  action="<%=path %>/parks_Edit" method="post">


    <div class="rows" style="margin-bottom: 1%; border: 1px solid #e6e6e6; overflow: hidden;  padding-left: 1px;">
        <div class="panel panel-default">
            <div class="panel-heading">
               <i class="fa fa-thumbs-o-up fa-lg" style="padding-right: 5px;"></i>
                Edit parking lot information
            </div>
            <div class="panel-body">
                
                <table style="width:100%;"><tr><td align="center">
                    

					  <table class="layui-table" style="width:98%;margin-left:10px;" align="center">
                    <tbody>
                        <% 			conn cn=new conn();
    
     			String id = request.getParameter("id");
				String sql = "select * from parks where pid=" + id ;
				ResultSet rs = cn.query(sql);
				rs.next();
			%>
<tr>
<td  style=" text-align:right; width:20%;"><font style='color:red'>*&nbsp;</font>Parking lot name:</td>
<td class="tbright"><div style="display:inline;float:left;">
<input name="txt_pname" type="text" id="txt_pname" style="width: 200px; " required  value='<%= rs.getString("pname") %>' /></div>
</div> 
 </td></tr>

<tr>
<td  style=" text-align:right; width:20%;"><font style='color:red'>*&nbsp;</font><span style="color: rgb(0, 0, 0); font-family: Roboto,RobotoDraft,Helvetica,Arial,sans-serif; font-size: medium; font-style: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-align: left; text-indent: 0px; text-transform: none; white-space: nowrap; widows: 2; word-spacing: 0px; background-color: rgb(241, 243, 244); display: inline ! important; float: none;">photo</span>:</td>
<td class="tbright"><div style="display:inline;float:left;">
<img src='<%=path %>/<%= rs.getString("pic") %>' width=100 height=100><input type="text" name="fujian" id="fujian" size="50"  value='<%= rs.getString("pic") %>' readonly="readonly" />
<input type="button" value="上传" onclick="up2()" />
 </td></tr>

<tr>
<td  style=" text-align:right; width:20%;"><font style='color:red'>*&nbsp;</font>price:</td>
<td class="tbright"><div style="display:inline;float:left;">
<input name="txt_price" type="text" id="txt_price" style="width: 200px; " required  value='<%= rs.getString("price") %>' /></div>
</div> 
 </td></tr>

<tr>
<td  style=" text-align:right; width:20%;"><font style='color:red'>*&nbsp;</font>Contact information:</td>
<td class="tbright"><div style="display:inline;float:left;">
<input name="txt_tel" type="text" id="txt_tel" style="width: 200px; " required  value='<%= rs.getString("tel") %>' /></div>
</div> 
 </td></tr>

<tr>
<td  style=" text-align:right; width:20%;"><font style='color:red'>*&nbsp;</font>address:</td>
<td class="tbright"><div style="display:inline;float:left;">
<input name="txt_address" type="text" id="txt_address" style="width: 200px; " required  value='<%= rs.getString("address") %>' /></div>
</div> 
 </td></tr>



    <tr>
        <td>&nbsp;</td>
        <td align="left"><input name="id" type="hidden" id="id" value='<%= request.getParameter("id") %>'> 
        <input type="submit" name="btnAdd" value="edit" id="btnAdd"  class="layui-layer-btn0 btn btn-primary" />
    <input name="btnReturn" type="button" value="return"  class="layui-layer-btn0 btn btn-primary"  onclick="location.href='<%=path %>/admin/parks/parks_Manage.jsp';"  />
    
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

	
</form>

