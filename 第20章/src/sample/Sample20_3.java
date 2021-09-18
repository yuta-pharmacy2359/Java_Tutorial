package sample;

public class Sample20_3 {
	public static void main(String[] args) {
		Member member = new StudentMember(100, "田中宏", "2020-06-18");
		System.out.println(member.getId());
		System.out.println(member.getName());
		// System.out.println(member.getBirthday());　コンパイルエラー
	}
}
