import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static int[] removeDuplicates(int[] arr) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 5, 5, 3, 2, 7, 2, 8, 7, 5};
        int[] result = removeDuplicates(arr);

        System.out.print("Array after removing duplicates: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
