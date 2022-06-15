<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.db.conn"%>
<%@ page import="java.sql.*"%>
<%
	String path = request.getContextPath();
%>



<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
 
    <title>Parking Space Reservation System</title>
	
	    <link href="<%=path %>/image/css/framework-font.css" rel="stylesheet" />
    <script src="<%=path %>/image/js/jquery/jquery-2.1.1.min.js"></script>
    <script src="<%=path %>/image/js/bootstrap/bootstrap.js"></script>
    <link href="<%=path %>/image/js/bootstrap/bootstrap.min.css" rel="stylesheet" />
    <script src="<%=path %>/image/js/dialog/dialog.js"></script>
    <script src="<%=path %>/image/js/cookie/jquery.cookie.js"></script>
    <link href="<%=path %>/image/css/framework-theme.css" rel="stylesheet" />
    <script src="<%=path %>/image/js/framework-ui.js"></script>
    <script src="<%=path %>/image/js/framework-clientdata.js"></script>

  </head>
 
  <body style="overflow: hidden;">

   <%
 
		String lname=(String) session.getAttribute("adminLname");
		String role=(String) session.getAttribute("role");
  if(lname==null){ %>
<script type="text/javascript" language="javascript">
		alert("You are not logged in, please log in...");
		window.document.location.href="<%=path %>/login.jsp";
	</script>	
  <%} %>



      <div id="ajax-loader" style="cursor: progress; position: fixed; top: -50%; left: -50%; width: 200%; height: 200%; background: #fff; z-index: 10000; overflow: hidden;">
        <img src="<%=path %>/image/img/ajax-loader.gif" style="position: absolute; top: 0; left: 0; right: 0; bottom: 0; margin: auto;" />
    </div>


	            <div id="theme-wrapper">
        <header class="navbar" id="header-navbar">
            <div class="container" style="padding-right: 0px;">
                <a href="#" id="logo" class="navbar-brand">Parking Space Reservation System</a>
                <div class="clearfix">
                    
                    <div class="nav-no-collapse pull-right" id="header-nav">
                        <ul class="nav navbar-nav pull-right">
                            
                            
                            

                            
                            <li class="dropdown profile-dropdown">
                                <a href="#" class="dropdown" data-toggle="dropdown" aria-expanded="true">
                                    <img src="<%=path %>/image/img/samples/scarlet-159.png" alt="">
                                    <span class="hidden-xs"><%= session.getAttribute("adminLname")%></span>
                                </a>
                                <ul class="dropdown-menu pull-right">
                                    <li><a class="menuItem" data-id="userInfo" href="<%=path %>/admin/admin/pass.jsp"><i class="fa fa-user"></i>change Password</a></li>
                             
                                    <li class="divider"></li>
                                    <li><a href="<%=path %>/login.jsp"><i class="ace-icon fa fa-power-off"></i>Retreat safely</a></li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </header>
        <div id="page-wrapper" class="container">
            <div class="row">
                <div id="nav-col">
                    <section id="col-left" class="col-left-nano">
                        <div id="col-left-inner" class="col-left-nano-content">
                            <div id="user-left-box" class="clearfix hidden-sm hidden-xs dropdown profile2-dropdown">
                                   <div class="text-center">
                                <img alt="" src="<%=path %>/image/img/samples/scarlet-159.png" />
                                </div>
                                <div class="user-box">
                                     <div class="text-center"> <span class="name">
                                        <%= session.getAttribute("role")%>;<%= session.getAttribute("adminLname")%>
                                    </span>
                                    </div>
                                </div>

                                <div class="collapse navbar-collapse navbar-ex1-collapse" id="sidebar-nav">
                                <ul class="nav nav-pills nav-stacked">

				
							   
   <% if(role.equals("administrator")){ %>
          <li class="">
                <a  href="#" class="dropdown-toggle"><i class="fa fa-tags"></i><span>Member management</span></a>
                <ul class="submenu" style="display: none; overflow: auto;">
                     		                    <li>
                        <a class="menuItem" data-id="m2" href="<%=path %>/admin/member/member_Add.jsp" data-index="2">Add member information</a>
                    </li>
		                    <li>
                        <a class="menuItem" data-id="m2" href="<%=path %>/admin/member/member_Manage.jsp" data-index="2">Manage member information</a>
                    </li>
  
                </ul>
            </li>



          <li class="">
                <a  href="#" class="dropdown-toggle"><i class="fa fa-tags"></i><span>System announcement management</span></a>
                <ul class="submenu" style="display: none; overflow: auto;">
                     		                    <li>
                        <a class="menuItem" data-id="m2" href="<%=path %>/admin/notices/notices_Add.jsp" data-index="2">Add system announcement information</a>
                    </li>
		                    <li>
                        <a class="menuItem" data-id="m2" href="<%=path %>/admin/notices/notices_Manage.jsp" data-index="2">Management system announcement information</a>
                    </li>
  
                </ul>
            </li>



          <li class="">
                <a  href="#" class="dropdown-toggle"><i class="fa fa-tags"></i><span>Parking lot management</span></a>
                <ul class="submenu" style="display: none; overflow: auto;">
                     		                    <li>
                        <a class="menuItem" data-id="m2" href="<%=path %>/admin/parks/parks_Add.jsp" data-index="2">Add parking lot information</a>
                    </li>
		                    <li>
                        <a class="menuItem" data-id="m2" href="<%=path %>/admin/parks/parks_Manage.jsp" data-index="2">Manage parking lot information</a>
                    </li>
  
                </ul>
            </li>


          <li class="">
                <a  href="#" class="dropdown-toggle"><i class="fa fa-tags"></i><span>parking space management</span></a>
                <ul class="submenu" style="display: none; overflow: auto;">
                     		                    <li>
                        <a class="menuItem" data-id="m2" href="<%=path %>/admin/seat/seat_Add.jsp" data-index="2">Add parking space information</a>
                    </li>
		                    <li>
                        <a class="menuItem" data-id="m2" href="<%=path %>/admin/seat/seat_Manage.jsp" data-index="2">Manage parking space information</a>
                    </li>
  
                </ul>
            </li>


   

          <li class="">
                <a  href="#" class="dropdown-toggle"><i class="fa fa-tags"></i><span>Parking reservation management</span></a>
                <ul class="submenu" style="display: none; overflow: auto;">
                     		
		                    <li>
                        <a class="menuItem" data-id="m2" href="<%=path %>/admin/orders/orders_Manage.jsp" data-index="2">Manage parking space reservation information</a>
                    </li>
  
                </ul>
            </li>

       <li class="">
                <a  href="#" class="dropdown-toggle"><i class="fa fa-tags"></i><span>Message feedback management</span></a>
                <ul class="submenu" style="display: none; overflow: auto;">
                     		
		                    <li>
                        <a class="menuItem" data-id="m2" href="<%=path %>/admin/asks/asks_Manage.jsp" data-index="2">Manage message feedback</a>
                    </li>
  
                </ul>
            </li>


          <li class="">
                <a  href="#" class="dropdown-toggle"><i class="fa fa-tags"></i><span>System Management</span></a>
                <ul class="submenu" style="display: none; overflow: auto;">
                     		                    <li>
                        <a class="menuItem" data-id="m2" href="<%=path %>/admin/admin/pass.jsp" data-index="2">change Password</a>
                    </li>
  
                </ul>
            </li>


<%} else { %>

         <li  class="open">
                <a  href="#" class="dropdown-toggle"><i class="fa fa-tags"></i><span>menu list</span></a>
                <ul class="submenu"  style="overflow: auto; display: block; ">
                
                   <li>
                        <a class="menuItem" data-id="m2" href="<%=path %>/admin/notices/notices_Manage2.jsp" data-index="2">system notification</a>
                    </li>
                    
                          <li>
                        <a class="menuItem" data-id="m2" href="<%=path %>/admin/parks/parks_Manage2.jsp" data-index="2">Parking lot search</a>
                    </li>
                    
                      <li>
                        <a class="menuItem" data-id="m2" href="<%=path %>/admin/orders/orders_Manage2.jsp" data-index="2">My parking space reservation</a>
                    </li>
  
                                        <li>
                        <a class="menuItem" data-id="m2" href="<%=path %>/admin/asks/asks_Add.jsp" data-index="2">feedback</a>
                    </li>
                    
                        <li>
                        <a class="menuItem" data-id="m2" href="<%=path %>/admin/member/Info.jsp" data-index="2">Modify Personal Information</a>
                    </li>
                     		                    <li>
                        <a class="menuItem" data-id="m2" href="<%=path %>/admin/admin/pass.jsp" data-index="2">change Password</a>
                    </li>
  
                </ul>
            </li>


<%} %>

                             </ul>
                            </div>
                                
                            </div>
                            
                        </div>
                    </section>
                </div>
                <div id="content-wrapper">
                    <div class="content-tabs">
                        <button class="roll-nav roll-left tabLeft">
                            <i class="fa fa-backward"></i>
                        </button>
                        <nav class="page-tabs menuTabs">
                            <div class="page-tabs-content" style="margin-left: 0px;">
                                <a href="javascript:;" class="menuTab active" data-id="right.aspx">Welcome Home</a>
                            </div>
                        </nav>
                        <button class="roll-nav roll-right tabRight">
                            <i class="fa fa-forward" style="margin-left: 3px;"></i>
                        </button>
                        <div class="btn-group roll-nav roll-right">
                            <button class="dropdown tabClose" data-toggle="dropdown">
                                页签操作<i class="fa fa-caret-down" style="padding-left: 3px;"></i>
                            </button>
                            <ul class="dropdown-menu dropdown-menu-right">
                                <li><a class="tabReload" href="javascript:void();">refresh current</a></li>
                                <li><a class="tabCloseCurrent" href="javascript:void();">close current</a></li>
                                <li><a class="tabCloseAll" href="javascript:void();">close all</a></li>
                                <li><a class="tabCloseOther" href="javascript:void();">Everything else is closed</a></li>
                            </ul>
                        </div>
                        <button class="roll-nav roll-right fullscreen"><i class="fa fa-arrows-alt"></i></button>
                    </div>
                    <div class="content-iframe" style="background-color: #f9f9f9; overflow: hidden;">
                        <div class="mainContent" id="content-main" style="margin: 10px; margin-bottom: 0px; padding: 0;">
                            <iframe class="NFine_iframe" width="100%" height="100%" src="right.jsp" frameborder="0" data-id="right.jsp"></iframe>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div id="loadingPage" style="display: none;">
        <div class="loading-shade"></div>
        <div class="loading-content" onclick="$.loading(false)">Loading data, please wait...</div>
    </div>
    <script src="<%=path %>/image/js/index.js"></script>
    <script src="<%=path %>/image/js/indextab.js"></script>
    <script src="<%=path %>/image/js/loading/pace.min.js"></script>



  </body>
</html>

