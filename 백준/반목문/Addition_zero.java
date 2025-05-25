import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Addition_zero {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력 객체 생성
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 출력 객체 생성

		StringTokenizer st;

		while (true) {
			st = new StringTokenizer(br.readLine(), " "); // 한 줄을 읽고 공백을 기준으로 분리
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			if (a == 0 && b == 0) {
				break; // 두 숫자가 모두 0이면 종료
			}

			bw.write((a + b) + "\n"); // 덧셈 결과 출력
		}

		br.close();
		bw.flush();
		bw.close();
	}
}
