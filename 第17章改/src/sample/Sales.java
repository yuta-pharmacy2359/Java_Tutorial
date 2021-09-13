package sample;

public class Sales {
	private String code;
	private String name;
	private int price;
	private int quantity;
	private boolean stock;
	public Sales(String code, String name, int price, int quantity, boolean stock) {
		this.code = code;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.stock = stock;
	}
	public String getCode() {
		return code;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	public boolean isStock() {
		return stock;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setStock(boolean stock) {
		this.stock = stock;
	}

	public int amount() {
		return price * quantity;
	}
	public boolean isHighSales() {
		return price * quantity >= 500000;
	}
	@Override
	public String toString() {
		return "Sales [code=" + code + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", stock="
				+ stock + "]";
	}


}
