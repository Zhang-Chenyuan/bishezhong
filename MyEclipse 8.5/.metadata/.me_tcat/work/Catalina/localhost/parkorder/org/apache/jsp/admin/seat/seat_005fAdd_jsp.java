package org.apache.jsp.admin.seat;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.db.conn;
import java.sql.*;

public final class seat_005fAdd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("/seat_Add\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"rows\" style=\"margin-bottom: 1%; border: 1px solid #e6e6e6; overflow: hidden;  padding-left: 1px;\">\r\n");
      out.write("        <div class=\"panel panel-default\">\r\n");
      out.write("            <div class=\"panel-heading\">\r\n");
      out.write("               <i class=\"fa fa-thumbs-o-up fa-lg\" style=\"padding-right: 5px;\"></i>\r\n");
      out.write("                添加车位信息\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"panel-body\">\r\n");
      out.write("                \r\n");
      out.write("                <table style=\"width:100%;\"><tr><td align=\"center\">\r\n");
      out.write("                    \r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t  <table class=\"layui-table\" style=\"width:98%;margin-left:10px;\" align=\"center\">\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                    <tr>\r\n");
      out.write("<td  style=\" text-align:right; width:20%;\"><font style='color:red'>*&nbsp;</font>所属停车场:</td>\r\n");
      out.write("<td class=\"tbright\"><div style=\"display:inline;float:left;\">\r\n");
      out.write("<select name=\"se_pid\" id=\"pidid\" style='width:200px'>\r\n");

 conn cnpid=new conn();
 ResultSet rspid=cnpid.query("select  pid,pname from parks ");
 while (rspid.next()) {

      out.write("\r\n");
      out.write("<option value=\"");
      out.print( rspid.getString("pid") );
      out.write('"');
      out.write('>');
      out.print(rspid.getString("pname"));
      out.write("</option>\r\n");
} 
      out.write("\r\n");
      out.write("</select>\r\n");
      out.write(" </td></tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td  style=\" text-align:right; width:20%;\"><font style='color:red'>*&nbsp;</font>车位名称:</td>\r\n");
      out.write("<td class=\"tbright\"><div style=\"display:inline;float:left;\">\r\n");
      out.write("<input name=\"txt_sname\" type=\"text\" id=\"txt_sname\" style=\"width: 200px; \" required /></div>\r\n");
      out.write("</div> \r\n");
      out.write(" </td></tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td  style=\" text-align:right; width:20%;\">车位规格:</td>\r\n");
      out.write("<td class=\"tbright\"><div style=\"display:inline;float:left;\">\r\n");
      out.write("<input name=\"txt_guig\" type=\"text\" id=\"txt_guig\" style=\"width: 200px; \"  /></div>\r\n");
      out.write("</div> \r\n");
      out.write(" </td></tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td>&nbsp;</td>\r\n");
      out.write("        <td align=\"left\">\r\n");
      out.write("        <input type=\"submit\" name=\"btnAdd\" value=\"添 加\"  id=\"btnAdd\"  class=\"layui-layer-btn0 btn btn-primary\" />\r\n");
      out.write("    <input name=\"btnReturn\" type=\"button\" value=\"返 回\"  class=\"layui-layer-btn0 btn btn-primary\"  onclick=\"location.href='");
      out.print(path );
      out.write("/admin/seat/seat_Manage.jsp';\"  />\r\n");
      out.write("    \r\n");
      out.write("               </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                </table>\r\n");
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
