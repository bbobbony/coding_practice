# 백준 문자와문자열 27688번 JAVA

### Q. 문자열S와  정수형i를 입력 받아 S문자열 중 i번째 문자를 출력하시오.

#### A. toCharArray() 사용하기
```java
import java.util.Scanner;

public class lettera_and_strings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();// 단어를 입력 받을 String형 변수
		int  i= sc.nextInt();// n번째 철자 순번을 불러올 int형 변수
		
		// 문자열을 문자 배열로 변환
		char[] arr = new char[S.length()];
		
		// 문자 하나하나를 배열에 저장하기
		for(int j =0; j<S.length(); j++) {
			arr[j] = S.toCharArray()[j];
		}
		
		System.out.println(arr[i-1]);
		
		sc.close();
	}
}

```
