<%@ taglib prefix="c" 		uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles"	uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<tiles:importAttribute name="navbar_selected_li" toName="selectLi" scope="page"/>

<script>
$(document).ready(function() {
		// remove la class active partout la set au bon endroit
		$("#mainNavBar ul li").removeClass("active");
		
		$("#${selectLi}").addClass("active");
	}
);
</script>	

<!-- header container -->
<div class="container top-container">
	<!-- IMG -->
	<div class="row">

		<div class="col-xs-3 col-md-3 col-lg-4 col-banniere">
			<img alt="Logo bsmt" src="img/logo.jpg"
				class="img-circle img-responsive img-banniere center-block" />
		</div>
		<div class="col-xs-4 col-md-4 col-banniere">
			<img alt="tof" height="230px" src="img/action_soldier.jpg"
				class="img-responsive img-banniere center-block">
		</div>
		<div class="col-xs-4 col-md-4 col-banniere">
			<img alt="tof" height="230px" src="img/action_forest.jpg"
				class="img-responsive img-banniere center-block">
		</div>

	</div>
	
	<!-- Nav bar -->
	<div class="row navbar-row">
		<nav id="mainNavBar" class="navbar navbar-inverse">
			<!-- navbar-fixed-top"> -->
			<ul class="nav navbar-nav">
				<li id="teamLi"><a href="<spring:url value="index.html"/>'">La team</a></li>
				<li id="newsLi"><a href="<spring:url value="/news.html"/>">Les news</a></li>
				<li id="membersLi"><a href="<spring:url value="/members.html"/>">Les membres</a></li>
				<li id="galerieLi"><a href="<spring:url value="/galerie.html"/>">La galerie</a></li>
				<li id="forumLi"><a href="http://bsmt.forumactif.org/">Le forum</a></li>

			</ul>
			<ul class="nav navbar-nav pull-right">
				<li class="recrutement-li"><a href="<spring:url value="/recrutement.html"/>">RECRUTEMENT</a></li>
			</ul>
		</nav>
	</div>
</div>
<!-- END header container -->

