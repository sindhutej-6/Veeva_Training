import java.util.*;
import java.lang.*;
class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = 0, r,n = sc.nextInt();
        n = Math.abs(n);
        while(n>0){
            r = n%10;
            s = s + r;
            n = n/10;
        }
        System.out.println(s);
    }
}
