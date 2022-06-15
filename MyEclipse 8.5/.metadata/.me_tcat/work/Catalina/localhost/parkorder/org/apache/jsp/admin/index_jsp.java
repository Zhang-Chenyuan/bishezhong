package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.db.conn;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("  <head>\r\n");
      out.write(" \r\n");
      out.write("    <title>Parking Space Reservation System</title>\r\n");
      out.write("\t\r\n");
      out.write("\t    <link href=\"");
      out.print(path );
      out.write("/image/css/framework-font.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <script src=\"");
      out.print(path );
      out.write("/image/js/jquery/jquery-2.1.1.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(path );
      out.write("/image/js/bootstrap/bootstrap.js\"></script>\r\n");
      out.write("    <link href=\"");
      out.print(path );
      out.write("/image/js/bootstrap/bootstrap.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <script src=\"");
      out.print(path );
      out.write("/image/js/dialog/dialog.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(path );
      out.write("/image/js/cookie/jquery.cookie.js\"></script>\r\n");
      out.write("    <link href=\"");
      out.print(path );
      out.write("/image/css/framework-theme.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <script src=\"");
      out.print(path );
      out.write("/image/js/framework-ui.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(path );
      out.write("/image/js/framework-clientdata.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write(" \r\n");
      out.write("  <body style=\"overflow: hidden;\">\r\n");
      out.write("\r\n");
      out.write("   ");

 
		String lname=(String) session.getAttribute("adminLname");
		String role=(String) session.getAttribute("role");
  if(lname==null){ 
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" language=\"javascript\">\r\n");
      out.write("\t\talert(\"You are not logged in, please log in...\");\r\n");
      out.write("\t\twindow.document.location.href=\"");
      out.print(path );
      out.write("/login.jsp\";\r\n");
      out.write("\t</script>\t\r\n");
      out.write("  ");
} 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      <div id=\"ajax-loader\" style=\"cursor: progress; position: fixed; top: -50%; left: -50%; width: 200%; height: 200%; background: #fff; z-index: 10000; overflow: hidden;\">\r\n");
      out.write("        <img src=\"");
      out.print(path );
      out.write("/image/img/ajax-loader.gif\" style=\"position: absolute; top: 0; left: 0; right: 0; bottom: 0; margin: auto;\" />\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t            <div id=\"theme-wrapper\">\r\n");
      out.write("        <header class=\"navbar\" id=\"header-navbar\">\r\n");
      out.write("            <div class=\"container\" style=\"padding-right: 0px;\">\r\n");
      out.write("                <a href=\"#\" id=\"logo\" class=\"navbar-brand\">Parking Space Reservation System</a>\r\n");
      out.write("                <div class=\"clearfix\">\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"nav-no-collapse pull-right\" id=\"header-nav\">\r\n");
      out.write("                        <ul class=\"nav navbar-nav pull-right\">\r\n");
      out.write("                            \r\n");
      out.write("                            \r\n");
      out.write("                            \r\n");
      out.write("\r\n");
      out.write("                            \r\n");
      out.write("                            <li class=\"dropdown profile-dropdown\">\r\n");
      out.write("                                <a href=\"#\" class=\"dropdown\" data-toggle=\"dropdown\" aria-expanded=\"true\">\r\n");
      out.write("                                    <img src=\"");
      out.print(path );
      out.write("/image/img/samples/scarlet-159.png\" alt=\"\">\r\n");
      out.write("                                    <span class=\"hidden-xs\">");
      out.print( session.getAttribute("adminLname"));
      out.write("</span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <ul class=\"dropdown-menu pull-right\">\r\n");
      out.write("                                    <li><a class=\"menuItem\" data-id=\"userInfo\" href=\"");
      out.print(path );
      out.write("/admin/admin/pass.jsp\"><i class=\"fa fa-user\"></i>change Password</a></li>\r\n");
      out.write("                             \r\n");
      out.write("                                    <li class=\"divider\"></li>\r\n");
      out.write("                                    <li><a href=\"");
      out.print(path );
      out.write("/login.jsp\"><i class=\"ace-icon fa fa-power-off\"></i>Retreat safely</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("        <div id=\"page-wrapper\" class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div id=\"nav-col\">\r\n");
      out.write("                    <section id=\"col-left\" class=\"col-left-nano\">\r\n");
      out.write("                        <div id=\"col-left-inner\" class=\"col-left-nano-content\">\r\n");
      out.write("                            <div id=\"user-left-box\" class=\"clearfix hidden-sm hidden-xs dropdown profile2-dropdown\">\r\n");
      out.write("                                   <div class=\"text-center\">\r\n");
      out.write("                                <img alt=\"\" src=\"");
      out.print(path );
      out.write("/image/img/samples/scarlet-159.png\" />\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"user-box\">\r\n");
      out.write("                                     <div class=\"text-center\"> <span class=\"name\">\r\n");
      out.write("                                        ");
      out.print( session.getAttribute("role"));
      out.write(';');
      out.print( session.getAttribute("adminLname"));
      out.write("\r\n");
      out.write("                                    </span>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"collapse navbar-collapse navbar-ex1-collapse\" id=\"sidebar-nav\">\r\n");
      out.write("                                <ul class=\"nav nav-pills nav-stacked\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t   \r\n");
      out.write("   ");
 if(role.equals("administrator")){ 
      out.write("\r\n");
      out.write("          <li class=\"\">\r\n");
      out.write("                <a  href=\"#\" class=\"dropdown-toggle\"><i class=\"fa fa-tags\"></i><span>Member management</span></a>\r\n");
      out.write("                <ul class=\"submenu\" style=\"display: none; overflow: auto;\">\r\n");
      out.write("                     \t\t                    <li>\r\n");
      out.write("                        <a class=\"menuItem\" data-id=\"m2\" href=\"");
      out.print(path );
      out.write("/admin/member/member_Add.jsp\" data-index=\"2\">Add member information</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("\t\t                    <li>\r\n");
      out.write("                        <a class=\"menuItem\" data-id=\"m2\" href=\"");
      out.print(path );
      out.write("/admin/member/member_Manage.jsp\" data-index=\"2\">Manage member information</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("  \r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("          <li class=\"\">\r\n");
      out.write("                <a  href=\"#\" class=\"dropdown-toggle\"><i class=\"fa fa-tags\"></i><span>System announcement management</span></a>\r\n");
      out.write("                <ul class=\"submenu\" style=\"display: none; overflow: auto;\">\r\n");
      out.write("                     \t\t                    <li>\r\n");
      out.write("                        <a class=\"menuItem\" data-id=\"m2\" href=\"");
      out.print(path );
      out.write("/admin/notices/notices_Add.jsp\" data-index=\"2\">Add system announcement information</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("\t\t                    <li>\r\n");
      out.write("                        <a class=\"menuItem\" data-id=\"m2\" href=\"");
      out.print(path );
      out.write("/admin/notices/notices_Manage.jsp\" data-index=\"2\">Management system announcement information</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("  \r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("          <li class=\"\">\r\n");
      out.write("                <a  href=\"#\" class=\"dropdown-toggle\"><i class=\"fa fa-tags\"></i><span>Parking lot management</span></a>\r\n");
      out.write("                <ul class=\"submenu\" style=\"display: none; overflow: auto;\">\r\n");
      out.write("                     \t\t                    <li>\r\n");
      out.write("                        <a class=\"menuItem\" data-id=\"m2\" href=\"");
      out.print(path );
      out.write("/admin/parks/parks_Add.jsp\" data-index=\"2\">Add parking lot information</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("\t\t                    <li>\r\n");
      out.write("                        <a class=\"menuItem\" data-id=\"m2\" href=\"");
      out.print(path );
      out.write("/admin/parks/parks_Manage.jsp\" data-index=\"2\">Manage parking lot information</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("  \r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("          <li class=\"\">\r\n");
      out.write("                <a  href=\"#\" class=\"dropdown-toggle\"><i class=\"fa fa-tags\"></i><span>parking space management</span></a>\r\n");
      out.write("                <ul class=\"submenu\" style=\"display: none; overflow: auto;\">\r\n");
      out.write("                     \t\t                    <li>\r\n");
      out.write("                        <a class=\"menuItem\" data-id=\"m2\" href=\"");
      out.print(path );
      out.write("/admin/seat/seat_Add.jsp\" data-index=\"2\">Add parking space information</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("\t\t                    <li>\r\n");
      out.write("                        <a class=\"menuItem\" data-id=\"m2\" href=\"");
      out.print(path );
      out.write("/admin/seat/seat_Manage.jsp\" data-index=\"2\">Manage parking space information</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("  \r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("          <li class=\"\">\r\n");
      out.write("                <a  href=\"#\" class=\"dropdown-toggle\"><i class=\"fa fa-tags\"></i><span>Parking reservation management</span></a>\r\n");
      out.write("                <ul class=\"submenu\" style=\"display: none; overflow: auto;\">\r\n");
      out.write("                     \t\t\r\n");
      out.write("\t\t                    <li>\r\n");
      out.write("                        <a class=\"menuItem\" data-id=\"m2\" href=\"");
      out.print(path );
      out.write("/admin/orders/orders_Manage.jsp\" data-index=\"2\">Manage parking space reservation information</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("  \r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("       <li class=\"\">\r\n");
      out.write("                <a  href=\"#\" class=\"dropdown-toggle\"><i class=\"fa fa-tags\"></i><span>Message feedback management</span></a>\r\n");
      out.write("                <ul class=\"submenu\" style=\"display: none; overflow: auto;\">\r\n");
      out.write("                     \t\t\r\n");
      out.write("\t\t                    <li>\r\n");
      out.write("                        <a class=\"menuItem\" data-id=\"m2\" href=\"");
      out.print(path );
      out.write("/admin/asks/asks_Manage.jsp\" data-index=\"2\">Manage message feedback</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("  \r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("          <li class=\"\">\r\n");
      out.write("                <a  href=\"#\" class=\"dropdown-toggle\"><i class=\"fa fa-tags\"></i><span>System Management</span></a>\r\n");
      out.write("                <ul class=\"submenu\" style=\"display: none; overflow: auto;\">\r\n");
      out.write("                     \t\t                    <li>\r\n");
      out.write("                        <a class=\"menuItem\" data-id=\"m2\" href=\"");
      out.print(path );
      out.write("/admin/admin/pass.jsp\" data-index=\"2\">change Password</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("  \r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
} else { 
      out.write("\r\n");
      out.write("\r\n");
      out.write("         <li  class=\"open\">\r\n");
      out.write("                <a  href=\"#\" class=\"dropdown-toggle\"><i class=\"fa fa-tags\"></i><span>menu list</span></a>\r\n");
      out.write("                <ul class=\"submenu\"  style=\"overflow: auto; display: block; \">\r\n");
      out.write("                \r\n");
      out.write("                   <li>\r\n");
      out.write("                        <a class=\"menuItem\" data-id=\"m2\" href=\"");
      out.print(path );
      out.write("/admin/notices/notices_Manage2.jsp\" data-index=\"2\">system notification</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    \r\n");
      out.write("                          <li>\r\n");
      out.write("                        <a class=\"menuItem\" data-id=\"m2\" href=\"");
      out.print(path );
      out.write("/admin/parks/parks_Manage2.jsp\" data-index=\"2\">Parking lot search</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    \r\n");
      out.write("                      <li>\r\n");
      out.write("                        <a class=\"menuItem\" data-id=\"m2\" href=\"");
      out.print(path );
      out.write("/admin/orders/orders_Manage2.jsp\" data-index=\"2\">My parking space reservation</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("  \r\n");
      out.write("                                        <li>\r\n");
      out.write("                        <a class=\"menuItem\" data-id=\"m2\" href=\"");
      out.print(path );
      out.write("/admin/asks/asks_Add.jsp\" data-index=\"2\">feedback</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    \r\n");
      out.write("                        <li>\r\n");
      out.write("                        <a class=\"menuItem\" data-id=\"m2\" href=\"");
      out.print(path );
      out.write("/admin/member/Info.jsp\" data-index=\"2\">Modify Personal Information</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                     \t\t                    <li>\r\n");
      out.write("                        <a class=\"menuItem\" data-id=\"m2\" href=\"");
      out.print(path );
      out.write("/admin/admin/pass.jsp\" data-index=\"2\">change Password</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("  \r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
} 
      out.write("\r\n");
      out.write("\r\n");
      out.write("                             </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                                \r\n");
      out.write("                            </div>\r\n");
      out.write("                            \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </section>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"content-wrapper\">\r\n");
      out.write("                    <div class=\"content-tabs\">\r\n");
      out.write("                        <button class=\"roll-nav roll-left tabLeft\">\r\n");
      out.write("                            <i class=\"fa fa-backward\"></i>\r\n");
      out.write("                        </button>\r\n");
      out.write("                        <nav class=\"page-tabs menuTabs\">\r\n");
      out.write("                            <div class=\"page-tabs-content\" style=\"margin-left: 0px;\">\r\n");
      out.write("                                <a href=\"javascript:;\" class=\"menuTab active\" data-id=\"right.aspx\">Welcome Home</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </nav>\r\n");
      out.write("                        <button class=\"roll-nav roll-right tabRight\">\r\n");
      out.write("                            <i class=\"fa fa-forward\" style=\"margin-left: 3px;\"></i>\r\n");
      out.write("                        </button>\r\n");
      out.write("                        <div class=\"btn-group roll-nav roll-right\">\r\n");
      out.write("                            <button class=\"dropdown tabClose\" data-toggle=\"dropdown\">\r\n");
      out.write("                                页签操作<i class=\"fa fa-caret-down\" style=\"padding-left: 3px;\"></i>\r\n");
      out.write("                            </button>\r\n");
      out.write("                            <ul class=\"dropdown-menu dropdown-menu-right\">\r\n");
      out.write("                                <li><a class=\"tabReload\" href=\"javascript:void();\">refresh current</a></li>\r\n");
      out.write("                                <li><a class=\"tabCloseCurrent\" href=\"javascript:void();\">close current</a></li>\r\n");
      out.write("                                <li><a class=\"tabCloseAll\" href=\"javascript:void();\">close all</a></li>\r\n");
      out.write("                                <li><a class=\"tabCloseOther\" href=\"javascript:void();\">Everything else is closed</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <button class=\"roll-nav roll-right fullscreen\"><i class=\"fa fa-arrows-alt\"></i></button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"content-iframe\" style=\"background-color: #f9f9f9; overflow: hidden;\">\r\n");
      out.write("                        <div class=\"mainContent\" id=\"content-main\" style=\"margin: 10px; margin-bottom: 0px; padding: 0;\">\r\n");
      out.write("                            <iframe class=\"NFine_iframe\" width=\"100%\" height=\"100%\" src=\"right.jsp\" frameborder=\"0\" data-id=\"right.jsp\"></iframe>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"loadingPage\" style=\"display: none;\">\r\n");
      out.write("        <div class=\"loading-shade\"></div>\r\n");
      out.write("        <div class=\"loading-content\" onclick=\"$.loading(false)\">Loading data, please wait...</div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <script src=\"");
      out.print(path );
      out.write("/image/js/index.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(path );
      out.write("/image/js/indextab.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(path );
      out.write("/image/js/loading/pace.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
