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
            <h2>Veuillez remplir les informations ci-dessous</h2>
            <hr/> 
            <form id="frmCheckout" role="form" action="/edroidz/checkout/" method="POST">
            	
                <div class="row form-group">
                    <div class="col-xs-12">
                        <ul class="nav nav-pills nav-justified thumbnail setup-panel">
                            <li class="active"><a href="#step-1">
                                <h4 class="list-group-item-heading">ÉTAPE 1</h4>
                                <p class="list-group-item-text">Vos informations Personnelles</p>
                            </a></li>
                            <li class="disabled"><a href="#step-2">
                                <h4 class="list-group-item-heading">ÉTAPE 2</h4>
                                <p class="list-group-item-text">Carte de crédit</p>
                            </a></li>
                        </ul>
                    </div>
                </div>
                <div class="row setup-content" id="step-1">
                    <div class="col-xs-12">
                        <div class="col-md-12 well">
                            <h1 class="text-center"> ÉTAPE 1</h1>
                            <div class="form-group">
                                <label class="control-label" for="nom">Nom</label>
                                <input id="lastName" name="lastName" placeholder="Votre nom" class="form-control" required="true" type="text" value=""/>
                                
                            </div>
                            <div class="form-group">
                                <label class="control-label" for="nom">Prénom</label>
                                <input id="firstName" name="firstName" placeholder="Votre pr&eacute;nom" class="form-control" required="true" type="text" value=""/>
                                
                            </div>
                            <div class="form-group">
                                <label class="control-label" for="adresse">Adresse</label>
                                <input id="address" name="address" placeholder="# adresse" class="form-control" required="true" type="text" value=""/>
                                
                            </div>
                            <div class="form-group">
                                <label class="control-label" for="ville">Ville</label>
                                <input id="city" name="city" placeholder="Nom de la ville" class="form-control" required="true" type="text" value=""/>
                                
                            </div>

                            <div class="form-group">
                                <label class="control-label" for="province">Province</label>
                                <select id="province" name="province" class="form-control">
                                    <option value="AB">Alberta</option>
                                    <option value="BC">British Columbia</option>
									<option value="MB">Manitoba</option>
									<option value="NB">New Brunswick</option>
									<option value="NL">Newfoundland and Labrador</option>
									<option value="NS">Nova Scotia</option>
									<option value="ON">Ontario</option>
									<option value="PE">Prince Edward Island</option>
									<option value="QC">Quebec</option>
									<option value="SK">Saskatchewan</option>
									<option value="NT">Northwest Territories</option>
									<option value="NU">Nunavut</option>
									<option value="YT">Yukon</option>
                                </select> 
                                
                            </div>
                            <div class="form-group">
                                <label class="control-label" for="country">Pays</label>
                                <select id="country" name="country" class="form-control">
                                    <option value="Canada">Canada</option>
                                </select> 
                                
                            </div>

                            <div class="form-group">
                                <label class="control-label" for="postalCode">Code-Postal</label>
                                <input id="postalCode" name="postalCode" placeholder="A1A1A1" class="form-control" required="true" type="text" value=""/>
                                
                            </div>
                            <div class="form-group">
                                <label class="control-label" for="telephone">No. Téléphone</label>
                                <input id="telephone" name="telephone" placeholder="5141234567" class="form-control" required="true" type="tel" value=""/>
                                
                            </div>
                            <button id="activate-step-2" class="btn btn-primary btn-lg">Étape Suivante</button>
                        </div>
                    </div>
                </div>
                <div class="row setup-content" id="step-2">
                    <div class="col-xs-12">
                        <div class="col-md-12 well">
                            <h1 class="text-center"> ÉTAPE 2</h1>
                            <div class="row">
                                <div class="form-group">
                                    <label class="control-label" for="ccLastName">Nom indiqué sur la carte</label>
                                    <input id="ccLastName" name="ccLastName" placeholder="Nom" class="form-control" required="true" type="text" value=""/>
                                    
                                </div>
                                <div class="form-group">
                                    <label class="control-label" for="ccFirstName">Prénom indiqué sur la carte</label>
                                    <input id="ccFirstName" name="ccFirstName" placeholder="Pr&eacute;nom" class="form-control" required="true" type="text" value=""/>
                                    
                                </div>
                                <div class="form-group">
                                    <label class="control-label" for="ccNumber">Numéro de carte</label>
                                    <input id="ccNumber" name="ccNumber" placeholder="123456789101121" class="form-control" required="true" type="number" value=""/>
                                    
                                </div>
                                <div class="row">
                                    <div class="col-md-4">
                                        <div class="form-group">
                                            <label class="control-label" for="ccMonth">Mois d'expiration</label>
                                            <input id="ccMonth" name="ccMonth" min="1" max="12" placeholder="1" class="form-control" required="true" type="number" value=""/>
                                            
                                        </div>
                                    </div>
                                    <div class="col-md-4">
                                        <div class="form-group">
                                            <label class="control-label" for="ccYear">Année d'expiration</label>
                                            <input id="ccYear" name="ccYear" min="2014" max="2024" placeholder="2014" class="form-control" required="true" type="number" value=""/>
                                            
                                        </div>
                                    </div>
                                    <div class="col-md-4">
                                        <div class="form-group">
                                            <label class="control-label" for="ccCVC">CVC</label>
                                            <input id="ccCVC" name="ccCVC" min="0" max="999" placeholder="123" class="form-control" required="true" type="number" value=""/>
                                            
                                        </div>
                                    </div>
                                </div>
                                <button type="submit" class="btn btn-primary">Payer maintenant</button>                                                           
                            </div>
                        </div>
                    </div>
                </div>
            </form>
        </div>
     

        <!-- Footer -->
        <%@ include file="templates/footer.jsp" %>
        
        <!-- FooterComponents -->
        <%@ include file="templates/baseFooterComponents.jsp" %>

        <!-- Custom javascript -->
        <script src="<c:url value="/resources/js/checkout.js" />"></script>
        
    </body>
</html>