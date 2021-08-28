package pass;

public class Pass12_4_2 {
	public static void main(String[] args) {
		exit:
		while(true) {
			for(int i = 0; i < 5; i++) {
				if(i == 3) break exit;
				System.out.print(i);
			}
		}
	}
}

// 012