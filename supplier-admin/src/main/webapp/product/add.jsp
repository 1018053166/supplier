<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>添加商品</title>
    <link rel="shortcut icon" href="${ctx}/favicon.ico">
    <link href="${ctx}/resources/css/bootstrap.min.css?v=3.3.5" rel="stylesheet">
    <link href="${ctx}/resources/css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
    <link href="${ctx}/resources/css/animate.min.css" rel="stylesheet">
    <link href="${ctx}/resources/css/plugins/summernote/summernote.css" rel="stylesheet">
    <link href="${ctx}/resources/css/plugins/summernote/summernote-bs3.css" rel="stylesheet">
    <link href="${ctx}/resources/css/style.min.css?v=4.0.0" rel="stylesheet">
</head>

<body>
<div class="row wrapper border-bottom white-bg page-heading">
    <div class="col-sm-4">
        <h2>标题</h2>
        <ol class="breadcrumb">
            <li>
                <a href="${ctx}/main.html">主页</a>
            </li>
            <li>
                <a href="${ctx}/main.html">商品列表</a>
            </li>
            <li>
                <strong>添加商品</strong>
            </li>
        </ol>
    </div>
    <div class="col-sm-8">
        <div class="title-action">
            <a href="javascript:history.back(-1);" class="btn btn-primary">返回上级</a>
        </div>
    </div>
</div>

<div class="wrapper wrapper-content">
    <div class="col-md-12">
        <div class="form-group">
            <label class="col-sm-3 control-label">商品编码：</label>
            <div class="col-sm-9">
                <input type="text" name="" class="form-control" placeholder="请输入商品编码"> <span
                    class="help-block m-b-none">说明文字</span>

            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-3 control-label">商品名称：</label>
            <div class="col-sm-9">
                <input type="text" name="" class="form-control" placeholder="请输入商品名称"> <span
                    class="help-block m-b-none">说明文字</span>

            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-3 control-label">商品描述：</label>
            <div class="col-sm-9">
                <input type="password" class="form-control" name="password" placeholder="商品描述">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-3 control-label">商品子标题：</label>
            <div class="col-sm-9">
                <input type="text" name="" class="form-control" placeholder="请输入商品子标题"> <span
                    class="help-block m-b-none">说明文字</span>

            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-3 control-label">商品分类：</label>
            <div class="col-sm-4">
                <select class="form-control" name=""></select>
            </div>
            <div class="col-sm-4">
                <select class="form-control" name=""></select>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-3 control-label">商品单位：</label>
            <div class="col-sm-4">
                <select class="form-control" name=""></select>
            </div>
        </div>
    </div>
</div>
<script src="${ctx}/resources/js/jquery.min.js?v=2.1.4"></script>
<script src="${ctx}/resources/js/bootstrap.min.js?v=3.3.5"></script>
<script src="${ctx}/resources/js/content.min.js?v=1.0.0"></script>
<script src="${ctx}/resources/js/jquery-ui-1.10.4.min.js"></script>
<script src="${ctx}/resources/js/plugins/beautifyhtml/beautifyhtml.js"></script>
</body>

</html>
