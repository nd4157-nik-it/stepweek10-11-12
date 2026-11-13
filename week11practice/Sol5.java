import java.util.HashSet;

public class Sol5 {
    public static boolean hasPairWithSum(int[] nums, int target) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            int complement = target - num;

            if (set.contains(complement)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }
}