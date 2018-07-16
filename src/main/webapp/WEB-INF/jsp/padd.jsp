<%--
  Created by IntelliJ IDEA.
  User: sea79
  Date: 2018/7/11
  Time: 15:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String appPath = request.getContextPath(); %>
<html>
<head>
    <title>增加</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 Shim 和 Respond.js 用于让 IE8 支持 HTML5元素和媒体查询 -->
    <!-- 注意： 如果通过 file://  引入 Respond.js 文件，则该文件无法起效果 -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    ADD
                </h1>
            </div>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <ul class="nav nav-tabs">
                <li><a href="<%=appPath%>/book/list">首页</a></li>
                <%--<li class="active"><a href="<%=appPath%>/book/detail/1003">图书具体信息</a></li>--%>
                <li class="disabled"><a href="#">信息</a></li>
            </ul>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    列表 <small>显示列表</small>
                </h1>
            </div>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <%--<form role="form-inline">--%>
                <%--<div class="form-group">--%>
                    <%--<label>编号</label>--%>
                    <%--<label>名称</label>--%>
                    <%--<label>数量</label>--%>
                    <%--<label>详情</label>--%>
                <%--</div>--%>
                <%--<div class="form-group">--%>
                    <%--<input class="form-control" id="id" type="text" placeholder="编号"/>--%>
                    <%--<input class="form-control" id="name"/>--%>
                    <%--<input class="form-control" id="number"/>--%>
                    <%--<input class="form-control" id="detail"/>--%>
                    <%--<button class="btn btn-blue btn-lg" id="btn_add" type="button">增加</button></a>--%>
                <%--</div>--%>
            <%--</form>--%>
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>编号</th>
                    <th>名字</th>
                    <th>数量</th>
                    <th>详情</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td><input placeholder="编号"  id="id"/></td>
                    <td><input placeholder="名字" id="name"/></td>
                    <td><input placeholder="数量"  id="number"/></td>
                    <td><input placeholder="详情"  id="detail"/></td>
                    <td><a href="#" id="a_add">增加</a></td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
    <%--<div class="row clearfix">--%>
        <%--<div class="col-md-12 column">--%>
            <%--<p>--%>
                <%--<em>《${requestScope.get('book').name}》</em><br>--%>
                <%--<i>${requestScope.get('book').detail}</i>--%>
            <%--</p>--%>
        <%--</div>--%>
    <%--</div>--%>
</div>

<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="https://code.jquery.com/jquery.js"></script>
<script>
    $(function () {
        $("#a_add").click(function () {
            alert("btn click!!!");
            $.ajax({
                url:"add",
                type:"GET",
                dataType:"json",
                contentType:"application/json;charset=UTF-8",
                data: {
                    id: $("#id").val(),
                    name: $("#name").val(),
                    number: $("#number").val(),
                    detail: $("#detail").val()
                },
                success:function (result) {
                    alert(result);
                },
                error:function () {
                    alert("error");
                }
            })
        })
    })
</script>
</body>
</html>
