import java.util.*;
public class first {
    public static void printList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    public static int getMax(ArrayList<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            max = Math.max(max, list.get(i));
        }
        return max;
    }

    public static void getSwapped(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(55);
        list.add(46);
        list.add(98);
        list.add(22);

        // Max in list
        // System.out.println("Max in list: " + getMax(list));

        // Swapping
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(5);
        list2.add(9);
        list2.add(3);
        list2.add(6);
        printList(list2);
        getSwapped(list2, 1, 3);
        printList(list2);
    }
}
