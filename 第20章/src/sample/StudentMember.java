package sample;

public class StudentMember extends Member{
	private String birthday;

	public StudentMember(int id, String name, String birthday) {
		super(id, name);
		this.birthday = birthday;
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
}
