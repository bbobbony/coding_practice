# 백준 1차원 배열 10818번 JAVA


### Q. 주어진 숫자들 중 최댓값과 최솟값을 찾아 출력하시오.

#### A. 기본적인 최대, 최소 알고리즘으로 풀기
```java
import java.util.Scanner;
//이방법 외에도 내장함수를 이용하는 방법 두가지가 더 있다.
//Math.Max() or Integer.MaxVALUE;
public class Max_and_Min_20250326 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println("올바른 입력값을 넣어주세요.");
            return;
        }

        int[] numbers = new int[N]; // 입력값을 저장할 배열
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt(); // 배열에 값 저장
        }

        // 첫 번째 값을 기준으로 초기화
        int max = numbers[0];
        int min = numbers[0];

        // 배열을 순회하면서 최댓값과 최솟값 찾기
        for (int i = 1; i < N; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            } 
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println(min + " " + max); // 최솟값과 최댓값 출력
    }
}

```




