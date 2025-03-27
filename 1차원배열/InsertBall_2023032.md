# 백준 1차원배열 10810번 JAVA
### Q. 바구니의 개수N, 공을 넣는 횟수M을 입력 받은 후 
###    M번째 만큼 공을 던지는데, I~J번째 바구니들애 K번 공이 들어가도록 한다.
<br>

#### A. Scanner를 사용하기
```java
import java.util.Scanner;

public class InsertBall_20250326 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 바구니 개수
		int arr[] = new int[N]; // 바구니 개수만큼 배열 크기 설정
		int M = sc.nextInt();// 던지는 횟수 설정

		for (int i = 0; i < M; i++) {// 던지는 횟수만큼 범위와 공번호 정하기
			int I = sc.nextInt(); // I번 바구니부터
			int J = sc.nextInt(); // J번 바구니까지
			int K = sc.nextInt(); // K번 공

			for (int j = I - 1; j < J; j++) {
				arr[j] = K;// 배열에 K번 공 넣기
			}
		}
		for (int k = 0; k < arr.length; k++) {// 배열에서 인덱스값 대압해 줄력하기
			System.out.print(arr[k] + " ");
		}

	}

}
```
<br>

#### A. Buffered를 사용하기
```java
import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()); // StringTokenizer로 N과 M, " "(공백)으로 구분

        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int M = Integer.parseInt(st.nextToken());

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());			 // StringTokenizer로 " "(공백)으로 구분
														
            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            for(int j = I - 1; j < J; j++) {
                arr[j] = K;
            }
        }
        for(int k = 0; k < arr.length; k++) {
            bw.write(arr[k] + " ");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
```
<br>

### ✅ Split( )와 StringTokenizer 차이
### -> 둘다 문자열을 특정 구분자로 나누는 기능을 한다.



<br>


