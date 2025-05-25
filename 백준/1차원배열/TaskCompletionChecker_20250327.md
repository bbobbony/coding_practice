# 백준 1차원배열 5597번 JAVA

### Q. 30명의 학생들 중 과제를 안 낸 두명의 출석번호 출력하기

#### A. Scanner를 사용하기
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[30];
        
        // 과제를 제출한 28명 학생 번호 입력받기
        for (int i = 0; i < 28; i++) {
            int done = sc.nextInt();
            arr[done - 1] = 1; // 배열에서 과제 제출한 학생 번호를 표시 (1로 설정)
        }

        // 과제를 제출하지 않은 학생 찾기
        for (int i = 0; i < 30; i++) {
            if (arr[i] != 1) {
                System.out.println(i + 1); // 1번부터 30번까지 출력
            }
        }
    }
}
```

<br>

#### A. Buffered를 사용하기
```java
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[30];
        
        // 과제를 제출한 28명 학생 번호 입력받기
        for (int i = 0; i < 28; i++) {
            int done = Integer.parseInt(br.readLine());
            arr[done - 1] = 1; // 배열에서 과제 제출한 학생 번호를 표시 (1로 설정)
        }

        // 과제를 제출하지 않은 학생 찾기
        for (int i = 0; i < 30; i++) {
            if (arr[i] != 1) {
                System.out.println(i + 1); // 1번부터 30번까지 출력
            }
        }
    }
}

```

<br>


### ✅ 어떻게 접근해야 할까?
#### => 기존의 30칸의 배열을 먼저 만들어두고 입력받은(과제제출을 한) 학생들의 값을 1로 저장,
#### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;조건문에서 i번째 배열 인덱스 값이 1이 아니라면(과제 미제출 출석번호) 출력
