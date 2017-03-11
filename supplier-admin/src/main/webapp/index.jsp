<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>

<!--头部-->
<jsp:include page="include/header.jsp" />


<body class="fixed-sidebar full-height-layout gray-bg" style="overflow:hidden">
<div id="wrapper">
    <!--左侧导航开始-->
    <jsp:include page="include/left.jsp" />
    <!--左侧导航结束-->
    <!--右侧部分开始-->
    <div id="page-wrapper" class="gray-bg dashbard-1">
        <jsp:include page="include/rightTop.jsp" />
        <div class="row J_mainContent" id="content-main">
            <iframe class="J_iframe" name="iframe0" width="100%" height="100%" src="index_v2.html?v=4.0" frameborder="0" data-id="index_v2.html" seamless></iframe>
        </div>
        <jsp:include page="include/footer.jsp" />
    </div>
    <!--右侧部分结束-->


</div>
<script type="text/javascript" src="${ctx}/resources/js/jquery.min.js?v=2.1.4"></script>
<script type="text/javascript" src="${ctx}/resources/js/bootstrap.min.js?v=3.3.5"></script>
<script type="text/javascript" src="${ctx}/resources/js/plugins/metisMenu/jquery.metisMenu.js"></script>
<script type="text/javascript" src="${ctx}/resources/js/plugins/slimscroll/jquery.slimscroll.min.js"></script>
<script type="text/javascript" src="${ctx}/resources/js/plugins/layer/layer.min.js"></script>
<script type="text/javascript" src="${ctx}/resources/js/hplus.min.js?v=4.0.0"></script>
<script type="text/javascript" src="${ctx}/resources/js/contabs.min.js"></script>
<script type="text/javascript" src="${ctx}/resources/js/plugins/pace/pace.min.js"></script>
</body>

</html>