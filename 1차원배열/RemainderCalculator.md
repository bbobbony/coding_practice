# 백준 1차원배열 3052번 JAVA
### Q. 정수 10개를 입력하고 각각을 42로 나눈 나머지의 값이 다르다면 다른 나머지개수 값을 출력하시오
<br>

#### A. 배열과 기본적인 알고리즘을 사용하기
```java
import java.util.Scanner;

public class RemainderCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10]; //입력 받는 수를 담아 둘 배열
        boolean[] isRemainderExist = new boolean[42]; // 나머지 값이 이미 나왔는지 체크할 배열 0~42까지

        // 배열에 입력값 받기
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt(); // 입력값 배열에 넣어주기
        }

        int count = 0; // 서로 다른 나머지의 개수(최종적으로 출력 될 아이)

        // 나머지를 체크하며 배열에서 중복을 확인
        for (int i = 0; i < 10; i++) {
            int remainder = arr[i] % 42; // 나머지 계산 + 나머지 변수의 생성 및 선언 한번에
            if (!isRemainderExist[remainder]) {  // 만약 해당 나머지가 이미 나온 적이 없다면
                isRemainderExist[remainder] = true;  // 해당 나머지를 기록
                count++;  // 서로 다른 나머지 개수 증가
            }
        }

        // 서로 다른 나머지 개수 출력
        System.out.println(count);
    }
}

```
