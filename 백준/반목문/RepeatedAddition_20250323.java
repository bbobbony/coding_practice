import java.util.Scanner;

public class RepeatedAddition_20250323 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt(); // 입력 받을 횟수
       
        for (int i = 0; i < count; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b); // 각 입력에 대해 결과 출력
        }
    }
}
