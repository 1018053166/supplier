<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>空白页</title>
    <link rel="shortcut icon" href="${ctx}/favicon.ico">
    <link href="${ctx}/resources/css/bootstrap.min.css?v=3.3.5" rel="stylesheet">
    <link href="${ctx}/resources/css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
    <link href="${ctx}/resources/css/animate.min.css" rel="stylesheet">
    <link href="${ctx}/resources/css/style.min.css?v=4.0.0" rel="stylesheet">
</head>

<body class="gray-bg">
<div class="row wrapper border-bottom white-bg page-heading">
    <div class="col-sm-4">
        <h2>标题</h2>
        <ol class="breadcrumb">
            <li>
                <a href="${ctx}/main.html">主页</a>
            </li>
            <li>
                <strong>包屑导航</strong>
            </li>
        </ol>
    </div>
    <div class="col-sm-8">
        <div class="title-action">
            <a href="empty_page.html" class="btn btn-primary">活动区域</a>
        </div>
    </div>
</div>

<div class="wrapper wrapper-content">
    <div class="row">
        <div class="col-sm-12">
            <div class="middle-box text-center animated fadeInRightBig">



            </div>
        </div>
    </div>
</div>
<script src="${ctx}/resources/js/jquery.min.js?v=2.1.4"></script>
<script src="${ctx}/resources/js/bootstrap.min.js?v=3.3.5"></script>
<script src="${ctx}/resources/js/content.min.js?v=1.0.0"></script>
</body>

</html>
