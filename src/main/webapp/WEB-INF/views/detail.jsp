<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page session="true" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <%@ include file="templates/baseHeaderComponents.jsp" %>
        <title>Détails</title>
        <!-- Script -->
		<script src="<c:url value="/resources/js/modernizr.custom.70736.js" />"></script>
		
		<style type="text/css">
			@import url('//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css')
		</style>
    </head>    
    <body>
    	<!-- Header -->
        <%@ include file="templates/header.jsp" %>
        
        <div class="row show-preview">
            <div class="container">
                <div class="col-md-6">
                    <h2>${ droid.name }</h2>
                    <h4>Compétences</h4>
                    <div class="skills">
                    	<div class="skill">
                            
                            <c:choose>
								<c:when test="${ droid.canCombat }">
									<img src="<c:url value="/resources/images/skills/combatOn.png" />" width="40px" height="40px">
									<div class="skillOn">
								</c:when>
								<c:otherwise>
									<img src="<c:url value="/resources/images/skills/combatOff.png" />" width="40px" height="40px">
									<div class="skillOff">
								</c:otherwise>
							</c:choose>
                            	<p>Combat</p>
                            </div>
                       	</div>
                        <div class="skill">
                            <c:choose>
								<c:when test="${ droid.canCook }">
									<img src="<c:url value="/resources/images/skills/cookOn.png" />" width="40px" height="40px">
									<div class="skillOn">
								</c:when>
								<c:otherwise>
									<img src="<c:url value="/resources/images/skills/cookOff.png" />" width="40px" height="40px">
									<div class="skillOff">
								</c:otherwise>
							</c:choose>
                            	<p>Cuisine</p>
                            </div>
                      	</div>
                        <div class="skill">
                            <c:choose>
								<c:when test="${ droid.canGarden }">
									<img src="<c:url value="/resources/images/skills/gardenOn.png" />" width="40px" height="40px">
									<div class="skillOn">
								</c:when>
								<c:otherwise>
									<img src="<c:url value="/resources/images/skills/gardenOff.png" />" width="40px" height="40px">
									<div class="skillOff">
								</c:otherwise>
							</c:choose>
                            	<p>Jardinage</p>
                            </div>
                      	</div>
                        <div class="skill">
                            <c:choose>
								<c:when test="${ droid.canLaundry }">
									<img src="<c:url value="/resources/images/skills/laundryOn.png" />" width="40px" height="40px">
									<div class="skillOn">
								</c:when>
								<c:otherwise>
									<img src="<c:url value="/resources/images/skills/laundryOff.png" />" width="40px" height="40px">
									<div class="skillOff">
								</c:otherwise>
							</c:choose>
                            	<p>Lessive</p>
                            </div>
                      	</div>
                        <div class="skill">
                            <c:choose>
								<c:when test="${ droid.canClean }">
									<img src="<c:url value="/resources/images/skills/cleaningOn.png" />" width="40px" height="40px">
									<div class="skillOn">
								</c:when>
								<c:otherwise>
									<img src="<c:url value="/resources/images/skills/cleaningOff.png" />" width="40px" height="40px">
									<div class="skillOff">
								</c:otherwise>
							</c:choose>
                            	<p>Ménage</p>
                            </div>
                      	</div>
                        <div class="skill">
                            <c:choose>
								<c:when test="${ droid.canWashDishes }">
									<img src="<c:url value="/resources/images/skills/washdishesOn.png" />" width="40px" height="40px">
									<div class="skillOn">
								</c:when>
								<c:otherwise>
									<img src="<c:url value="/resources/images/skills/washdishesOff.png" />" width="40px" height="40px">
									<div class="skillOff">
								</c:otherwise>
							</c:choose>
                            	<p>Vaisselle</p>
                            </div>
                      	</div>
                   	</div>
                </div>
                <div class="col-md-6 decalage">
                    <img src="<c:url value="/resources/images/details/${ droid.imageName }.jpg" />" width="310px" height="367px">
                </div>
            </div>
        </div>

        <!-- Show details -->
        <div class="row show-details">
            <div class="container">
                <h2>Description</h2>
                <!--<div class="col-md-12">
                	<h3>Description</h3>
                    <p>Edgy festival.</p>
                </div>-->
                <div class="col-md-12">
                	<!--<h3>Artistes</h3>-->
                    <div class="list-group list-group-item">
                    	
                    	<!--<a href="#" class="list-group-item">-->
                    		<p class="list-group-item-text">${ droid.description }</p>
                    	<!--</a>-->
                        
                    </div>
                </div>
            </div>
        </div>

        <!-- Ticket option -->
        <div class="row show-buying">
            <div class="container form-horizontal">
                <h2>Achat</h2>
                	<form action="/edroidz/panier/" class="form-horizontal">
	                    <div class="form-group">
	                        <label for="nbTickets" class="col-sm-4 control-label">Nombre d'androïde</label>
	                        <div class="col-sm-6">
	                            <select name="nbTickets" id="nbTickets" class="form-control">
	                                <option value="1">1</option>
	                                <option value="2">2</option>
	                                <option value="3">3</option>
	                                <option value="4">4</option>
	                            </select>
	                        </div>
	                    </div>	                   
	                    <div class="form-group">
	                        <label for="totalPrice" class="col-sm-4 control-label">Total</label>
	                        <div class="col-sm-6">
	                            <input name="totalPrice" id='totalPrice' type="text" class="form-control" value="8199,99" readonly>
	                            <input type="hidden" id='idDroid' name="idDroid" value="${ droid.id }">
	                            <input type="hidden" id='unityPrice' name="unityPrice" value="${ droid.price }">
	                            <input type="hidden" id='nomDroid' name="nomDroid" value="${ droid.name }">
	                            <!-- <input type="hidden" id='nomBilletPanier' name="nomBilletPanier" value="">  -->
	                        </div>
	                    </div>
	                    <div class="clearfix"></div>
	                    <div class="col-md-10 text-right">
	                        <button type="submit" id='form_btn' class="btn btn-default">Ajouter au panier</button>                       
	                    </div>
                   </form>
                
            </div>
        </div>
		
        <div class="amazone">
            <div class="container">
                <h2>Amazone</h2>
                <p>productssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss</p>
            </div>
        </div>
        
        <div class="comment">
            <div class="container">
                <h2>Votre appréciation du produit</h2>
                <form:form role="form" id="frmCheckout" modelAttribute="commentForm" method="POST">
                	<form:input path="comment" type="text" min="0" max="350" class="form-control smaller" placeholder="Votre commentaire" id="comment" required="true" />
                	<form:errors path="comment" />
	                <form:input  type="hidden" path="score" id="hiddenScore" value="${ comment.score }"/>
	                <div id="stars-existing" class="starrr" data-rating='${ comment.score }' disabled="false"></div>
	                <div class="col-md-10 text-right">
		            	<button type="submit" id='form_btn' class="btn btn-default">Envoyer</button>                       
		            </div>
	            </form:form>
            </div>
        </div>
                
        
        <div class="container">
        	<c:forEach items="${ droid.commentsList }" var="curComment" varStatus="loop">
	            <div class="oldCommentContainer">
	            	<p class="oldComment">${ curComment.comment }</p>
	                <div class="starrr2 rating2" data-rating='${ curComment.score }' disabled="true"></div>
	                <p></p>
	            </div>
            </c:forEach>
        </div>

        <!-- Footer -->
        <%@ include file="templates/footer.jsp" %>
        
        <!-- FooterComponents -->
        <%@ include file="templates/baseFooterComponents.jsp" %>

        <!-- Custom javascript -->
        
        <script src="<c:url value="/resources/js/stars.js" />"></script>
        <script src="<c:url value="/resources/js/starsDisabled.js" />"></script>
        
	</body>
</html>