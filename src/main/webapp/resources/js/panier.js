function update(id, val)
{
    if (!isNaN(val) && val % 1 === 0 && val > 0 && val < 5)
    {
    	//alert(id);
        //alert(val);
        
        window.location.href = "panier/update/" + id + "/" + val;
    }
    else
        alert("Le nombre est invalide.")
}