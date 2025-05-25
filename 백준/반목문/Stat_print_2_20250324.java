import java.util.Scanner;

public class Stat_print_2_20250324 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		// 별과 공백을 출력하는 반복문
		for (int i = 1; i <= N; i++) {
			// 공백 문자열
			String empty = " ".repeat(N - i);
			// 별 문자열
			String star = "*".repeat(i);

			// 공백 + 별 출력
			System.out.println(empty + star);
		}
	}
}
