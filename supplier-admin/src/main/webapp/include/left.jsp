<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<nav class="navbar-default navbar-static-side" role="navigation">
    <div class="nav-close"><i class="fa fa-times-circle"></i>
    </div>
    <div class="sidebar-collapse">
        <ul class="nav" id="side-menu">
            <li class="nav-header">
                <div class="dropdown profile-element">
                    <span><img alt="image" class="img-circle"
                               src="${pageContext.request.contextPath}/resources/img/profile_small.jpg"/></span>
                    <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                                <span class="clear">
                               <span class="block m-t-xs">
                                   <strong class="font-bold">
                                        <c:if test="${sessionScope.admin_user_session==null}">
                                            Admin
                                        </c:if>
                                        <c:if test="${sessionScope.admin_user_session!=null}">
                                            ${sessionScope.admin_user_session.adminNickname}
                                        </c:if>
                                   </strong>
                               </span>
                                <span class="text-muted text-xs block">管理员<b class="caret"></b></span>
                                </span>
                    </a>
                    <ul class="dropdown-menu animated fadeInRight m-t-xs">
                        <li><a class="J_menuItem" href="form_avatar.html">修改头像</a>
                        </li>
                        <li><a class="J_menuItem" href="profile.html">个人资料</a>
                        </li>
                        <li><a class="J_menuItem" href="contacts.html">联系我们</a>
                        </li>
                        <li><a class="J_menuItem" href="mailbox.html">信箱</a>
                        </li>
                        <li class="divider"></li>
                        <li><a href="login.html">安全退出</a>
                        </li>
                    </ul>
                </div>
                <div class="logo-element">S+
                </div>
            </li>
            <li>
                <a href="#">
                    <i class="fa fa-home"></i>
                    <span class="nav-label">主页</span>
                    <span class="fa arrow"></span>
                </a>
                <ul class="nav nav-second-level">
                    <li>
                        <a class="J_menuItem" href="${ctx}/main.html" data-index="0">仪表盘</a>
                    </li>
                </ul>

            </li>
            <li>
                <a href="#">
                    <i class="fa fa fa-shopping-cart"></i>
                    <span class="nav-label">商品管理</span>
                    <span class="fa arrow"></span>
                </a>
                <ul class="nav nav-second-level">
                    <li>
                        <a class="J_menuItem" href="${ctx}/product.html">商品列表</a>
                    </li>
                    <li>
                        <a class="J_menuItem" href="graph_flot.html">分类管理</a>
                    </li>
                </ul>
            </li>

            <li>
                <a href="#">
                    <i class="fa fa fa-users"></i>
                    <span class="nav-label">商家管理</span>
                    <span class="fa arrow"></span>
                </a>
                <ul class="nav nav-second-level">
                    <li>
                        <a class="J_menuItem" href="graph_echarts.html">商家列表</a>
                    </li>
                </ul>
            </li>

            <li>
                <a href="#">
                    <i class="fa fa fa-columns"></i>
                    <span class="nav-label">订单管理</span>
                    <span class="fa arrow"></span>
                </a>
                <ul class="nav nav-second-level">
                    <li>
                        <a class="J_menuItem" href="graph_echarts.html">订单列表</a>
                    </li>
                </ul>
            </li>


        </ul>
    </div>
</nav>