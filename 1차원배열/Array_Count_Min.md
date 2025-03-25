# 백준 1차원배열 10871번 JAVA
### Q. 수열에서 입력값보다 작은값 출력하기
<br>

#### A. Scanner 사용하기
```java
import java.util.Scanner;

public class Array_count_min_20250325 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] A = new int[N];
        int count = 0;

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        for (int Num : A) {
            if (Num < X) { // 배열의 수가 입력한 수보다 작은 경우
                System.out.print(Num + " "); // 배열의 원소를 출력
            }
        }

    }

}

```

<br>

