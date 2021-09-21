package sample;

public class Foo implements Versionable {
	public String version() {
		return "Foo version 2.0";
	}
}

class Bar implements Versionable {
	public String version() {
		return "Bar version 1.5";
	}
}
