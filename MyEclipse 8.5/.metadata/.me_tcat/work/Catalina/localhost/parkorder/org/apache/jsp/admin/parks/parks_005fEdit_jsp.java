package org.apache.jsp.admin.parks;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.db.conn;
import java.sql.*;

public final class parks_005fEdit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\t\t<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/popup_shuaxin_no.js\"></script>\r\n");
      out.write("\t<script language=\"javascript\">     \r\n");
      out.write("\t\t    \r\n");
      out.write("\t       function up2()\r\n");
      out.write("\t       {\r\n");
      out.write("\t\t        var pop=new Popup({ contentType:1,isReloadOnClose:false,width:400,height:200});\r\n");
      out.write("\t            pop.setContent(\"contentUrl\",\"");
      out.print(path);
      out.write("/upfile/upload1.jsp\");\r\n");
      out.write("\t            pop.setContent(\"title\",\"文件上传\");\r\n");
      out.write("\t            pop.build();\r\n");
      out.write("\t            pop.show();\r\n");
      out.write("\t       }\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basePath}/admin/head.jsp", java.lang.String.class, (PageContext)_jspx_page_context, null, false), out, true);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form  action=\"");
      out.print(path );
      out.write("/parks_Edit\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"rows\" style=\"margin-bottom: 1%; border: 1px solid #e6e6e6; overflow: hidden;  padding-left: 1px;\">\r\n");
      out.write("        <div class=\"panel panel-default\">\r\n");
      out.write("            <div class=\"panel-heading\">\r\n");
      out.write("               <i class=\"fa fa-thumbs-o-up fa-lg\" style=\"padding-right: 5px;\"></i>\r\n");
      out.write("                Edit parking lot information\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"panel-body\">\r\n");
      out.write("                \r\n");
      out.write("                <table style=\"width:100%;\"><tr><td align=\"center\">\r\n");
      out.write("                    \r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t  <table class=\"layui-table\" style=\"width:98%;margin-left:10px;\" align=\"center\">\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                        ");
 			conn cn=new conn();
    
     			String id = request.getParameter("id");
				String sql = "select * from parks where pid=" + id ;
				ResultSet rs = cn.query(sql);
				rs.next();
			
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td  style=\" text-align:right; width:20%;\"><font style='color:red'>*&nbsp;</font>Parking lot name:</td>\r\n");
      out.write("<td class=\"tbright\"><div style=\"display:inline;float:left;\">\r\n");
      out.write("<input name=\"txt_pname\" type=\"text\" id=\"txt_pname\" style=\"width: 200px; \" required  value='");
      out.print( rs.getString("pname") );
      out.write("' /></div>\r\n");
      out.write("</div> \r\n");
      out.write(" </td></tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td  style=\" text-align:right; width:20%;\"><font style='color:red'>*&nbsp;</font><span style=\"color: rgb(0, 0, 0); font-family: Roboto,RobotoDraft,Helvetica,Arial,sans-serif; font-size: medium; font-style: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-align: left; text-indent: 0px; text-transform: none; white-space: nowrap; widows: 2; word-spacing: 0px; background-color: rgb(241, 243, 244); display: inline ! important; float: none;\">photo</span>:</td>\r\n");
      out.write("<td class=\"tbright\"><div style=\"display:inline;float:left;\">\r\n");
      out.write("<img src='");
      out.print(path );
      out.write('/');
      out.print( rs.getString("pic") );
      out.write("' width=100 height=100><input type=\"text\" name=\"fujian\" id=\"fujian\" size=\"50\"  value='");
      out.print( rs.getString("pic") );
      out.write("' readonly=\"readonly\" />\r\n");
      out.write("<input type=\"button\" value=\"上传\" onclick=\"up2()\" />\r\n");
      out.write(" </td></tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td  style=\" text-align:right; width:20%;\"><font style='color:red'>*&nbsp;</font>price:</td>\r\n");
      out.write("<td class=\"tbright\"><div style=\"display:inline;float:left;\">\r\n");
      out.write("<input name=\"txt_price\" type=\"text\" id=\"txt_price\" style=\"width: 200px; \" required  value='");
      out.print( rs.getString("price") );
      out.write("' /></div>\r\n");
      out.write("</div> \r\n");
      out.write(" </td></tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td  style=\" text-align:right; width:20%;\"><font style='color:red'>*&nbsp;</font>Contact information:</td>\r\n");
      out.write("<td class=\"tbright\"><div style=\"display:inline;float:left;\">\r\n");
      out.write("<input name=\"txt_tel\" type=\"text\" id=\"txt_tel\" style=\"width: 200px; \" required  value='");
      out.print( rs.getString("tel") );
      out.write("' /></div>\r\n");
      out.write("</div> \r\n");
      out.write(" </td></tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td  style=\" text-align:right; width:20%;\"><font style='color:red'>*&nbsp;</font>address:</td>\r\n");
      out.write("<td class=\"tbright\"><div style=\"display:inline;float:left;\">\r\n");
      out.write("<input name=\"txt_address\" type=\"text\" id=\"txt_address\" style=\"width: 200px; \" required  value='");
      out.print( rs.getString("address") );
      out.write("' /></div>\r\n");
      out.write("</div> \r\n");
      out.write(" </td></tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td>&nbsp;</td>\r\n");
      out.write("        <td align=\"left\"><input name=\"id\" type=\"hidden\" id=\"id\" value='");
      out.print( request.getParameter("id") );
      out.write("'> \r\n");
      out.write("        <input type=\"submit\" name=\"btnAdd\" value=\"edit\" id=\"btnAdd\"  class=\"layui-layer-btn0 btn btn-primary\" />\r\n");
      out.write("    <input name=\"btnReturn\" type=\"button\" value=\"return\"  class=\"layui-layer-btn0 btn btn-primary\"  onclick=\"location.href='");
      out.print(path );
      out.write("/admin/parks/parks_Manage.jsp';\"  />\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");

				if (rs != null)
					rs.close();
				if (cn != null)
					cn.close();
			
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
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
