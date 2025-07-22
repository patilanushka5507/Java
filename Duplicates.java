
import java.util.*;

public class Duplicates {

    public static void main(String[] args) {
        int[] arr = {3, 2, 3, 1, 2, 4};
        Set<Integer> set = new HashSet<>();

        System.out.print("Output: ");
        for (int num : arr) {
            if (!set.contains(num)) {
                System.out.print(num + " ");
                set.add(num);
            }
        }
    }
}
