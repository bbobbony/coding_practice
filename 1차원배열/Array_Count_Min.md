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

#### A. Buffered 사용하기
```java
import java.io.*;

public class Array_count_min_20250325 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 첫 번째 줄에서 N과 X를 공백으로 구분하여 읽고 바로 변수에 할당
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int X = Integer.parseInt(input[1]);

        // 두 번째 줄에서 수열 원소들을 공백으로 구분하여 읽음
        String[] numbers = br.readLine().split(" ");

        // 수열의 각 원소를 하나씩 비교하여 출력
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(numbers[i]);
            if (num < X) {
                bw.write(num + " ");
            }
        }

        // 버퍼 비우고 자원 해제
        bw.flush();
        bw.close();
        br.close();
    }
}

```

