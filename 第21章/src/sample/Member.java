package sample;

public class Member implements Versionable {
	private int id;
	private String name;
	public Member(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String version() {
		return "Memberクラス version 1.0";
	}
}
