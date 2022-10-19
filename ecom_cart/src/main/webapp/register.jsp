<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE HTML>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="pragma" content="no-cache" />
<meta http-equiv="cache-control" content="max-age=604800" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title>Yashi.in | One of the Biggest Online Shopping Platform</title>

<link href="images/favicon.ico" rel="shortcut icon" type="image/x-icon">
<style type="text/css">
.d-flex input {
	color: #00009e;
}

.d-flex .form-control {
	color: #00009e;
}

/* The message box is shown when the user clicks on the password field */
#message {
	display: none;
}

/* Add a green text color and a checkmark when the requirements are right */
.valid {
	color: green;
}

.valid:before {
	position: relative;
}

/* Add a red text color and an "x" when the requirements are wrong */
.invalid {
	color: red;
}

.invalid:before {
	position: relative;
}
</style>


<!-- jQuery -->
<script src="js/jquery-2.0.0.min.js" type="text/javascript"></script>

<!-- Bootstrap4 files-->
<script src="js/bootstrap.bundle.min.js" type="text/javascript"></script>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" />

<!-- Font awesome 5 -->
<link href="fonts/fontawesome/css/all.min.css" type="text/css"
	rel="stylesheet">

<!-- custom style -->
<link href="css/ui.css" rel="stylesheet" type="text/css" />
<link href="css/responsive.css" rel="stylesheet"
	media="only screen and (max-width: 1200px)" />

<!-- custom javascript -->
<script src="js/script.js" type="text/javascript"></script>

<script type="text/javascript">
	/// some script

	// jquery ready start
	$(document).ready(function() {
		// jQuery code

	});
	// jquery end
</script>

</head>
<body>


	<header class="section-header">
		<nav class="navbar p-md-0 navbar-expand-sm navbar-light border-bottom">
			<div class="container">
				<button class="navbar-toggler" type="button" data-toggle="collapse"
					data-target="#navbarTop4" aria-controls="navbarNav"
					aria-expanded="false" aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarTop4">
					<ul class="navbar-nav mr-auto">
						<li class="nav-item dropdown"><a href="#"
							class="nav-link dropdown-toggle" data-toggle="dropdown">
								Language </a>
							<ul class="dropdown-menu small">
								<li><a class="dropdown-item" href="#">English</a></li>
								<li><a class="dropdown-item" href="#">Arabic</a></li>
								<li><a class="dropdown-item" href="#">Russian </a></li>
							</ul></li>
						<li class="nav-item dropdown"><a href="#"
							class="nav-link dropdown-toggle" data-toggle="dropdown"> INR
						</a>
							<ul class="dropdown-menu small">
								<li><a class="dropdown-item" href="#">EUR</a></li>
								<li><a class="dropdown-item" href="#">USD</a></li>
								<li><a class="dropdown-item" href="#">RUBL </a></li>
							</ul></li>
					</ul>
					<ul class="navbar-nav">
						<li><a href="#" class="nav-link"> <i
								class="fa fa-envelope"></i> Email
						</a></li>
						<li><a href="#" class="nav-link"> <i class="fa fa-phone"></i>
								Call us
						</a></li>
					</ul>
					<!-- list-inline //  -->
				</div>
				<!-- navbar-collapse .// -->
			</div>
			<!-- container //  -->
		</nav>

		<section class="header-main border-bottom">
			<div class="container">
				<div class="row align-items-center">
					<div class="col-lg-2 col-md-3 col-6">
						<a href="./" class="brand-wrap"> <img class="logo"
							src="./images/logo2.png">
						</a>
						<!-- brand-wrap.// -->
					</div>
					<div class="col-lg col-sm col-md col-6 flex-grow-0">
						<div class="category-wrap dropdown d-inline-block float-right">
							<button type="button" class="btn btn-primary dropdown-toggle"
								data-toggle="dropdown">
								<i class="fa fa-bars"></i> All category
							</button>
							<div class="dropdown-menu">
								<a class="dropdown-item" href="#">Machinery / Mechanical
									Parts / Tools </a> <a class="dropdown-item" href="#">Consumer
									Electronics / Home Appliances </a> <a class="dropdown-item"
									href="#">Auto / Transportation</a> <a class="dropdown-item"
									href="#">Apparel / Textiles / Timepieces </a> <a
									class="dropdown-item" href="#">Home & Garden / Construction
									/ Lights </a> <a class="dropdown-item" href="#">Beauty &
									Personal Care / Health </a>
							</div>
						</div>
						<!-- category-wrap.// -->
					</div>
					<!-- col.// -->
					<a href="./store.jsp" class="btn btn-outline-primary">Store</a>
					<div class="col-lg  col-md-6 col-sm-12 col">
						<form action="#" class="search">
							<div class="input-group w-100">
								<input type="text" class="form-control" style="width: 60%;"
									placeholder="Search">

								<div class="input-group-append">
									<button class="btn btn-primary" type="submit">
										<i class="fa fa-search"></i>
									</button>
								</div>
							</div>
						</form>
						<!-- search-wrap .end// -->
					</div>
					<!-- col.// -->
					<div class="col-lg-3 col-sm-6 col-8 order-2 order-lg-3">
						<div class="d-flex justify-content-end mb-3 mb-lg-0">
							<div class="widget-header">
								<small class="title text-muted">Welcome guest!</small>
								<div>
									<a href="./signin.jsp">Sign in</a> <span class="dark-transp">
										| </span> <a href="./register.jsp"> Register</a>
								</div>
							</div>
							<a href="./cart.jsp" class="widget-header pl-3 ml-3">
								<div class="icon icon-sm rounded-circle border">
									<i class="fa fa-shopping-cart"></i>
								</div> <span class="badge badge-pill badge-danger notify">0</span>
							</a>
						</div>
						<!-- widgets-wrap.// -->
					</div>
					<!-- col.// -->
				</div>
				<!-- row.// -->
			</div>
			<!-- container.// -->
		</section>
		<!-- header-main .// -->



	</header>
	<!-- section-header.// -->



	<!-- ========================= SECTION CONTENT ========================= -->
	<section class="section-content padding-y">

		<!-- ============================ COMPONENT REGISTER   ================================= -->
		<div class="card mx-auto" style="max-width: 520px; margin-top: 40px;">
			<article class="card-body">
				<header class="mb-4">
					<h4 class="card-title">Sign up</h4>
					<h5><%@include file="components/message.jsp"%></h5>
				</header>
				<form action="RegisterServlet" method="post"
					onSubmit="return checkPassword(this)">
					<div class="form-row">

						<div class="col form-group">
							<label>First name</label> <input type="text" name="f_name"
								class="form-control" placeholder="First Name"
								required="required" autocomplete="off">
						</div>
						<!-- form-group end.// -->
						<div class="col form-group">
							<label>Last name</label> <input type="text" name="l_name"
								class="form-control" placeholder="Last Name" required="required"
								autocomplete="off">
						</div>
						<!-- form-group end.// -->
					</div>
					<!-- form-row end.// -->
					<div class="form-row">
						<div class="col form-group">
							<label>Email</label> <input type="email" name="email"
								class="form-control" placeholder="">
						</div>
						<!-- form-group end.// -->
						<div class="col form-group">
							<label>Mobile</label> <input type="number" name="mobile"
								class="form-control" placeholder="Mobile" autocomplete="off">
						</div>
						<!-- form-group end.// -->
					</div>
					<!-- form-group end.// -->
					<div class="form-row">
						<div class="col form-group ">
							<label class="custom-control custom-radio custom-control-inline">
								<input class="custom-control-input" name="gender" type="radio"
								value="male"> <span class="custom-control-label">
									Male </span>
							</label> <label class="custom-control custom-radio custom-control-inline">
								<input class="custom-control-input" name="gender" type="radio"
								value="female"> <span class="custom-control-label">
									Female </span>
							</label>

						</div>
						<div class="col form-group">
							<label>Post Code</label> <input class="form-control" name="pin"
								required="required" autocomplete="off">
						</div>
					</div>

					<!-- form-group end.// -->
					<div class="form-row">
						<div class="form-group col-md-6">
							<label>City</label> <select class="form-control"
								id="inputDistrict" name="u_dist" required="required">
								<option value="">-- select one --</option>
							</select>
						</div>
						<!-- form-group end.// -->
						<div class="form-group col-md-6">
							<label>State</label> <select id="inputState" name="u_state"
								class="form-control">
								<option value="SelectState">Select State</option>
								<option value="Andra Pradesh">Andra Pradesh</option>
								<option value="Arunachal Pradesh">Arunachal Pradesh</option>
								<option value="Assam">Assam</option>
								<option value="Bihar">Bihar</option>
								<option value="Chhattisgarh">Chhattisgarh</option>
								<option value="Goa">Goa</option>
								<option value="Gujarat">Gujarat</option>
								<option value="Haryana">Haryana</option>
								<option value="Himachal Pradesh">Himachal Pradesh</option>
								<option value="Jammu and Kashmir">Jammu and Kashmir</option>
								<option value="Jharkhand">Jharkhand</option>
								<option value="Karnataka">Karnataka</option>
								<option value="Kerala">Kerala</option>
								<option value="Madya Pradesh">Madya Pradesh</option>
								<option value="Maharashtra">Maharashtra</option>
								<option value="Manipur">Manipur</option>
								<option value="Meghalaya">Meghalaya</option>
								<option value="Mizoram">Mizoram</option>
								<option value="Nagaland">Nagaland</option>
								<option value="Orissa">Orissa</option>
								<option value="Punjab">Punjab</option>
								<option value="Rajasthan">Rajasthan</option>
								<option value="Sikkim">Sikkim</option>
								<option value="Tamil Nadu">Tamil Nadu</option>
								<option value="Telangana">Telangana</option>
								<option value="Tripura">Tripura</option>
								<option value="Uttaranchal">Uttaranchal</option>
								<option value="Uttar Pradesh">Uttar Pradesh</option>
								<option value="West Bengal">West Bengal</option>
								<option disabled style="background-color: #aaa; color: #fff">UNION
									Territories</option>
								<option value="Andaman and Nicobar Islands">Andaman and
									Nicobar Islands</option>
								<option value="Chandigarh">Chandigarh</option>
								<option value="Dadar and Nagar Haveli">Dadar and Nagar
									Haveli</option>
								<option value="Daman and Diu">Daman and Diu</option>
								<option value="Delhi">Delhi</option>
								<option value="Lakshadeep">Lakshadeep</option>
								<option value="Pondicherry">Pondicherry</option>
							</select>
						</div>
						<!-- form-group end.// -->
					</div>
					<!-- form-row.// -->
					<div class="form-row">
						<div class="form-group col-md-6">
							<label>Create password</label> <input class="form-control"
								name="u_pass" type="password" id="password"
								pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
								title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"
								required="required">
						</div>
						<div id="message" style="font-size: small;">
							<h3 style="font-weight: 500; font: bolder; font-size: small;">Password
								must contain the following:</h3>
							<span id="letter" class="invalid">A Lowercase letter! </span> <span
								id="capital" class="invalid">A <b>capital (uppercase)</b>
								letter!
							</span> <span id="number" class="invalid">A <b>number!</b>
							</span> <span id="length" class="invalid">Minimum <b>8
									characters!</b></span>
						</div>

						<script>

var myInput = document.getElementById("password");
var letter = document.getElementById("letter");
var capital = document.getElementById("capital");
var number = document.getElementById("number");
var length = document.getElementById("length");

// When the user clicks on the password field, show the message box
myInput.onfocus = function() {
  document.getElementById("message").style.display = "block";
}

// When the user clicks outside of the password field, hide the message box
myInput.onblur = function() {
  document.getElementById("message").style.display = "none";
}

// When the user starts to type something inside the password field
myInput.onkeyup = function() {
  // Validate lowercase letters
  var lowerCaseLetters = /[a-z]/g;
  if(myInput.value.match(lowerCaseLetters)) {  
    letter.classList.remove("invalid");
    letter.classList.add("valid");
  } else {
    letter.classList.remove("valid");
    letter.classList.add("invalid");
  }
  
  // Validate capital letters
  var upperCaseLetters = /[A-Z]/g;
  if(myInput.value.match(upperCaseLetters)) {  
    capital.classList.remove("invalid");
    capital.classList.add("valid");
  } else {
    capital.classList.remove("valid");
    capital.classList.add("invalid");
  }

  // Validate numbers
  var numbers = /[0-9]/g;
  if(myInput.value.match(numbers)) {  
    number.classList.remove("invalid");
    number.classList.add("valid");
  } else {
    number.classList.remove("valid");
    number.classList.add("invalid");
  }
  
  // Validate length
  if(myInput.value.length >= 8) {
    length.classList.remove("invalid");
    length.classList.add("valid");
  } else {
    length.classList.remove("valid");
    length.classList.add("invalid");
  }
}

// Function to check Whether both passwords
// is same or not.
function checkPassword(form) {
	u_pass = form.u_pass.value;
	c_pass = form.c_pass.value;

    // If password not entered
    if (u_pass == '')
        alert ("Please enter Password");
          
    // If confirm password not entered
    else if (c_pass == '')
        alert ("Please enter confirm password");
          
    // If Not same return False.    
    else if (u_pass != c_pass) {
        alert ("\nPassword did not match: Please try again...")
        return false;
    }

    // If same return True.
    else{
        alert("Password Match: Welcome to Yashi.in!")
        return true;
    }
}




</script>

						<!-- form-group end.// -->
						<div class="form-group col-md-6">
							<label>Repeat password</label> <input class="form-control"
								name="c_pass" type="password">
						</div>
						<!-- form-group end.// -->
					</div>
					<div class="form-group">
						<button type="submit" class="btn btn-primary btn-block">
							Register</button>
					</div>
					<!-- form-group// -->

				</form>
			</article>
			<!-- card-body.// -->
		</div>
		<!-- card .// -->
		<p class="text-center mt-4">
			Have an account? <a href="">Log In</a>
		</p>
		<br> <br>
		<!-- ============================ COMPONENT REGISTER  END.// ================================= -->


	</section>
	<!-- ========================= SECTION CONTENT END// ========================= -->


	<!-- ========================= FOOTER ========================= -->
	<footer class="section-footer border-top padding-y">
		<div class="container">
			<p class="float-md-right">&copy Copyright 2019 All rights
				reserved</p>
			<p>
				<a href="#">Terms and conditions</a>
			</p>
		</div>
		<!-- //container -->
	</footer>
	<!-- ========================= FOOTER END // ========================= -->


	<script type="text/javascript" src="js/dist.js"></script>



</body>
</html>