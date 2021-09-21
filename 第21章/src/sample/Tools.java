package sample;

interface Printable {
	void print();
}

interface Editable extends Printable {
	String edit();
}

public class Tools implements Editable {

	@Override
	public void print() {
		System.out.println("print()");
	}

	@Override
	public String edit() {
		return "edit()";
	}

}
