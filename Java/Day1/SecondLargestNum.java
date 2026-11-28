import java.util.*;

public class SecondLargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> set = new TreeSet<>();
        for (int i = 0;i<n;i++) {
            set.add(sc.nextInt());
        }
        List<Integer> list = new ArrayList<>(set);
        if (list.size() >= 2) {
            System.out.println(list.get(list.size() - 2));
        }
        else{
            System.out.println("None");
        }
  }
}
