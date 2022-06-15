package org.apache.jsp.admin.parks;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.db.conn;
import com.db.Pagination;
import java.sql.*;

public final class parks_005fManage2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                Parking lot search\r\n");
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
      out.write("/admin/parks/parks_Manage2.jsp\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("<strong> PARKING LOT:</strong><select name=\"se_pid\" style='width:150px' id=\"pidid\">\r\n");
      out.write("<option value=\"\">all</option>\r\n");

String p=request.getParameter("se_pid");
 conn cnpid=new conn();
 ResultSet rspid=cnpid.query("select  pid,pname from parks ");
 while (rspid.next()) {
 
 if(p!=null && p.equals(rspid.getString("pid"))){

      out.write("\r\n");
      out.write("<option value=\"");
      out.print( rspid.getString("pid") );
      out.write("\"  selected = \"selected\">");
      out.print(rspid.getString("pname"));
      out.write("</option>\r\n");
} else { 
      out.write("\r\n");
      out.write("<option value=\"");
      out.print( rspid.getString("pid") );
      out.write('"');
      out.write('>');
      out.print(rspid.getString("pname"));
      out.write("</option>\r\n");
}} 
      out.write("\r\n");
      out.write("</select>\r\n");
      out.write("<strong> address:</strong><input name=\"txt_address\" type=\"text\" id=\"txt_address\" style=\"width:150px;\" value=\"");
      out.print(request.getParameter("txt_address")==null?"":new String(request.getParameter("txt_address").getBytes("ISO8859_1"), "UTF-8") );
      out.write("\"  />\r\n");
      out.write("   <strong> Parking time begins:</strong><input name=\"txt_t1\" type=\"text\" id=\"txt_t1\" style=\"width:150px;\" class=\"Wdate\" onclick=\"WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',minDate:'%y-%M-%d'})\" value=\"");
      out.print(request.getParameter("txt_t1")==null?"":new String(request.getParameter("txt_t1").getBytes("ISO8859_1"), "UTF-8") );
      out.write("\"  />\r\n");
      out.write("     <strong> Finish:</strong><input name=\"txt_t2\" type=\"text\" id=\"txt_t2\" style=\"width:150px;\"  class=\"Wdate\" onclick=\"WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',minDate:'%y-%M-%d'})\"  value=\"");
      out.print(request.getParameter("txt_t2")==null?"":new String(request.getParameter("txt_t2").getBytes("ISO8859_1"), "UTF-8") );
      out.write("\"  />\r\n");
      out.write("         \r\n");
      out.write("       <input type=\"hidden\" name = \"flag\" value=\"1\"/>\r\n");
      out.write("                <input name=\"search\" type=\"submit\" border=\"0\" class=\"layui-layer-btn0 btn btn-primary\"\tvalue='Inquire' />\r\n");
      out.write("                </form>\r\n");
      out.write("\r\n");
      out.write("   </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("             <tr>\r\n");
      out.write("                <td align=\"center\">\r\n");
      out.write("                \r\n");
      out.write("                ");

                                     if( request.getParameter("flag")!=null )
{

                 
      out.write("\r\n");
      out.write("                 \r\n");
      out.write("             ");

                                  if( request.getParameter("flag")!=null && ( request.getParameter("txt_t1").length()==0 || request.getParameter("txt_t2").length()==0))
{
  
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<b style=\"color:red;\">Please set the parking time</b>\r\n");
      out.write("\r\n");
} else { 
      out.write("  \r\n");
      out.write("                 \r\n");
      out.write("                \r\n");
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
if(request.getParameter("se_pid")!=null)
{
 String pname= new String(request.getParameter("se_pid").getBytes("ISO8859_1"), "UTF-8");
where+=" and a.pid="+pname;
}

if(request.getParameter("txt_address")!=null)
{
 String pname= new String(request.getParameter("txt_address").getBytes("ISO8859_1"), "UTF-8");
where+=" and address like '%"+pname+"%' ";
}


conn cn=new conn();


ResultSet rs=cn.query("select count(*) from parks a where "+where);
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
 
rs=cn.query("select a.*,ifnull(null,tt) as tt from parks a left join (select pid,count(*) as tt from seat group by pid) b on a.pid=b.pid where "+where+" order by pid desc limit "+pageSize*(pageNow-1)+", "+pageSize);


      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<table cellspacing=\"0\" border=\"0\" style=\"width:100%;border-collapse:collapse;\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("    <th >Parking lot name</th>\r\n");
      out.write("    <th >photo</th>\r\n");
      out.write("    <th >price</th>\r\n");
      out.write("    <th >Contact information</th>\r\n");
      out.write("    <th >address</th>\r\n");
      out.write("       <th >number of parking spaces</th>\r\n");
      out.write("             <th >Number of spares</th>\r\n");
      out.write("\t\t\t<th scope=\"col\">operate</th>\t\t</tr>\r\n");
      out.write("\t\t");

while(rs.next()){

      out.write("\r\n");
      out.write("\t\t<tr align=\"center\" >\r\n");
      out.write("  \t\t\t<td>");
      out.print(rs.getString("pname") );
      out.write("</td>\r\n");
      out.write(" <td align=\"center\"><img alt=\"\" src=\"");
      out.print(path );
      out.write('/');
      out.write('/');
      out.print(rs.getString("pic") );
      out.write("\" width=\"80\"  height=\"80\" /></td>\r\n");
      out.write("  \t\t\t<td>");
      out.print(rs.getString("price") );
      out.write("</td>\r\n");
      out.write("  \t\t\t<td>");
      out.print(rs.getString("tel") );
      out.write("</td>\r\n");
      out.write("  \t\t\t<td>");
      out.print(rs.getString("address") );
      out.write("</td>\r\n");
      out.write("  \t\t\t\t<td>");
      out.print(rs.getString("tt") );
      out.write("</td>\r\n");
      out.write("  \t\t\t\t\r\n");
      out.write("  \t\t\t\t\t<td>");
 String pid=rs.getString("pid"); 
  					String tt=rs.getString("tt");
  					String s1=new String(request.getParameter("txt_t1").getBytes("ISO8859_1"), "UTF-8"); 
  					String s2=new String(request.getParameter("txt_t2").getBytes("ISO8859_1"), "UTF-8"); 
  					
  					ResultSet rs2 = cn.query("select count(*) as tt from orders where ( stime<='"+s1+"' and etime>='"+s1+"' or stime<='"+s2+"' and etime>='"+s2+"') and pid="+pid+" group by sid ");
				
				String temp="0";
				 if(rs2.next())
				 {
				 temp=rs2.getString("tt");
				 }
				
				
				int tt2= Integer.valueOf (tt)-Integer.valueOf(temp);
  					 
      out.write("\r\n");
      out.write("  \t\t\t\t\t ");
      out.print( tt2 );
      out.write("\r\n");
      out.write("  \t\t\t\t\t </td>\r\n");
      out.write("\t\t\t<td >\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");
 if(tt2>0){ 
      out.write("\r\n");
      out.write("           <a href=\"");
      out.print(path );
      out.write("/admin/parks/yy.jsp?id=");
      out.print(rs.getString("pid") );
      out.write("&s1=");
      out.print(s1 );
      out.write("&s2=");
      out.print(s2 );
      out.write("\">book now</a>&nbsp;\r\n");
      out.write("           ");
} else { 
      out.write("\r\n");
      out.write("           No vacancy\r\n");
      out.write("           ");
} 
      out.write("\r\n");
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
      out.write("                ");
} } 
      out.write("\r\n");
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
