import java.util.*;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        if (n == 0) return;
        k %= n;

        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[(i + k) % n] = a[i];
        }

        for (int i = 0; i < n; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(res[i]);
        }
    }
}
