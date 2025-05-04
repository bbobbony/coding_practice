# 백준 1차원배열 1546번 JAVA
### Q. 점수 N개를 입력받은 뒤, 최댓값을 기준으로 각 점수를 (점수 / 최댓값) × 100으로 변환한 후, 새로운 평균을 출력하시오

##### A. Scanner 사용하기
```java
import java.util.Scanner;

public class Score_Manipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 과목 수
        double[] scores = new double[n];
        double max = 0;

        // 점수 입력 및 최댓값 찾기
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextDouble();
            if (scores[i] > max) {
                max = scores[i];
            }
        }

        // 새로운 점수 계산하여 평균 구하기
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (scores[i] / max) * 100;
        }

        double average = sum / n;
        System.out.println(average);
    }
}

```
