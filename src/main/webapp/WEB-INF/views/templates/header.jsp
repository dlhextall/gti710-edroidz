<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page session="true" %>

<!-- Header image -->
<a href="/edroidz/" >
	<div class="header-image container"></div>
</a>
<!-- Navbar -->
<div class="navbar navbar-default" role="navigation">
	<div class="container">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span>
                    <span class="icon-b"></span>
                    <span class="icon-b"></span>
                    <span class="icon-b"></span>
                </button>
                <a href="/edroidz/" class="navbar-brand">eDroidz</a>
			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li><a href="/edroidz/catalogue">Catalogue</a></li>
					<li><a href="/edroidz/panier">Panier <span  id="panier" class="badge"></span></a></li>
				</ul>
				<!--
				<form action="/edroidz/catalogue" method="get" class="nav navbar-form navbar-right">
					<div id="the-basics" class="form-group">
						<input type="text" id="searching" name="criteria"  class="form-control typeahead" placeholder="Rechercher" data-provide="typeahead" autocomplete="off">
					</div>
					<button class="btn btn-default">Rechercher</button>
				</form>
				-->
			</div>
		</div>
	</div>
</div>