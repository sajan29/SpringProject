<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<c:set var="contextRoot" value="${pageContext.request.contextPath}"></c:set>
<spring:url var="css" value="/webapp/css" />
<spring:url var="js" value="/webapp/js" />
<spring:url var="images" value="/webapp/images" />


<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Online Shopping - ${title}</title>

<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css}/app.css" rel="stylesheet">
<!-- External theme included -->
<link href="${css}/bootstrap-cosmo-theme.css" rel="stylesheet">

<script>
	window.menu = "${title}";
</script>

</head>

<body>

	<div class="wrapper">
		<!-- Navigation -->
		<%@include file="./shared/navbar.jsp"%>
		<!-- Page Content -->
		<div class="content">
			<c:if test="${UserClickHome==true}">
				<%@include file="body.jsp"%>
			</c:if>
			<!-- About Content -->
			<c:if test="${UserClickAbout==true}">
				<%@include file="about.jsp"%>
			</c:if>
			<!-- Contact Content -->
			<c:if test="${UserClickContact==true}">
				<%@include file="contact.jsp"%>
			</c:if>
			<c:if test="${UserClickAllProducts==true or UserClickCategoryProducts==true}">
				<%@include file="listProducts.jsp"%>
			</c:if>
		</div>
		<!-- Footer -->
		<%@include file="./shared/footer.jsp"%>
	</div>
	<!-- Bootstrap core JavaScript -->
	<script src="${js}/jquery.js"></script>
	<script src="${js}/bootstrap.bundle.min.js"></script>
	<!-- Own Javascript -->
	<script src="${js}/myapp.js"></script>

</body>

</html>