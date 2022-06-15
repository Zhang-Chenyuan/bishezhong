package org.apache.jsp.admin.asks;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.db.conn;
import java.sql.*;
import com.db.Pagination;

public final class asks_005fAdd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basePath}/admin/head.jsp", java.lang.String.class, (PageContext)_jspx_page_context, null, false), out, true);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form  action=\"");
      out.print(path );
      out.write("/asks_Add\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"rows\" style=\"margin-bottom: 1%; border: 1px solid #e6e6e6; overflow: hidden;  padding-left: 1px;\">\r\n");
      out.write("        <div class=\"panel panel-default\">\r\n");
      out.write("            <div class=\"panel-heading\">\r\n");
      out.write("               <i class=\"fa fa-thumbs-o-up fa-lg\" style=\"padding-right: 5px;\"></i>\r\n");
      out.write("               feedback\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"panel-body\">\r\n");
      out.write("                \r\n");
      out.write("                <table style=\"width:100%;\"><tr><td align=\"center\">\r\n");
      out.write("                    \r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t  <table class=\"layui-table\" style=\"width:98%;margin-left:10px;\" align=\"center\">\r\n");
      out.write("                    <tbody>\r\n");
      out.write("     \r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td  style=\" text-align:right; width:20%;\"><font style='color:red'>*&nbsp;</font>Feedback content:</td>\r\n");
      out.write("<td class=\"tbright\"><div style=\"display:inline;float:left;\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<textarea  name=\"txt_ask\" type=\"text\" id=\"txt_ask\" style=\"width: 400px; height:110px; \" required></textarea>\r\n");
      out.write("</div>\r\n");
      out.write("</div> \r\n");
      out.write(" </td></tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td>&nbsp;</td>\r\n");
      out.write("        <td align=\"left\">\r\n");
      out.write("        <input type=\"submit\" name=\"btnAdd\" value=\"submit\"  id=\"btnAdd\"  class=\"layui-layer-btn0 btn btn-primary\" />\r\n");
      out.write("    \r\n");
      out.write("               </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("              <table class=\"layui-table\" style=\"width:98%;margin-left:10px;\" align=\"center\">\r\n");
      out.write("                    <tbody>\r\n");
      out.write("         \r\n");
      out.write("             <tr>\r\n");
      out.write("                <td align=\"center\">\r\n");
      out.write("                      ");

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


      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<table cellspacing=\"0\" border=\"0\" style=\"width:100%;border-collapse:collapse;\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("    <th >username</th>\r\n");
      out.write("    <th >Feedback content</th>\r\n");
      out.write("    <th >feedback time</th>\r\n");
      out.write("    <th >admin reply</th>\r\n");
      out.write("\t\t\t<th scope=\"col\">operate</th>\t\t</tr>\r\n");
      out.write("\t\t");

while(rs.next()){

      out.write("\r\n");
      out.write("\t\t<tr align=\"center\" >\r\n");
      out.write("  \t\t\t<td>");
      out.print(rs.getString("lname") );
      out.write("</td>\r\n");
      out.write("  \t\t\t<td>");
      out.print(rs.getString("ask")!=null && rs.getString("ask").length()>20?rs.getString("ask").substring(0,20)+"……": rs.getString("ask")==null ?"":rs.getString("ask") );
      out.write("</td>\r\n");
      out.write("  \t\t\t<td>");
      out.print(rs.getString("atime") );
      out.write("</td>\r\n");
      out.write("  \t\t\t<td>");
      out.print(rs.getString("ans")!=null && rs.getString("ans").length()>20?rs.getString("ans").substring(0,20)+"……": rs.getString("ans")==null ?"":rs.getString("ans") );
      out.write("</td>\r\n");
      out.write("\t\t\t<td >\r\n");
      out.write("           <a href=\"");
      out.print(path );
      out.write("/admin/asks/asks_Detail.jsp?id=");
      out.print(rs.getString("aid") );
      out.write("\">detailed</a>&nbsp;\r\n");
      out.write("           <a href=\"");
      out.print(path );
      out.write("/asks_Delete?id=");
      out.print(rs.getString("aid") );
      out.write("&flag=1\">DELE</a>\r\n");
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
      out.write("                \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                           </td></tr></table>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </form>\r\n");
      out.write("\r\n");
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
