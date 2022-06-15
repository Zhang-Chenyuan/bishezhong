package org.apache.jsp.admin.parks;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.db.conn;
import java.sql.*;

public final class yy_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basePath}/admin/head.jsp", java.lang.String.class, (PageContext)_jspx_page_context, null, false), out, true);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t    <div class=\"rows\" style=\"margin-bottom: 1%; border: 1px solid #e6e6e6; overflow: hidden;  padding-left: 1px;\">\r\n");
      out.write("        <div class=\"panel panel-default\">\r\n");
      out.write("            <div class=\"panel-heading\">\r\n");
      out.write("               <i class=\"fa fa-thumbs-o-up fa-lg\" style=\"padding-right: 5px;\"></i>\r\n");
      out.write("               View parking lot information\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"panel-body\">\r\n");
      out.write("                \r\n");
      out.write("               <table class=\"layui-table\" style=\"width:98%;margin-left:10px;\" align=\"center\">\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                ");
 			conn cn=new conn();
    
     			String id = request.getParameter("id");
     				String s1 = request.getParameter("s1");
     					String s2 = request.getParameter("s2");
				String sql = "select  * from parks  where pid=" + id ;
				ResultSet rs = cn.query(sql);
				rs.next();
			
      out.write("\r\n");
      out.write(" <tr>\r\n");
      out.write("\t<td height=\"25\" width=\"20%\" align=\"right\">Parking lot name：</td>\r\n");
      out.write("\t<td height=\"25\" width=\"*\" align=\"left\" style=\"text-align:left\">");
      out.print(rs.getString("pname") );
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write(" <tr>\r\n");
      out.write("\t<td height=\"25\" width=\"20%\" align=\"right\">photo：</td>\r\n");
      out.write("\t<td height=\"25\" width=\"*\" align=\"left\" style=\"text-align:left\"><img Width=\"120\" Height=\"120\" src='");
      out.print(path );
      out.write('/');
      out.print(rs.getString("pic") );
      out.write("' /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write(" <tr>\r\n");
      out.write("\t<td height=\"25\" width=\"20%\" align=\"right\">price：</td>\r\n");
      out.write("\t<td height=\"25\" width=\"*\" align=\"left\" style=\"text-align:left\">");
      out.print(rs.getString("price") );
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write(" <tr>\r\n");
      out.write("\t<td height=\"25\" width=\"20%\" align=\"right\">Contact information：</td>\r\n");
      out.write("\t<td height=\"25\" width=\"*\" align=\"left\" style=\"text-align:left\">");
      out.print(rs.getString("tel") );
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write(" <tr>\r\n");
      out.write("\t<td height=\"25\" width=\"20%\" align=\"right\">address：</td>\r\n");
      out.write("\t<td height=\"25\" width=\"*\" align=\"left\" style=\"text-align:left\">");
      out.print(rs.getString("address") );
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td>&nbsp;</td>\r\n");
      out.write("        <td align=\"left\">\r\n");
      out.write("          <input name=\"btnReturn\" type=\"button\" value=\"return\"  class=\"layui-layer-btn0 btn btn-primary\"  onclick=\"location.href='");
      out.print(path );
      out.write("/admin/parks/parks_Manage2.jsp';\"  />\r\n");
      out.write("    \r\n");
      out.write("               </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr><td colspan=2 align=\"center\">\r\n");
      out.write("    \r\n");
      out.write("    ");
 	String sql2 = "select  * from seat  where pid=" + id ;
				ResultSet rs2 = cn.query(sql2);
			 while(	rs2.next()){ 
			 String sid=rs2.getString("sid") ;		 

			  
      out.write("\r\n");
      out.write("    ");
 			 if(cn.exist("select *  from orders where ( stime<='"+s1+"' and etime>='"+s1+"' or stime<='"+s2+"' and etime>='"+s2+"') and sid="+sid)) { 
      out.write("\r\n");
      out.write("    \r\n");
      out.write("        <table style=\"width: 60px; height: 90px;  float: left;background-color: green;float: left;\r\n");
      out.write("    background-color: red;\r\n");
      out.write("        margin: 10px;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    font-size: 22px;\r\n");
      out.write("    color: white; \"><tr><td>\r\n");
      out.write("        ");
      out.print(rs2.getString("sname") );
      out.write("<br/>\r\n");
      out.write("    </td></tr></table>\r\n");
      out.write("    ");
} else { 
      out.write("\r\n");
      out.write("        <table style=\"width: 60px; height: 90px;  float: left;background-color: green;float: left;\r\n");
      out.write("    background-color: green;\r\n");
      out.write("    margin: 10px;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    font-size: 22px;\r\n");
      out.write("    color: white; \"><tr><td>\r\n");
      out.write("        ");
      out.print(rs2.getString("sname") );
      out.write("<br/>\r\n");
      out.write("        <a href=\"");
      out.print(path );
      out.write("/orders_Add?pid=");
      out.print(id );
      out.write("&sid=");
      out.print(sid );
      out.write("&s1=");
      out.print(s1 );
      out.write("&s2=");
      out.print(s2 );
      out.write("\" style='color:white;font-size:12px;'>Reserve this parking space</a>\r\n");
      out.write("    </td></tr></table>\r\n");
      out.write("    ");
} 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    ");
} 
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    </td></tr>\r\n");
      out.write("    \r\n");
      out.write("                    </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                           </td></tr></table>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\t");

				if (rs != null)
					rs.close();
				if (cn != null)
					cn.close();
			
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
