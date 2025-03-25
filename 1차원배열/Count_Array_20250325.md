# 백준 1차원배열 10807번 JAVA
### Q. 수열에서 특정 숫자가 몇 번 나오는지 세기

#### A. Scanner를 사용하기
```java
import java.util.Scanner;//Scanner 불러오기

public class Count_Number_20250325 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 수열의 개수 입력
        int[] sequence = new int[N]; // 수열을 저장할 배열 생성

        for (int i = 0; i < N; i++) { // N개의 숫자를 입력받아 배열에 저장
            sequence[i] = sc.nextInt();
        }

        int target = sc.nextInt(); // 찾을 정수 입력
        int count = 0;

        for (int num : sequence) { // 배열을 순회하면서 입력한 정수의 개수 카운트
            if (num == target) {
                count++;//현재 숫자와 입력한 수가 같으면 1씩 증가
            }
        }

        System.out.println(count); // 결과 출력
        sc.close();
    }
}
```
