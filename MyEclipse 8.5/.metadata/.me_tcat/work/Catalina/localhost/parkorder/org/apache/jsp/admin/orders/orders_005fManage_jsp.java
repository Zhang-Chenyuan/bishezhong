package org.apache.jsp.admin.orders;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.db.conn;
import com.db.Pagination;
import java.sql.*;

public final class orders_005fManage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script src=\"");
      out.print(path );
      out.write("/My97DatePicker/WdatePicker.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("<form >\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"rows\" style=\"margin-bottom: 1%; border: 1px solid #e6e6e6; overflow: hidden;  padding-left: 1px;\">\r\n");
      out.write("        <div class=\"panel panel-default\">\r\n");
      out.write("            <div class=\"panel-heading\">\r\n");
      out.write("               <i class=\"fa fa-thumbs-o-up fa-lg\" style=\"padding-right: 5px;\"></i>\r\n");
      out.write("                Manage parking space reservation information\r\n");
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
      out.write("/admin/orders/orders_Manage.jsp\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("<strong> Owned parking lot:</strong><select name=\"se_pid\" style='width:150px' id=\"pidid\">\r\n");
      out.write("<option value=\"\">all</option>\r\n");

 conn cnpid=new conn();
 ResultSet rspid=cnpid.query("select  pid,pname from parks ");
 while (rspid.next()) {

      out.write("\r\n");
      out.write("<option value=\" ");
      out.print( rspid.getString("pid") );
      out.write(' ');
      out.write('"');
      out.write('>');
      out.print(rspid.getString("pname"));
      out.write("</option>\r\n");
} 
      out.write("\r\n");
      out.write("</select>\r\n");
      out.write("<strong> Starting time:</strong><input name=\"txt_stime\" type=\"text\" id=\"txt_stime\" style=\"width:150px;\"   class=\"Wdate\" onclick=\"WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})\"   />\r\n");
      out.write("<strong>End Time:</strong><input name=\"txt_etime\" type=\"text\" id=\"txt_etime\" style=\"width:150px;\"  class=\"Wdate\" onclick=\"WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})\"    />\r\n");
      out.write("<strong> username:</strong><input name=\"txt_lname\" type=\"text\" id=\"txt_lname\" style=\"width:150px;\"  />\r\n");
      out.write("\r\n");
      out.write("                <input name=\"search\" type=\"submit\" border=\"0\" class=\"layui-layer-btn0 btn btn-primary\"\tvalue='Inquire' />\r\n");
      out.write("                </form>\r\n");
      out.write("\r\n");
      out.write("   </td>\r\n");
      out.write("            </tr>\r\n");
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

String where="  1=1 ";

if(request.getParameter("se_pid")!=null  && request.getParameter("se_pid")!="")
{
where+=" and a.pid="+request.getParameter("se_pid");
}

if(request.getParameter("txt_stime")!=null && request.getParameter("txt_stime").length()>0)
{
 String stime= new String(request.getParameter("txt_stime").getBytes("ISO8859_1"), "UTF-8");
where+=" and stime >='"+stime+"' ";
}

if(request.getParameter("txt_etime")!=null && request.getParameter("txt_etime").length()>0)
{
 String etime= new String(request.getParameter("txt_etime").getBytes("ISO8859_1"), "UTF-8");
where+=" and etime <= '"+etime+"' ";
}

if(request.getParameter("txt_lname")!=null)
{
 String lname= new String(request.getParameter("txt_lname").getBytes("ISO8859_1"), "UTF-8");
where+=" and a.lname like '%"+lname+"%' ";
}


conn cn=new conn();


ResultSet rs=cn.query("select count(*) from orders a where "+where);
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
 
rs=cn.query("select  a.*,b.pname,c.* from orders a  left join parks b on a.pid=b.pid left join member c on a.lname=c.lname  where "+where+" order by id desc limit "+pageSize*(pageNow-1)+", "+pageSize);


      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<table cellspacing=\"0\" border=\"0\" style=\"width:100%;border-collapse:collapse;\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("    <th >Owned parking lot</th>\r\n");
      out.write("    <th >parking space</th>\r\n");
      out.write("    <th >Starting time</th>\r\n");
      out.write("    <th >End Time</th>\r\n");
      out.write("    <th >username</th>\r\n");
      out.write("        <th >Name</th>\r\n");
      out.write("    <th >phone number</th>\r\n");
      out.write("    <th >Appointment</th>\r\n");
      out.write("\t\t\t<th scope=\"col\">operate</th>\t\t</tr>\r\n");
      out.write("\t\t");

while(rs.next()){

      out.write("\r\n");
      out.write("\t\t<tr align=\"center\" >\r\n");
      out.write(" \t\t\t<td>");
      out.print(rs.getString("pname") );
      out.write("</td>\r\n");
      out.write("  \t\t\t<td>");
      out.print(rs.getString("sid") );
      out.write("</td>\r\n");
      out.write("  \t\t\t<td>");
      out.print(rs.getString("stime") );
      out.write("</td>\r\n");
      out.write("  \t\t\t<td>");
      out.print(rs.getString("etime") );
      out.write("</td>\r\n");
      out.write("  \t\t\t<td>");
      out.print(rs.getString("lname") );
      out.write("</td>\r\n");
      out.write("  \t\t\t\t\t<td>");
      out.print(rs.getString("mname") );
      out.write("</td>\r\n");
      out.write("  \t\t\t<td>");
      out.print(rs.getString("tel") );
      out.write("</td>\r\n");
      out.write("  \t\t\t<td>");
      out.print(rs.getString("oitme") );
      out.write("</td>\r\n");
      out.write("\t\t\t<td >\r\n");
      out.write("           <a href=\"");
      out.print(path );
      out.write("/admin/orders/orders_Detail.jsp?id=");
      out.print(rs.getString("id") );
      out.write("\">detailed</a>&nbsp;\r\n");
      out.write("           <a href=\"");
      out.print(path );
      out.write("/orders_Delete?id=");
      out.print(rs.getString("id") );
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
