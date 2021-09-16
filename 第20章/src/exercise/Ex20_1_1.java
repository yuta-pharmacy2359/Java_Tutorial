package exercise;

public class Ex20_1_1 {
	public static void main(String[] args) {
		Player p = new Player();
		sub(p);
		System.out.println("Life=" + p.getLife());
	}
	public static void sub(Player player) {
		player.magic();
	}
}