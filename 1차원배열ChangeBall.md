# 백준 1차원배열 10813번 JAVA
### Q. 배열 중 I와 J를 입력하여 두 숫자의 위치를 바꾸고 출력

### A. Scanner를 사용하기
```java
import java.util.Scanner;

public class ChangeBall_20250327 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 바구니 개수
        int[] arr = new int[N];
        int M = sc.nextInt(); // 던지는 횟수
        int cnt = 1;

        // 초기 공 번호를 바구니에 넣음
        for (int i = 0; i < N; i++) {
            arr[i] = cnt;
            cnt++;
        }

        // M번 만큼 두 바구니의 공 번호를 바꾼다
        for (int k = 0; k < M; k++) {
            int i = sc.nextInt(); // i번 바구니
            int j = sc.nextInt(); // j번 바구니

            // i번과 j번 바구니의 공 번호를 바꿈
            int temp = arr[i - 1]; // i번 바구니의 공 번호
            arr[i - 1] = arr[j - 1]; // j번 바구니의 공 번호를 i번 바구니에 넣음
            arr[j - 1] = temp; // i번 바구니의 공 번호를 j번 바구니에 넣음
        }

        // 결과 출력
        for (int l = 0; l < arr.length; l++) {
            System.out.print(arr[l] + " ");
        }
    }
}

```


