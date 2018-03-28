<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<
<c:set var="contextRoot" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Sara Online Shopping - ${title}</title>

<script>
	window.menu = '${title}';
</script>

<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<link href="${css}/bootswatch.min.css" rel="stylesheet">


<!-- Custom styles for this template -->
<link href="${css}/myApp.css" rel="stylesheet">

</head>

<body>

	<div class="wrapper">
		<!-- Navigation -->
		<%@include file="./shared/Navbar.jsp"%>

		<div class="content">

			<!-- Page Content -->
			<c:if test="${userClickHome == true}">
				<%@include file="Home.jsp"%>
			</c:if>
			<!-- /.container -->

			<!-- Load only when user click about -->
			<c:if test="${userClickAbout == true}">
				<%@include file="About.jsp"%>
			</c:if>
			<!-- /.container -->


			<!-- Load only when user click Contact -->
			<c:if test="${userClickContact == true}">
				<%@include file="Contact.jsp"%>
			</c:if>
			<!-- /.container -->
			
			<!-- Load only when user click Contact -->
			<c:if test="${userClickAllProducts == true or userClickCategoryProducts == true}">
				<%@include file="listProducts.jsp"%>
			</c:if>
			<!-- /.container -->
		</div>


		<!-- Footer -->
		<%@include file="./shared/Footer.jsp"%>


		<!-- Bootstrap core JavaScript -->
		<script src="${js}/jquery.min.js"></script>
		<script src="${js}/bootstrap.min.js"></script>
		<script src="${js}/myApp.js"></script>

	</div>

</body>

</html>
