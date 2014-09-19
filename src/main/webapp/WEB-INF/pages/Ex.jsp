<html>
<head>
<meta charset="utf-8">
<title>ex</title>

<link href="css/settings.css" rel="stylesheet">
<link href="css/registration.css" rel="stylesheet">
<link href="css/profileStyle.css" rel="stylesheet">
<link href="css/bootstrap.css" rel="stylesheet">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/bootstrap-theme.css" rel="stylesheet">
<link href="css/bootstrap-theme.min.css" rel="stylesheet">

</head>

<body class="body">

	<div class="container" >
		<div class="col-md-6 form" id="location_registration">
		
			<form class="form-horizontal">
				<fieldset>
					
					<!-- Form Name -->
						<legend>Реєстрація</legend>
					
						<div class="form-group">
							
							<label class="col-md-4 control-label" for="firstNameInput">Ім'я</label>
							
							<div class="col-md-5">
								<input id="firstNameInput" name="firstNameInput" type="text"
									placeholder="" class="form-control input-md">
							</div>
						</div>
						
						<!-- Email input-->
						<div class="form-group">
							<label class="col-md-4 control-label" for="EmailInput">Email/Login</label>
							<div class="col-md-5">
								<input id="EmailInput" name="EmailInput" type="text"
									placeholder="" class="form-control input-md">
							</div>
						</div>
						
							<!-- Password input-->
						<div class="form-group">
							<label class="col-md-4 control-label" for="PasswordInput">Пароль</label>
							<div class="col-md-5">
								<input id="PasswordInput" name="PasswordInput" type="password"
									placeholder="" class="form-control input-md">
							</div>
						</div>
						
						<!-- Confirm password input-->
						<div class="form-group">
							<label class="col-md-4 control-label" for="ConfirmPasswordInput">Підтвердьте
								Пароль</label>
							<div class="col-md-5">
								<input id="ConfirmPasswordInput" name="ConfirmPasswordInput"
									type="password" placeholder="" class="form-control input-md">
							</div>
						</div>
						
							<!-- Birthday input-->

						<div class="form-group">
							<label class="col-md-4 control-label" for="birthdayInput">Дата
								народження</label>
							<div class="col-md-5">
								<div class='input-group date' id='datetimepicker5'>
									<input type='text' class="form-control"
										data-date-format="YYYY/MM/DD" /> <span
										class="input-group-addon"> <span
										class="glyphicon glyphicon-calendar"></span>
									</span>
								</div>
							</div>

							<script type="text/javascript">
								$(function() {
									$('#datetimepicker5').datetimepicker({
										pickTime : false
									});
								});
							</script>
						</div>
						
							<!-- Sex Select -->
						<div class="form-group">
							<label class="col-md-4 control-label" for="SexInput">Стать</label>
							<div class="col-md-5">
								<select class="form-control">
									<option>Чоловік</option>
									<option>Жінка</option>
								</select>
							</div>
						</div>
						
						<!-- Phone input-->
						<div class="form-group">
							<label class="col-md-4 control-label" for="PhoneNuvmerInput">Номер
								телефону</label>
							<div class="col-md-5">
								<input id="PhoneNuvmerInput" name="PhoneNuvmerInput" type="text"
									placeholder="" class="form-control input-md">
								<p class="help-block">+38(xxx)xxx-xx-xx</p>
							</div>
						</div>
						
							<!-- Save Button -->
						<div class="form-group">
							<a href="#" class="btn btn-primary"><span
								class="glyphicon glyphicon-ok"></span> Зберегти</a>
						</div>
						
						
				</fieldset>
			</form>
		</div>
	</div>

	<script src="http://code.jquery.com/jquery-latest.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>

</html>