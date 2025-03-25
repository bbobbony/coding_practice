# 백준 1차원배열 10807번 JAVA
### Q. 수열에서 특정 숫자가 몇 번 나오는지 세기
<br>

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
<br>

#### A. Buffered를 사용하기
```java
import java.io.*;

public class Count_Number_20250325 {

    public static void main(String[] args) throws IOException { // 예외처리  반드시 해주기!!!!!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); // 수열의 전체 개수 입력 받기
        int[] sequence = new int[N]; // 크기가 N인 배열 선언과 생성을 동시에

        for (int i = 0; i < N; i++) {
            sequence[i] = Integer.parseInt(br.readLine()); // 배열에 입력한 값 집어넣기
        }

        int target = Integer.parseInt(br.readLine()); // 개수 셀 숫자 입력하기
        int count = 0;

        for (int num : sequence) {
            if (num == target) {
                count++;
            }
        }

        // 결과 출력
        bw.write(count + "\n");
        bw.flush(); // 출력 버퍼 비우기
        bw.close(); // BufferedWriter 닫기
        br.close(); // BufferedReader 닫기
    }
}

```

<br>


### ✅ Scanner와 Buffered의 장단점
<br>

| 구분 | Scanner | Buffered |
|----|----|----|
|입력 속도|상대적으로 느림(버퍼링없음)|빠름(버퍼링으로 한번에 처리)|
|사용 용이성|사용이 간단하고 직관적|다소 복잡한 코드|
|메모리 사용|상대적으로 적음|상대적으로 많음(버퍼를 사용해 메모리를 더 사용)|
|성능|작은 입력에선 무난하지만 큰 입력에선 느림|대용량 입력에서 성능이 우수함|
|예외 처리|예외 처리 필요 없음|예외처리가 필수|
|출력 속도|상대적으로 느림|빠름(BufferedWriter 사용 시 성능 우수)|


