<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.db.conn"%>
<%@ page import="java.sql.*"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>




<jsp:include flush="true" page="${basePath}/admin/head.jsp"></jsp:include>

<link rel="stylesheet" href="<%=path %>/kindeditor/themes/default/default.css" />
	<link rel="stylesheet" href="<%=path %>/kindeditor/plugins/code/prettify.css" />
	<script charset="utf-8" src="<%=path %>/kindeditor/kindeditor.js"></script>
	<script charset="utf-8" src="<%=path %>/kindeditor/lang/zh_CN.js"></script>
	<script charset="utf-8" src="<%=path %>/kindeditor/plugins/code/prettify.js"></script>
	<script>
		KindEditor.ready(function(K) {
			var editor1 = K.create('textarea[name="Textarea1"]', {
				cssPath : '<%=path %>/kindeditor/plugins/code/prettify.css',
				uploadJson : '<%=path %>/kindeditor/jsp/upload_json.jsp',
				fileManagerJson : '<%=path %>/kindeditor/jsp/file_manager_json.jsp',
				allowFileManager : true,
				afterCreate : function() {
					var self = this;
					K.ctrl(document, 13, function() {
						self.sync();
						document.forms['example'].submit();
					});
					K.ctrl(self.edit.doc, 13, function() {
						self.sync();
						document.forms['example'].submit();
					});
				}
			});
			prettyPrint();
		});
	</script>
	
<form  action="<%=path %>/notices_Edit" method="post">


    <div class="rows" style="margin-bottom: 1%; border: 1px solid #e6e6e6; overflow: hidden;  padding-left: 1px;">
        <div class="panel panel-default">
            <div class="panel-heading">
               <i class="fa fa-thumbs-o-up fa-lg" style="padding-right: 5px;"></i>
                Edit system announcement information
            </div>
            <div class="panel-body">
                
                <table style="width:100%;"><tr><td align="center">
                    

					  <table class="layui-table" style="width:98%;margin-left:10px;" align="center">
                    <tbody>
                        <% 			conn cn=new conn();
    
     			String id = request.getParameter("id");
				String sql = "select * from notices where nid=" + id ;
				ResultSet rs = cn.query(sql);
				rs.next();
			%>
<tr>
<td  style=" text-align:right; width:20%;"><font style='color:red'>*&nbsp;</font>announcement title:</td>
<td class="tbright"><div style="display:inline;float:left;">
<input name="txt_title" type="text" id="txt_title" style="width: 200px; " required  value='<%= rs.getString("title") %>' /></div>
</div> 
 </td></tr>

<tr>
<td  style=" text-align:right; width:20%;"><font style='color:red'>* </font>Announcement content:</td>
<td class="tbright"><div style="display:inline;float:left;">
<textarea id="Textarea1"  name="Textarea1"  cols="100" rows="8" style="width:700px;height:400px;visibility:hidden;"><%= rs.getString("memo") %></textarea></div>
 </td></tr>



    <tr>
        <td>&nbsp;</td>
        <td align="left"><input name="id" type="hidden" id="id" value='<%= request.getParameter("id") %>'> 
        <input type="submit" name="btnAdd" value="edit"  id="btnAdd"  class="layui-layer-btn0 btn btn-primary" />
    <input name="btnReturn" type="button" value="return"  class="layui-layer-btn0 btn btn-primary"  onclick="location.href='<%=path %>/admin/notices/notices_Manage.jsp';"  />
    
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

