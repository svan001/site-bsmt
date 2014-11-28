<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<link href="css/teamMember.css" rel="stylesheet">


<div class="container teamMembersContainer">
	<div class="row">

		<c:forEach items="${teamMembers}" var="member">
			<div class="col-xs-6 col-sm-3 col-md-2 col-lg-2">
				<img src="profilePicture/${member.nickName}.jpg" class="img-responsive thumbnail" />
			<p class="profilName">${member.nickName}</p>
			</div>
		</c:forEach>
	</div>
</div>
