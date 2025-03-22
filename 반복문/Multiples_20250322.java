import java.util.Scanner;
public class multiples_20250322 {
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);	
		int a = in.nextInt();
		
		in.close();		
		
		for(int i = 1; i<10;i++) {
			System.out.println(a+" * "+i+" = "+(a*i)); //각 문자열 사이에 공백 반드시 넣을 것!! 안그러면 계속 오류 발생
		}
	}
}
