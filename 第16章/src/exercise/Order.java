package exercise;

public class Order {
	private String id;
	private String date;
	private int price;
	private int quantity;
	private boolean delivery;
	public Order(String id, String date, int price, int quantity, boolean delivery) {
		this.id = id;
		this.date = date;
		this.price = price;
		this.quantity = quantity;
		this.delivery = delivery;
	}
	public String getId() {
		return id;
	}
	public String getDate() {
		return date;
	}
	public int getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	public boolean isDelivery() {
		return delivery;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setDelivery(boolean delivery) {
		this.delivery = delivery;
	}

}
