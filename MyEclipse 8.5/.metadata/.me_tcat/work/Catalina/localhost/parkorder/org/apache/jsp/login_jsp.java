package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \r\n");
      out.write("    <title>주차공간 예약시스템</title>\r\n");
      out.write("    \r\n");
      out.write("      <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("      <link href=\"");
      out.print(path );
      out.write("/image/css/framework-font.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <link href=\"");
      out.print(path );
      out.write("/image/css/framework-login.css\" rel=\"stylesheet\" />\r\n");
      out.write("       <script src=\"");
      out.print(path );
      out.write("/image/js/jquery/jquery-2.1.1.min.js\"></script>\r\n");
      out.write("                          <script src=\"");
      out.print(path );
      out.write("/layer/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(path );
      out.write("/layer/layer.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("        function show()\r\n");
      out.write("        {\r\n");
      out.write("            layer.open({\r\n");
      out.write("                type: 2,\r\n");
      out.write("                title: '회원가입',\r\n");
      out.write("                shadeClose: true,\r\n");
      out.write("                shade: 0.8,\r\n");
      out.write("                area: ['550px', '380px'],\r\n");
      out.write("                content: 'reg.jsp'\r\n");
      out.write("            });     \r\n");
      out.write("\r\n");
      out.write("           \r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body  >    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\t<div class=\"wrapper\" style=\"height: 390px;\">\r\n");
      out.write("        <div class=\"container\" style=\"margin-top: -35px;\">\r\n");
      out.write("            <div class=\"logo\">\r\n");
      out.write("                <i class=\"fa fa-modx\"></i>\r\n");
      out.write("                <h1><span>주차공간 예약 시스템</span></h1>\r\n");
      out.write("            </div>\r\n");
      out.write("            <form name=\"from\" action=\"login\"   method=\"post\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <input name=\"txtUserName\" type=\"text\" id=\"txtUserName\" placeholder=\"ID\">\r\n");
      out.write("                    <i class=\"fa fa-user\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <input name=\"txtPassWord\" type=\"password\" id=\"txtPassWord\" placeholder=\"Password\">\r\n");
      out.write("                    <i class=\"fa fa-key\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("               \r\n");
      out.write("                  <div class=\"row\">\r\n");
      out.write("                                <select name=\"Role\" id=\"Role\" style='    height: 42px;  margin-bottom: 10px;  width: 300px;}'>\r\n");
      out.write("\t<option value=\"관리인\">관리인</option>\r\n");
      out.write("\t<option value=\"회원\">회원</option>\r\n");
      out.write("\r\n");
      out.write("</select>\r\n");
      out.write("                </div>\r\n");
      out.write("               \r\n");
      out.write("                \r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("                    <input type=\"submit\" name=\"login_button\" value=\"Login\" id=\"login_button\" class=\"button\" style=\" float:left; text-align:center; width:100px; margin-left: 30px; \">\r\n");
      out.write("                    \r\n");
      out.write("                    <input type=\"button\" name=\"login_button2\" value=\"Register\" onclick=\"show();\" class=\"button\" style=\"  text-align:center;width:100px; float:right;margin-right: 30px; \">\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("            <div class=\"login_tips\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <ul class=\"bg-bubbles\">\r\n");
      out.write("            <li></li>\r\n");
      out.write("            <li></li>\r\n");
      out.write("            <li></li>\r\n");
      out.write("            <li></li>\r\n");
      out.write("            <li></li>\r\n");
      out.write("            <li></li>\r\n");
      out.write("            <li></li>\r\n");
      out.write("            <li></li>\r\n");
      out.write("            <li></li>\r\n");
      out.write("            <li></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\t    <script type=\"text/javascript\">\r\n");
      out.write("        (function ($) {\r\n");
      out.write("      $('.wrapper').height($(window).height());\r\n");
      out.write("                    $(\".container\").css(\"margin-top\", ($(window).height() - $(\".container\").height()) / 2 - 50);\r\n");
      out.write("                    $(window).resize(function (e) {\r\n");
      out.write("                        $('.wrapper').height($(window).height());\r\n");
      out.write("                        $(\".container\").css(\"margin-top\", ($(window).height() - $(\".container\").height()) / 2 - 50);\r\n");
      out.write("                    });\r\n");
      out.write("        })(jQuery);\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
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
