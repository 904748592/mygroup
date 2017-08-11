<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@ include file="/taglibs.jsp"%>
<%@ include file="/includeJsAndCss.jsp"%>
<script type="text/javascript">
	$(document).ready(function() {
		changeCode();
		$("#codeImg").bind("click", changeCode);
		$("#login").click(function(){
			var username = $("#username").val();
			var password = $("#password").val();
			var code = $("#code").val();
			console.log(username+":"+password+":"+code);
			if(username==null||username==""){
				$("#login_warn").html("请填写用户名");
				return false;
			}
			if(password==null||password==""){
				$("#login_warn").html("请填写密码");
				return false;
			}
			if(code==null||code==""){
				$("#login_warn").html("请填写验证码");
				return false;
			}
			
			$.ajax({
				type: "post",
				url : "login",
				data : {
					username : username,
					password : password,
					code : code
				},
				success:function(data){
					console.log(data);
				},
				fail: function(ev,tm){
					
				}
			})
		})
	});
	
	$(document).keyup(function(event) {
		if (event.keyCode == 13) {
			$("#login").trigger("click");
		}
	});
	
	function genTimestamp() {
		var time = new Date();
		return time.getTime();
	}
	
	function changeCode() {
		$("#codeImg").attr("src", "code.do?t=" + genTimestamp());
	}
</script>
</head>
<body>
	<div>
      <a class="hiddenanchor" id="signup"></a>
      <a class="hiddenanchor" id="signin"></a>

		<div class="login_wrapper">
			<div class="animate form login_form">
				<section class="login_content">
				<form>
					<h1>SilkRoadCloth</h1>
					<div><span class="warn" id="login_warn"></span></div>
					<div>
						<input type="text" id="username" class="form-control" placeholder="Username" required="required" />
					</div>
					<div>
						<input type="password" id="password" class="form-control" placeholder="Password" required="required" />
					</div>
					<div>
						<input type="text" id="code" class="" placeholder="Code" required="required" style="width: 81%;height: 34px;padding: 12px;color: #777;font-size: 14px;" />
						<img style="height: 22px;" id="codeImg" alt="点击更换" title="点击更换" src="" />
					</div>
					<div>
						<a class="btn btn-default submit" id="login" href="#" style="margin: 6px 15px 0 0;">Log in</a> 
						<a class="reset_pass" href="#">Lost your password?</a>
					</div>

					<div class="clearfix"></div>

					<div class="separator">
						<p class="change_link">
							New to site? <a href="#signup" class="to_register"> Create
								Account </a>
						</p>

						<div class="clearfix"></div>
						<br />

						<div>
							<h1>
								<i class="fa fa-paw"></i> Gentelella Alela!
							</h1>
							<p>©2016 All Rights Reserved. Gentelella Alela! is a
								Bootstrap 3 template. Privacy and Terms</p>
						</div>
					</div>
				</form>
				</section>
			</div>

			<div id="register" class="animate form registration_form">
				<section class="login_content">
				<form>
					<h1>Create Account</h1>
					<div>
						<input type="text" class="form-control" placeholder="Username"
							required="" />
					</div>
					<div>
						<input type="email" class="form-control" placeholder="Email"
							required="" />
					</div>
					<div>
						<input type="password" class="form-control" placeholder="Password"
							required="" />
					</div>
					<div>
						<a class="btn btn-default submit" href="#">Submit</a>
					</div>

					<div class="clearfix"></div>

					<div class="separator">
						<p class="change_link">
							Already a member ? <a href="#signin" class="to_register"> Log
								in </a>
						</p>

						<div class="clearfix"></div>
						<br />

						<div>
							<h1>
								<i class="fa fa-paw"></i> Gentelella Alela!
							</h1>
							<p>©2016 All Rights Reserved. Gentelella Alela! is a
								Bootstrap 3 template. Privacy and Terms</p>
						</div>
					</div>
				</form>
				</section>
			</div>
		</div>
	</div>
</body>
</html>