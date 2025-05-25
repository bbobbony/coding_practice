import java.util.Scanner;
//런타임에러
public class Num_Remain_20250318 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		sc.close();
		
		int one = (A+B)%C;
		int two = ((A%C)+(B%C))%C;
		int th = (A*B)%C;
		int four = ((A%C) * (B%C))%C;
		
		int Nums[] = {one, two, th, four}; //배열에 계산값 넣어두고 foreach로 반복문 설정
		
		for(int Num:Nums) {
			System.out.println(Nums[Num]);
		}
		
//		System.out.println(one);
//		System.out.println(two);
//		System.out.println(th);
//		System.out.println(four);
		
		
	}

}
