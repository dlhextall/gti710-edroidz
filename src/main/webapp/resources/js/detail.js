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

				/*var body = $("html, body");
				body.animate({scrollTop:0}, '500', 'swing').promise().done(function(){
					$('#panier').html('+1');		
					ajaxForm();
				});	*/
		
				ajaxForm();
	});	
	
	function ajaxForm() {
		
		$nbDroids = $("#nbDroids").val();
		var idDroid = $("#idDroid").val();
		$montant = toDouble($("#totalPrice").val());
		$('#totalPrice').attr('value', $montant);
		
		//var body = $("html, body");
		//var pos = document.documentElement.scrollTop;
		
		$.get( "../panier/add", { nbDroids: $nbDroids, idDroid: idDroid } )
		  .done(function( data ) {

			  window.location.href = "http://localhost:8080/edroidz/panier";
			  //window.location.href = "http://localhost:8080/edroidz/detail/" + $("#idDroid").val();
			  //Probl�me ic, la page ne se reload pas assez vite pour que le reste du code s'�x�cute
			  //$('#panier').html('+1');
			  //document.documentElement.scrollTop = pos;	
			  //body.animate({scrollTop:0}, '500', 'swing').promise().done(function(){		
		
			  //});				  
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
	
	$(document).on('click', '#commentbutton', function(data){    
		var idDroid = $("#idDroid").val();		
		localStorage.setItem(idDroid, "true");		   

    });
	
	var idDroid = $("#idDroid").val();	
	if(localStorage.getItem(idDroid)){
		 $('#commentbutton').prop('disabled', true);
		 $('#comment').prop('disabled', true);		
	}
	
	
	
});