<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@ include file="/taglibs.jsp"%>
<%@ include file="/includeJsAndCss.jsp"%>
</head>
<body>
<!-- top navigation -->
        <div class="top_bar">
          <div class="top_menu">
<!--             <nav> -->
<!--               <div class="nav toggle"> -->
<!--                 <a id="menu_toggle"><i class="fa fa-bars"></i></a> -->
<!--               </div> -->

              <ul class="nav navbar-nav navbar-right">
                <li class="top_togglle top_li1" onclick="topf()">
                  <a href="javascript:;" class="top_a1" aria-expanded="false">
                    <img src="images/img.jpg" class="u_img" alt="">john doe
                    <span class=" fa fa-angle-down"></span>
                  </a>
                  <ul class="dropdown-menu dropdown-usermenu pull-right top_ul2">
                    <li><a> Profile</a></li>
                    <li>
                      <a>
                        <span class="badge bg-red pull-right">50%</span>
                        <span>Settings</span>
                      </a>
                    </li>
                    <li><a>Help</a></li>
                    <li><a><i class="fa fa-sign-out pull-right"></i> Log Out</a></li>
                  </ul>
                </li>

<!--                 <li role="presentation" class="dropdown"> -->
<!--                   <a href="javascript:;" class="dropdown-toggle info-number" data-toggle="dropdown" aria-expanded="false"> -->
<!--                     <i class="fa fa-envelope-o"></i> -->
<!--                     <span class="badge bg-green">6</span> -->
<!--                   </a> -->
<!--                   <ul id="menu1" class="dropdown-menu list-unstyled msg_list" role="menu"> -->
<!--                     <li> -->
<!--                       <a> -->
<!--                         <span class="image"><img src="images/img.jpg" alt="Profile Image" /></span> -->
<!--                         <span> -->
<!--                           <span>John Smith</span> -->
<!--                           <span class="time">3 mins ago</span> -->
<!--                         </span> -->
<!--                         <span class="message"> -->
<!--                           Film festivals used to be do-or-die moments for movie makers. They were where... -->
<!--                         </span> -->
<!--                       </a> -->
<!--                     </li> -->
<!--                     <li> -->
<!--                       <a> -->
<!--                         <span class="image"><img src="images/img.jpg" alt="Profile Image" /></span> -->
<!--                         <span> -->
<!--                           <span>John Smith</span> -->
<!--                           <span class="time">3 mins ago</span> -->
<!--                         </span> -->
<!--                         <span class="message"> -->
<!--                           Film festivals used to be do-or-die moments for movie makers. They were where... -->
<!--                         </span> -->
<!--                       </a> -->
<!--                     </li> -->
<!--                     <li> -->
<!--                       <a> -->
<!--                         <span class="image"><img src="images/img.jpg" alt="Profile Image" /></span> -->
<!--                         <span> -->
<!--                           <span>John Smith</span> -->
<!--                           <span class="time">3 mins ago</span> -->
<!--                         </span> -->
<!--                         <span class="message"> -->
<!--                           Film festivals used to be do-or-die moments for movie makers. They were where... -->
<!--                         </span> -->
<!--                       </a> -->
<!--                     </li> -->
<!--                     <li> -->
<!--                       <a> -->
<!--                         <span class="image"><img src="images/img.jpg" alt="Profile Image" /></span> -->
<!--                         <span> -->
<!--                           <span>John Smith</span> -->
<!--                           <span class="time">3 mins ago</span> -->
<!--                         </span> -->
<!--                         <span class="message"> -->
<!--                           Film festivals used to be do-or-die moments for movie makers. They were where... -->
<!--                         </span> -->
<!--                       </a> -->
<!--                     </li> -->
<!--                     <li> -->
<!--                       <div class="text-center"> -->
<!--                         <a> -->
<!--                           <strong>See All Alerts</strong> -->
<!--                           <i class="fa fa-angle-right"></i> -->
<!--                         </a> -->
<!--                       </div> -->
<!--                     </li> -->
<!--                   </ul> -->
<!--                 </li> -->
              </ul>
<!--             </nav> -->
          </div>
        </div>
        <!-- /top navigation -->
</body>
</html>