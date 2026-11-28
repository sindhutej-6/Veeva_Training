import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                double r = sc.nextDouble();
                System.out.printf("%.2f%n", 3.14 * r * r);
                break;
            case 2:
                double l = sc.nextDouble();
                double b = sc.nextDouble();
                System.out.printf("%.2f%n", l * b);
                break;
            case 3:
                double base = sc.nextDouble();
                double h = sc.nextDouble();
                System.out.printf("%.2f%n", 0.5 * base * h);
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
