<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<link href="css/news.css" rel="stylesheet">


<div class="container">
	<c:forEach items="${listNews}" var="news">
		<div class="row newsTitle">
			<div class="col-xs-12 col-sm-8 col-lg-6">${news.title}</div>
		</div>
		<div class="row newsContent">
			<div class="col-md-1 col-lg-1 hidden-xs hidden-sm">
				<img src="img/new.png" class="img-responsive" />
			</div>
			<div class="col-xs-12 col-sm-12 col-md-10 col-lg-10">
				<p>${news.content}</p>
			</div>
		</div>
		<div class="row newsAuthor">
			<div class="col-lg-2 pull-right">
				${news.author} : le
				<fmt:formatDate value="${news.creationDate.time}"
					pattern="dd/MM/yyyy" />
			</div>
		</div>


	</c:forEach>

</div>
