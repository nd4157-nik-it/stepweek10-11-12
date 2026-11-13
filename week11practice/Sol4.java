import java.util.HashMap;

public class Sol4 {
    public static HashMap<String, String> buildLookup(String[][] records) {
        HashMap<String, String> lookup = new HashMap<>();

        for (String[] record : records) {
            lookup.put(record[0], record[1]);
        }

        return lookup;
    }

    public static String getDepartment(HashMap<String, String> lookup, String employeeId) {
        return lookup.getOrDefault(employeeId, "Unknown");
    }
}