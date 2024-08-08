package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array = sc.nextLine().split(" ");
        int n = sc.nextInt();
        int a = 0;
        for (int i = 0; i < n; i++) {

        }

        String s = sc.nextLine();
        for (int i = 0; i < n; i++) {
            if (array[i] == s) {
                a++;
            }
        }
    }

//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int[] array = new int[n];
//        int a = 0;
//
//        for (int i = 0; i < n; i++) {
//            StringTokenizer in = new StringTokenizer(br.readLine(), " ");
//            array[i] = Integer.parseInt(in.nextToken());
//        }
//
//        for (int i = 0; i < n; i++) {
//            StringTokenizer in1 = new StringTokenizer(br.readLine(), " ");
//            if (array[i] == Integer.parseInt(in1.nextToken())) {
//                a++;
//            }
//        }
//        System.out.println(a);
//    }
}

