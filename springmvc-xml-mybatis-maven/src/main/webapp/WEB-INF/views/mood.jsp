<%--
  Created by IntelliJ IDEA.
  User: kevinfeng
  Date: 2019-05-25
  Time: 15:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <title>Title</title>
    <link href="https://cdn.bootcss.com/twitter-bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div id="moods" class="container">
        <b>说说列表：</b><br>
        <c:forEach items="${moods}" var="mood">
            <div class="card" style="width: 18rem;">
                <div class="card-body">
                    <h5 class="card-title">${mood.userName}</h5>
                    <p class="card-text">${mood.content}</p>
                    <div class="row">
                        <div class="col-md-7">
                            <p class="card-text text-left">
                                <small class="text-muted">
                                    <fmt:formatDate value="${mood.publishTime}" pattern="yyyy-MM-dd HH:mm:ss" />
                                </small>
                            </p>
                        </div>
                        <div class="col-md-3">
                            <p class="card-text text-right">
                                <small class="text-muted">
                                    ${mood.praiseNum}
                                </small>
                            </p>
                        </div>
                        <div class="col-md-2">
                            <a id="praise" href="/book_library/mood/${mood.id}/praise?userId=${mood.userId}" class="card-text text-left">👍</a>
                        </div>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</body>
</html>
