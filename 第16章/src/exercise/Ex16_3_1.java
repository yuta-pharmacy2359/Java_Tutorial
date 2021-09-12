package exercise;

public class Ex16_3_1 {
	public static void main(String[] args) {
		Order o1 = new Order("ICBK61", "2020-07-11", 2100, 5, true);
		System.out.println(o1.getId());
		System.out.println(o1.getDate());
		System.out.println(o1.getPrice());
		System.out.println(o1.getQuantity());
		System.out.println(o1.isDelivery());
	}
}
