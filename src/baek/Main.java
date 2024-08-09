package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String[] stLength = new String[Integer.parseInt(st.nextToken())];
        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            if (st.nextToken() != null) {
                stLength[i] = st.nextToken();
            }
        }

        for (int i = 0; i < stLength.length; i++){
            if (N < Integer.parseInt(stLength[i])) {
                stLength[i] = stLength[i] + " ";
            }
        }
        System.out.println(Arrays.toString(stLength));
    }















//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String[] arrays = new String[sc.nextInt()];
//        int a = sc.nextInt();
//
//        for (int i = 0; i < arrays.length; i++){
//            arrays[i] = sc.next();
//        }
//
//
//        for (int i = 0; i < arrays.length; i++){
//            if (a < Integer.parseInt(arrays[i])) {
//                arrays[i] = arrays[i] + " ";
//            }
//        }
//        System.out.println(Arrays.toString(arrays));
//    }
}

