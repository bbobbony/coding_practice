import java.util.Scanner;

public class Oven_Maker_20250321 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		//처음 생각 해 본 방법, 그러나 24시간이 넘으면 계속 숫자가 커지는 오류가 있고 코드가 지저분하다(같은 내용이 반복됨)
//		if (A == 23) {// 시간이 23시간 인경우
//			A = ((B + C) / 60) - 1;
//			B = ((B + C) % 60); //분을 60으로 나눈 나머지가 조리완료 후의 분
//			System.out.print(A + " " + B);
//		} else {
//			if ((B + C) < 60) {// 현시각의 분과 조리시간의 합이 60 미만인 경우
//				B = B + C;
//				System.out.print(A + " " + B);
//			} else if ((B + C) >= 60) {// 현시각의 분과 조리시간의 합이 60 이상인 경우
//				A += ((B + C) / 60);
//				B = ((B + C) % 60);
//				System.out.print(A + " " + B);
//			}
//		}
		//인터넷을 보며 새롭게 습득한 방법
		// 현재 시간과 조리 시간을 합친 후, 그 값이 60분 이상이면 시간도 더해야 함
		int totalMinutes = B + C; // 현재 분과 조리 시간을 더한 값

		// 시간 계산: 전체 분을 60으로 나누어 시간 계산
		A = (A + totalMinutes / 60) % 24; // 24시간 기준으로 시간 계산
		B = totalMinutes % 60; // 60분을 초과한 부분은 분으로 남음

		System.out.println(A + " " + B);

	}
}
