package Bean;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartBean 
{
	private String id;
	private String dateOrder;
	private String supplier;
	private String destination;
	private int amountReceived;
	private int amountBilled;
	private int priceWithoutTaxe;
	private int total;
	private String state;
	private List<ArticleBean> listArticle = new ArrayList<ArticleBean>();
		
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDateOrder() {
		return dateOrder;
	}

	public void setDateOrder(String dateOrder) {
		this.dateOrder = dateOrder;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getAmountReceived() {
		return amountReceived;
	}

	public void setAmountReceived(int amountReceived) {
		this.amountReceived = amountReceived;
	}

	public int getAmountBilled() {
		return amountBilled;
	}

	public void setAmountBilled(int amountBilled) {
		this.amountBilled = amountBilled;
	}

	public int getPriceWithoutTaxe() {
		return priceWithoutTaxe;
	}

	public void setPriceWithoutTaxe(int priceWithoutTaxe) {
		this.priceWithoutTaxe = priceWithoutTaxe;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setListArticle(List<ArticleBean> listArticle) {
		this.listArticle = listArticle;
	}

	public List<ArticleBean> getListArticle()
	{
		return listArticle;
	}
	
	public void addArticle(ArticleBean article)
	{
		listArticle.add(article);
	}
}
