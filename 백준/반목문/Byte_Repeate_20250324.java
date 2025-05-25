import java.util.Scanner;

public class Byte_Repeate_20250324 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Scope = N / 4;
        String count = "";

        // 'long'을 Scope만큼 반복
        for (int i = 0; i < Scope; i++) {
            count += "long";  // "long"을 추가
            if (i < Scope - 1) {  // 마지막 'long' 뒤에는 공백을 넣지 않도록 처리
                count += " ";  // 공백 추가
            }
        }

        // 결과 출력
        System.out.print(count + " int");
    }
}
