package pass;

interface Runnable {
	void run();
}

interface Sortable {
	void sort();
}

interface Visible extends Runnable, Sortable {
	void disp();
}
