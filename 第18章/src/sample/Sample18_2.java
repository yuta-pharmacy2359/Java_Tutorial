package sample;

public class Sample18_2 {
	public static void main(String[] args) {
		StudentMember student = new StudentMember(100, "田中宏", "2000-06-18");
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getBirthday());
	}
}
