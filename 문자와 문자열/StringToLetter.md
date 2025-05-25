# 백준 문자와문자열 27688번 JAVA

### Q. 문자열S와 정수형i를 입력 받아 S문자열 중 i번째 문자를 출력하시오.

#### A. toCharArray() 사용하기
```java
import java.util.Scanner;

public class lettera_and_strings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();// 단어를 입력 받을 String형 변수
		int  i= sc.nextInt();// n번째 철자 순번을 불러올 int형 변수
		
		// 문자열을 문자 배열로 변환
		char[] arr = new char[S.length()];
		
		// 문자 하나하나를 배열에 저장하기
		for(int j =0; j<S.length(); j++) {
			arr[j] = S.toCharArray()[j];
		}
		
		System.out.println(arr[i-1]);
		
		sc.close();
	}
}

```

<br>

#### A. charAt() 사용하기
```java
import java.util.Scanner;

public class lettera_and_strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String i = sc.next(); // 단어를 입력받음
        int S = sc.nextInt(); // n번째 철자 순번을 입력받음
        
        // 문자열의 인덱스는 0부터 시작하므로 S-1 번째 문자를 출력
        System.out.println(i.charAt(S - 1));

        sc.close();
    }
}

```

<br>

### ✅ toCharArray()와 charAt(), char[]의 차이는 뭘까?

|방식|설명|장점|단점|사용예시|
|--|--|--|--|--|
|charAt(index)|문자열에서 특정 인덱스의 문자 하나를 가져옴| 배열을 만들 필요 없음 → 간결하고 메모리 효율적|문자열이 길어도 반복문 없이 한 문자씩만 가져와야 함|```java"apple".charAt(2); //'p'```|
|char[] 베얄| toCharArray() 없이 직접 char[]로 선언 후 사용|특정 문자들을 수정 가능|직접 초기화해야 하므로 유동적인 문자열 처리 어려움|```java char[] arr = {'a', 'p', 'p', 'l', 'e'};```|
|toCharArray() | String을 문자 배열(char[])로 변환 | 한 번 변환하면 여러 문자에 반복적으로 접근 가능 |변환 시 새로운 배열이 생성되므로 메모리 사용 증가|```java "apple".toCharArray(); // {'a', 'p', 'p', 'l', 'e'}```|

#### 한글자만 가져올 땐? 👉CharAt()

#### 배열을 직접만들고 싶을 땐? 👉char[]

#### 문자열 전체를변환하고 싶을 땐? 👉toCharArray()

