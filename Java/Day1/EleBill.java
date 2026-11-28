import java.util.*;

public class EleBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double u = sc.nextDouble();
        double bill = 50.0;

        if (u <= 100) {
            bill += u * 1.5;
        } else if (u <= 200) {
            bill += 100 * 1.5 + (u - 100) * 2.5;
        } else {
            bill += 100 * 1.5 + 100 * 2.5 + (u - 200) * 4.0;
        }

        System.out.printf("%.2f%n", bill);
    }
}
