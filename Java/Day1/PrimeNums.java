import java.util.*;

public class PrimeNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt(), R = sc.nextInt();
        boolean found = false;

        for (int n = L; n <= R; n++) {
            if (isPrime(n)) {
                if (found) System.out.print(" ");
                System.out.print(n);
                found = true;
            }
        }
        if (!found) System.out.print("None");
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
