<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page session="true" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <%@ include file="templates/baseHeaderComponents.jsp" %>
        <title>Détails</title>
        <!-- Script -->
		<script src="<c:url value="/resources/js/modernizr.custom.70736.js" />"></script>
    </head>    
    <body>
    	<!-- Header -->
        <%@ include file="templates/header.jsp" %>
        
        <div class="row show-preview">
            <div class="container">
                <div class="col-md-6">
                    <h2>${ droid.getName() }</h2>
                    <h4>Compétences</h4>
                    <div class="skills">
                    	<div class="skill">
                            <img src="<c:url value="/resources/images/skills/combatOn.png" />" width="40px" height="40px">
                            <c:choose>
								<c:when test="${ droid.isCanCombat() }"><div class="skillOn"></c:when>
								<c:otherwise><div class="skillOff"></c:otherwise>
							</c:choose>
                            	<p>Combat</p>
                            </div>
                       	</div>
                        <div class="skill">
                            <img src="<c:url value="/resources/images/skills/cookOn.png" />" width="40px" height="40px">
                            <c:choose>
								<c:when test="${ droid.isCanCook() }"><div class="skillOn"></c:when>
								<c:otherwise><div class="skillOff"></c:otherwise>
							</c:choose>
                            	<p>Cuisine</p>
                            </div>
                      	</div>
                        <div class="skill">
                            <img src="<c:url value="/resources/images/skills/gardenOn.png" />" width="40px" height="40px">
                            <c:choose>
								<c:when test="${ droid.isCanGarden() }"><div class="skillOn"></c:when>
								<c:otherwise><div class="skillOff"></c:otherwise>
							</c:choose>
                            	<p>Jardinage</p>
                            </div>
                      	</div>
                        <div class="skill">
                            <img src="<c:url value="/resources/images/skills/laundryOn.png" />" width="40px" height="40px">
                            <c:choose>
								<c:when test="${ droid.isCanLaundry() }"><div class="skillOn"></c:when>
								<c:otherwise><div class="skillOff"></c:otherwise>
							</c:choose>
                            	<p>Lessive</p>
                            </div>
                      	</div>
                        <div class="skill">
                            <img src="<c:url value="/resources/images/skills/cleaningOn.png" />" width="40px" height="40px">
                            <c:choose>
								<c:when test="${ droid.isCanClean() }"><div class="skillOn"></c:when>
								<c:otherwise><div class="skillOff"></c:otherwise>
							</c:choose>
                            	<p>Ménage</p>
                            </div>
                      	</div>
                        <div class="skill">
                            <img src="<c:url value="/resources/images/skills/washdishesOff.png" />" width="40px" height="40px">
                            <c:choose>
								<c:when test="${ droid.isCanWashDishes() }"><div class="skillOn"></c:when>
								<c:otherwise><div class="skillOff"></c:otherwise>
							</c:choose>
                            	<p>Vaisselle</p>
                            </div>
                      	</div>
                   	</div>
                </div>
                <div class="col-md-6 decalage">
                    <img src="<c:url value="/resources/images/details/${ droid.getImageName() }.jpg" />" width="310px" height="367px">
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
                    		<p class="list-group-item-text">${ droid.getDescription() }</p>
                    	<!--</a>-->
                        
                    </div>
                </div>
            </div>
        </div>

        <!-- Ticket option -->
        <div class="row show-buying">
            <div class="container form-horizontal">
                <h2>Achat</h2>
                	<form action="/edroidz/panier/" class="form-horizontal" role="form">
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
	                            <input type="hidden" id='idDroid' name="idDroid" value="${ droid.getId() }">
	                            <input type="hidden" id='unityPrice' name="unityPrice" value="${ droid.getPrice() }">
	                            <input type="hidden" id='nomDroid' name="nomDroid" value="${ droid.getName() }">
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
                <textarea id="userComment" name="userComment" placeholder="Votre commentaire" required type="text"  maxlength="250" cols="1" rows="1"></textarea>            
                <div class="col-md-10 text-right">
                    <div class="rating">
                        <label id="note" for="rating">Note</label>
                        <input type="radio" name="rating" value="0" checked /><span id="hideStars"></span>
                        <input type="radio" name="rating" value="1" /><span></span>
                        <input type="radio" name="rating" value="2" /><span></span>
                        <input type="radio" name="rating" value="3" /><span></span>
                        <input type="radio" name="rating" value="4" /><span></span>
                        <input type="radio" name="rating" value="5" /><span></span>
                    </div> 
	            	<button type="submit" id='form_btn' class="btn btn-default">Envoyer</button>                       
	            </div>
            </div>
        </div>
        
        
        <div class="container">
            <div class="oldCommentContainer">
                <textarea class="oldComment" name="userComment" required type="text"  maxlength="250" cols="1" rows="1" enabled="false">Bla blbablablaB lablbablablaBl ablbabla blaBlablbablablaBlablbablabl aBlablbabla blaB lablbablablaBlablbablablaBlabl bablablaBl</textarea>
                <div class="rating2">
                    <input type="radio" name="rating" value="0" disabled="disabled"/><span id="hideStars"></span>
                    <input type="radio" name="rating" value="1" disabled="disabled"/><span></span>
                    <input type="radio" name="rating" value="2" disabled="disabled"/><span></span>
                    <input type="radio" name="rating" value="3" disabled="disabled" checked /><span></span>
                    <input type="radio" name="rating" value="4" disabled="disabled"/><span></span>
					<input type="radio" name="rating" value="5" disabled="disabled"/><span></span>
              	</div> 
            </div>
        </div>
        
        <div class="container">
            <div class="oldCommentContainer">
                <textarea class="oldComment" name="userComment" required type="text"  maxlength="250" cols="1" rows="1" enabled="false">Bla blbablablaB lablbablablaBl ablbabla blaBlablbablablaBlablbablabl aBlablbabla blaB lablbablablaBlablbablablaBlabl bablablaBl</textarea>
                <div class="rating2">
                    <input type="radio" name="rating" value="0" disabled="disabled"/><span id="hideStars"></span>
                    <input type="radio" name="rating" value="1" disabled="disabled"/><span></span>
                    <input type="radio" name="rating" value="2" disabled="disabled"/><span></span>
                    <input type="radio" name="rating" value="3" disabled="disabled" checked /><span></span>
                    <input type="radio" name="rating" value="4" disabled="disabled"/><span></span>
					<input type="radio" name="rating" value="5" disabled="disabled"/><span></span>
              	</div> 
            </div>
        </div>
        
        <div class="container">
            <div class="oldCommentContainer">
                <textarea class="oldComment" name="userComment" required type="text"  maxlength="250" cols="1" rows="1" enabled="false">Bla</textarea>
                <div class="rating2">
                    <input type="radio" name="rating" value="0" enabled="false"/><span id="hideStars"></span>
                    <input type="radio" name="rating" value="1" enabled="false"/><span></span>
                    <input type="radio" name="rating" value="2" enabled="false"/><span></span>
                    <input type="radio" name="rating" value="3" enabled="false" checked /><span></span>
                    <input type="radio" name="rating" value="4" enabled="false"/><span></span>
					<input type="radio" name="rating" value="5" enabled="false"/><span></span>
              	</div> 
            </div>
        </div>

        <!-- Footer -->
        <%@ include file="templates/footer.jsp" %>
        
        <!-- FooterComponents -->
        <%@ include file="templates/baseFooterComponents.jsp" %>

        <!-- Custom javascript -->
        
        
	</body>
</html>