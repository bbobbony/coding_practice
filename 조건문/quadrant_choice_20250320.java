import java.util.Scanner;

public class quadrant_choice_20250320 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		 //사분면의 부호값을 조건으로 나누어 사분면을 구분한다.
		if(x>0 && y>0) {
			System.out.println("1");
		}else if(x<0 && y>0) {
			System.out.println("2");
		}else if(x<0 && y<0) {
			System.out.println("3");
		}else {
			System.out.println("4");
		}

	}

}
