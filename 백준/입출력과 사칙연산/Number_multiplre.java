import java.util.Scanner;

public class Number_multiplre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int first = sc.nextInt();
		String second = sc.next();
        
		sc.close();
		
		//charAt()으로 문자열에서 자릿수를 가져와 바로 곱해주기
		System.out.println(first * (second.charAt(2) - '0')); //단계별 풀이는 자릿수별로 바로 하기
		System.out.println(first * (second.charAt(1) - '0'));
		System.out.println(first * (second.charAt(0) - '0'));
		System.out.println(first * Integer.parseInt(second)); //실질적인건 문자가 곱해지기 때문에 꼭 정수형으로 형변환 필수
		
 
//		//변수없이 조금 더 간결하게
//		System.out.println(first*(second%10));
//		System.out.println(first*(second%100/10));
//		System.out.println(first*(second/100));
//		System.out.println(first*second);
		
		// 내가 우선적으로 생각해 본 방법
//		int one = second%10;
//		int ten= (second%100)/10*10;	
//		int hund= (second/100)*100;
//		
//		int three = first * one;
//		int four = first * ten;
//		int five = first * hund;
//		
//		int sum = three + four + five;
//		
//		System.out.println(three);
//		System.out.println(four);
//		System.out.println(five);
//		System.out.println(sum);

		
		
	}

}
