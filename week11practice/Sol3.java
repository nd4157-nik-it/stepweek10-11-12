import java.util.HashSet;

public class Sol3 {
    public static boolean hasDuplicate(String[] transactionIds) {
        HashSet<String> set = new HashSet<>();

        for (String id : transactionIds) {
            if (set.contains(id)) {
                return true;
            }

            set.add(id);
        }

        return false;
    }
}