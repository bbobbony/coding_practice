import java.util.Scanner;
public class LeapYear_20250320 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		//4년마다 한번씩 오는 윤년의 주기!!`
		//윤년인 경우 1. 4의 배수이면서 100의 배수가 아닐 때/ 2. 400의 배수일 때
		//윤년이라면 1을 출력, 윤년이 아니라면 0을 출력
		
		if(((year % 4 == 0) && !(year%100==0)) || (year%400==0)) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}

	}

}
