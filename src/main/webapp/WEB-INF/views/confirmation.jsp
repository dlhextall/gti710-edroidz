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
       		<div class="row">
                <h2>Achat réussi et complété</h2>
                <span>LIVRAISON SOUS LES 20 JOURS OUVRABLES</span>
                <h4>Numéro de confirmation : AH67DA92JB8M</h4>
        	</div>
        </div>
        
        <div class="container">
       		<div class="row">
                <h2>Adresse de livraison</h2>
				<p>Balix Lothbrok</p>
                <p>450 rue des Vikings</p>
                <p>Boucherville, Quebec, Canada</p>
                <p>J3X 4B4</p>
        	</div>
        </div>
	  
	  	<div class="container">
	      	<div class="row">
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
				            <tr>
				              <td class="col-sm-8 col-md-6">
				                <div class="media">
				                  <a class="thumbnail pull-left" href="#"> <img class="media-object" src="images/details-thumb/52.jpg" style="width: 72px; height: 72px;"> </a>
				                  <div class="media-body">
				                   <h4 class="media-heading"><a href="/ticketz/detail?id=1">Androïde DrZ60</a></h4>
				                  </div>
				                </div>
				              </td>
				              <td class="col-sm-1 col-md-1" style="text-align: center">
				                <label  class="form-control" id="exampleInputEmail1" value="2">2</label>
				              </td>
				              <td class="col-sm-1 col-md-1 text-center"><strong> 199</strong></td>
				              <td class="col-sm-1 col-md-1 text-right"><strong>398</strong></td>
				            </tr>
				           
				            <tr>
				              <td class="col-sm-8 col-md-6">
				                <div class="media">
				                  <a class="thumbnail pull-left" href="#"> <img class="media-object" src="images/details-thumb/52.jpg" style="width: 72px; height: 72px;"> </a>
				                  <div class="media-body">
				                   <h4 class="media-heading"><a href="/ticketz/detail?id=1">Prototype Viking Balix</a></h4>
				                  </div>
				                </div>
				              </td>
				              <td class="col-sm-1 col-md-1" style="text-align: center">
				                <label  class="form-control" id="exampleInputEmail1" value="3">3</label>
				              </td>
				              <td class="col-sm-1 col-md-1 text-center"><strong> 199</strong></td>
				              <td class="col-sm-1 col-md-1 text-right"><strong>597</strong></td>
				            </tr>
				           
					            <tr>
					             <td>   </td>
					             <td>   </td>
					             <td><h5>Sous-Total</h5></td>
					             <td class="text-right"><h5><strong>995</strong></h5></td>
					            </tr>
                                
                                <tr>
					             <td>   </td>
					             <td>   </td>
					             <td><h5>TPS (5%)</h5></td>
					             <td class="text-right"><h5><strong>49.75</strong></h5></td>
					            </tr>
                                
                                <tr>
					             <td>   </td>
					             <td>   </td>
					             <td><h5>TVQ (10%)</h5></td>
					             <td class="text-right"><h5><strong>99.50</strong></h5></td>
					            </tr>
					            
					            <tr>
					             <td>   </td>
					             <td>   </td>
					             <td><h3>Total</h3></td>
					             <td class="text-right"><h3><strong>1144.25</strong></h3></td>
					            </tr>					            
			          	</tbody>
			       	</table>		        
	      		</form>		        
	      	</div>
	  	</div>	

		<!-- Footer -->
        <%@ include file="templates/footer.jsp" %>
        
        <!-- FooterComponents -->
        <%@ include file="templates/baseFooterComponents.jsp" %>

        <!-- Custom javascript -->      
	        
	</body>
</html>
