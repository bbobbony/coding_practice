import java.util.Scanner;

public class Scanner_FourOp {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		/* 배열을 사용하지 않은 코드
		 * int add = a+b; int sub = a-b; int mul = a*b; int div = a/b;
		 * int remain = a%b;
		 * 
		 * System.out.print(add); System.out.println(); System.out.print(sub);
		 * System.out.println(); System.out.print(mul); System.out.println();
		 * System.out.print(div); System.out.println(); System.out.print(remain);
		 */
		
		//여기서부턴 배열을 사용하서 foreach문으로 코드 간결성 향상
		
        int[] results = { // 연산 결과를 배열에 저장
            a + b,  // 더하기
            a - b,  // 빼기
            a * b,  // 곱하기
            a / b,  // 나누기
            a % b   // 나머지
        };
		
        //foreach문을 사용하여 배열의 값을 출력
        for(int result: results) {
        	System.out.println(result);
        }
		
        sc.close();
	}

}
