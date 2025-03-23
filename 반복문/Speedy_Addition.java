import java.io.BufferedReader; // BufferedReader 클래스 import: 빠른 입력을 위해 사용
import java.io.BufferedWriter; // BufferedWriter 클래스 import: 빠른 출력을 위해 사용
import java.io.IOException; // 입출력 예외 처리를 위한 클래스 import
import java.io.InputStreamReader; // System.in으로부터 데이터를 읽기 위한 클래스 import
import java.io.OutputStreamWriter; // System.out으로 데이터를 출력하기 위한 클래스 import
import java.util.StringTokenizer; // 문자열을 구분자로 분리하는 클래스 import

public class Speedy_Addition {

	public static void main(String[] args) throws IOException { // main 메서드 정의 (IOException 발생할 수 있음)

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader로 입력을 받기 위한 객체 생성
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // BufferedWriter로 출력을 위한 객체 생성

		int N = Integer.parseInt(br.readLine()); // 첫 번째 줄에서 테스트 케이스의 개수 N을 입력받고 정수로 변환

		StringTokenizer st; // StringTokenizer 객체 선언, 이후 입력받은 문자열을 구분자로 나누기 위해 사용

		for (int i = 0; i < N; i++) { // 테스트 케이스 수만큼 반복
			st = new StringTokenizer(br.readLine(), " "); // 한 줄을 읽고 공백을 기준으로 문자열을 분리하여 StringTokenizer 객체에 저장
			// StringTokenizer는 입력된 문자열을 구분자로 나누어 하나씩 꺼내서 사용할 수 있게 해줌
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n"); // 두 수를 더한 값을 출력 버퍼에
																									// 기록
			// st.nextToken()을 사용해서 공백을 기준으로 나눈 두 값을 Integer.parseInt로 정수로 변환하고 더한 후, 그 결과를
			// 출력 버퍼에 기록
		}
		br.close(); // BufferedReader를 닫아 입력 스트림을 종료

		bw.flush(); // BufferedWriter의 버퍼에 기록된 내용을 출력 스트림으로 내보냄
					// 데이터를 쌓은 후 한번에 출력하는 방식으로 성능을 최적화 할 수 있다.
		bw.close(); // BufferedWriter를 닫아 출력 스트림을 종료
	}
}
