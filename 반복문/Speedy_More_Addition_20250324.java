import java.io.BufferedReader; //빠른 입력을 위해 사용
import java.io.BufferedWriter; //빠른 출력을 위해 사용
import java.io.IOException; //입출력 예외 처리를 위한 클래스 import
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer; //문자열을 구분자로 분리하는 클래스 import

public class Speedy_More_Addition_20250324 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine()); // N값을 입력 받고 정수형으로 변환
        
        StringTokenizer st; // 입력 받은 문자열을 구분자로 나누기 위해 사용
        
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine(), " "); // 한 줄을 읽고 공백을 기준으로 문자열을 분리
            int sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
            bw.write("Case #" + i + ": " + sum + "\n");
            //sum변수를 따로 만들어 bw.write(sum)형식으로 해주면 되는거군아
        }
        
        br.close();
        bw.flush(); // BufferedWriter의 버퍼에 기록된 내용을 출력스트림으로 내보냄
        bw.close();
    }
}
