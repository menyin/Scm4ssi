<%--
  Created by IntelliJ IDEA.
  User: win7
  Date: 2018/3/16
  Time: 10:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
    <script src="/static/jquery.min.js"></script>
    <script>
        $(function () {
            $('#btn').click(function () {
                $.post('/account/page.do', {startIndex:1,size:4,keyword:'Admin'}, function (data) {
                    console.log(data);
                    debugger;
                });
            });
        });

    </script>
</head>
<body>
<input type="button" id="btn" value="确认">
${applicationScope.sysParam.subType}
<br>
测试系统参数
<c:forEach var="subtype" items="${applicationScope.sysParam.subType}" varStatus="status">
    <br> ${subtype.key}-----${subtype.value}
</c:forEach>
</body>
</html>
