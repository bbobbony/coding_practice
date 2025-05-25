# 백준 1차원배열 1546번 JAVA
### Q. 최댓값을 기준으로 점수를 비례적으로 조정하여 평균을 계산하기

#### A. 검색없이 처음 작성해 본 코드
```java
import java.util.Scanner;
//틀린이유 평균계산식이 잘못됨, 출력 방식이 잘못됨, 자료형 오용
//그러나 배열을 이용한 접근과 최댓값을 찾는 방식은 아주 깔끔함! 칭찬100개

public class Max_Average_Cal_20250331 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 과목개수
		int[] score = new int[N]; // 시험 점수들을 보관할 배열
		int max = score[0]; // 최댓값/ 설정
		int sum = 0;// 합계값을 지정해두는 변수

		int[] a = new int[N];

		for (int i = 0; i < N; i++) {
			score[i] = sc.nextInt(); // 입력 받은 점수 넣기
			if (max < score[i]) {
				max = score[i]; // 최댓값 알고리즘
			}
		}

		for (int j = 0; j < N; j++) {// 조작된 점수로 평균값 구하기
			int ever = score[j] / (max * 100); // 조작한 값 변수 처리 <-- 이부분과 + double 자료형 사용 X
			a[j] = ever; // 조작된 점수를 넣는 배열
		}

		for (int num : a) {

			sum += num;
		}
		int avg = sum / N;
		System.out.print(avg);<-- printf를 사용하지 않음(소수점 둘때자리까지 출력 미완성)
	}

}

```

<br>

#### A. 구글링 + copilot을 사용해 오답을 고쳐낸 코드


```java
import java.util.Scanner;

public class Max_Average_Cal_20250331 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 과목개수
        int[] score = new int[N]; // 시험 점수들을 보관할 배열
        int max = 0; // 최댓값을 0으로 초기화
        int sum = 0; // 합계값을 지정해두는 변수

        for (int i = 0; i < N; i++) {
            score[i] = sc.nextInt(); // 입력 받은 점수 넣기
            if (max < score[i]) {
                max = score[i]; // 최댓값 알고리즘
            }
        }

        for (int i = 0; i < N; i++) {
            // 점수를 최댓값에 맞춰서 비율을 계산하고 100을 곱함
            sum += (double) score[i] / max * 100; // 조작된 점수를 더하기 + 실수형으로 형변환!!!
        }

        // 평균값을 실수로 계산
        double avg = sum / (double) N;
        System.out.printf("%.2f", avg); // 소수점 2자리까지 출력
    }
}

```
<br>


### 보완해야 할 점은 무엇이 있을까? 🤔
- printf()의 출력형식
- 연산에서 double, int 자료형의 형변환, 쓰임새
-  불필요한 변수생성 X, 반복문안에서 깔끔하고 가독성있게 코드짜기
