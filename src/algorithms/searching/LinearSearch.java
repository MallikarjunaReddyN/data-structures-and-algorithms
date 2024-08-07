package algorithms.searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {4, 8, 2, 6, 1, 9, 5, 3, 7};
        int target = 7;
        int index = linearSearch(array, target);
        if (index != -1) {
            System.out.printf("Element found at %d index", index);
        } else {
            System.out.println("Element not found");
        }
    }
    public static int linearSearch(int[] array, int target){
        for (int i=0; i<array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
