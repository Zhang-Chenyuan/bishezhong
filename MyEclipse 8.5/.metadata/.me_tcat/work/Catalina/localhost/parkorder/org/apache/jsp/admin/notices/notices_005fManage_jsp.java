package org.apache.jsp.admin.notices;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.db.conn;
import com.db.Pagination;
import java.sql.*;

public final class notices_005fManage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basePath}/admin/head.jsp", java.lang.String.class, (PageContext)_jspx_page_context, null, false), out, true);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form >\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"rows\" style=\"margin-bottom: 1%; border: 1px solid #e6e6e6; overflow: hidden;  padding-left: 1px;\">\r\n");
      out.write("        <div class=\"panel panel-default\">\r\n");
      out.write("            <div class=\"panel-heading\">\r\n");
      out.write("               <i class=\"fa fa-thumbs-o-up fa-lg\" style=\"padding-right: 5px;\"></i>\r\n");
      out.write("                Management system announcement information\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"panel-body\">\r\n");
      out.write("                \r\n");
      out.write("                <table style=\"width:100%;\"><tr><td align=\"center\">\r\n");
      out.write("                    \r\n");
      out.write("\r\n");
      out.write("\t\t  <table class=\"layui-table\" style=\"width:98%;margin-left:10px;\" align=\"center\">\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                 <tr>\r\n");
      out.write("                <td align=\"center\">\r\n");
      out.write("                                    <form action=\"");
      out.print(path );
      out.write("/admin/notices/notices_Manage.jsp\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("<strong> announcement title:</strong><input name=\"txt_title\" type=\"text\" id=\"txt_title\" style=\"width:150px;\"  />\r\n");
      out.write("\r\n");
      out.write("                <input name=\"search\" type=\"submit\" border=\"0\" class=\"layui-layer-btn0 btn btn-primary\"\tvalue='Inquire' />\r\n");
      out.write("                </form>\r\n");
      out.write("\r\n");
      out.write("   </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("             <tr>\r\n");
      out.write("                <td align=\"center\">\r\n");
      out.write("                      ");

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


      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<table cellspacing=\"0\" border=\"0\" style=\"width:100%;border-collapse:collapse;\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("    <th >announcement title</th>\r\n");
      out.write("    <th >release time</th>\r\n");
      out.write("\t\t\t<th scope=\"col\">operate</th>\t\t</tr>\r\n");
      out.write("\t\t");

while(rs.next()){

      out.write("\r\n");
      out.write("\t\t<tr align=\"center\" >\r\n");
      out.write("  \t\t\t<td>");
      out.print(rs.getString("title") );
      out.write("</td>\r\n");
      out.write("  \t\t\t<td>");
      out.print(rs.getString("ntime") );
      out.write("</td>\r\n");
      out.write("\t\t\t<td >\r\n");
      out.write("           <a href=\"");
      out.print(path );
      out.write("/admin/notices/notices_Detail.jsp?id=");
      out.print(rs.getString("nid") );
      out.write("\">detailed</a>&nbsp;\r\n");
      out.write("           <a href=\"");
      out.print(path );
      out.write("/admin/notices/notices_Edit.jsp?id=");
      out.print(rs.getString("nid") );
      out.write("\">edit</a>&nbsp;\r\n");
      out.write("           <a href=\"");
      out.print(path );
      out.write("/notices_Delete?id=");
      out.print(rs.getString("nid") );
      out.write("\">delete</a>\r\n");
      out.write("\t\t</tr>\r\n");
} 
      out.write("\r\n");
      out.write("  \r\n");
      out.write("\t\t\t\t\t   </table>\r\n");
      out.write("              </td>\r\n");
      out.write("              </tr>\r\n");
      out.write("               <tr>\r\n");
      out.write("                <td align=\"center\">\r\n");
      out.write("                       ");
      out.print( Pagination.getPagination(pageNow,pageCount,rowCount,request.getRequestURI()) );
      out.write("    \r\n");
      out.write("              </td>\r\n");
      out.write("              </tr>\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("\r\n");
      out.write("                           </td></tr></table>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
