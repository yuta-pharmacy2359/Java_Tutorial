package sample;

public class StudentMember extends Member {
	private String birthday;

	public StudentMember(int id, String name, String birthday) {
		super(id, name);
		this.birthday = birthday;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "StudentMember [birthday=" + birthday + ", getId()=" + id + ", getName()=" + name + "]";
	}


}
