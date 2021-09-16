package sample2;

public final class Sales {
	private final String code;
	private final String name;
	private final int price;
	private final String quantity;
	private final boolean stock;
	public Sales(String code, String name, int price, String quantity, boolean stock) {
		this.code = code;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.stock = stock;
	}

}
