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
              
                <div class="item active">
                    <img src="<c:url value="/resources/images/carousel/img2.jpg" />" alt="Osheaga">
                    <div class="container">
                        <div class="carousel-caption">
                            <h1>Androïde DrZ60</h1>
                            <div class="description">
                                <p>Description DrZ60 blablabla testtt testtt testtt testtt testtt testtt testtt testtt testtt testtt testtt testtt testtt testtt testtt testtt testtt etc</p>
                                <p class="indexPrice">20345$</p>
                            </div>                           
                        </div>
                    </div>
                </div>
              
                <div class="item">
                    <img src="<c:url value="/resources/images/carousel/img1.jpg" />" alt="The Summer Slaughter Tour">
                    <div class="container">
                        <div class="carousel-caption">
                            <h1>The Summer Slaughter Tour</h1>
                            <div class="description">
                                <p>Next level brutalness.</p>
                            </div>                            
                        </div>
                    </div>
                </div>

                 <div class="item">
                    <img src="<c:url value="/resources/images/carousel/img3.jpg" />" alt="The Summer Slaughter Tour">
                    <div class="container">
                        <div class="carousel-caption">
                            <h1>Balix rulez</h1>
                            <div class="description">
                                <p>Next level brutalness.</p>
                            </div>                            
                        </div>
                    </div>
                </div>

                 <div class="item">
                    <img src="<c:url value="/resources/images/carousel/img4.jpg" />" alt="The Summer Slaughter Tour">
                    <div class="container">
                        <div class="carousel-caption">
                            <h1>Alex suit de pres</h1>
                            <div class="description">
                                <p>Next level brutalness.</p>
                            </div>                            
                        </div>
                    </div>
                </div>
              
            </div>
            <a class="left carousel-control" href="#featuredShows" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a>
            <a class="right carousel-control" href="#featuredShows" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
        </div>
    
        <!-- feature info -->
        <div id="featuredInfo" class="container">
            <div class="row">
                <div class="col-md-8">
                    <h1></h1>
                </div>
                <div class="col-md-4">
                    <!--<h3 class="text-right">
                        <small>Du <strong id="date-start"> 24 Avril</strong> au <strong id="date-end">24 Juin</strong></small>
                    </h3>-->
                </div>
            </div>
            <div class="description"></div>
            <p class="text-right"><a href="/edroidz/detail" class="btn btn-default show-id">Détails</a></p>
        </div>

        <!-- Footer -->
       	<%@ include file="templates/footer.jsp" %>

        <!-- FooterComponents -->
        <%@ include file="templates/baseFooterComponents.jsp" %>

        <!-- Custom javascript -->
        <script src="<c:url value="/resources/js/carousel.js" />"></script>
    </body>
</html>
