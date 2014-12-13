
<link href="css/news.css" rel="stylesheet">
<script src="angular/angular.js"></script>
<script src="js/newsListApp.js"></script>

<div class="container" ng-app="newsListApp" ng-controller="newsListCtrl">
	
	<div ng-repeat="news in listNews" >
	
		<div class="row newsTitle">
			<div class="col-xs-12 col-sm-8 col-lg-6">{{news.title}}</div>
		</div>
		<div class="row newsContent">
			<div class="hidden-xs hidden-sm col-md-1 col-lg-1">
				<img src="img/new.png" class="img-responsive" />
			</div>
			<div class="col-xs-12 col-sm-12 col-md-9 col-lg-9">
				<p>{{news.content}}</p>
			</div>
		</div>
		<div class="row newsAuthor">
			<div class="col-lg-2 pull-right">
				{{news.author}} : le {{news.creationDate}}
			</div>
		</div>

	</div>
	
	<p>Add</p>
	<form ng-submit="addNews()">
		<input placeholder="Title" ng-model="newTitle"/>
		<input placeholder="Content" ng-model="newContent"/>
		<input placeholder="Author" ng-model="newAuthor"/>
		<input type="submit"/>
	</form>


</div>
