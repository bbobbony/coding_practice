# 백준 1차원배열 2562번 JAVA
### Q. 값 9개를 입력 받아 최댓값과 그 값의 위치를 출력하시오.

<br>

#### A. Integer.MIN_VALUE를 사용하기
```java
import java.util.Scanner;

public class FindMaxAndIndex_20250326 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int max = Integer.MIN_VALUE; // 최댓값을 저장할 변수
		int index = -1; // 최댓값의 위치를 저장할 변수

		// 9개의 수 입력 받기
		for (int i = 0; i < 9; i++) {
			int num = sc.nextInt(); // 입력된 숫자

			// Math.max()로 최댓값을 구하고, 위치도 기록
			if (num > max) {
				max = num;
				index = i + 1; // 인덱스는 1부터 시작하므로 i+1
			}
		}

		// 결과 출력
		System.out.println(max); // 최댓값 출력
		System.out.println(index); // 최댓값의 위치 출력
	}
}

```
