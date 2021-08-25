package pass;

public class Pass11_5 {
	public static void main(String[] args) {
		String[] name = { "田中", "前田", "鈴木", "中村", "田辺", "浦川", "島田", "岩田" };
		int[] drinking = { 7, 0, 3, 3, 2, 0, 0, 6 };
		int[] smoking = { 60, 10, 0, 20, 10, 0, 30, 0 };
		for(int i = 0; i < name.length; i++) {
			int d = drinking[i], s = smoking[i];
			String cond = "";
			if(d == 0 && s == 0) {
				cond = "安全";
			} else if((d == 0 && (s >= 1 && s <= 20)) || ((d >= 1 && d <= 3) && s == 0)) {
				cond = "注意";
			} else if((d >= 1 && d <= 3) && (s >= 1 && s <= 20)) {
				cond = "要指導";
			} else {
				cond = "要検査";
			}
			System.out.printf("%s(%d, %d)\t%s%n", name[i], d, s, cond);
		}
	}
}