<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
<%@include file="components/common_css_js.jsp"%>

</head>
<body style="background: #EDE7F6">
	<%@ include file="components/navbar.jsp"%>
	<div class="row mt-5">
		<div class="col-md-6 mx-auto">
			<div class="card shadow-sm p-3 mb-5 customshadow-bg rounded">
				<div class="card-body customshadow-bg ">
					<h2 class="text-center">Register Here</h2>
					<form action="">
						<div class="form-group row">
							<div class="col-sm-6 ">
								<label for="name">Full Name</label> <input type="text"
									class="form-control" id="name" aria-describedby="emailHelp"
									name="u_name" placeholder="Enter your name" required="required">

							</div>
							<div class="col-sm-6">
								<label for="name">Email</label> <input type="email"
									class="form-control" id="name" aria-describedby="emailHelp"
									name="u_email" placeholder="john@gmail.com" required="required">
							</div>
							<div class="col-sm-6">
								<label for="name">Mobile</label> <input type="number"
									class="form-control" id="name" aria-describedby="emailHelp"
									name="u_mobile" placeholder="9574512563" required="required">
							</div>
							<div class="col-sm-6">
								<label for="name">User Name</label> <label for="inputState">State</label>
								<select class="form-control" id="inputState" name="u_state"
									required="required">
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
									<option value="Andaman and Nicobar Islands">Andaman
										and Nicobar Islands</option>
									<option value="Chandigarh">Chandigarh</option>
									<option value="Dadar and Nagar Haveli">Dadar and Nagar
										Haveli</option>
									<option value="Daman and Diu">Daman and Diu</option>
									<option value="Delhi">Delhi</option>
									<option value="Lakshadeep">Lakshadeep</option>
									<option value="Pondicherry">Pondicherry</option>
								</select>
							</div>
							<div class="col-sm-6">
								<label for="inputDistrict">District</label> <select
									class="form-control" id="inputDistrict" name="u_dist"
									required="required">
									<option value="">-- select one --</option>
								</select>
							</div>
							<div class="col-sm-3">
								<label for="name">Postal Pin</label> <input type="number"
									class="form-control" id="u_pin" aria-describedby="emailHelp"
									placeholder="813208">
							</div>

							<div class="col-sm-6">
								<label for="name">Image</label> <input type="file"
									class="form-control" id="u_pic" aria-describedby="emailHelp"
									placeholder="Profile">
							</div>
							<div class="col-sm-3">
								<label for="name">Password</label> <input type="password"
									class="form-control" id="u_pass" aria-describedby="emailHelp"
									placeholder="**********" required="required">
							</div>
							<div class="col-sm-3">
								<label for="name">Confirm Password</label> <input
									type="password" class="form-control" id="c_pass"
									aria-describedby="emailHelp" placeholder="*********"
									required="required">
							</div>
							<div class="container text-center">
								<button class="btn button-outline-success">Register</button>
								<button class="btn button-outline-warning">Reset</button>
							</div>
						</div>
					</form>

				</div>
			</div>
		</div>
	</div>


	<script type="text/javascript" src="js/dist.js"></script>
</body>
</html>