import java.util.ArrayList;

public class classRoom {
    // brute Force approach
    // public static boolean findPair(ArrayList<Integer> list, int target) {
    // for (int i = 0; i < list.size(); i++) {
    // for (int j = i + 1; j < list.size(); j++) {
    // if (list.get(i) + list.get(j) == target) {
    // return true;
    // }
    // }
    // }
    // return false;
    // }

    // 2 pointer approach
    public static boolean findPair(ArrayList<Integer> list, int target) {
        // Define left and right pointer position
        int lp = 0;
        int rp = list.size() - 1;

        while (lp != rp) {
            int sum = list.get(lp) + list.get(rp);
            if (sum == target) { // case 1
                return true;
            }

            // case 2
            if (sum < target) {
                lp++;
            } else {
                rp--;
            }
        }
        return false;
    }

    public static boolean optimizedPairSumTwo(ArrayList<Integer> list, int target) {
        int n = list.size();
        int pivot = -1;

        for (int i = 0; i < n; i++) {
            if (list.get(i) > list.get(i + 1)) {
                pivot = i;
                break;
            }
        }

        int lp = (pivot + 1) % n;
        int rp = pivot;

        while (lp != rp) {
            int sum = list.get(lp) + list.get(rp);

            if (sum == target) {
                return true;
            }

            if (sum < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp - 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        System.out.println(optimizedPairSumTwo(list, target));
    }
}