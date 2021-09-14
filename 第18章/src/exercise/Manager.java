package exercise;

public class Manager extends Employee {
	private String title;

	public Manager(long id, String name, int salary, String title) {
		super(id, name, salary);
		this.title = title;
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Manager [title=" + title + ", getId()=" + getId() + ", getName()=" + getName() + ", getSalary()="
				+ getSalary() + "]";
	}

}
