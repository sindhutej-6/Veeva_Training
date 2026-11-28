import java.util.*;

public class MaxSubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int curr_s = arr[0];
        for(int i = 0;i<n;i++){
            curr_s = Math.max(curr_s+arr[i],arr[i]);
            max = Math.max(curr_s,max);
        }
        System.out.println(max);
  }
}
