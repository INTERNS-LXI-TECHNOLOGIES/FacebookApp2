<!DOCTYPE HTML>
<html>
	<head>
		<title>Playgame</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link rel="stylesheet" href="assets/css/main.css" />
		
		<style> 
#question {
    border-radius: 25px;
    background:#8B4513 ;
    padding: 20px; 
    width: 100%;
    height: 10%;    
}
#option {
    border-radius: 8px;
    background: #73AD21;
    padding: 20px; 
    width: 30%;
    height: 10%;    
}

* {
    box-sizing: border-box;
}

.column {
    float: left;
    width: 33.33%;
    padding: 5px;
}

.row::after {
    content: "";
    clear: both;
    display: table;
}
</style>
	</head>
	<body>

		<!-- Wrapper -->
			<div id="wrapper">

				<!-- Header -->
					<header id="header">
						<span class="avatar"><img src="images/chest/chest.gif" alt="" /></span>
						<!-- Enter the question inside h1 tag -->
						<h1 id="question"><strong>Question goes here</strong></h1>
						<!-- Enter the question inside h1 tag -->
						<br />
					</header>

				<!-- Main -->
					<section id="main">

						<!-- Thumbnails -->
							
								<div class="row">
										<div class="column">
									 
										<input type="image" src="images/chest/closed.png" alt="alarm" onmouseover="this.src='images/chest/alarm copy.png'" onmouseout="this.src='images/chest/closed.png'" style="width:100%" />
										<center> <h3 id="option">Alarm</h3></center></center>
									
									</div><div class="column">
									 
										<input type="image" src="images/chest/closed.png" alt="" onmouseover="this.src='images/chest/book shelf.png'" onmouseout="this.src='images/chest/closed.png'" style="width:100%" />
										<center> <h3 id="option">Shelf</h3></center>
									</div><div class="column">
								
									
										<input type="image" src="images/chest/closed.png" alt="" onmouseover="this.src='images/chest/candle.png'" onmouseout="this.src='images/chest/closed.png'" style="width:100%" />
										<center> <h3 id="option">Candle</h3></center>
									</div></div>
									<div class="row"><div class="column">
									
										<input type="image" src="images/chest/closed.png" alt="" onmouseover="this.src='images/chest/clock.png'" onmouseout="this.src='images/chest/closed.png'" style="width:100%" />
										<center> <h3 id="option">Clock</h3></center>
									</div><div class="column">
									
										<input type="image" src="images/chest/closed.png" alt="" onmouseover="this.src='images/chest/computer.png'" onmouseout="this.src='images/chest/closed.png'" style="width:100%" />
										<center> <h3 id="option">Computer</h3></center>
									</div><div class="column">
								
									
										<input type="image" src="images/chest/closed.png" alt="" onmouseover="this.src='images/chest/desk.png'" onmouseout="this.src='images/chest/closed.png'" style="width:100%" />
										<center> <h3 id="option">Desk</h3></center>
									</div></div>
									<div class="row"><div class="column">
									
										<input type="image" src="images/chest/closed.png" alt="" onmouseover="this.src='images/chest/dictionary.png'" onmouseout="this.src='images/chest/closed.png'" style="width:100%" />
										<center> <h3 id="option">Dictionary</h3></center>
									</div><div class="column">
										
									
										<input type="image" src="images/chest/closed.png" alt="" onmouseover="this.src='images/chest/dish.png'" onmouseout="this.src='images/chest/closed.png'" style="width:100%" />
										<center> <h3 id="option">Dish</h3></center>
									</div><div class="column">
									
										<input type="image" src="images/chest/closed.png" alt="" onmouseover="this.src='images/chest/door.png'" onmouseout="this.src='images/chest/closed.png'" style="width:100%" />
										<center> <h3 id="option">Door</h3></center>
									</div></div>
									<div class="row"><div class="column">
									
										<input type="image" src="images/chest/closed.png" alt="" onmouseover="this.src='images/chest/lamp.png'" onmouseout="this.src='images/chest/closed.png'" style="width:100%" />
										<center> <h3 id="option">Lamp</h3></center>
									</div><div class="column">
										
									
										<input type="image" src="images/chest/closed.png" alt="" onmouseover="this.src='images/chest/mirror.png'" onmouseout="this.src='images/chest/closed.png'" style="width:100%" />
										<center> <h3 id="option">Mirror</h3></center>
									</div><div class="column">
									
										<input type="image" src="images/chest/closed.png" alt="" onmouseover="this.src='images/chest/oven.png'" onmouseout="this.src='images/chest/closed.png'" style="width:100%" />
										<center> <h3 id="option">Oven</h3></center>
									</div></div>
									<div class="row"><div class="column">
									
									
										<input type="image" src="images/chest/closed.png" alt="" onmouseover="this.src='images/chest/pantry.png'" onmouseout="this.src='images/chest/closed.png'" style="width:100%" />
										<center> <h3 id="option">Pantry</h3></center>
									</div><div class="column">
									
										<input type="image" src="images/chest/closed.png" alt="" onmouseover="this.src='images/chest/paper.png'" onmouseout="this.src='images/chest/closed.png'" style="width:100%" />
										<center> <h3 id="option">Paper</h3></center>
									</div><div class="column">
									
										<input type="image" src="images/chest/closed.png" alt="" onmouseover="this.src='images/chest/pillow.png'" onmouseout="this.src='images/chest/closed.png'" style="width:100%" />
										<center> <h3 id="option">Pillow</h3></center>
									</div></div>
									<div class="row"><div class="column">
									
									
										<input type="image" src="images/chest/closed.png" alt="" onmouseover="this.src='images/chest/potato.png'" onmouseout="this.src='images/chest/closed.png'" style="width:100%" />
										<center> <h3 id="option">Potato</h3></center>
									</div><div class="column">
									
										<input type="image" src="images/chest/closed.png" alt="" onmouseover="this.src='images/chest/refrigerator.png'" onmouseout="this.src='images/chest/closed.png'" style="width:100%" />
										<center> <h3 id="option">Refrigerator</h3></center>
									</div><div class="column">
									
									
										<input type="image" src="images/chest/closed.png" alt="" onmouseover="this.src='images/chest/shower.png'" onmouseout="this.src='images/chest/closed.png'" style="width:100%" />
										<center> <h3 id="option">Shower</h3></center>
									</div></div>
									<div class="row"><div class="column">
									
										<input type="image" src="images/chest/closed.png" alt="" onmouseover="this.src='images/chest/stairs.png'" onmouseout="this.src='images/chest/closed.png'" style="width:100%" />
										<center> <h3 id="option">Stairs</h3></center>
									</div><div class="column">
									
										<input type="image" src="images/chest/closed.png" alt="" onmouseover="this.src='images/chest/stove.png'" onmouseout="this.src='images/chest/closed.png'" style="width:100%" />
										<center> <h3 id="option">Stove</h3></center>
									</div><div class="column">
									
									
										<input type="image" src="images/chest/closed.png" alt="" onmouseover="this.src='images/chest/television.png'" onmouseout="this.src='images/chest/closed.png'" style="width:100%" />
										<center> <h3 id="option">Televison</h3></center>
									</div></div>
									<div class="row"><div class="column">
									
										<input type="image" src="images/chest/closed.png" alt="" onmouseover="this.src='images/chest/toaster.png'" onmouseout="this.src='images/chest/closed.png'" style="width:100%" />
										<center> <h3 id="option">Toaster</h3></center>
									</div><div class="column">
									
									
										<input type="image" src="images/chest/closed.png" alt="" onmouseover="this.src='images/chest/towel.png'" onmouseout="this.src='images/chest/closed.png'" style="width:100%" />
										<center> <h3 id="option">Towel</h3></center>
									</div><div class="column">
									
										<input type="image" src="images/chest/closed.png" alt="" onmouseover="this.src='images/chest/washer.png'" onmouseout="this.src='images/chest/closed.png'" style="width:100%" />
										<center> <h3 id="option">Washer</h3></center>
									</div></div>
									
									
								
							</section>

					

				
			</div>
		

	</body>
	

</html>