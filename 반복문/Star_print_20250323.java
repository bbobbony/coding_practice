//첫째줄부터 N번째 줄까지 차례대로 별을 출력한다.

import java.util.Scanner;
public class Star_print_20250323 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String line ="";
		for(int i =0; i<N; i++) {
			line += "*";
			System.out.println(line);
		}

	}

}
