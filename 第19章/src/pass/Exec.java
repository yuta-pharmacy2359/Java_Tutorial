package pass;

class Member {
	protected String name;
	public Member(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}

class StudentMember extends Member {
	int age;
	public StudentMember(String name, int age) {
		super(name);
		this.age = age;
	}
}

public class Exec {
	public static void main(String[] args) {
		StudentMember s = new StudentMember("田中宏", 20);
		System.out.println(s.name + " " + s.age);
	}
}

/*
 問1
 A. s.nameではなくs.getName()を使わないとコンパイルエラーになる→x (nameの修飾子はprotectで、同じパッケージなのでOK)
 B. a.ageではなくs.getAge()を使わないとコンパイルエラーになる→x (ageの修飾子はパッケージアクセスで、同じパッケージなのでOK)
 C. s.getName()とs.getAge()を使わないとコンパイルエラーになる→x (同上)
 D. 実行すると、田中宏 20と表示される→◯

 問2
 D. ファイル名をMember.javaにするには、Execクラスのpublicを取る。

 */


