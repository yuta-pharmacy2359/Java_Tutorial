package exercise;

public class Ex18_3_1 {
	public static void main(String[] args) {
		Manager employee = new Manager(1234, "佐藤修", 300000, "主任");
		System.out.print(employee.getId() + "/");
		System.out.print(employee.getName() + "/");
		System.out.print(employee.getSalary() + "/");
		System.out.print(employee.getTitle());
	}
}
