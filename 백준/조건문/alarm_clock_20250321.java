import java.util.Scanner;

public class alarm_clock_20250321 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int M = sc.nextInt();

		if (M >= 45) {// 분이 45보다 크거나 같은 경우
			M -= 45;
			System.out.print(H + " " + M);
		} else {
			if (H == 0) {// 시간이 0시 즉, 자정인 경우
				H = 23;
				M = (60 + M) - 45;
				System.out.print(H + " " + M);
			} else if (H > 0) {// 시간이 0보다 큰 경우
				H -= 1;
				M = (60 + M) - 45;
				System.out.print(H + " " + M);
			}
		}

	}

}
