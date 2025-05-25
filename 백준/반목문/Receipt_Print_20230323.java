//첫째줄에는 영수증에 적힌 총금액 X
//둘째줄에는 구매한 물건의 종류의 수
//이후 N개의 줄에서는 각 물건의 가격 a와 개수 b가 공백을 두고 주어짐
//총 금액과 물건의 값과 개수의 합이 맞다면 Yes를 출력/아니라면 No를 출력

import java.util.Scanner;

public class Receipt_Print_20230323 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt(); // 영수증에 적힌 최종 금액
		int N = sc.nextInt(); // 구매한 물품 종류의 개수
		int sum=0; //계산 된 금액

		for (int i = 0; i < N; i++) {
			int a = sc.nextInt(); // 물품 금액
			int b = sc.nextInt(); // 물품 개수
			sum += a*b;
		}
		sc.close();
		if(sum == X) {
			System.out.println("Yes");
		}else {
			System.out.print("No");
		}
	}

}
