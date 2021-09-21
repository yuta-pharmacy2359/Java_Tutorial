package sample;

public class Sample21_6 {

	public static void main(String[] args) {
		Member m = new Member(200, "田中宏");
		if(m instanceof Member) {
			System.out.println("Member型です");
		}
		if(m instanceof Versionable) {
			System.out.println("Versionable型です");
		}
	}
}
