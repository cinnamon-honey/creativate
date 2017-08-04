<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=Edge" />
<meta http-equiv="Content-Type" content="text/html, charset=UTF-8" />
<meta name="viewport"
	content="initial-scale=1.0, maximum-scale=1.0, user-scalable=0" />
<link rel="stylesheet"
	href="<c:url value="/resources/twitter-bootstrap/css/bootstrap.min.css" />">

<title>Add User</title>
</head>

<body class="sidebar-mini skin-green-light wysihtml5-supported">

	<div class="box box-primary">
		<div class="box-header with-border">Add Bus</div>
		<div class="box-body" style="padding-left: 5%; padding-right: 5%;">
			<form:form modelAttribute="user" method="POST" commandName="user"
				cssClass="form-horizontal">
				<div class="form-group">
					<div class="form-line">
						<input name="firstname" class="form-control"
							placeholder="First Name" id="firstname">
					</div>
				</div>
				<div class="form-group">
					<div class="form-line">
						<input name="lastname" class="form-control"
							placeholder="Last Name" id="lastname">
					</div>
				</div>
				<div class="form-group">
					<div class="form-line">
						<input name="username" class="form-control"
							placeholder="User Name" id="username">
					</div>
				</div>
				<div class="form-group">
					<label for="user_role">User Role</label> <select name="user_role"
						class="form-control" id="user_role">
						<c:forEach var="user_role" items="${user_role}">
							<option class="form-control" value="${user_role.role_name}">${user_role.role_name}</option>
						</c:forEach>
					</select>
				</div>
				<div class="form-group">
					<div class="form-line">
						<input name="othernames" class="form-control"
							placeholder="Other Names" id="othernames">
					</div>
				</div>
				<div class="form-group">
					<div class="form-line">
						<input name="dateOfBirth" class="form-control"
							placeholder="Date of Birth" id="dateOfBirth">
					</div>
				</div>
				<div class="form-group">
					<label for="gender">Gender</label> <select name="gender"
						class="form-control" id="gender">
						<option class="form-control" value="Male">Male</option>
						<option class="form-control" value="Female">Female</option>
					</select>
				</div>
				<div class="form-group">
					<div class="form-line">
						<input name="email" class="form-control" placeholder="E-Mail"
							id="email">
					</div>
				</div>
				<div class="form-group">
					<div class="form-line">
						<input name="country" class="form-control" placeholder="Country"
							id="country">
					</div>
				</div>
				<div class="form-group">
					<div class="form-line">
						<input name="province" class="form-control" placeholder="Province"
							id="province">
					</div>
				</div>
				<div class="form-group">
					<div class="form-line">
						<input name="district" class="form-control" placeholder="District"
							id="district">
					</div>
				</div>
				<div class="form-group">
					<div class="form-line">
						<input name="picture" class="form-control" placeholder="Picture picture rangers!!!"
							id="picture">
					</div>
				</div>
				<div class="form-group">
					<button type="submit" class="btn btn-success">+ Submit</button>
				</div>
			</form:form>
		</div>
	</div>

</body>
</html>