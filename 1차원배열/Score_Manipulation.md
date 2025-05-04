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

### <풀이과정>

#### 1. 배열안에 과목 점수들을 넣는다. <br>
#### 2. 배열 안에서 최댓값을 찾아 최댓값 변수안에 넣는다. <br>
#### 3. 배열에 있던 기존 점수들에 최댓값으로 나누고 100을 곱하는 연산을 실시한다. <br>
#### 4. 덧셈 변수를 과목수를 가지고 있는변수 N으로 나누어 평균값을 구하고 출력한다.
