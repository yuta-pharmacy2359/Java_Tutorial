package pass;


class A implements Runnable, Sortable {
	public void sort() {}
	public void run() {}
}

/*
class B implements Visible {
	public void sort() {}
	public void run() {}
	public void read() {}
}
*/

class C implements Sortable {
	public void sort() {}
	public void run() {}
	public void disp() {}
}

/*
class D implements Visible {
	public void disp() {}
}
*/

/*
class E implements Runnable {
	public void disp() {}
	public void sort() {}
}
*/

class F implements Visible {
	public void disp() {}
	public void sort() {}
	public void run() {}
	public void read() {}
}