<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page session="true" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <%@ include file="templates/baseHeaderComponents.jsp" %>
        <title>Panier</title>
        <!-- Script -->
		<script src="<c:url value="/resources/js/modernizr.custom.70736.js" />"></script>
    </head>    
    <body>
    	<!-- Header -->
        <%@ include file="templates/header.jsp" %>
        
        <div class="container">
       	<div class='col-md-1'></div>
       	<div class='col-md-10'>
	      	<div class="row">
	      		<form action="/edroidz/checkout" class="form-horizontal" role="form">
	      		
		          	
	          		<table class="table table-hover">
					    <thead>
					        <tr>
				               <th>Produit</th>
				               <th>Quantité</th>
				               <th class="text-center">Prix</th>
				               <th class="text-center">Total</th>
				               <th> </th>
					        </tr>
				        </thead>
					    
					    <tbody>			
					    	<c:forEach items="${ panier.getListLignePanier() }" var="ligne" varStatus="loop">          		
					            <tr>
					              <td class="col-sm-8 col-md-6">
					                <div class="media">
					                  <a class="thumbnail pull-left" href="/edroidz/detail/${ ligne.droid.id }"> <img class="media-object" src="<c:url value="/resources/images/details-thumb/${ ligne.droid.imageName }.jpg" />" style="width: 72px; height: 72px;"> </a>
					                  <div class="media-body">
					                   <h4 class="media-heading"><a href="/edroidz/detail/${ ligne.droid.id }">${ ligne.droid.name }</a></h4>
					                   <span>Statut: </span><span class="text-success"><strong>${ ligne.getStatus() }</strong></span>
					                  </div>
					                </div>
					              </td>
					              <td class="col-sm-1 col-md-1" style="text-align: center">
					                <label  class="form-control" id="exampleInputEmail1" value="${ ligne.nbDroids }">${ ligne.nbDroids }</label>
					              </td>
					              <td class="col-sm-1 col-md-1 text-center"><strong>${ ligne.droid.price }</strong></td>
					              <td class="col-sm-1 col-md-1 text-center"><strong>${ ligne.getTotalRound() }</strong></td>
					              <td class="col-sm-1 col-md-1 text-right">
					              <a href="/edroidz/panier/delete?id=${ loop.index }" type="button" class="btn btn-danger">
					                <span class="glyphicon glyphicon-remove"></span> Retirer
					              </a></td>
					            </tr>
				            </c:forEach>
				           
					        <tr>
					        	<td>   </td>
					            <td>   </td>
					            <td>   </td>
					            <td><h5>Sous-Total</h5></td>
					            <td class="text-right"><h5><strong>${ panier.getSousTotalRound() }</strong></h5></td>
					        </tr>
                                
                            <tr>
					            <td>   </td>
					            <td>   </td>
					            <td>   </td>
					            <td><h5>TPS (5%)</h5></td>
					            <td class="text-right"><h5><strong>${ panier.getTpsRound() }</strong></h5></td>
					        </tr>
                                
                            <tr>
					            <td>   </td>
					            <td>   </td>
					            <td>   </td>
					            <td><h5>TVQ (10%)</h5></td>
					            <td class="text-right"><h5><strong>${ panier.getTvqRound() }</strong></h5></td>
					        </tr>
					            
					        <tr>
					            <td>   </td>
					            <td>   </td>
					            <td>   </td>
					            <td><h3>Total</h3></td>
					            <td class="text-right"><h3><strong>${ panier.getPrixTotalRound() }</strong></h3></td>
					        </tr>
					        
					        <tr>
					            <td>   </td>
					            <td>   </td>
					            <td>   </td>
					            <td>
					            	<a href="/edroidz/catalogue"><button  type="button" class="btn btn-default"><span class="glyphicon glyphicon-shopping-cart"></span> Continuer à magasiner</button></a>
					            </td>
					            <td class="col-sm-1 col-md-1 text-right">
						            <c:choose>
										<c:when test="${ panier.isEmpty() }">
											<button type="submit" class="btn btn-success" disabled>Paiement <span class="glyphicon glyphicon-play"></span></button>
										</c:when>
										<c:otherwise>
											<button type="submit" class="btn btn-success">Paiement <span class="glyphicon glyphicon-play"></span></button>
										</c:otherwise>
									</c:choose>					            	
					            </td>
				            </tr>
					               
			          	</tbody>
			       	</table>		        
	      		</form>		        
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