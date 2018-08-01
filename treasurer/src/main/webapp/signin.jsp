<!DOCTYPE html>
<html lang="en">
<head>
	<title>Login</title>
	<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<link href="layout/styles/layout.css" rel="stylesheet" type="text/css" media="all">
	<link rel="stylesheet" type="text/css" href="pages/signin/css/util.css">
	<link rel="stylesheet" type="text/css" href="pages/signin/css/main.css">
		<link rel="stylesheet" type="text/css" href="pages/signin/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="pages/signin/fonts/iconic/css/material-design-iconic-font.min.css">
</head>
<body id="top">

<!-- Top Background Image Wrapper -->
<div class="bgded overlay" style="background-image:url('images/background/bg.jpg');"> 
  <!-- ################################################################################################ -->
  <div class="wrapper row1">
    <header id="header" class="hoc clear"> 
      <!-- ################################################################################################ -->
      <div id="logo" class="fl_left">
        <h1><a href="index.jsp">Treasurer</a></h1>
      </div>
      <nav id="mainav" class="fl_right">
        <ul class="clear">
          <li><a href="index.jsp">Home</a></li>
          <li class="active"><a class="drop" href="#">User</a>
            <ul>
             
              <li ><a href="#">Sign up</a></li>
            </ul>
          </li>
          
          <li><a href="#">Play Game</a></li>
          
        </ul>
      </nav>
      <!-- ################################################################################################ -->
    </header>
  </div>
  
<!-- JAVASCRIPTS -->


	
	
	<div class="container-login100" style="background-image: url('pages/signin/images/treasurehunt.jpg');">
		<div class="wrap-login100 p-l-55 p-r-55 p-t-80 p-b-30">
			<form class="login100-form validate-form" action="j_security_check" method="POST">
				<span class="login100-form-title p-b-37">
					Sign In
				</span>
                 
				<div class="wrap-input100 validate-input m-b-20" data-validate="Enter username">
					<input class="input100" type="text" name="j_username" placeholder="username">
					<span class="focus-input100"></span>
				</div>

				<div class="wrap-input100 validate-input m-b-25" data-validate = "Enter password">
					<input class="input100" type="password" name="j_password" placeholder="password">
					<span class="focus-input100"></span>
				</div>

				<div class="container-login100-form-btn">
					<button class="login100-form-btn">
						Log In
					</button>
				</div>

			
				</div>
			</form>

			
		</div>
	</div>
	
	

	
<!--===============================================================================================-->
	<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
	<script src="layout/scripts/jquery.min.js"></script>
<script src="layout/scripts/jquery.backtotop.js"></script>
<script src="layout/scripts/jquery.mobilemenu.js"></script>
<!--===============================================================================================-->


<script src="js/main.js"></script>

</body>
</html>