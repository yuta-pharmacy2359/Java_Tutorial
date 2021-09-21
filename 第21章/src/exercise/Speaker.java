package exercise;

public class Speaker implements Talkable {
	private String name;
	public Speaker(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	@Override
	public void talk(String s) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(s);
	}
}
