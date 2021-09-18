package exercise;

public class Renraku_Meibo extends Meibo {
	private String mail;
	private String phone;
	public Renraku_Meibo(String name, String address, String mail, String phone) {
		super(name, address);
		this.mail = mail;
		this.phone = phone;
	}
	public String getMail() {
		return mail;
	}
	public String getPhone() {
		return phone;
	}
	public void call() {

	}
}
