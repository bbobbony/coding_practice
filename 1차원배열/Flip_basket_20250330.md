# 백준 1차원배열 10811번 JAVA
### Q. 주어진 범위 (i~j)의 바구니 순서를 역순으로 뒤집기

<br>


#### A. while문을 사용해보기
```java
import java.util.Scanner;

public class Flip_Basket_20250330 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 바구니 개수
		int M = sc.nextInt(); // 바꾸는 횟수
		int[] basket = new int[N]; // 바구니 배열 선언

		// 바구니 번호 초기화 (1부터 N까지)
		for (int num = 0; num < N; num++) {
			basket[num] = num + 1; // 바구니에 있는 번호의 값이 들어가야 하므로 +1하기
		}

		// M번에 걸쳐 범위 뒤집기
		for (int ty = 0; ty < M; ty++) {
			int i = sc.nextInt() - 1; // 입력값을 배열 인덱스에 맞추기 위해 -1하기
			int j = sc.nextInt() - 1;

			// **i~j 범위를 뒤집기 **
			while (i < j) { // 핵심은 서로 엇갈리면 멈춘다!!! + 백준에서는 i<=j이기 때문에 그 외의 경우는 고려 X
				int temp = basket[i];
				basket[i] = basket[j];
				basket[j] = temp;
				i++;
				j--;
			}
		}

		// 결과 출력
		for (int num : basket) {
			System.out.print(num + " ");
		}

		sc.close(); // Scanner 닫기
	}
}

```
