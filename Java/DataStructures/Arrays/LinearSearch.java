import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 5 };
        // System.out.println(LinearSearch(arr, 5, 0));
        // System.out.println(LinearSearch(arr, 5, 0, new ArrayList<>()));
        System.out.println(LinearSearchWithoutArrayListInArgument(arr, 5, 0));
    }

    static boolean LinearSearch(int[] array, int target, int index) {
        if (index > array.length - 1) {
            return false;
        }
        if (array[index] == target) {
            return true;
        } else {
            return LinearSearch(array, target, index + 1);
        }
    }

    static ArrayList<Integer> LinearSearch(int[] array, int target, int index, ArrayList<Integer> list) {
        if (index > array.length - 1) {
            return list;
        }
        if (array[index] == target) {
            list.add(index);
            return LinearSearch(array, target, index + 1, list);
        } else {
            return LinearSearch(array, target, index + 1, list);
        }

    }

    static ArrayList<Integer> LinearSearchWithoutArrayListInArgument(int[] array, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index > array.length - 1) {
            return list;
        }

        if (array[index] == target) {
            list.add(index);
        }

        ArrayList<Integer> ansList = LinearSearchWithoutArrayListInArgument(array, target, index + 1);
        list.addAll(ansList);
        return list;
    }

}
