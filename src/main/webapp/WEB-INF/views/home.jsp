<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page session="true" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <%@ include file="templates/baseHeaderComponents.jsp" %>
        <title>eDroidz</title>        
    </head>
    <body>
    	<!-- Header -->   
    	<%@ include file="templates/header.jsp" %>
        <!-- Carousel -->        
        <div id="featuredShows" class="carousel slide" data-interval="false">
            <ol class="carousel-indicators">
              
                <li data-target="#featuredShows" data-slide-to="0" class="active"></li>              
                <li data-target="#featuredShows" data-slide-to="1" class=""></li>
                <li data-target="#featuredShows" data-slide-to="2" class=""></li>
                <li data-target="#featuredShows" data-slide-to="3" class=""></li>
              
            </ol>
            <div class="carousel-inner">
            	
            	<c:forEach items="${ promoList }" var="droid" varStatus="loop">
					<c:choose>
						<c:when test="${loop.index == 0}"><div class="item active"></c:when>
						<c:otherwise><div class="item"></c:otherwise>
					</c:choose>
	                    <img src="<c:url value="/resources/images/carousel/${ droid.promoImgName }.jpg" />" alt="${ droid.name }">
	                    <div class="container">
	                        <div class="carousel-caption">
	                            <h1>${ droid.name }</h1>
	                            <div class="description">
	                                <p>${ droid.getDescription() }</p>
	                                <p class="indexPrice">${ droid.price }$</p>
	                            </div>   
	                            <div class="detailLink">
	                                <p class="text-right"><a href="/edroidz/detail/${ droid.id }" class="btn btn-default show-id">Détails</a></p>
	                            </div>
	                        </div>
	                    </div>
	                </div>
                </c:forEach>
              
            </div>
            <a class="left carousel-control" href="#featuredShows" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a>
            <a class="right carousel-control" href="#featuredShows" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
        </div>
    
        <!-- feature info -->
        <div id="featuredInfo" class="container">
        	<div class='col-md-3'></div>
            <div class='col-md-6'>
           		<div class="row">
	                <div class="col-md-8">
	                <h1> </h1>
	                </div>
	                <div class="col-md-4">
	                </div>
	            </div>
	            <div class="description"></div>
	            <div class="detailLink"></div>
            </div>
        </div>

        <!-- Footer -->
       	<%@ include file="templates/footer.jsp" %>

        <!-- FooterComponents -->
        <%@ include file="templates/baseFooterComponents.jsp" %>

        <!-- Custom javascript -->
        <script src="<c:url value="/resources/js/carousel.js" />"></script>
    </body>
</html>
