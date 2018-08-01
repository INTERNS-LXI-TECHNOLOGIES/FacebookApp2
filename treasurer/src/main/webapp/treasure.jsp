<!DOCTYPE html>
<html>
<head>
<title>Treasurer</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<link href="layout/styles/layout.css" rel="stylesheet" type="text/css" media="all">
<link href="assets/css/extra.css" rel="stylesheet" type="text/css" media="all">

</head>
<body id="top">

<!-- Top Background Image Wrapper -->
<div class="bgded overlay" style="background-image:url('images/background/bg2.jpg');"> 
  <!-- ################################################################################################ -->
  <div class="wrapper row1">
    <header id="header" class="hoc clear"> 
      <!-- ################################################################################################ -->
      <div id="logo" class="fl_left">
        <h1><a href="index.jsp">Treasurer</a></h1>
      </div>
      <nav id="mainav" class="fl_right">
        <ul class="clear">
          <li class="active"><a href="index.jsp">Home</a></li>
          <li><a class="drop" href="#">User</a>
            <ul>
              <li><a href="game">Log In</a></li>
              <li><a href="signup.jsp">Sign up</a></li>
            </ul>
          </li>
          
          <li><a href="game">Play Game</a></li>
          
        </ul>
      </nav>
      <!-- ################################################################################################ -->
    </header>
  </div>
  <!-- ################################################################################################ -->
  <!-- ################################################################################################ -->
  <!-- ################################################################################################ -->
 
 <br /><center><img src="images/chest/tenor.gif" alt="Avatar" style="width:200px"></center>
 <div id="pageintro" class="hoc clear"> 

    <!-- ################################################################################################ -->
   <div class="sp-container">
	<div class="sp-content">
		<div class="sp-globe"></div>
		<%@ page import = "com.lxisoft.treasurer.controller.*"%>
		<%
		String username = (String)session.getAttribute("username");
		int score = (Integer)session.getAttribute("count");%>
		
		<h2 class="frame-1"><%out.print(username);%></h2>
		<h2 class="frame-2">your score is <%out.print(score);%></h2>

			<h2 class="frame-3"> 
			<span><button class="button button1">Play Again</button></span>
			</h2>
	</div>
</div>
    <!-- ################################################################################################ -->
  </div>
  <!-- ################################################################################################ -->
</div>


<!-- ################################################################################################ -->

  </div>
</div>
<!-- ################################################################################################ -->
<!-- ################################################################################################ -->
<!-- ################################################################################################ -->
<a id="backtotop" href="#top"><i class="fa fa-chevron-up"></i></a>
</body>
</html>