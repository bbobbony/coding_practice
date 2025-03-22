import java.util.Scanner;

public class Dice_20250322 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();        // 세 개의 주사위 눈 입력
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = 0; // 상금 총액

        if (a == b && b == c) {  // 세 개의 눈이 모두 같은 경우
            sum = 10000 + a * 1000;
        }
        else if (a == b || b == c || c == a) { // 두 개의 눈만 같은 경우
            // 두 개의 눈만 같을 때 상금 계산
            if (a == b) {
                sum = 1000 + a * 100; // a와 b가 같을 때
            } else if (a == c) {
                sum = 1000 + a * 100; // a와 c가 같을 때
            } else {
                sum = 1000 + b * 100; // b와 c가 같을 때
            }
        }
        else { // 세 개의 눈이 모두 다른 경우
            // 가장 큰 눈을 찾아서 계산
            int max = a;
            if (b > max) max = b;
            if (c > max) max = c;
            sum = max * 100;
        }

        // 결과 출력
        System.out.println(sum);
    }
}
