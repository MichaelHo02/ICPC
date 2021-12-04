import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;

public class MyTemplate {
    public static void main(String[] args) throws Exception {
        BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(infile.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        /*
        int T = Integer.parseInt(stringTokenizer.nextToken());
        StringBuilder stringBuilder = new StringBuilder();
        while (T-- > 0) {
            stringTokenizer = new StringTokenizer(infile.readLine());
            int N = Integer.parseInt(stringTokenizer.nextToken());
            int[] arr = readArr(N, infile, stringTokenizer);
        }
        */
    }

    public static int[] readArr(int N, BufferedReader infile, StringTokenizer stringTokenizer) throws  Exception {
        int[] arr = new int[N];
        stringTokenizer = new StringTokenizer(infile.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        return arr;
    }

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.println(i + " ");
        }
        System.out.println();
    }

    public static void sort(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer integer : list) {
            list.add(integer);
        }
        Collections.sort(list);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
    }

    public static boolean isPrime(long n) {
        if (n < 2) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        long sqrtN = (long) Math.sqrt(n) + 1;
        for (long i = 6L; i < sqrtN; i++) {
            if (n % (i - 1) == 0 || n % (i + 1) == 0) return false;
        }
        return true;
    }

    public static long gcd(long a, long b) {
        if (a > b) {
            a = (a + b) - (b = a);
        }
        if (a == 0L) {
            return b;
        }
        return gcd(b % a, a);
    }

    public static ArrayList<Integer> findDiv(int N) {
        // generate all divisor of N
        ArrayList<Integer> ls1 = new ArrayList<>();
        ArrayList<Integer> ls2 = new ArrayList<>();
        for (int i = 1; i <= (int) (Math.sqrt(N) + 0.00000001); i++) {
            if (N % i == 0) {
                ls1.add(i);
                ls2.add(N / i);
            }
        }
        Collections.reverse(ls2);
        for (Integer integer : ls2) {
            if (integer != ls1.get(ls1.size() - 1)) {
                ls1.add(integer);
            }
        }
        return ls1;
    }


}
