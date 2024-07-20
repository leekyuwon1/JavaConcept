package baek;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.close();

        m += n;
        while (m >= 60) {
            m -= 60;
            h++;
            if (h > 23) {
                h = 0;
            }
        }
        System.out.println(h);
        System.out.println(m);
    }
}
