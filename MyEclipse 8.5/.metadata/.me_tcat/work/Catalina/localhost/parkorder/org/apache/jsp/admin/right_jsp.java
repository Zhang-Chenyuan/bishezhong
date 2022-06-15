package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class right_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t   <link href=\"");
      out.print(path );
      out.write("/image/css/framework-font.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <link href=\"");
      out.print(path );
      out.write("/image/css/framework-ui.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <link href=\"");
      out.print(path );
      out.write("/image/css/framework-theme.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <link href=\"");
      out.print(path );
      out.write("/image/js/bootstrap/bootstrap.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <link href=\"");
      out.print(path );
      out.write("/image/css/framework-theme.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <link href=\"");
      out.print(path );
      out.write("/image/css/framework-about.css\" rel=\"stylesheet\" />\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"rows\" style=\"margin-bottom: 1%; border: 1px solid #e6e6e6; overflow: hidden;  padding-left: 1px;\">\r\n");
      out.write("        <div class=\"panel panel-default\">\r\n");
      out.write("            <div class=\"panel-heading\">\r\n");
      out.write("               <i class=\"fa fa-thumbs-o-up fa-lg\" style=\"padding-right: 5px;\"></i>\r\n");
      out.write("                Welcome Home\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"panel-body\">\r\n");
      out.write("               <table align=\"center\" class=\"style1\"  style=\" line-height:35px;\">\r\n");
      out.write("               <tr>\r\n");
      out.write("                   <td>\r\n");
      out.write("                       &nbsp;</td>\r\n");
      out.write("               </tr>\r\n");
      out.write("               <tr>\r\n");
      out.write("                   <td>\r\n");
      out.write("                       &nbsp;</td>\r\n");
      out.write("               </tr>\r\n");
      out.write("               <tr>\r\n");
      out.write("                   <td>\r\n");
      out.write("                       welcome your login！</td>\r\n");
      out.write("               </tr>\r\n");
      out.write("               <tr>\r\n");
      out.write("                   <td>\r\n");
      out.write("                      Your login IP is：");
      out.print(  request.getRemoteAddr() );
      out.write("</td>\r\n");
      out.write("               </tr>\r\n");
      out.write("               <tr>\r\n");
      out.write("                   <td>\r\n");
      out.write("                      Login time：");
      out.print(new java.sql.Timestamp(System.currentTimeMillis()).toString() );
      out.write("</td>\r\n");
      out.write("               </tr>\r\n");
      out.write("               <tr>\r\n");
      out.write("                   <td>\r\n");
      out.write("                       &nbsp;</td>\r\n");
      out.write("               </tr>\r\n");
      out.write("               <tr>\r\n");
      out.write("                   <td>\r\n");
      out.write("                       &nbsp;</td>\r\n");
      out.write("               </tr>\r\n");
      out.write("           </table>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
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
