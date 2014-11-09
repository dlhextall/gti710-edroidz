<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page session="true" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <%@ include file="templates/baseHeaderComponents.jsp" %>
        <title>Détails</title>
        <!-- Script -->
        <script src='<c:url value="/resources/js/modernizr.custom.70736.js" />'></script>
        
        <style type="text/css">
            @import url('//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css')
        </style>
    </head>    
    <body>
        <!-- Header -->
        <%@ include file="templates/header.jsp" %>
        
        <div class='container'>
            <div class="row show-preview">
                <div>
                	<div class="col-md-4 decalage">
                        <img src='<c:url value="/resources/images/details/${ droid.imageName }.jpg" />' class='img-responsive'>
                    </div>
                    
                    <div class="col-md-8">
                        <h2>${ droid.name }</h2>
                        <hr>
                        
                        <div class='row'>
                        	<div class='col-md-4'>
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
                        	
                        	<div class='col-md-8'>
                        		<div class="col-md-12" style="padding-left: 0px;">
                        		 	<h4 >Description</h4>                            
		                            <div class="list-group list-group-item">
		                                <p class="list-group-item-text">${ droid.description }</p>
		                            </div>
		                            <h7 style=""margin-top:10px;">Moyenne des appréciations</h7>
		                            <!-- L'attribut disabled est utiliser dans le javascript, ne pas y toucher! -->
		                            <div class="starrr2 rating3" data-rating='${ droid.getAverageScore() }' disabled="true"></div>
                        		</div>
                        	</div>
                        </div>
                        
                    </div>
                   
                </div>
               
            </div>

           
            <div class="row show-buying">
             <hr>
            	 <!--Amazone-->
            	<div class="col-md-4 thumbnail">
            		<div class="amazone">            
	                    <h2>Amazone</h2>
	                    <p>productssssssss</p>           
                	</div> 
            	</div>
            	
            	 <!-- Achat -->
                <div class="col-md-8 form-horizontal">
                    <h2>Achat</h2>
                    <div class="form-group">
                        <label for="nbDispo" class="col-sm-4 control-label">Nombre disponible</label>
                        <div class="col-sm-8">
                            <input name="nbDispo" id='nbDispo' type="text" class="form-control" value="${ droid.quantityAvailable }" readonly>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="nbDroids" class="col-sm-4 control-label">Nombre d'androïde</label>
                        <div class="col-sm-8">
                            <select name="nbDroids" id="nbDroids" class="form-control">
                                <c:if test="${ droid.quantityAvailable == 0 }">
                                        <option value="0">Aucun en stock</option>
                                </c:if>
                                <c:if test="${ droid.quantityAvailable >= 1 }">
                                        <option value="1">1</option>
                                </c:if>
                                <c:if test="${ droid.quantityAvailable >= 2 }">
                                        <option value="2">2</option>
                                </c:if>
                                <c:if test="${ droid.quantityAvailable >= 3 }">
                                        <option value="3">3</option>
                                </c:if>
                                <c:if test="${ droid.quantityAvailable >= 4 }">
                                        <option value="4">4</option>
                                </c:if>
                            </select>
                        </div>
                    </div>                     
                    <div class="form-group">
                        <label for="totalPrice" class="col-sm-4 control-label">Total</label>
                        <div class="col-sm-8">
                            <input name="totalPrice" id='totalPrice' type="text" class="form-control" value="<fmt:formatNumber value='${ droid.price }' minFractionDigits='2' maxFractionDigits='2' />" readonly>
                            <input type="hidden" id='idDroid' name="idDroid" value="${ droid.id }">
                            <input type="hidden" id='unityPrice' name="unityPrice" value="${ droid.price }">
                        </div>
                    </div>
                    
                    <div class="col-md-12 text-right">
                        <c:choose>
                            <c:when test="${ droid.quantityAvailable == 0 }">
                                <button type="submit" id='form_btn' class="btn btn-default" disabled>Ajouter au panier</button> 
                            </c:when>
                            <c:otherwise>
                                <button type="submit" id='form_btn' class="btn btn-default">Ajouter au panier</button> 
                            </c:otherwise>
                        </c:choose>
                    </div>                
                </div>
                
            </div>

           
            
            
            <div class="row" style='margin-bottom:20px;'>
                <div class='comment'>
                    <div class='col-md-6'>
                        <h2>Votre appréciation du produit</h2>
                        <form:form role="form" id="frmComment" modelAttribute="commentForm" method="POST">
                            <form:input path="comment" type="text" min="0" max="350" class="form-control smaller" placeholder="Votre commentaire" id="comment" required="true" />
                            <form:errors path="comment" />
                            <form:input  type="hidden" path="score" id="hiddenScore" value="${ comment.score }"/>
                            <!-- L'attribut disabled est utiliser dans le javascript, ne pas y toucher! -->
                            <div id="stars-existing" class="starrr" data-rating='${ comment.score }' disabled="false"></div>
                            <div class=" text-right">
                                <button type="submit" id='form_btn' class="btn btn-default">Envoyer</button>                       
                            </div>
                        </form:form>                
                    </div>
                </div>
            </div>
            
            <div class='row espace'>
                <c:forEach items="${ droid.commentsList }" var="curComment" varStatus="loop">
                    <div class="oldCommentContainer">
                        <p class="oldComment">${ curComment.comment }</p>
                        <!-- L'attribut disabled est utiliser dans le javascript, ne pas y toucher! -->
                        <div class="starrr2 rating2" data-rating='${ curComment.score }' disabled="true"></div>
                        <p></p>
                    </div>
                </c:forEach>
            </div>
        
        </div>

        <!-- Footer -->
        <%@ include file="templates/footer.jsp" %>
        
        <!-- FooterComponents -->
        <%@ include file="templates/baseFooterComponents.jsp" %>

        <!-- Custom javascript -->
        
        <script src="<c:url value="/resources/js/detail.js" />"></script>
        <script src="<c:url value="/resources/js/stars.js" />"></script>
        <script src="<c:url value="/resources/js/starsDisabled.js" />"></script>
        
    </body>
</html>