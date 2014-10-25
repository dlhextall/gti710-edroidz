$(document).ready(function() {

	$montant = $("#totalPrice").val();
	$montant = toDouble($montant);
	$montant = parseFloat($montant);
		
	$( "#nbDroids" ).change(function() {
				
		$traitement = (parseFloat($("#nbDroids").val())*$montant).toFixed(2);
		$traitement = toFMT($traitement);		
		$('#totalPrice').attr('value', $traitement);
	});		
		
	$('#form_btn').click(function() {	

				var body = $("html, body");
				body.animate({scrollTop:0}, '500', 'swing').promise().done(function(){
					$('#panier').html('+1');		
					ajaxForm();
				});	
	});	
	
	function ajaxForm() {
		
		$nbDroids = $("#nbDroids").val();
		var idDroid = $("#idDroid").val();
		$montant = toDouble($("#totalPrice").val());
		$('#totalPrice').attr('value', $montant);
		
		$.get( "../panier/add", { nbDroids: $nbDroids, idDroid: idDroid } )
		  .done(function( data ) {
		    
		});
	}
	
	//exemple : 12000.99 devient 12 000,99
	function toFMT(str) {
		
		str = str.replace(/\B(?=(\d{3})+(?!\d))/g, " ");
		str = str.replace(".", ",");		
		return str;
	}
	
	//exemple : 12 000,99 devient 12000.99
	function toDouble(str) {		
		
		str = str.replace(/,/g, '.');
		str = str.replace(/\s/g, '');		
		return str;
	}
});