<%--
  Created by IntelliJ IDEA.
  User: qq370
  Date: 2019/4/15
  Time: 21:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Hello JavaEE</title>
    <script type="text/javascript">

      window.onload = function(){
        var btn = document.getElementById("btn");
        var div = document.getElementsByName("div");
        btn.onclick = function(){
          div.style.width=90;
          div.style.height=90;
          div.style.backgroundColor="#0f0";
        }
      }
    </script>
  </head>
  <body>
      <h1>Hello World ! ! !</h1>
      <div>你好</div>
      <button id="btn">hello</button>
  </body>
</html>
