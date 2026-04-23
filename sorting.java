import java.util.*;

public class sorting {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(2);
        nums.add(9);
        nums.add(1);
        nums.add(3);

        nums.sort(Comparator.naturalOrder());
        System.out.println("Ascending order: " + nums);
        nums.sort(Comparator.reverseOrder());
        System.out.println("Descending order: " + nums);

        // // Collection method
        // Collections.sort(list);
        // System.out.println("Ascending order: " + list);

        // Collections.sort(list, Collections.reverseOrder());
        // System.out.println("Descending order: " + list);
    }
}