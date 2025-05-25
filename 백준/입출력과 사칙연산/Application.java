import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String lastString = "??!";
		
		String s=sc.next();
		System.out.print(s+lastString);//사용자가 입력한 아이디에 ??!추가
		
		sc.close();
		
		
	}

}
