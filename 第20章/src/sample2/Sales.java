package sample2;

public final class Sales {
	private final String code;
	private final String name;
	private final int price;
	private final int quantity;
	private final boolean stock;
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

}
