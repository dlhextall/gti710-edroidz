package Bean;

public class ArticleBean 
{
	private String id;
	private String name;
	private String quantityAvailabe;
	private String virtualStock;
	private int unitPrice;
	private String description;
	private String ProductType;
	private int publicPrice;
	private String udm;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQuantityAvailabe() {
		return quantityAvailabe;
	}
	public void setQuantityAvailabe(String quantityAvailabe) {
		this.quantityAvailabe = quantityAvailabe;
	}
	public String getVirtualStock() {
		return virtualStock;
	}
	public void setVirtualStock(String virtualStock) {
		this.virtualStock = virtualStock;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getProductType() {
		return ProductType;
	}
	public void setProductType(String productType) {
		ProductType = productType;
	}
	public int getPublicPrice() {
		return publicPrice;
	}
	public void setPublicPrice(int publicPrice) {
		this.publicPrice = publicPrice;
	}
	public String getUdm() {
		return udm;
	}
	public void setUdm(String uDM) {
		udm = uDM;
	}
}
