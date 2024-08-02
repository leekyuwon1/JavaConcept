package baek;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // 총 금액
        int n = sc.nextInt(); // 구매한 물건의 갯수
        int a = sc.nextInt(); // 아이템 가격
        int b = sc.nextInt(); // 아이템 갯수


        while (true) {
            int result = a * b;
            if (result == x) {
                System.out.println("Yes");
                break;
            }else{
                System.out.println("No");
            }
        }
    }
}
