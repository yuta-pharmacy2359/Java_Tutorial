package pass;

public class Bookshop implements Readable {
	private String name;

	public Bookshop(String name) {
		this.name = name;
	}

	public void read() {
		System.out.println("Readable");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
