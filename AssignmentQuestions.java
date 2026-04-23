import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AssignmentQuestions {
    public static boolean isMonotonic(ArrayList<Integer> list) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                increasing = false;
            }
            if (list.get(i) < list.get(i + 1)) {
                decreasing = false;
            }
        }
        return increasing || decreasing;
    }

    public static List<Integer> findLonelyNumbers(ArrayList<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums.size();

        for (int num : nums) {
            // Check frequency == 1
            int freq = 0;
            for (int j = 0; j < n; j++) {
                if (nums.get(j) == num) {
                    freq++;
                }
            }
            if (freq != 1) continue;

            // Check no num-1 or num+1 exists
            boolean hasAdj = false;
            for (int j = 0; j < n; j++) {
                if (nums.get(j) == num - 1 || nums.get(j) == num + 1) {
                    hasAdj = true;
                    break;
                }
            }
            if (!hasAdj) {
                result.add(num);
            }
        }

        // Remove duplicates if any (though freq check prevents)
        return result.stream().distinct().toList();
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);
        System.out.println(findLonelyNumbers(list));
    }
}