import java.util.Arrays;

class Sol5 {

    static int[] diceSort(int[] rolls) {
        int[] count = new int[7];

        for (int i = 0; i < rolls.length; i++) {
            count[rolls[i]]++;
        }

        System.out.print("Counts: ");

        for (int i = 1; i <= 6; i++) {
            System.out.print(i + ":" + count[i] + " ");
        }

        System.out.println();

        int[] sorted = new int[rolls.length];
        int index = 0;

        for (int i = 1; i <= 6; i++) {
            for (int j = 0; j < count[i]; j++) {
                sorted[index] = i;
                index++;
            }
        }

        return sorted;
    }

    public static void main(String[] args) {
        int[] rolls1 = {4, 1, 6, 4, 2, 1, 4};

        int[] result1 = diceSort(rolls1);
        System.out.println("Sorted: " + Arrays.toString(result1));

        System.out.println();

        int[] rolls2 = {6, 3, 2, 5, 1, 3, 6, 2};

        int[] result2 = diceSort(rolls2);
        System.out.println("Sorted: " + Arrays.toString(result2));
    }
}