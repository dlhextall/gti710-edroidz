<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page session="true" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <%@ include file="templates/baseHeaderComponents.jsp" %>
        <title>Confirmation</title>
        <!-- Script -->
		<script src="<c:url value="/resources/js/modernizr.custom.70736.js" />"></script>
    </head>
    <body>
     	<!-- Header -->
        <%@ include file="templates/header.jsp" %>
        
        <div class="container">
        	
       		<div class='col-md-10'>
       			<div class="row">
	                <h2>Achat réussi et complété</h2>
	                <span>LIVRAISON SOUS LES 20 JOURS OUVRABLES</span>
	                <h4>Numéro de confirmation : ${ noConfirmation }</h4>
	        	</div>
	        	
	        	<div class="row">
	                <h2>Adresse de livraison</h2>
					<p>${ checkoutForm.firstName }  ${ checkoutForm.lastName }</p>
	                <p>${ checkoutForm.address }</p>
	                <p>${ checkoutForm.city }, ${ checkoutForm.province }, ${ checkoutForm.country }</p>
	                <p>${ checkoutForm.postalCode }</p>
	        	</div>
	        	
	        	<div class="row espace">
	            	<h2>Vos achats</h2>
		      		<form class="form-horizontal" role="form">
		          		<table class="table table-hover">
						    <thead>
						        <tr>
					               <th>Produit</th>
					               <th>Quantité</th>
					               <th class="text-center">Prix</th>
					               <th class="text-right">Total</th>
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
						                  </div>
						                </div>
						              </td>
						              <td class="col-sm-1 col-md-1" style="text-align: center">
						                <label  class="form-control" id="exampleInputEmail1" value="${ ligne.nbDroids }">${ ligne.nbDroids }</label>
						              </td>
						              <td class="col-sm-1 col-md-1 text-center"><strong>${ ligne.droid.price }</strong></td>
						              <td class="col-sm-1 col-md-1 text-right"><strong>${ ligne.getTotalRound() }</strong></td>
						            </tr>
					            </c:forEach>
					           
						            <tr>
						             <td>   </td>
						             <td>   </td>
						             <td><h5>Sous-Total</h5></td>
						             <td class="text-right"><h5><strong>${ panier.getSousTotalRound() }</strong></h5></td>
						            </tr>
	                                
	                                <tr>
						             <td>   </td>
						             <td>   </td>
						             <td><h5>TPS (5%)</h5></td>
						             <td class="text-right"><h5><strong>${ panier.getTpsRound() }</strong></h5></td>
						            </tr>
	                                
	                                <tr>
						             <td>   </td>
						             <td>   </td>
						             <td><h5>TVQ (10%)</h5></td>
						             <td class="text-right"><h5><strong>${ panier.getTvqRound() }</strong></h5></td>
						            </tr>
						            
						            <tr>
						             <td>   </td>
						             <td>   </td>
						             <td><h3>Total</h3></td>
						             <td class="text-right"><h3><strong>${ panier.getPrixTotalRound() }</strong></h3></td>
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
