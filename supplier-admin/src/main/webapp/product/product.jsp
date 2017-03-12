<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>商品管理</title>
    <link rel="shortcut icon" href="${ctx}/favicon.ico">
    <link href="${ctx}/resources/css/bootstrap.min.css?v=3.3.5" rel="stylesheet">
    <link href="${ctx}/resources/css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
    <link href="${ctx}/resources/css/plugins/bootstrap-table/bootstrap-table.min.css" rel="stylesheet">
    <link href="${ctx}/resources/css/animate.min.css" rel="stylesheet">
    <link href="${ctx}/resources/css/style.min.css?v=4.0.0" rel="stylesheet">
</head>

<body class="gray-bg">
<div class="row wrapper border-bottom white-bg page-heading">
    <div class="col-sm-4">
        <h2>商品管理</h2>
        <ol class="breadcrumb">
            <li>
                <a href="${ctx}/main.html">主页</a>
            </li>
            <li>
                <strong>商品列表</strong>
            </li>
        </ol>
    </div>
    <div class="col-sm-8">
        <div class="title-action">
            <a href="${ctx}/product/add.html" class="btn btn-primary">添加商品</a>
        </div>
    </div>
</div>

<div class="wrapper wrapper-content">
    <div class="row">
        <div class="col-sm-12 ">

            <table id="table" data-toggle="table"
                   data-url="${ctx}/product/list"
                   data-cache="false"
                   data-method="post"
                   data-pagination="true"
                   data-side-pagination="server"
                   data-page-list="[20]"
                   data-page-size="20"
                   data-query-params="queryParams"
                   data-response_handler="responseHandler"
                   data-mobile-responsive="true"
                   data-height="400"
                   data-icon-size="outline"
                   data-search="true">
                <thead>
                <tr>
                    <th data-field="id">名称</th>
                    <th data-field="name">商品编号</th>
                    <th data-field="price">销售价</th>
                    <th data-field="price">市场价</th>
                    <th data-field="price">分类</th>
                    <th data-field="price">库存量</th>
                    <th data-field="price">权重</th>
                    <th data-field="price">状态</th>
                    <th data-field="price">操作</th>
                </tr>
                </thead>
            </table>

        </div>
    </div>

</div>
<script src="${ctx}/resources/js/jquery.min.js?v=2.1.4"></script>
<script src="${ctx}/resources/js/bootstrap.min.js?v=3.3.5"></script>
<script src="${ctx}/resources/js/content.min.js?v=1.0.0"></script>
<script src="${ctx}/resources/js/plugins/bootstrap-table/bootstrap-table.min.js"></script>
<script src="${ctx}/resources/js/plugins/bootstrap-table/bootstrap-table-mobile.min.js"></script>
<script src="${ctx}/resources/js/plugins/bootstrap-table/locale/bootstrap-table-zh-CN.min.js"></script>
</body>

<script>

    function queryParams(params) {
        return {
            offset : params.offset,
            limit : params.limit
        };
    }

    function responseHandler(json){
        if (json.code == '200') {
            return {
                "total" : json.data.total,
                "rows" : json.data.rows
            }
        } else {
            return {
                "rows" : [],
                "tatal" : 0
            }
        }
    }



</script>

</html>
