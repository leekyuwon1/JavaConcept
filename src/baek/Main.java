package baek;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        int c = 0;
        int result = 0;

        while (c != n) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            result += a * b;
            c++;
        }

        if (x == result) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
