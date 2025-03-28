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

<br>

#### A. HashSet<> 자료구조 사용하기
```java
import java.util.Scanner;
import java.util.HashSet; // Set을 사용하기 위해 import문 추가하기

public class RemainderCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        HashSet<Integer> remainders = new HashSet<>(); // 나머지를 저장할 Set

        // 배열에 입력값 받기
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt(); // 입력값 배열에 넣기
        }

        // 나머지를 Set에 저장하면서 중복을 자동으로 제거
        for (int i = 0; i < 10; i++) {
            int remainder = arr[i] % 42; // 나머지 계산
            remainders.add(remainder); // Set에 나머지 추가
        }

        // Set의 크기가 서로 다른 나머지 개수
        System.out.println(remainders.size()); // 중복을 제거한 후 개수 출력하기
    }
}

```

<br>

### ✅ HashSet<>이란?

|구분|내용|
|-------------------------------------------------|-------------------------------------------------|
|구분|내용|
|정의|HashSet은 자바의 컬렌션 프레임우크에서 제공하는 Set자료구조로, 중복되지 않는 값만 저장하는 집합|
|특징|- 중복 허용 안함: 동일한 값을 두 번 넣을 수 없고 중복되는 값은 자동으로 제외됨|
||- 순서 없음: 저장된 요소의 순서를 보장하지 않음(입력 순서와 출력 순서가 다를 수 있음)|
|장점|- 빠른성능: 내부적으로 HashMap을 사용하므로 값의 추가, 삭제, 검색이 매우 빠름|
||- 중복데이터 제거: 자동으로 중복된 값을 제거해줌. 중복처리에 신경 쓸 시간 절약)|
||- 메모리 효율성: 내부적으로 HashMap을 사용하므로 효율적으로 저장하고 관리됨|
|단점|- 순서 보장 안됨: 저장된 요소들의 순서가 유지되지 않음. 순서가 중요한 경우에는 부적함함.|
||- 큰 메모리 사용: 내부적으로 HashMap을 사용하므로 메모리 사용량이 비교적 높을 수 있음.|

<br>

### ✅ 메모리 효율성과 메모리 사용량의 차이는?
#### => 메모리 사용량은 커다란 창고에 많은 물건을 보관하는 것이고, <br> 메모리 효율성은 필요한 물건만 알맞게 정리해서 공간을 최적으로 활용하는 것
#### ※ 위 두가지는 상반된 개념이 아니라 상쇄관계에 있음을 알게 되었다. 즉, 성능을 높이려면 더 많은 메모리가 필요하고 메모리를 절약하면 성능이 낮아질 수 있다는 것!





<br>
