<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Portfolio</title>

<!-- Bootstrap -->
<link rel="stylesheet" href="bootstrap-3.3.7/dist/css/bootstrap.css">
  <link href="css/toastr.css" rel="stylesheet"/>
<%--  <style type="text/css">
    *{ margin: 0; padding: 0; }
    body,html{ height: 100%;
      background-image: url("http://pic32.photophoto.cn/20140729/0008020903740129_b.jpg");
      background-position: center center;
      background-repeat: no-repeat;
      background-attachment: fixed;
      background-size: cover;
    }

  </style>--%>
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
      <a class="navbar-brand" href="StudentLogin.action">首页</a> </div>
    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="myInverseNavbar2">
      <ul class="nav navbar-nav navbar-right">
        <!--        <li><a href="#">Link</a></li>
        <li><a href="#">Link</a></li>
        <li><a href="#">Link</a></li>
        <li><a href="#">Link</a></li>-->
        <li class="dropdown"> <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false" aria-haspopup="true"><span id="username"> ${remarkPeople}</span><span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">个人信息</a></li>
            <li><a href="#">修改密码</a></li>
            <li><a href="#">个人笔记</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">退出系统</a></li>
          </ul>
        </li>
      </ul>
    </div>
    <!-- /.navbar-collapse --> 
  </div>
  <!-- /.container-fluid --> 
</nav>
<div class="container" >
  <hr>
  <div class="row">
    <div class="col-xs-6">
      <h1 id="kind">${activityInformation.activityKind}类</h1>

    </div>
    <!--      <div class="col-xs-6">
        <p class="text-right"><a href="">Download my Resume <span class="glyphicon glyphicon-download-alt" aria-hidden="true"></span></a></p>
      </div>--> 
  </div>
  <hr>
<%--  <div class="jumbotron"></div>--%>
  <div class="row">
    <div class="col-xs-12">
      <div class="media">
        <div class="media-left"> <a href="#"> <img class="media-object img-rounded" src="images/115X115.gif" alt="..."> </a> </div>
        <div class="media-body">
          <h2 class="media-heading" id="activityTitle" >${activityInformation.activityName}</h2>
          <span style="font-size: 18px">${activityInformation.activityContent}</span>
          <div class="row">
            <div class="col-lg-3">已加入人数：${activityInformation.activityPeopleRemainNum}</div>
            <div class="col-lg-3">总人数：${activityInformation.activityPeopleNum}</div>
          </div>
          <div class="row">
            <div class="col-lg-3">活动开始时间：${activityInformation.activityStartTime}</div>
            <div class="col-lg-3">活动结束时间：${activityInformation.activityEndTime}</div>
          </div>
          <div class="row">
            <div class="col-lg-10">
              <p class="text-right">发布人：${activityInformation.activityPeopleId}</p>
            </div>
            <div class="col-lg-2">
              <p class="text-right">发布时间：${activityInformation.activityTime}</p>
            </div>
          </div>
        </div>
      </div>
    </div>
    <!--      <div class="col-xs-5 well">
        <div class="row">
          <div class="col-lg-6">
            <h4><span class="glyphicon glyphicon-phone" aria-hidden="true"></span> : 123-456-7890</h4>
          </div>
          <div class="col-lg-6">
            <h4><span class="glyphicon glyphicon-envelope" aria-hidden="true"></span> : john@example.com</h4>
          </div>
        </div>
        <div class="row">
          <div class="col-lg-6">
            <h4><span class="glyphicon glyphicon-map-marker" aria-hidden="true"></span> : San Francisco, CA</h4>
          </div>
          <div class="col-lg-6">
            <h4><span class="glyphicon glyphicon-phone" aria-hidden="true"></span> : 123-456-7890</h4>
          </div>
        </div>
      </div>--> 
  </div>
  <hr>
  <div style="min-height: 200px">
    <div class="row">
      <div class="col-lg-2"> </div>
      <div class="col-lg-8">
        <div class="input-group">
          <input type="text" class="form-control" placeholder="此处输入评论" maxlength="50" id="remarkContent" oninput="zishu() ">
          <span class="input-group-btn">
          <button class="btn btn-default" type="button" onclick="remark()">发表评论</button>
          </span> </div>
        <!-- /input-group --> 
      </div>
      <p style="font-size: 3px">还可以输入<span id="zishu">50</span>字</p>
    </div>
    <div class="row">
      <div class="col-lg-2">
        <p class="text-right">活动评论：</p>
      </div>
    </div>
    <hr>
    <div class="row">
      <div class="col-lg-1"></div>
      <div class="col-lg-10" id="remark">
       <div class="well">
          <div class="row"> 沙发，赶紧来抢啊 </div>
          
        </div>
           <%--     <div class="well">
          <div class="row"> <span> guha0 </span>:<span>这个 活动超级有意思，楼主下 次继续 组织啊</span> </div>
         
              <p class="text-right">2017.5.11</p>
          
        </div>--%>
      </div>
    </div>
  </div>
</div>
<hr>
<footer class="text-center">
  <div class="container">
    <div class="row">
      <div class="col-xs-12">
        <p>Copyright © MyWebsite. All rights reserved.</p>
      </div>
    </div>
  </div>
<span id="iiid" style="visibility: hidden"> ${activityId}</span>
</footer>
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery-3.2.1.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="bootstrap-3.3.7/dist/js/bootstrap.js"></script>
<script src="js/joinremark.js"></script>
<script src="js/toastr.js"></script>
</body>
</html>
