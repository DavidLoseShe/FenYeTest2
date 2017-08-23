<%--
  Created by IntelliJ IDEA.
  User: d
  Date: 2017/8/16
  Time: 18:41
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Bootstrap Real Estate Website Template</title>

    <!-- Bootstrap -->
    <link rel="stylesheet" href="bootstrap-3.3.7/dist/css/bootstrap.css">
    <link rel="stylesheet" href="css/style.css">
    <style type="text/css">
        *{ margin: 0; padding: 0; }
        body,html{ height: 100%;
            background-image: url("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1502379771162&di=2515ee3bcb7bab7c6e12b1cd3916c399&imgtype=0&src=http%3A%2F%2Fimg3.redocn.com%2Ftupian%2F20151106%2Fdansechouxiangduobianxingbeijingtupian_5263726.jpg");
            background-position: center center;
            background-repeat: no-repeat;
            background-attachment: fixed;
            background-size: cover;
        }
        .eee{
            border-style:none ;

        }
    </style>
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#myInverseNavbar2" aria-expanded="false"> <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
            <a class="navbar-brand" href="#">首页</a> </div>
        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="myInverseNavbar2">
            <ul class="nav navbar-nav navbar-right">
                <!--        <li><a href="#">Link</a></li>
                        <li><a href="#">Link</a></li>
                        <li><a href="#">Link</a></li>
                        -->
                <li><a href="Javascript: void(0)" onclick="Message()">消息 <span class="badge" id="MessageContent">0</span></a></li>
                <li class="dropdown"> <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false" aria-haspopup="true" id ="user"> ${stduent.studentName}<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="Javascript: void(0)" data-toggle="modal" data-target="#myModal" >个人信息</a></li>
                        <li><a href="#">修改密码</a></li>
                        <li><a href="#">个人发布活动</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="welcome.jsp" onclick="exitSystem()">退出系统</a></li>
                    </ul>
                </li>
            </ul>
        </div>
        <!-- /.navbar-collapse -->
    </div>
    <!-- /.container-fluid -->
</nav>

<hr>

<footer class="text-center">
    <div class="container">
        <div class="row">
            <div class="col-xs-12">
                <p>Copyright © MyWebsite. All rights reserved.</p>
            </div>
        </div>
    </div>
</footer>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery-3.2.1.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="bootstrap-3.3.7/dist/js/bootstrap.js"></script>
<script src="js/ActivityJs.js"></script>

</body>
</html>