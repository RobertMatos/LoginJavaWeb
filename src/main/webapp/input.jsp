<%@ page language="java" contentType="text/html; charset=UTF-8"
      pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Login info</title>
		<link href="assets/css/style.css" rel ="stylesheet"/>
	</head>
	<body>
		<form action="Login" method="post" class="card">
		
			<div class="card-header">
                <h2>Login</h2>
            </div>
            
            <div class="card-content">
				<div class="card-content-area">
					<label for="usuario">Usuário</label>
					<input type="text" id="usuario" name="username">
				</div>
			
				<div class="card-content-area">
					<label for="password">Senha</label>
					
					<input type="password" id="password" name="password">
				</div>
			</div>
			
			 <div class="card-footer">
				<input type="submit" value="login" class="submit">
			</div>
		</form>
	</body>
</html>