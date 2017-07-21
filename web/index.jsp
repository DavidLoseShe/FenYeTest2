<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html><%--
  Created by IntelliJ IDEA.
  User: d
  Date: 2017/7/12
  Time: 21:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
       <title>ttttt</title>
       <link rel="stylesheet" href="bootstrap-3.3.7/dist/css/bootstrap.css">
       <script src="js/jquery-3.2.1.js"></script>
       <script  src="bootstrap-3.3.7/dist/js/bootstrap.js"></script>
        <script src="js/ActivityJs.js"></script>
  </head>
  <body>
  <div align="center" style="width: 400px;height: 600px">
      <div id = "content">
          <s:iterator value="activityInformations" id="activity">
              <tr >
                  <td><s:property value="activityId" /></td>
                  <td><s:property value="activityContent"/></td>
              </tr><br>
          </s:iterator>
      </div>
     <ul class="pager">
         <li ><a href="#" id="firstPage">首页</a> </li>
         <li ><a href="#" id="previousPage" style="visibility: hidden">上一页</a></li>
         第<span id="pageNo">1</span>页 &nbsp;&nbsp;共<span id="pageCount">${page}</span>页
         <li ><a href="#" id="nextPage">下一页</a> </li>
         <li ><a href="#" id="finalPage">尾页</a> </li>
     </ul>
  </div>
  </body>
</html>
