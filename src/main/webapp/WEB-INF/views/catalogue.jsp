<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page session="true" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <%@ include file="templates/baseHeaderComponents.jsp" %>
        <title>Catalogue</title>
        <!-- Script -->
		<script src="<c:url value="/resources/js/modernizr.custom.70736.js" />"></script>
    </head>    
    <body>
    	<!-- Header -->
        <%@ include file="templates/header.jsp" %>
        
        <div class="container">	
        	<nav class="navbar navbar-fixed-left navbar-minimal animate" role="navigation">
				<div class="navbar-toggler animate">
					<span class="menu-icon"></span>
				</div>
				<ul class="navbar-menu animate">
					<li>
						<a href="/edroidz/catalogue/combat" class="animate">
							<span class="desc animate"> DANNY </span>
							<span class="glyphicon glyphicon-user"></span>
						</a>
					</li>
					<li>
						<a href="/edroidz/catalogue/cook" class="animate">
							<span class="desc animate"> GO PLAY </span>
							<span class="glyphicon glyphicon-info-sign"></span>
						</a>
					</li>
					<li>
						<a href="/edroidz/catalogue/garden" class="animate">
							<span class="desc animate"> MASS EFFECT 3 </span>
							<span class="glyphicon glyphicon-comment"></span>
						</a>
					</li>
				</ul>
			</nav>	
			<div class="main">								
				<div class="gamma-container gamma-loading" id="gamma-container">
					<ul class="gamma-gallery">
						
						<c:forEach items="${ droidList }" var="droid" varStatus="loop">
							<li>
	                            <div data-alt="${ droid.id }" data-description="<h3>${ droid.name }</h3>" data-max-width="1800" data-max-height="1350">
	                                <div data-src="<c:url value="/resources/images/details-big/${ droid.imageName }.jpg" />" data-min-width="1300"></div>
	                                <div data-src="<c:url value="/resources/images/details-big/${ droid.imageName }.jpg" />" data-min-width="1000"></div>
	                                <div data-src="<c:url value="/resources/images/details-big/${ droid.imageName }.jpg" />" data-min-width="700"></div>
	                                <div data-src="<c:url value="/resources/images/details-big/${ droid.imageName }.jpg" />" data-min-width="300"></div>
	                                <div data-src="<c:url value="/resources/images/details-big/${ droid.imageName }.jpg" />" data-min-width="200"></div>
	                                <div data-src="<c:url value="/resources/images/details-big/${ droid.imageName }.jpg" />" data-min-width="140"></div>
	                                <div data-src="<c:url value="/resources/images/details-big/${ droid.imageName }.jpg" />"></div>
	                                <noscript>
	                                    <img src="<c:url value="/resources/images/details-big/${ droid.imageName }.jpg" />" alt="${ droid.name }"/>
	                                </noscript>
	                            </div>
                        	</li>
						</c:forEach>
						
					</ul>
				</div>
			</div><!--/main-->
		</div>
		
		
		
		<!-- Footer -->
        <%@ include file="templates/footer.jsp" %>
        
        <!-- FooterComponents -->
        <%@ include file="templates/baseFooterComponents.jsp" %>
		
		<!-- Custom javascript -->		
		<script src="<c:url value="/resources/js/jquery.masonry.min.js" />"></script>
		<script src="<c:url value="/resources/js/jquery.history.js" />"></script>
		<script src="<c:url value="/resources/js/js-url.min.js" />"></script>
		<script src="<c:url value="/resources/js/jquerypp.custom.js" />"></script>
		<script src="<c:url value="/resources/js/gamma.js" />"></script>
		<script type="text/javascript">
			$(function () {
			    /* START OF DEMO JS - NOT NEEDED */
			    if (window.location == window.parent.location) {
			        $('#fullscreen').html('<span class="glyphicon glyphicon-resize-small"></span>');
			        $('#fullscreen').attr('href', 'http://bootsnipp.com/mouse0270/snippets/PbDb5');
			        $('#fullscreen').attr('title', 'Back To Bootsnipp');
			    }    
			    $('#fullscreen').on('click', function(event) {
			        event.preventDefault();
			        window.parent.location =  $('#fullscreen').attr('href');
			    });
			    $('#fullscreen').tooltip();
			    /* END DEMO OF JS */
			    
			    $('.navbar-toggler').on('click', function(event) {
					event.preventDefault();
					$(this).closest('.navbar-minimal').toggleClass('open');
				})
			});
		
			$(function() {
				
				var GammaSettings = {
						// order is important!
						viewport : [ {
							width : 1200,
							columns : 5
						}, {
							width : 900,
							columns : 4
						}, {
							width : 500,
							columns : 3
						}, { 
							width : 320,
							columns : 2
						}, { 
							width : 0,
							columns : 2
						} ]
				};
				
				Gamma.init( GammaSettings, null );
			});
		</script>	
	</body>
</html>